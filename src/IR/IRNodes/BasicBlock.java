package IR.IRNodes;

import IR.IRVisitor;

import java.util.ArrayList;
import java.util.List;

public class BasicBlock{
    private List<Inst> instList;

    public BasicBlock() {
        instList = new ArrayList<>();
    }

    public List<Inst> getInstList() {
        return instList;
    }

    public void append(Inst inst){
        instList.add(inst);
    }

    public void accept(IRVisitor visitor){
        visitor.visit(this);
    }
}
