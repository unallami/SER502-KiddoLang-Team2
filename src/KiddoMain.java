import org.antlr.v4.runtime.*;
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


        } catch (IOException e) {
            System.err.println("Error reading file: " + args[0]);
            e.printStackTrace();
        }
    }
}