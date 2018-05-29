package IR.IRNodes;

import IR.IRVisitor;

public class Register extends IntValue{
    private int ord;

    static private int cntRegister = 0;

    public Register() {
        this.ord = cntRegister++;
    }

    public int getOrd() {
        return ord;
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }
}
