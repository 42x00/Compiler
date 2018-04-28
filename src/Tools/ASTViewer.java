package Tools;

import AST_Node.*;
import AST_Node.DeclNodes.*;
import AST_Node.ExprNodes.*;
import AST_Node.StmtNodes.*;
import AST_Node.TypeNodes.*;

import static java.lang.System.err;
import static java.lang.System.in;
import static java.lang.System.runFinalization;


public class ASTViewer implements ASTVisitor {
    private int indent;

    public ASTViewer() {
        indent = 0;
    }

    public void indentPrinter(){
        for(int i=0;i<indent;++i){
            err.print("\t");
        }
    }

    @Override
    public void visit(ProgNode progNode) {
        err.println("Program:");
        ++indent;
        for (DeclNode declNode : progNode.declarations) {
            indentPrinter();
            if (declNode.declname != "") declNode.accept(this);
        }
        --indent;
    }

    @Override
    public void visit(FuncDeclNode funcDeclNode) {
        err.print("FuncDecl:");
        funcDeclNode.getFunctionReturnType().accept(this);
        err.print(" " + funcDeclNode.getFunctionName());
        err.println();
        if (!(funcDeclNode.getFunctionStatements() instanceof CompStmtNode))
            indentPrinter();
        funcDeclNode.getFunctionStatements().accept(this);
    }

    @Override
    public void visit(TypeNode typeNode) {
        err.print(typeNode.basetype + " " + String.valueOf(typeNode.dim));
    }

    @Override
    public void visit(VarDeclNode varDeclNode) {
        err.print("VarDecl:");
        varDeclNode.getVartype().accept(this);
        err.println(" " + varDeclNode.getVarname());
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
        err.println("IfExpr:");
        ++indent;
        if (ifStmtNode.ifstmt instanceof CompStmtNode) {
            --indent;
            ifStmtNode.ifstmt.accept(this);
            ++indent;
        }
        else{
            indentPrinter();
            ifStmtNode.ifstmt.accept(this);
        }
        if (ifStmtNode.elsestmt != null){
            --indent;
            indentPrinter();
            err.println("ElseExpr:");
            ++indent;
            if (ifStmtNode.elsestmt instanceof CompStmtNode) {
                --indent;
                ifStmtNode.elsestmt.accept(this);
                ++indent;
            }
            else{
                indentPrinter();
                ifStmtNode.elsestmt.accept(this);
            }
        }
        --indent;
    }

    @Override
    public void visit(WhileStmtNode whileStmtNode) {
        err.println("WhileExpr:");
        if (whileStmtNode.whilestmt instanceof CompStmtNode)
            whileStmtNode.whilestmt.accept(this);
        else {
            ++indent;
            indentPrinter();
            whileStmtNode.whilestmt.accept(this);
            --indent;
        }
    }

    @Override
    public void visit(ForStmtNode forStmtNode) {
        err.println("ForExpr:");
        if (forStmtNode.forstmt instanceof CompStmtNode)
            forStmtNode.forstmt.accept(this);
        else {
            ++indent;
            indentPrinter();
            forStmtNode.forstmt.accept(this);
            --indent;
        }
    }

    @Override
    public void visit(ContinueStmtNode continueStmtNode) {
        err.println("ContinueExpr");
    }

    @Override
    public void visit(BreakStmtNode breakStmtNode) {
        err.println("BreakExpr");
    }

    @Override
    public void visit(ReturnStmtNode returnStmtNode) {
        err.println("ReturnExpr");
    }

    @Override
    public void visit(ClassDeclNode classDeclNode) {
        err.println("ClassDecl:" + classDeclNode.declname);
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
        err.print("NewExpr:");
        newExprNode.exprtype.accept(this);
        err.println();
    }

    @Override
    public void visit(BinaryExprNode binaryExprNode) {
        err.println("BinaryExpr:" + binaryExprNode.exprop);
        ++indent;
        indentPrinter();
        binaryExprNode.lhs.accept(this);
        indentPrinter();
        binaryExprNode.rhs.accept(this);
        --indent;
    }

    @Override
    public void visit(NullExprNode nullExprNode) {
        err.println("NullExpr");
    }

    @Override
    public void visit(UnaryExprNode unaryExprNode) {
        err.println("UnaryExpr:" + unaryExprNode.exprop);
    }

    @Override
    public void visit(IDExprNode idExprNode) {
        err.println("IDExpr");
    }

    @Override
    public void visit(IntExprNode intExprNode) {
        err.println("IntExpr");
    }

    @Override
    public void visit(BoolExprNode boolExprNode) {
        err.println("BoolExpr");
    }

    @Override
    public void visit(StringExprNode stringExprNode) {
        err.println("StringExpr");
    }

    @Override
    public void visit(ArrayIndexExprNode arrayIndexExprNode) {
        err.println("ArraIndexExpr");
    }

    @Override
    public void visit(ClassMethodExprNode classMethodExprNode) {
        err.println("ClassMethodExpr");
    }

    @Override
    public void visit(ClassTypeNode classTypeNode) {
        err.print("Class " + classTypeNode.classname);
    }

    @Override
    public void visit(ExprStmtNode exprStmtNode) {
        if (exprStmtNode.exprnode != null) exprStmtNode.exprnode.accept(this);
        err.println();
    }

    @Override
    public void visit(FuncCallExprNode funcCallExprNode) {
        err.println("FuncCallExpr");
    }

    @Override
    public void visit(SuffixExprNode suffixExprNode) {
        err.println("SuffixExpr:" + suffixExprNode.exprop);
    }
}
