package Test;

import AST_Node.ProgNode;
import Frontend.ASTBuilder;
import Parser.LMxLexer;
import Parser.LMxParser;
import Tools.ASTViewer;
import Tools.SymbolTable;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Test {
    public static void main(String[] args) throws Exception {
        String inputFile = "D:\\LYK\\Class\\Compiler\\LMx_Compiler\\Compiler\\src\\Test\\code.txt";
        CharStream stream = fromFileName(inputFile);
        LMxLexer lexer              = new LMxLexer(stream);
        CommonTokenStream tokens    = new CommonTokenStream(lexer);
        LMxParser parser            = new LMxParser(tokens);
        ParseTree parsetree = parser.program();

        ASTBuilder builder = new ASTBuilder();
        ProgNode ast = (ProgNode) builder.visit(parsetree);

        ASTViewer viewer = new ASTViewer();
        viewer.visit(ast);

        SymbolTable scoper = new SymbolTable();
        scoper.visit(ast);
    }
}
