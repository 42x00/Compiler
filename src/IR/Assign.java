package IR;

public class Assign extends Inst{
    private int lhs;
    private IntValue rhs;

    public Assign(int lhs, IntValue rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }
}
