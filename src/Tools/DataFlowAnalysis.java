package Tools;

import AST_Node.DeclNodes.ClassDeclNode;
import AST_Node.DeclNodes.DeclNode;
import AST_Node.DeclNodes.FuncDeclNode;
import AST_Node.DeclNodes.VarDeclNode;
import AST_Node.ProgNode;
import Backend.IRGenerator;
import IR.IRNodes.*;

import java.util.*;

import static java.lang.System.err;
import static java.lang.System.out;

public class DataFlowAnalysis {
    private static class VirtualRegisterInfo {
        Set<Register> neighbour = new HashSet<>();
        int degree = 0;
        int color = 0;
        boolean deleted = false;

        void addEdge(Register register) {
            neighbour.add(register);
            ++degree;
        }
    }

    private Map<Register, VirtualRegisterInfo> virtualRegisterInfoMap;
    private LinkedList<Register> registerStack;
    private List<BasicBlock> reverseOrderBlockList;
    private List<BasicBlock> orderBlockList;
    private Set<Register> virtualRegisters;

    private int cntColor = 5;

    private void setDefUse(Inst inst) {
        if (inst instanceof Assign) {
            Assign assign = (Assign) inst;
            assign.addDef(assign.getLhs());
            assign.addUse(assign.getRhs());
        } else if (inst instanceof Bin) {
            Bin bin = (Bin) inst;
            bin.addUse(bin.getLhs());
            bin.addUse(bin.getRhs());
            bin.addDef(bin.getAns());
        } else if (inst instanceof Cjump) {
            Cjump cjump = (Cjump) inst;
            cjump.addUse(cjump.getCond());
        } else if (inst instanceof Uni) {
            Uni uni = (Uni) inst;
            uni.addUse(uni.getObj());
            uni.addDef(uni.getAns());
        } else if (inst instanceof Push) {
            Push push = (Push) inst;
            push.addUse(push.getIntValue());
        }
    }

    private void setConflictEdge(Inst inst) {
        IntValue intValue = null;
        if (inst instanceof Assign) {
            intValue = ((Assign) inst).getLhs();
        } else if (inst instanceof Bin) {
            intValue = ((Bin) inst).getAns();
        } else if (inst instanceof Uni) {
            intValue = ((Uni) inst).getAns();
        }
        if (intValue != null && intValue instanceof Register) {
            Register register = (Register) intValue;
            if (register.getOrd() > 15) {
                Register outRegister;
                for (Iterator<Register> iter = inst.getOut().iterator(); iter.hasNext(); ) {
                    outRegister = iter.next();
                    addEdge(register, outRegister);
                }
            }
        }
    }

    private void viewOrder(BasicBlock basicBlock) {
        orderBlockList.add(basicBlock);
        basicBlock.setVisit();
        LinkedList<BasicBlock> succ = basicBlock.getSucc();
        for (Iterator<BasicBlock> iter = succ.iterator(); iter.hasNext(); ) {
            BasicBlock nxtBlock = iter.next();
            if (!nxtBlock.isVisit())
                viewOrder(nxtBlock);
        }
    }

    private void setReverseOrder(BasicBlock basicBlock) {
        basicBlock.setReverseVisit();
        reverseOrderBlockList.add(basicBlock);
        LinkedList<BasicBlock> pred = basicBlock.getPred();
        for (Iterator<BasicBlock> iter = pred.iterator(); iter.hasNext(); ) {
            BasicBlock preBlock = iter.next();
            if (!preBlock.isReverseVisit())
                setReverseOrder(preBlock);
        }
    }

    private void livenessAnalysis(FuncDeclNode funcDeclNode) {
        reverseOrderBlockList = new ArrayList<>();

        //set reverse order
        setReverseOrder(funcDeclNode.getOverBlock());
        reverseOrderBlockList.remove(0);

        //clear more jump
        for (BasicBlock nowBloc : reverseOrderBlockList) {
            List<Inst> insts = nowBloc.getInstList();
            int cnt = 0;
            for (Inst inst : insts) {
                if (inst instanceof Jump || inst instanceof Cjump || inst instanceof ReturnInst)
                    ++cnt;
            }
            if (cnt > 1) {
                int endindex = -1;
                for (Inst inst : insts) {
                    ++endindex;
                    if (inst instanceof Jump || inst instanceof Cjump || inst instanceof ReturnInst)
                        break;
                }
                for (int index = insts.size() - 1; index > endindex; --index) {
                    insts.remove(index);
                }
            }
        }

        //set def & use
        for (BasicBlock nowBlock : reverseOrderBlockList) {
            for (Inst inst : nowBlock.getInstList()) {
                setDefUse(inst);
            }
        }

        Set<Register> tmpIn;
        Set<Register> tmpOut;

        boolean flag = false;
        //slove the equation
        do {
            flag = true;
            for (BasicBlock nowBlock : reverseOrderBlockList) {
                for (int index = nowBlock.getInstList().size() - 1; index >= 0; --index) {
                    Inst inst = nowBlock.getInstList().get(index);
                    //in' = in
                    tmpIn = inst.getIn();
                    //out' = out
                    tmpOut = inst.getOut();
                    //out = V succ in
                    inst.clearOut();
                    if (inst instanceof Jump) {
                        Jump jump = (Jump) inst;
                        inst.getOut().addAll(jump.getNxtBlock().getIn());
                    } else if (inst instanceof Cjump) {
                        Cjump cjump = (Cjump) inst;
                        inst.getOut().addAll(cjump.getThenBlock().getIn());
                        inst.getOut().addAll(cjump.getElseBlock().getIn());
                    } else
                        inst.getOut().addAll((nowBlock.getInstList().get(index + 1)).getIn());
                    //in = use V (out - def)
                    inst.clearIn();
                    inst.getIn().addAll(inst.getOut());
                    inst.getIn().removeAll(inst.getDef());
                    inst.getIn().addAll(inst.getUse());
                    if (!inst.getIn().equals(tmpIn) || !inst.getOut().equals(tmpOut))
                        flag = false;
                }
            }
        }
        while (!flag);
    }

    private VirtualRegisterInfo getInfo(Register register) {
        return virtualRegisterInfoMap.get(register);
    }

    private void addEdge(Register x, Register y) {
        getInfo(x).addEdge(y);
        getInfo(y).addEdge(x);
    }

    private void deleteNode(Register register) {
        registerStack.push(register);
        VirtualRegisterInfo virtualRegisterInfo = getInfo(register);
        virtualRegisterInfo.deleted = true;
        Register neighbour;
        for (Iterator<Register> iter = virtualRegisterInfo.neighbour.iterator(); iter.hasNext(); ) {
            neighbour = iter.next();
            --getInfo(neighbour).degree;
        }
    }

    private boolean tryColor(Register register, int tryColor) {
        VirtualRegisterInfo virtualRegisterInfo = getInfo(register);
        for (Register neighbour : virtualRegisterInfo.neighbour) {
            if (tryColor == getInfo(neighbour).color)
                return false;
        }
        virtualRegisterInfo.color = tryColor;
        return true;
    }

    private void buildRIG(FuncDeclNode funcDeclNode) {
        registerStack = new LinkedList<>();
        //collect viturl register
        virtualRegisters = new HashSet<>();
        for (BasicBlock basicBlock : reverseOrderBlockList) {
            for (Inst inst : basicBlock.getInstList()) {
                virtualRegisters.addAll(inst.getDef());
            }
        }
        for (VarDeclNode varDeclNode : funcDeclNode.getFunctionParameterList().getVardeclnodeList()) {
            virtualRegisters.add((Register) varDeclNode.getIntValue());
        }

        //set Map
        virtualRegisterInfoMap = new HashMap<>();
        for (Iterator<Register> iter = virtualRegisters.iterator(); iter.hasNext(); )
            virtualRegisterInfoMap.put(iter.next(), new VirtualRegisterInfo());


        //add conflict edges
        for (BasicBlock basicBlock : reverseOrderBlockList) {
            for (Inst inst : basicBlock.getInstList()) {
                setConflictEdge(inst);
            }
        }

        //coloring graph
        VirtualRegisterInfo virtualRegisterInfo;
        Register registerWithLowDegree;
        boolean flag;
        int cntLeft = virtualRegisters.size();
        while (cntLeft > 0) {
            flag = false;
            for (Iterator<Register> iter = virtualRegisters.iterator(); iter.hasNext(); ) {
                registerWithLowDegree = iter.next();
                virtualRegisterInfo = getInfo(registerWithLowDegree);
                if (virtualRegisterInfo.deleted) continue;
                if (virtualRegisterInfo.degree < cntColor) {
                    deleteNode(registerWithLowDegree);
                    flag = true;
                    --cntLeft;
                    break;
                }
            }
            if (flag) continue;
            for (Iterator<Register> iter = virtualRegisters.iterator(); iter.hasNext(); ) {
                registerWithLowDegree = iter.next();
                virtualRegisterInfo = getInfo(registerWithLowDegree);
                if (virtualRegisterInfo.deleted) continue;
                deleteNode(registerWithLowDegree);
                --cntLeft;
                break;
            }
        }

        //color stack
        while (registerStack.size() > 0) {
            Register register = registerStack.pop();
            for (int colorIndex = 1; colorIndex <= cntColor && !tryColor(register, colorIndex); ++colorIndex) ;
        }
    }

    private void setPhysicalRegister() {
        for (Register register : virtualRegisters) {
            int setColor = getInfo(register).color;
            err.println(register.toString() + " " + Integer.toString(setColor));
            switch (setColor) {
                case 1:
                    register.setOrd(Register.RegisterName.R12);
                    break;
                case 2:
                    register.setOrd(Register.RegisterName.R13);
                    break;
                case 3:
                    register.setOrd(Register.RegisterName.R14);
                    break;
                case 4:
                    register.setOrd(Register.RegisterName.R15);
                    break;
                case 5:
                    register.setOrd(Register.RegisterName.RBX);
                    break;
                case 6:
                    register.setOrd(Register.RegisterName.RSI);
                    break;
                case 7:
                    register.setOrd(Register.RegisterName.R8);
                    break;
                case 8:
                    register.setOrd(Register.RegisterName.R9);
                    break;
            }
        }
    }


    private void viewRightOrder(FuncDeclNode funcDeclNode){
        orderBlockList = new ArrayList<>();
        viewOrder(funcDeclNode.getStartBlock());

        for (BasicBlock basicBlock : orderBlockList) {

            out.println("=============================");
            out.println(basicBlock.toLabel());
            for (Inst inst : basicBlock.getInstList()) {
                if (inst instanceof Cjump) {
                    Cjump cjump = (Cjump) inst;
                    out.printf("cjp %s %s\n", cjump.getThenBlock(), cjump.getElseBlock());
                } else if (inst instanceof Jump) {
                    Jump jump = (Jump) inst;
                    out.printf("jmp %s\n", jump.getNxtBlock());
                }
            }
        }
    }

    private void analysisFunc(FuncDeclNode funcDeclNode) {
        livenessAnalysis(funcDeclNode);
        buildRIG(funcDeclNode);
        setPhysicalRegister();
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
