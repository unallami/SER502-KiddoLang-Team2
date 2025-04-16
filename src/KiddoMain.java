import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import antlr.KiddoLangLexer;
import antlr.KiddoLangParser;
import java.io.IOException;

public class KiddoMain {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Usage: java KiddoMain <filename.kiddo>");
            return;
        }

        try {
            CharStream input = CharStreams.fromFileName(args[0]);
            KiddoLangLexer lexer = new KiddoLangLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            KiddoLangParser parser = new KiddoLangParser(tokens);

            ParseTree tree = parser.program();

            printPrettyTree(tree, parser, 0); 

        } catch (IOException e) {
            System.err.println("Error reading file: " + args[0]);
            e.printStackTrace();
        }
    }

    public static void printPrettyTree(ParseTree tree, Parser parser, int indent) {
        String indentStr = "  ".repeat(indent);
        String nodeText = Trees.getNodeText(tree, parser);
        System.out.println(indentStr + nodeText);

        for (int i = 0; i < tree.getChildCount(); i++) {
            printPrettyTree(tree.getChild(i), parser, indent + 1);
        }
    }
}