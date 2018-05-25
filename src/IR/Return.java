package IR;

public class Return extends Inst{
    private IntValue intValue;

    public Return(IntValue intValue) {
        this.intValue = intValue;
    }
}
