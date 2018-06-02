package IR.IRNodes;

import IR.IRVisitor;

public class GloalVar extends IntValue{
    private String declname;
    private boolean isAddr;

    public GloalVar(String declname) {
        this.declname = declname;
        this.isAddr = false;
    }

    public GloalVar(String declname, boolean isAddr) {
        this.declname = declname;
        this.isAddr = isAddr;
    }

    public String getDeclname() {
        return declname;
    }

    public void setDeclname(String declname) {
        this.declname = declname;
    }

    public boolean isAddr() {
        return isAddr;
    }

    @Override
    public String accept(IRVisitor visitor) {
        return visitor.visit(this);
    }
}
