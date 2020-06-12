import model.PiCalcListener;
import model.PiCalcVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import gen.grammar.*;

import java.io.*;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new FileReader(args[0])
        );

        String[] parts = args[0].split("\\\\");
        String filename = parts[parts.length - 1];

        StringBuilder input = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            input.append(line);
            input.append('\n');
        }

        ANTLRInputStream inputStream = new ANTLRInputStream(
                input.toString()
        );

        piLexer lexer = new piLexer(inputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        piParser parser = new piParser(commonTokenStream);
        piParser.ExpressionContext context = parser.expression();

        PiCalcVisitor visitor = new PiCalcVisitor();

        String result = filename.substring(0, filename.indexOf('.')) +
                "-pi" +
                "." +
                filename.substring(filename.indexOf('.') + 1);

        FileWriter writer = new FileWriter(new File(result));
        writer.write(visitor.visitExpression(context));
        writer.flush();
        writer.close();
    }
}
