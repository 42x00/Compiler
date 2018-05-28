package IR.IRNodes;

import IR.IRVisitor;

public class ConstValue extends IntValue{
    private int anInt;

    public ConstValue(int anInt) {
        this.anInt = anInt;
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }
}
