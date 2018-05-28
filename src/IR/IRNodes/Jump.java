package IR.IRNodes;

import IR.IRVisitor;

public class Jump extends Inst{
    private BasicBlock nxtBlock;

    public BasicBlock getNxtBlock() {
        return nxtBlock;
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }

    public Jump(BasicBlock nxtBlock) {
        this.nxtBlock = nxtBlock;
    }
}
