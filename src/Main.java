import AST_Node.ProgNode;
import Frontend.ASTBuilder;
import Parser.LMxLexer;
import Parser.LMxParser;
import Tools.ASTViewer;
import Tools.SemanticCheck;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        InputStream inS = System.in;
        CharStream stream = CharStreams.fromStream(inS);
        LMxLexer lexer              = new LMxLexer(stream);
        CommonTokenStream tokens    = new CommonTokenStream(lexer);
        LMxParser parser            = new LMxParser(tokens);
        ParseTree parsetree = parser.program();

        ASTBuilder builder = new ASTBuilder();
        ProgNode ast = (ProgNode) builder.visit(parsetree);

        ASTViewer viewer = new ASTViewer();
        viewer.visit(ast);

        SemanticCheck scoper = new SemanticCheck();
        scoper.visit(ast);
    }
}
