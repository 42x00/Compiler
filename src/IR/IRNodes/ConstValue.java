package IR.IRNodes;

import IR.IRVisitor;

public class ConstValue extends IntValue{
    private int anInt;

    public int getAnInt() {
        return anInt;
    }

    public ConstValue(int anInt) {
        this.anInt = anInt;
    }

    @Override
    public String accept(IRVisitor visitor) {
       return visitor.visit(this);
    }
}
