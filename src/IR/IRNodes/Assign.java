package IR.IRNodes;

import IR.IRVisitor;

public class Assign extends Inst{
    private IntValue lhs;
    private IntValue rhs;

    public Assign(IntValue lhs, IntValue rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    public IntValue getLhs() {
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
