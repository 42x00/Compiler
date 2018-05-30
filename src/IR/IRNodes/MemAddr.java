package IR.IRNodes;

import IR.IRVisitor;

public class MemAddr extends IntValue {
    private IntValue intValue;

    public MemAddr(IntValue intValue) {
        this.intValue = intValue;
    }

    @Override
    public String accept(IRVisitor visitor) {
        return visitor.visit(this);
    }
    
}
