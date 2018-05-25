package IR;

public class Cjump extends Inst{
    private IntValue Cond;
    private BasicBlock thenBlock, elseBlock;

    public Cjump(IntValue cond, BasicBlock thenBlock, BasicBlock elseBlock) {
        Cond = cond;
        this.thenBlock = thenBlock;
        this.elseBlock = elseBlock;
    }
}
