package IR.IRNodes;

import AST_Node.ExprNodes.BinaryExprNode;
import IR.IRVisitor;

public class Bin extends Inst{
    private BinaryExprNode.BinaryOP binaryOP;
    private IntValue lhs, rhs;
    private Register ans;

    public Bin(BinaryExprNode.BinaryOP binaryOP, IntValue lhs, IntValue rhs, Register ans) {
        this.binaryOP = binaryOP;
        this.lhs = lhs;
        this.rhs = rhs;
        this.ans = ans;
    }

    public BinaryExprNode.BinaryOP getBinaryOP() {
        return binaryOP;
    }

    public IntValue getLhs() {
        return lhs;
    }

    public IntValue getRhs() {
        return rhs;
    }

    public Register getAns() {
        return ans;
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }
}
