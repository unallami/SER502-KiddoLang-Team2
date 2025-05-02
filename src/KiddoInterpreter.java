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
        if (ctx.INT() != null) return Integer.parseInt(ctx.INT().getText());
        if (ctx.FLOAT() != null) return Float.parseFloat(ctx.FLOAT().getText());
        if (ctx.STRING() != null) return ctx.STRING().getText().replaceAll("^\"|\"$", "");
        if (ctx.YES() != null) return true;
        if (ctx.NO() != null) return false;
        if (ctx.ID() != null) return memory.getOrDefault(ctx.ID().getText(), 0);

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

        return switch (op) {
            case "+" -> toNum(left) + toNum(right);
            case "-" -> toNum(left) - toNum(right);
            case "*" -> toNum(left) * toNum(right);
            case "/" -> toNum(left) / toNum(right);
            case ">" -> toNum(left) > toNum(right);
            case "<" -> toNum(left) < toNum(right);
            case "==" -> left.equals(right);
            case "and" -> (Boolean) left && (Boolean) right;
            case "or" -> (Boolean) left || (Boolean) right;
            default -> throw new RuntimeException("Unknown binary operator: " + op);
        };
    }

    // Converts a number (int/float) to double
    private double toNum(Object val) {
        if (val instanceof Integer) return ((Integer) val).doubleValue();
        if (val instanceof Float) return ((Float) val).doubleValue();
        if (val instanceof Double) return (Double) val;
        throw new RuntimeException("Expected numeric type, got: " + val);
    }
}