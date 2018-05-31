package IR.IRNodes;

import IR.IRVisitor;

public class Register extends IntValue {
    static public enum RegisterName {
        RAX, RCX, RDX, RBX, RSI, RDI, RSP, RBP, R8, R9, R10, R11, R12, R13, R14, R15
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

    public Register(RegisterName registerName) {
        switch (registerName) {
            case RAX:
                ord =0; break;
            case RCX:
                ord =1; break;
            case RDX:
                ord =2; break;
            case RBX:
                ord =3; break;
            case RSI:
                ord =4; break;
            case RDI:
                ord =5; break;
            case RSP:
                ord =6; break;
            case RBP:
                ord =7; break;
            case R8:
                ord =8; break;
            case R9:
                ord =9; break;
            case R10:
                ord =10; break;
            case R11:
                ord =11; break;
            case R12:
                ord =12; break;
            case R13:
                ord =13; break;
            case R14:
                ord =14; break;
            case R15:
                ord =15; break;
        }
    }

    public int getOrd() {
        return ord;
    }

    public String toString() {
        if (ord < 16) {
            if (ord == 0) return "rax";
            return "Err ord with" + Integer.toString(ord);
        } else {
            return "qword [rbp - " + Integer.toString((ord - 15) * 8) + "]";
        }
    }

    @Override
    public String accept(IRVisitor visitor) {
        return visitor.visit(this);
    }
}
