package IR.IRNodes;

import IR.IRVisitor;

public class Assign extends Inst{
    private int lhs;
    private IntValue rhs;

    public Assign(int lhs, IntValue rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    public int getLhs() {
        return lhs;
    }

    public IntValue getRhs() {
        return rhs;
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }
}
