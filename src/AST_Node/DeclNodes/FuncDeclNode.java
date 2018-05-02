package AST_Node.DeclNodes;

import AST_Node.ASTVisitor;
import AST_Node.StmtNodes.CompStmtNode;
import AST_Node.TypeNodes.TypeNode;
import Tools.Scope.Scope;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;

public class FuncDeclNode extends DeclNode{
    private boolean isConstructFunction;
    private TypeNode functionReturnType;
    private VarDeclListNode functionParameterList;
    private CompStmtNode functionStatements;

    public FuncDeclNode(){
        isConstructFunction = false;
        functionReturnType = new TypeNode();
        functionParameterList = new VarDeclListNode();
        functionStatements = new CompStmtNode();
    }

    public FuncDeclNode(String functionName) {
        isConstructFunction = false;
        functionReturnType = new TypeNode();
        functionParameterList = new VarDeclListNode();
        functionStatements = new CompStmtNode();
        this.declname = functionName;
    }

    public FuncDeclNode(TypeNode functionReturnType, String functionName, VarDeclListNode functionParameterList, CompStmtNode functionStatements) {
        if (functionReturnType == null) isConstructFunction = true;
        else isConstructFunction = false;
        this.functionReturnType = functionReturnType;
        this.declname = functionName;
        if (functionParameterList != null) this.functionParameterList = functionParameterList;
        else this.functionParameterList = new VarDeclListNode();
        this.functionStatements = functionStatements;
    }

    public int getParamSize(){
        return functionParameterList.getParamSize();
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
        if (functionReturnType == null) this.isConstructFunction = true;
        else this.isConstructFunction = false;
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

    @Override
    public void setCtx(ParserRuleContext ctx) {
        this.ctx = ctx;
    }
}
