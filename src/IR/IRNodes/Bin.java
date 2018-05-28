package IR.IRNodes;

import AST_Node.ExprNodes.BinaryExprNode;
import IR.IRVisitor;

public class Bin extends Inst{
    private BinaryExprNode.BinaryOP binaryOP;
    private IntValue lhs, rhs;

    public Bin(BinaryExprNode.BinaryOP binaryOP, IntValue lhs, IntValue rhs) {
        this.binaryOP = binaryOP;
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }
}
