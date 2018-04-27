package Tools;

import AST_Node.ASTVisitor;
import AST_Node.DeclNodes.ClassDeclNode;
import AST_Node.DeclNodes.DeclNode;
import AST_Node.DeclNodes.FuncDeclNode;
import AST_Node.DeclNodes.VarDeclNode;
import AST_Node.ExprNodes.*;
import AST_Node.ProgNode;
import AST_Node.StmtNodes.*;
import AST_Node.TypeNodes.ClassTypeNode;
import AST_Node.TypeNodes.TypeNode;
import Tools.Scope.*;

import java.util.LinkedList;

public class SymbolTable implements ASTVisitor{
    private final LinkedList<Scope> scopeStack = new LinkedList<>();

    private Scope currentScope(){
        return scopeStack.getLast();
    }

    @Override
    public void visit(ProgNode progNode) {
        ToplevelScope toplevelScope = new ToplevelScope();
        scopeStack.addLast(toplevelScope);
        for (DeclNode declNode : progNode.declarations)
            declNode.accept(this);
        scopeStack.removeLast();
    }

    @Override
    public void visit(VarDeclNode varDeclNode) {
        Scope scope = currentScope();
        scope.addDecl(varDeclNode);
    }

    @Override
    public void visit(FuncDeclNode funcDeclNode) {
        LocalScope localScope = new LocalScope(currentScope());
        if (funcDeclNode.getFunctionParameterList() != null)
            localScope.addDecls(funcDeclNode.getFunctionParameterList().vardeclnodeList);
        scopeStack.addLast(localScope);
        if (funcDeclNode.getFunctionStatements() != null)
            funcDeclNode.getFunctionStatements().accept(this);
        scopeStack.removeLast();
    }

    @Override
    public void visit(CompStmtNode compStmtNode) {
        LocalScope localScope = new LocalScope(currentScope());
        scopeStack.addLast(localScope);
        for (StmtNode stmtNode : compStmtNode.stmtNodeList)
            stmtNode.accept(this);
        scopeStack.removeLast();
    }

    @Override
    public void visit(ForStmtNode forStmtNode) {
        LocalScope localScope = new LocalScope(currentScope(),forStmtNode.forinit);
        scopeStack.addLast(localScope);
        if (forStmtNode.forstmt != null)
            forStmtNode.forstmt.accept(this);
        scopeStack.removeLast();
    }

    @Override
    public void visit(VarDeclStmtNode varDeclStmtNode) {
        varDeclStmtNode.vardeclnode.accept(this);
    }

    @Override
    public void visit(WhileStmtNode whileStmtNode) {
        LocalScope localScope = new LocalScope(currentScope());
        scopeStack.addLast(localScope);
        if (whileStmtNode.whilestmt != null)
            whileStmtNode.whilestmt.accept(this);
        scopeStack.removeLast();
    }

    @Override
    public void visit(ClassDeclNode classDeclNode) {
        LocalScope localScope = new LocalScope(currentScope());
        scopeStack.addLast(localScope);
        for (DeclNode declNode : classDeclNode.classdecllist)
            declNode.accept(this);
        scopeStack.removeLast();
    }

    @Override
    public void visit(ArrayIndexExprNode arrayIndexExprNode) {

    }

    @Override
    public void visit(BinaryExprNode binaryExprNode) {

    }

    @Override
    public void visit(BoolExprNode boolExprNode) {

    }

    @Override
    public void visit(BreakStmtNode breakStmtNode) {

    }

    @Override
    public void visit(ClassMethodExprNode classMethodExprNode) {

    }

    @Override
    public void visit(ClassTypeNode classTypeNode) {

    }

    @Override
    public void visit(ContinueStmtNode continueStmtNode) {

    }

    @Override
    public void visit(ExprStmtNode exprStmtNode) {

    }

    @Override
    public void visit(FuncCallExprNode funcCallExprNode) {

    }

    @Override
    public void visit(IDExprNode idExprNode) {

    }

    @Override
    public void visit(IfStmtNode ifStmtNode) {

    }

    @Override
    public void visit(IntExprNode intExprNode) {

    }

    @Override
    public void visit(NewExprNode newExprNode) {

    }

    @Override
    public void visit(ReturnStmtNode returnStmtNode) {

    }

    @Override
    public void visit(StringExprNode stringExprNode) {

    }

    @Override
    public void visit(SuffixExprNode suffixExprNode) {

    }

    @Override
    public void visit(TypeNode typeNode) {

    }

    @Override
    public void visit(UnaryExprNode unaryExprNode) {

    }
}
