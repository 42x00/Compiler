package Test;

import AST_Node.ProgNode;
import Frontend.ASTBuilder;
import Parser.LMxLexer;
import Parser.LMxParser;
import Tools.ASTViewer;
import Tools.CodeGenerator;
import Tools.IRGenerator;
import Tools.SemanticCheck;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static java.lang.System.out;
import static org.antlr.v4.runtime.CharStreams.fromFileName;
import static java.lang.System.err;

public class Test {
    public static void main(String[] args) throws Exception {
        String inputFile = "D:\\LYK\\Class\\Compiler\\LMx_Compiler\\Compiler\\src\\Test\\testcode.txt";
        String outputFile = "D:\\LYK\\Class\\Compiler\\LMx_Compiler\\Compiler\\src\\Test\\testcode.asm";
        PrintStream ps = new PrintStream(new FileOutputStream(outputFile));
        System.setOut(ps);
        CharStream stream = fromFileName(inputFile);
        LMxLexer lexer              = new LMxLexer(stream);
        CommonTokenStream tokens    = new CommonTokenStream(lexer);
        LMxParser parser            = new LMxParser(tokens);
        ParseTree parsetree = parser.program();

        ASTBuilder builder = new ASTBuilder();
        ProgNode ast = (ProgNode) builder.visit(parsetree);

        SemanticCheck scoper = new SemanticCheck();
        try {
            scoper.visit(ast);
        }
        catch (Error e) {
            err.println(e);
        }

//        ASTViewer viewer = new ASTViewer();
//        viewer.visit(ast);

        IRGenerator irGenerator = new IRGenerator();
        irGenerator.visit(ast);

        CodeGenerator codeGenerator = new CodeGenerator();
        codeGenerator.generate(irGenerator, ast);
    }
}
