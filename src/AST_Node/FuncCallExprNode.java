package AST_Node;

import java.util.ArrayList;
import java.util.List;

public class FuncCallExprNode extends ExprNode{
    public ExprNode function;
    public List<ExprNode> parameters;

    public FuncCallExprNode() {
        this.parameters = new ArrayList<>();
    }

    public FuncCallExprNode(ExprNode function) {
        this.function = function;
        this.parameters = new ArrayList<>();
    }

    public FuncCallExprNode(List<ExprNode> parameters) {
        this.parameters = parameters;
    }

    public void setFunction(ExprNode function) {
        this.function = function;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
