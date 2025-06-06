
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import antlr.KiddoLangLexer;
import antlr.KiddoLangParser;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class KiddoInterpreter {

    // Stores variables and their values
    private final Map<String, Object> memory = new HashMap<>();

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java KiddoInterpreter <filename.kiddo>");
            return;
        }
        new KiddoInterpreter().executeFile(args[0]);
    }

    // Reads the file and starts interpreting
    public void executeFile(String filename) throws IOException {
        CharStream input = CharStreams.fromFileName(filename);
        KiddoLangLexer lexer = new KiddoLangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        KiddoLangParser parser = new KiddoLangParser(tokens);
        ParseTree tree = parser.program();
        interpret(tree);
    }

    // Goes through each statement in the program
    public void interpret(ParseTree tree) {
        for (int i = 0; i < tree.getChildCount(); i++) {
            ParseTree child = tree.getChild(i);
            if (child instanceof KiddoLangParser.StatementContext stmtCtx) {
                handleStatement(stmtCtx);
            }
        }
    }

    // Handles each kind of statement
    private void handleStatement(KiddoLangParser.StatementContext ctx) {
        if (ctx.assignment() != null) {
            handleAssignment(ctx.assignment());
        } else if (ctx.printStatement() != null) {
            handlePrint(ctx.printStatement());
        } else if (ctx.ifStatement() != null) {
            handleIf(ctx.ifStatement());
        } else if (ctx.loopStatement() != null) {
            handleLoop(ctx.loopStatement());
        } else if (ctx.ternaryExpr() != null) {
            Object value = handleTernary(ctx.ternaryExpr());
            System.out.println(value);
        }
    }

    // Handles variable assignment like: set x to 5;
    private void handleAssignment(KiddoLangParser.AssignmentContext ctx) {
        if (ctx.ID() == null || ctx.expr() == null) {
            System.err.println("Invalid assignment statement.");
            return;
        }
        String id = ctx.ID().getText();
        Object value = evaluateExpr(ctx.expr());
        memory.put(id, value);
    }

    // Handles print statements like: say x;
    private void handlePrint(KiddoLangParser.PrintStatementContext ctx) {
        Object value = evaluateExpr(ctx.expr());
        System.out.println(value);
    }

    // Handles if-else conditions
    private void handleIf(KiddoLangParser.IfStatementContext ctx) {
        Object condVal = evaluateExpr(ctx.expr());
        if (!(condVal instanceof Boolean)) {
            throw new RuntimeException("Condition must evaluate to boolean");
        }
        boolean cond = (Boolean) condVal;
        if (cond) {
            interpret(ctx.block(0));
        } else if (ctx.OTHERWISE() != null) {
            interpret(ctx.block(1));
        }
    }

    // Handles both for and while loops
    private void handleLoop(KiddoLangParser.LoopStatementContext ctx) {
        if (ctx.forLoop() != null) {
            handleFor(ctx.forLoop());
        } else if (ctx.whileLoop() != null) {
            handleWhile(ctx.whileLoop());
        }
    }

    // Handles count from x to y
    private void handleFor(KiddoLangParser.ForLoopContext ctx) {
        Object startVal = evaluateExpr(ctx.expr(0));
        Object endVal = evaluateExpr(ctx.expr(1));
        if (!(startVal instanceof Number) || !(endVal instanceof Number)) {
            throw new RuntimeException("Loop range must be numbers");
        }
        int start = ((Number) startVal).intValue();
        int end = ((Number) endVal).intValue();
        for (int i = start; i <= end; i++) {
            memory.put("i", i);
            interpret(ctx.block());
        }
    }

    // Handles repeat until
    private void handleWhile(KiddoLangParser.WhileLoopContext ctx) {
        while (true) {
            Object condVal = evaluateExpr(ctx.expr());
            if (!(condVal instanceof Boolean)) {
                throw new RuntimeException("While condition must be boolean");
            }
            boolean cond = (Boolean) condVal;
            if (cond) {
                break;
            }
            interpret(ctx.block());
        }
    }

    // Handles ternary expressions like: cond ? a : b
    private Object handleTernary(KiddoLangParser.TernaryExprContext ctx) {
        Object conditionValue = evaluateExpr(ctx.expr(0));
        if (!(conditionValue instanceof Boolean)) {
            throw new RuntimeException("Ternary condition must be boolean");
        }
        return (Boolean) conditionValue ? evaluateExpr(ctx.expr(1)) : evaluateExpr(ctx.expr(2));
    }

    // Evaluates an expression and returns its value
    private Object evaluateExpr(KiddoLangParser.ExprContext ctx) {
        if (ctx.INT() != null) {
            return Integer.parseInt(ctx.INT().getText());
        }
        if (ctx.FLOAT() != null) {
            return Float.parseFloat(ctx.FLOAT().getText());
        }
        if (ctx.STRING() != null) {
            return ctx.STRING().getText().replaceAll("^\"|\"$", "");
        }
        if (ctx.YES() != null) {
            return true;
        }
        if (ctx.NO() != null) {
            return false;
        }
        if (ctx.ID() != null) {
            return memory.getOrDefault(ctx.ID().getText(), 0);
        }

        // Handles: not x
        if (ctx.expr().size() == 1 && ctx.NOT() != null) {
            Object val = evaluateExpr(ctx.expr(0));
            if (!(val instanceof Boolean)) {
                throw new RuntimeException("Operand to 'not' must be boolean");
            }
            return !((Boolean) val);
        }

        // Handles: (x + y)
        if (ctx.LPAREN() != null && ctx.RPAREN() != null) {
            return evaluateExpr(ctx.expr(0));
        }

        // Handles: x + y, x > y, x and y, etc.
        Object left = evaluateExpr(ctx.expr(0));
        Object right = evaluateExpr(ctx.expr(1));
        String op = ctx.getChild(1).getText();

        switch (op) {
            case "+":
                return toNum(left) + toNum(right);
            case "-":
                return toNum(left) - toNum(right);
            case "*":
                return toNum(left) * toNum(right);
            case "/":
                return toNum(left) / toNum(right);
            case ">":
                return toNum(left) > toNum(right);
            case "<":
                return toNum(left) < toNum(right);
            case "==":
                if (left instanceof Number && right instanceof Number) {
                    return Math.abs(toNum(left) - toNum(right)) < 1e-6;
                }
                return left.equals(right);
            case "and":
                return (Boolean) left && (Boolean) right;
            case "or":
                return (Boolean) left || (Boolean) right;
            default:
                throw new RuntimeException("Unknown binary operator: " + op);
        }
    }

    // Converts a number (int/float) to double
    private double toNum(Object val) {
        if (val instanceof Integer) {
            return ((Integer) val).doubleValue();
        }
        if (val instanceof Float) {
            return ((Float) val).doubleValue();
        }
        if (val instanceof Double) {
            return (Double) val;
        }
        throw new RuntimeException("Expected numeric type, got: " + val);
    }
}
