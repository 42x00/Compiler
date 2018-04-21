package AST_Node;

import java.util.List;

public class FuncDeclNode extends DeclNode{
    private boolean isConstructFunction;
    private TypeNode functionReturnType;
    private String functionName;
    private List<VarDeclNode> functionParameterList;
    private CompStmtNode functionStatements;
    private Location location;

    public FuncDeclNode(TypeNode functionReturnType, String functionName, List<VarDeclNode> functionParameterList, CompStmtNode functionStatements, Location location) {
        if (functionReturnType == null){
            this.isConstructFunction = true;
        }
        else {
            this.isConstructFunction = false;
        }
        this.functionReturnType = functionReturnType;
        this.functionName = functionName;
        this.functionParameterList = functionParameterList;
        this.functionStatements = functionStatements;
        this.location = location;
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

    public void setFunctionParameterList(List<VarDeclNode> functionParameterList) {
        this.functionParameterList = functionParameterList;
    }

    public void setFunctionStatements(CompStmtNode functionStatements) {
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

    public List<VarDeclNode> getFunctionParameterList() {
        return functionParameterList;
    }

    public CompStmtNode getFunctionStatements() {
        return functionStatements;
    }

    @Override
    public Location location() {
        return location;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
