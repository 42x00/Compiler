package IR.IRNodes;

import AST_Node.ExprNodes.UnaryExprNode;
import IR.IRVisitor;

public class Uni extends Inst{
    private UnaryExprNode.UnaryOP unaryOP;
    private IntValue obj;

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }

    public Uni(UnaryExprNode.UnaryOP unaryOP, IntValue obj) {
        this.unaryOP = unaryOP;
        this.obj = obj;
    }
}