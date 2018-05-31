package IR.IRNodes;

import IR.IRVisitor;

import java.util.List;

public class Call extends Inst{
    private String funcName;
    private List<IntValue> intValues;

    public Call(String funcName, List<IntValue> intValues) {
        this.funcName = funcName;
        this.intValues = intValues;
    }

    public String getFuncName() {
        return funcName;
    }

    public List<IntValue> getIntValues() {
        return intValues;
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }
}
