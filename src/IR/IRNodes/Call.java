package IR.IRNodes;

import IR.IRVisitor;

import java.util.ArrayList;
import java.util.List;

public class Call extends Inst{
    private String funcName;
    private List<IntValue> intValues;

    public Call(String funcName, List<IntValue> intValues) {
        this.funcName = funcName;
        this.intValues = intValues;
    }

    public Call(String funcName, IntValue intValue){
        this.funcName = funcName;
        this.intValues = new ArrayList<>();
        this.intValues.add(intValue);
    }

    public Call(String funcName) {
        this.funcName = funcName;
        this.intValues = new ArrayList<>();
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
