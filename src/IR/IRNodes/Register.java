package IR.IRNodes;

import IR.IRVisitor;

public class Register extends IntValue {
    static public enum RegisterName {
        RSI, RDI
    }

    private int ord;

    static private int cntRegister = 6;

    public Register() {
        this.ord = cntRegister++;
    }

    public Register(RegisterName registerName) {
        switch (registerName) {
            case RSI:
                this.ord = 6;
                break;
            case RDI:
                this.ord = 7;
                break;
        }
    }

    public int getOrd() {
        return ord;
    }

    public String toString() {
        if (ord < 8) {
            switch (ord) {
                case 6:
                    return "rsi";
                case 7:
                    return "rdi";
                default:
                    return "Err ord with" + Integer.toString(ord);
            }
        } else {
            return "r" + Integer.toString(ord);
        }
    }

    @Override
    public String accept(IRVisitor visitor) {
        return visitor.visit(this);
    }
}
