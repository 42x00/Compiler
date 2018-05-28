package IR.IRNodes;

import IR.IRVisitor;

public class Register extends IntValue{
    private int ord;

    public Register(int ord) {
        this.ord = ord;
    }

    public int getOrd() {
        return ord;
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }
}
