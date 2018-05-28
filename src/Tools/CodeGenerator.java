package Tools;

import IR.IRNodes.*;
import IR.IRVisitor;

import static java.lang.System.in;
import static java.lang.System.out;

public class CodeGenerator implements IRVisitor {
    private static int cntLabel = 0;

    private void indent(){
        out.print('\t');
    }

    private void setLabel(int cntLabel){
        out.println("L_" + Integer.toString(cntLabel));
    }

    public void fromIR(BasicBlock startBlock){
        out.print("default rel\n\nglobal main\n\nSECTION .text\n\n");
        out.println("main:");
        startBlock.accept(this);
    }

    @Override
    public void visit(BasicBlock basicBlock) {
        for (Inst inst : basicBlock.getInstList()){
            indent();
            inst.accept(this);
        }
    }

    @Override
    public void visit(Jump jump) {
        out.println("jmp\tL_" + Integer.toString(++cntLabel));
        setLabel(cntLabel);
        jump.getNxtBlock().accept(this);
    }

    @Override
    public void visit(Cjump cjump) {
        int elseLabel = ++cntLabel;
        out.println("js\tL_" + Integer.toString(elseLabel));
        cjump.getThenBlock().accept(this);
        setLabel(elseLabel);
        cjump.getElseBlock().accept(this);
    }

    @Override
    public void visit(Assign assign) {
        out.print("movq\t");
        out.print("[rbp - " + Integer.toString(assign.getLhs()) + "]\t");
        assign.getRhs().accept(this);
    }

    @Override
    public void visit(Bin bin) {

    }

    @Override
    public void visit(Uni uni) {

    }

    @Override
    public void visit(ConstValue constValue) {

    }

    @Override
    public void visit(MemAddr memAddr) {

    }

    @Override
    public void visit(Register register) {

    }

    @Override
    public void visit(ReturnInst returnInst) {

    }
}
