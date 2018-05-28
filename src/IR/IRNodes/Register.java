package IR.IRNodes;

import IR.IRVisitor;

public class Register extends IntValue{
    private int ord;
    private int anInt;

    public Register(int ord) {
        this.ord = ord;
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }
}
