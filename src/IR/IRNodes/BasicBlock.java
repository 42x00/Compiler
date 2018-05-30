package IR.IRNodes;

import IR.IRVisitor;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.err;
import static java.lang.System.out;

public class BasicBlock{
    private List<Inst> instList;
    private int ord;

    static private int cntBasicBlock = 0;

    public BasicBlock() {
        instList = new ArrayList<>();
        ord = cntBasicBlock++;
    }

    public int getOrd() {
        return ord;
    }

    public void setOrd(int ord) {
        this.ord = ord;
    }

    public String toLabel(){
        return "L_" + Integer.toString(ord);
    }

    public void setLabel(){
        out.println(toLabel() + ":");
        err.println(toLabel() + ":");
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
