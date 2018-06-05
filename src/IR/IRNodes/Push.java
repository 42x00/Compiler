package IR.IRNodes;

import IR.IRVisitor;

public class Push extends Inst{
    private IntValue intValue;

    public Push(IntValue intValue) {
        this.intValue = intValue;
    }

    public IntValue getIntValue() {
        return intValue;
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }
}
