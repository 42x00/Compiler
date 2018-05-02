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
        for (DeclNode declNode : progNode.getDeclarations()) {
            indentPrinter();
            if (declNode.getDeclname() != "") declNode.accept(this);
        }
        --indent;
    }

    @Override
    public void visit(FuncDeclNode funcDeclNode) {
        err.print("FuncDecl:");
        if (funcDeclNode.isConstructFunction() == true) err.print("Construct ");
        else funcDeclNode.getFunctionReturnType().accept(this);
        err.print(" " + funcDeclNode.getFunctionName());
        err.println();
        if (!(funcDeclNode.getFunctionStatements() instanceof CompStmtNode))
            indentPrinter();
        funcDeclNode.getFunctionStatements().accept(this);
    }

    @Override
    public void visit(TypeNode typeNode) {
        err.print(typeNode.getBasetype() + " " + String.valueOf(typeNode.getDim()));
    }

    @Override
    public void visit(ArrayTypeNode arrayTypeNode) {

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
        for (StmtNode stmtNode : compStmtNode.getStmtNodeList()) {
            indentPrinter();
            stmtNode.accept(this);
        }
        --indent;
    }

    @Override
    public void visit(IfStmtNode ifStmtNode) {
        err.println("IfExpr:");
        ++indent;
        if (ifStmtNode.getIfstmt() instanceof CompStmtNode) {
            --indent;
            ifStmtNode.getIfstmt().accept(this);
            ++indent;
        }
        else{
            indentPrinter();
            ifStmtNode.getIfstmt().accept(this);
        }
        if (ifStmtNode.getElsestmt() != null){
            --indent;
            indentPrinter();
            err.println("ElseExpr:");
            ++indent;
            if (ifStmtNode.getElsestmt() instanceof CompStmtNode) {
                --indent;
                ifStmtNode.getElsestmt().accept(this);
                ++indent;
            }
            else{
                indentPrinter();
                ifStmtNode.getElsestmt().accept(this);
            }
        }
        --indent;
    }

    @Override
    public void visit(WhileStmtNode whileStmtNode) {
        err.println("WhileExpr:");
        if (whileStmtNode.getWhilestmt() instanceof CompStmtNode)
            whileStmtNode.getWhilestmt().accept(this);
        else {
            ++indent;
            indentPrinter();
            whileStmtNode.getWhilestmt().accept(this);
            --indent;
        }
    }

    @Override
    public void visit(ForStmtNode forStmtNode) {
        err.println("ForExpr:");
        if (forStmtNode.getForstmt() instanceof CompStmtNode)
            forStmtNode.getForstmt().accept(this);
        else {
            ++indent;
            indentPrinter();
            forStmtNode.getForstmt().accept(this);
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
        err.println("ClassDecl:" + classDeclNode.getDeclname());
        ++indent;
        for (DeclNode declNode : classDeclNode.getClassdecllist()){
            indentPrinter();
            declNode.accept(this);
        }
        --indent;
    }

    @Override
    public void visit(VarDeclStmtNode varDeclStmtNode) {
        varDeclStmtNode.getVardeclnode().accept(this);
    }

    @Override
    public void visit(NewExprNode newExprNode) {
        err.print("NewExpr:");
        newExprNode.getExprtype().accept(this);
        err.println();
    }

    @Override
    public void visit(BinaryExprNode binaryExprNode) {
        err.println("BinaryExpr:" + binaryExprNode.getExprop());
        ++indent;
        indentPrinter();
        binaryExprNode.getLhs().accept(this);
        indentPrinter();
        binaryExprNode.getRhs().accept(this);
        --indent;
    }

    @Override
    public void visit(NullExprNode nullExprNode) {
        err.println("NullExpr");
    }

    @Override
    public void visit(UnaryExprNode unaryExprNode) {
        err.println("UnaryExpr:" + unaryExprNode.getExprop());
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
    public void visit(ClassThisExprNode classThisExprNode) {
        err.println("ClassThisExpr");
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
        err.print("Class " + classTypeNode.getClassname());
    }

    @Override
    public void visit(ExprStmtNode exprStmtNode) {
        if (exprStmtNode.getExprnode() != null) exprStmtNode.getExprnode().accept(this);
        err.println();
    }

    @Override
    public void visit(FuncCallExprNode funcCallExprNode) {
        err.println("FuncCallExpr");
    }

    @Override
    public void visit(SuffixExprNode suffixExprNode) {
        err.println("SuffixExpr:" + suffixExprNode.getExprop());
    }
}
