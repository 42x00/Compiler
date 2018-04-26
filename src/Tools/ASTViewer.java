package Tools;

import AST_Node.*;
import AST_Node.DeclNodes.*;
import AST_Node.ExprNodes.*;
import AST_Node.StmtNodes.*;
import AST_Node.TypeNodes.*;

import static java.lang.System.out;


public class ASTViewer implements ASTVisitor {
    private int indent;

    public ASTViewer() {
        indent = 0;
    }

    public void indentPrinter(){
        for(int i=0;i<indent;++i){
            out.print("\t");
        }
    }

    @Override
    public void visit(ProgNode progNode) {
        out.println("Program:");
        for (DeclNode declNode : progNode.declarations)
            declNode.accept(this);
    }

    @Override
    public void visit(FuncDeclNode funcDeclNode) {
        ++indent;
        indentPrinter();
        out.print("FuncDecl:");
        funcDeclNode.getFunctionReturnType().accept(this);
        out.print(" " + funcDeclNode.getFunctionName());
        out.println();
        funcDeclNode.getFunctionStatements().accept(this);
        --indent;
    }

    @Override
    public void visit(TypeNode typeNode) {
        out.print(typeNode.basetype + " " + String.valueOf(typeNode.dim));
    }

    @Override
    public void visit(VarDeclNode varDeclNode) {
        out.print("VarDecl:");
        varDeclNode.getVartype().accept(this);
        out.println(" " + varDeclNode.getVarname());
    }

    @Override
    public void visit(CompStmtNode compStmtNode) {
        ++indent;
        for (StmtNode stmtNode : compStmtNode.stmtNodeList) {
            indentPrinter();
            stmtNode.accept(this);
        }
        --indent;
    }

    @Override
    public void visit(IfStmtNode ifStmtNode) {
        out.println("IfExpr:");
        ++indent;
        indentPrinter();
        ifStmtNode.ifstmt.accept(this);
        if (ifStmtNode.elsestmt != null){
            indentPrinter();
            ifStmtNode.elsestmt.accept(this);
        }
        --indent;
    }

    @Override
    public void visit(WhileStmtNode whileStmtNode) {
        out.println("WhileExpr:");
        ++indent;
        indentPrinter();
        whileStmtNode.whilestmt.accept(this);
        --indent;
    }

    @Override
    public void visit(ForStmtNode forStmtNode) {
        out.println("ForExpr:");
        forStmtNode.forstmt.accept(this);
    }

    @Override
    public void visit(ContinueStmtNode continueStmtNode) {
        out.println("ContinueExpr");
    }

    @Override
    public void visit(BreakStmtNode breakStmtNode) {
        out.println("BreakExpr");
    }

    @Override
    public void visit(ReturnStmtNode returnStmtNode) {
        out.println("ReturnExpr");
    }

    @Override
    public void visit(ClassDeclNode classDeclNode) {
        out.print("ClassDecl:" + classDeclNode.classname);
        ++indent;
        for (DeclNode declNode : classDeclNode.classdecllist){
            indentPrinter();
            declNode.accept(this);
        }
        --indent;
    }

    @Override
    public void visit(VarDeclStmtNode varDeclStmtNode) {
        varDeclStmtNode.vardeclnode.accept(this);
    }

    @Override
    public void visit(NewExprNode newExprNode) {
        out.print("NewExpr:");
        newExprNode.exprtype.accept(this);
        out.println();
    }

    @Override
    public void visit(BinaryExprNode binaryExprNode) {
        out.println("BinaryExpr:" + binaryExprNode.exprop);
        ++indent;
        indentPrinter();
        binaryExprNode.lhs.accept(this);
        indentPrinter();
        binaryExprNode.rhs.accept(this);
        --indent;
    }

    @Override
    public void visit(UnaryExprNode unaryExprNode) {
        out.println("UnaryExpr:" + unaryExprNode.exprop);
    }

    @Override
    public void visit(IDExprNode idExprNode) {
        out.println("IDExpr");
    }

    @Override
    public void visit(IntExprNode intExprNode) {
        out.println("IntExpr");
    }

    @Override
    public void visit(BoolExprNode boolExprNode) {
        out.println("BoolExpr");
    }

    @Override
    public void visit(StringExprNode stringExprNode) {
        out.println("StringExpr");
    }

    @Override
    public void visit(ArrayIndexExprNode arrayIndexExprNode) {
        out.println("ArraIndexExpr");
    }

    @Override
    public void visit(ClassMethodExprNode classMethodExprNode) {
        out.println("ClassMethodExpr");
    }

    @Override
    public void visit(ClassTypeNode classTypeNode) {
        out.print("Class " + classTypeNode.classname);
    }

    @Override
    public void visit(ExprStmtNode exprStmtNode) {
        exprStmtNode.exprnode.accept(this);
    }

    @Override
    public void visit(FuncCallExprNode funcCallExprNode) {
        out.println("FuncCallExpr");
    }

    @Override
    public void visit(SuffixExprNode suffixExprNode) {
        out.println("SuffixExpr:" + suffixExprNode.exprop);
    }
}
