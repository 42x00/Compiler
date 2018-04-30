package AST_Node.DeclNodes;

import AST_Node.ASTVisitor;
import AST_Node.StmtNodes.CompStmtNode;
import AST_Node.TypeNodes.TypeNode;
import Tools.Scope.Scope;

public class FuncDeclNode extends DeclNode{
    private boolean isConstructFunction;
    private TypeNode functionReturnType;
    private VarDeclListNode functionParameterList;
    private CompStmtNode functionStatements;
    public Scope astscope;

    public void setAstscope(Scope astscope) {
        this.astscope = astscope;
    }

    public FuncDeclNode(){
    }

    public FuncDeclNode(String functionName) {
        this.declname = functionName;
    }

    public FuncDeclNode(TypeNode functionReturnType, String functionName, VarDeclListNode functionParameterList, CompStmtNode functionStatements) {
        if (functionReturnType == null) isConstructFunction = true;
        else isConstructFunction = false;
        this.functionReturnType = functionReturnType;
        this.declname = functionName;
        this.functionParameterList = functionParameterList;
        this.functionStatements = functionStatements;
    }

    public boolean isConstructFunction() {
        return isConstructFunction;
    }

    public TypeNode getFunctionReturnType() {
        return functionReturnType;
    }

    public String getFunctionName() {
        return this.declname;
    }

    public VarDeclListNode getFunctionParameterList() {
        return functionParameterList;
    }

    public CompStmtNode getFunctionStatements() {
        return functionStatements;
    }

    public void setConstructFunction(boolean constructFunction) {
        isConstructFunction = constructFunction;

    }

    public void setFunctionReturnType(TypeNode functionReturnType) {
        this.functionReturnType = functionReturnType;
    }

    public void setFunctionName(String functionName) {
        this.declname = functionName;
    }

    public void setFunctionParameterList(VarDeclListNode functionParameterList) {
        this.functionParameterList = functionParameterList;
    }

    public void setFunctionStatements(CompStmtNode functionStatements) {
        this.functionStatements = functionStatements;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
