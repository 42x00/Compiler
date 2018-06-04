package Tools;

import AST_Node.DeclNodes.ClassDeclNode;
import AST_Node.DeclNodes.DeclNode;
import AST_Node.DeclNodes.FuncDeclNode;
import AST_Node.ProgNode;
import Backend.IRGenerator;
import IR.IRNodes.*;

import java.util.*;

public class DataFlowAnalysis {
    static private List<BasicBlock> reverseOrderBlockList;

    private void setDefUse(Inst inst) {
        if (inst instanceof Assign) {
            Assign assign = (Assign) inst;
            assign.addDef(assign.getLhs());
            assign.addDef(assign.getRhs());
        }
        else if (inst instanceof Bin) {
            Bin bin = (Bin) inst;
            bin.addUse(bin.getLhs());
            bin.addUse(bin.getRhs());
            bin.addDef(bin.getAns());
        }
        else if (inst instanceof Call) {
            Call call = (Call) inst;
            for (IntValue intValue : call.getIntValues()){
                call.addUse(intValue);
            }
        }
        else if (inst instanceof Cjump) {
            Cjump cjump = (Cjump) inst;
            cjump.addUse(cjump.getCond());
        }
        else if (inst instanceof Uni) {
            Uni uni = (Uni) inst;
            uni.addUse(uni.getObj());
            uni.addDef(uni.getAns());
        }
    }

    private void setReverseOrder(BasicBlock basicBlock) {
        reverseOrderBlockList.add(basicBlock);
        LinkedList<BasicBlock> pred = basicBlock.getPred();
        for (Iterator<BasicBlock> iter = pred.iterator(); iter.hasNext(); ) {
            setReverseOrder(iter.next());
        }
    }

    private void analysisFunc(FuncDeclNode funcDeclNode) {
        //set reverse order
        reverseOrderBlockList = new ArrayList<>();
        setReverseOrder(funcDeclNode.getOverBlock());

        //set def & use
        for (BasicBlock nowBlock : reverseOrderBlockList) {
            for (Inst inst : nowBlock.getInstList()) {
                setDefUse(inst);
            }
        }

        Set<Register> tmpIn;
        Set<Register> tmpOut;
        boolean flag;
        //slove the equation
        do {
            flag = true;
            for (BasicBlock nowBlock : reverseOrderBlockList){
                for (Inst inst : nowBlock.getInstList()){
                    //in' = in
                    tmpIn = inst.getIn();
                    //out' = out
                    tmpOut = inst.getOut();
                    inst.clearOut();

                    

                    //in = use V (out - def)
                    inst.getOut().removeAll(inst.getDef());
                    inst.clearIn();
                    inst.getIn().addAll(inst.getUse());
                    inst.getIn().addAll(inst.getOut());
                    //out = V succ in


                }
            }
        }
        while (true);
    }

    public void analysis(IRGenerator irGenerator, ProgNode progNode) {
        for (DeclNode declNode : progNode.getDeclarations()) {
            if (declNode instanceof FuncDeclNode) {
                analysisFunc((FuncDeclNode) declNode);
            } else if (declNode instanceof ClassDeclNode) {
                for (DeclNode declNodeInClass : ((ClassDeclNode) declNode).getClassdecllist()) {
                    if (declNodeInClass instanceof FuncDeclNode) {
                        analysisFunc((FuncDeclNode) declNodeInClass);
                    }
                }
            }
        }
    }
}
