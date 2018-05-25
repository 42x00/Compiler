package IR;

import AST_Node.ExprNodes.UnaryExprNode;

public class Uni extends Inst{
    private UnaryExprNode.UnaryOP unaryOP;
    private IntValue obj;

    public Uni(UnaryExprNode.UnaryOP unaryOP, IntValue obj) {
        this.unaryOP = unaryOP;
        this.obj = obj;
    }
}
