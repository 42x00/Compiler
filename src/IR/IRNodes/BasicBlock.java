package IR.IRNodes;

import IR.IRVisitor;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import static java.lang.System.err;
import static java.lang.System.out;

public class BasicBlock{
    private List<Inst> instList;
    private int ord;
    private LinkedList<BasicBlock> pred;
    private LinkedList<BasicBlock> succ;
    private boolean isReverseVisit;

    private boolean isVisit;

    static private int cntBasicBlock = 0;

    public BasicBlock() {
        instList = new ArrayList<>();
        pred = new LinkedList<>();
        succ = new LinkedList<>();
        ord = cntBasicBlock++;
        isReverseVisit = false;
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
    }

    public List<Inst> getInstList() {
        return instList;
    }

    public LinkedList<BasicBlock> getPred() {
        return pred;
    }

    public LinkedList<BasicBlock> getSucc() {
        return succ;
    }

    public Set<Register> getIn(){
        return instList.get(0).getIn();
    }

    public boolean isReverseVisit() {
        return isReverseVisit;
    }

    public boolean isVisit() {
        return isVisit;
    }

    public void setVisit() {
        isVisit = true;
    }

    public void setReverseVisit() {
        isReverseVisit = true;
    }

    public void pushPred(BasicBlock basicBlock){
        pred.push(basicBlock);
    }

    public void pushSucc(BasicBlock basicBlock){
        succ.push(basicBlock);
    }

    public void append(Inst inst){
        instList.add(inst);
    }

    public void accept(IRVisitor visitor){
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return toLabel();
    }
}
