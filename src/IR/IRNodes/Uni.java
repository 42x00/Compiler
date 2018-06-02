package IR.IRNodes;

import AST_Node.ExprNodes.UnaryExprNode;
import IR.IRVisitor;

public class Uni extends Inst{
    private UnaryExprNode.UnaryOP unaryOP;
    private IntValue obj;
    private IntValue ans;

    public Uni(UnaryExprNode.UnaryOP unaryOP, IntValue obj, IntValue ans) {
        this.unaryOP = unaryOP;
        this.obj = obj;
        this.ans = ans;
    }

    public UnaryExprNode.UnaryOP getUnaryOP() {
        return unaryOP;
    }

    public IntValue getObj() {
        return obj;
    }

    public IntValue getAns() {
        return ans;
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }

}
