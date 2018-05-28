package IR.IRNodes;

import IR.IRVisitor;

public class MemAddr extends IntValue{
    private int memAddr;

    public MemAddr(int memAddr) {
        this.memAddr = memAddr;
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }

//    public MemAddr(MemAddr obj) {
//        memAddr = obj.memAddr;
//    }
}
