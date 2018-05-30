package IR.IRNodes;

import IR.IRVisitor;

public class Register extends IntValue {
    static public enum RegisterName {
        RSI, RDI
    }

    private int ord;

    static private int cntRegister;

    static public void resetCnt() {
        cntRegister = 16;
    }

    public static int getCntRegister() {
        return cntRegister;
    }

    public Register() {
        this.ord = cntRegister++;
    }

    public int getOrd() {
        return ord;
    }

    public String toString() {
        if (ord < 8) {
            return "Err ord with" + Integer.toString(ord);
        } else {
            return "qword [rsp - " + Integer.toString((ord-15)*8) + "]";
        }
    }

    @Override
    public String accept(IRVisitor visitor) {
        return visitor.visit(this);
    }
}
