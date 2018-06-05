package Test;

import AST_Node.ASTVisitor;
import AST_Node.ProgNode;
import Frontend.ASTBuilder;
import Parser.LMxLexer;
import Parser.LMxParser;
import Tools.ASTViewer;
import Backend.CodeGenerator;
import Backend.IRGenerator;
import Backend.SemanticCheck;
import Tools.DataFlowAnalysis;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileOutputStream;
import java.io.PrintStream;

import static org.antlr.v4.runtime.CharStreams.fromFileName;
import static java.lang.System.err;

public class Test {
    public static void main(String[] args) throws Exception {
        String inputFile = "D:\\LYK\\Class\\Compiler\\LMx_Compiler\\Compiler\\src\\Test\\testcode.cpp";
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

        ASTVisitor astVisitor = new ASTViewer();
        astVisitor.visit(ast);

        err.println();

        SemanticCheck scoper = new SemanticCheck();
        try {
            scoper.visit(ast);
        }
        catch (Error e) {
            err.println(e);
        }

        IRGenerator irGenerator = new IRGenerator();
        irGenerator.visit(ast);

        DataFlowAnalysis dataFlowAnalysis = new DataFlowAnalysis();
        dataFlowAnalysis.analysis(irGenerator, ast);

        CodeGenerator codeGenerator = new CodeGenerator();
        codeGenerator.generate(irGenerator, ast);

    }
}
