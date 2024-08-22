// OVO JE PO UZORU NA ORIGINAL IZVOR

// import org.antlr.v4.runtime.CharStreams;
// import org.antlr.v4.runtime.CommonTokenStream;
// import org.antlr.v4.runtime.tree.ParseTree;

// public class Main {
//     public static void main(String[] args) throws Exception {
//         // Use CharStreams.fromFileName instead of ANTLRFileStream
//         MuLexer lexer = new MuLexer(CharStreams.fromFileName("test.mu"));
//         MuParser parser = new MuParser(new CommonTokenStream(lexer));
//         ParseTree tree = parser.parse(); // start rule for parsing
//         EvalVisitor visitor = new EvalVisitor();
//         visitor.visit(tree); // Visit the parse tree with the visitor
//     }
// }


// OVO JE DA BI SE IZGENERISALO STABLO

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName("test.mu");
        MuLexer lexer = new MuLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MuParser parser = new MuParser(tokens);

        // Parsirajte ulaz
        ParseTree tree = parser.parse();

        // Kreirajte visitor i obradite AST
        EvalVisitor visitor = new EvalVisitor();
        visitor.visit(tree);
    }
}