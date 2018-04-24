package AST_Node;

import java.util.List;

public class FuncCallExprNode extends ExprNode{
    public ExprNode function;
    public List<ExprNode> parameters;

    public FuncCallExprNode() {
    }

    public FuncCallExprNode(ExprNode function) {
        this.function = function;
    }

    public FuncCallExprNode(List<ExprNode> parameters) {
        this.parameters = parameters;
    }

    public void setFunction(ExprNode function) {
        this.function = function;
    }
}
