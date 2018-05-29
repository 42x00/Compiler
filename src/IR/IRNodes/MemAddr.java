package IR.IRNodes;

import IR.IRVisitor;

public class MemAddr extends IntValue {
    private IntValue intValue;

    public MemAddr(IntValue intValue) {
        this.intValue = intValue;
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }
    
}
