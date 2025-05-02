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
}