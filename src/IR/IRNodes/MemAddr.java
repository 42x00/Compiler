package IR.IRNodes;

import IR.IRVisitor;

public class MemAddr extends IntValue {
    private IntValue baseAddr;
    private IntValue offset;

    public MemAddr(IntValue baseAddr, IntValue offset) {
        this.baseAddr = baseAddr;
        this.offset = offset;
    }

    public IntValue getBaseAddr() {
        return baseAddr;
    }

    public IntValue getOffset() {
        return offset;
    }

    @Override
    public String accept(IRVisitor visitor) {
        return visitor.visit(this);
    }
    
}
