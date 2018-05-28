package IR.IRNodes;

import IR.IRVisitor;

public class Cjump extends Inst{
    private IntValue Cond;
    private BasicBlock thenBlock, elseBlock;

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }

    public Cjump(IntValue cond, BasicBlock thenBlock, BasicBlock elseBlock) {
        Cond = cond;
        this.thenBlock = thenBlock;
        this.elseBlock = elseBlock;
    }

    public IntValue getCond() {
        return Cond;
    }

    public BasicBlock getThenBlock() {
        return thenBlock;
    }

    public BasicBlock getElseBlock() {
        return elseBlock;
    }
}
