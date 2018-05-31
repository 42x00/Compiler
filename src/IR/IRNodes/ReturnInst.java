package IR.IRNodes;

import IR.IRVisitor;

public class ReturnInst extends Inst{
//    private IntValue intValue;
//
//    public ReturnInst(IntValue intValue) {
//        this.intValue = intValue;
//    }
//
//    public IntValue getIntValue() {
//        return intValue;
//    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }
}
