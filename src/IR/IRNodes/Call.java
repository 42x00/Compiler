package IR.IRNodes;

import IR.IRVisitor;

import java.util.ArrayList;
import java.util.List;

public class Call extends Inst{
    private String funcName;

    public Call(String funcName) {
        this.funcName = funcName;
    }

    public String getFuncName() {
        return funcName;
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }
}
