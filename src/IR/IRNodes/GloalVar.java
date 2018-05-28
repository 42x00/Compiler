package IR.IRNodes;

import IR.IRVisitor;

public class GloalVar extends IntValue{
    private String declname;

    public GloalVar(String declname) {
        this.declname = declname;
    }

    public String getDeclname() {
        return declname;
    }

    public void setDeclname(String declname) {
        this.declname = declname;
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }
}
