package AST_Node;

public class FuncDeclNode extends DeclNode{
    private boolean isConstructFunction;
    private TypeNode functionReturnType;
    private String functionName;
    private VarDeclListNode functionParameterList;
    private CompStmtNode functionStatements;

    public FuncDeclNode(){
    }

    public FuncDeclNode(TypeNode functionReturnType, String functionName, VarDeclListNode functionParameterList, CompStmtNode functionStatements) {
        if (functionReturnType == null) isConstructFunction = true;
        else isConstructFunction = false;
        this.functionReturnType = functionReturnType;
        this.functionName = functionName;
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
        return functionName;
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
        this.functionName = functionName;
    }

    public void setFunctionParameterList(VarDeclListNode functionParameterList) {
        this.functionParameterList = functionParameterList;
    }

    public void setFunctionStatements(CompStmtNode functionStatements) {
        this.functionStatements = functionStatements;
    }
}
