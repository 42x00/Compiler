package IR;

public class Jump extends Inst{
    private BasicBlock nxtBlock;

    public Jump(BasicBlock nxtBlock) {
        this.nxtBlock = nxtBlock;
    }
}
