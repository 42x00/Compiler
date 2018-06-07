package IR.IRNodes;

import IR.IRVisitor;

import java.util.*;

import static java.lang.System.err;
import static java.lang.System.out;

public class BasicBlock{
    private List<Inst> instList;
    private int ord;
    private LinkedList<BasicBlock> pred;
    private LinkedList<BasicBlock> succ;
    private boolean isReverseVisit;
    private boolean isVisit;
    private boolean isForBody;

    static private int cntBasicBlock = 0;

    public BasicBlock() {
        instList = new ArrayList<>();
        pred = new LinkedList<>();
        succ = new LinkedList<>();
        ord = cntBasicBlock++;
        isReverseVisit = false;
    }

    public BasicBlock(boolean isForBody) {
        instList = new ArrayList<>();
        pred = new LinkedList<>();
        succ = new LinkedList<>();
        ord = cntBasicBlock++;
        isReverseVisit = false;
        this.isForBody = true;
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

    public void resetPredBlock(BasicBlock oldBlock, BasicBlock newBlock){
        for (Iterator<BasicBlock> iter = pred.iterator(); iter.hasNext(); ){
            BasicBlock checkBlock = iter.next();
            if (checkBlock == oldBlock) iter.remove();
        }
        pred.push(newBlock);
    }

    public void resetSuccBlock(BasicBlock oldBlock, BasicBlock newBlock){
        for (Iterator<BasicBlock> iter = succ.iterator(); iter.hasNext(); ){
            BasicBlock checkBlock = iter.next();
            if (checkBlock == oldBlock) iter.remove();
        }
        succ.push(newBlock);
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

    public boolean isForBody() {
        return isForBody;
    }

    public void accept(IRVisitor visitor){
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return toLabel();
    }
}
