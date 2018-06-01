package Tools;

import AST_Node.DeclNodes.ClassDeclNode;
import AST_Node.DeclNodes.DeclNode;
import AST_Node.DeclNodes.FuncDeclNode;
import AST_Node.DeclNodes.VarDeclNode;
import AST_Node.ExprNodes.UnaryExprNode;
import AST_Node.ProgNode;
import AST_Node.TypeNodes.ArrayTypeNode;
import AST_Node.TypeNodes.ClassTypeNode;
import AST_Node.TypeNodes.TypeNode;
import IR.IRNodes.*;
import IR.IRVisitor;
import Type.Type;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map;

import static java.lang.System.out;
import static java.lang.System.err;

public class CodeGenerator implements IRVisitor {
    static private Set<Integer> labelSet = new HashSet<>();

    static private Map<String, Integer> cntRegisterMap;
    static private Map<String, BasicBlock> funcBlockMap;
    private boolean isPrintMain = false;

    private void indent() {
        out.print('\t');
        err.print('\t');
    }

    private boolean trySetLabel(BasicBlock basicBlock) {
        if (labelSet.contains(basicBlock.getOrd())) return false;
        labelSet.add(basicBlock.getOrd());
        basicBlock.setLabel();
        return true;
    }

    private String c8t1(String s) {
        if (s.startsWith("qword")) {
            return "byte" + s.substring(5);
        }
        switch (s) {
            case "rsi":
                return "sil";
            case "rdi":
                return "dil";
            default:
                return s + 'b';
        }
    }

    public void generate(IRGenerator irGenerator, ProgNode progNode) {
        cntRegisterMap = irGenerator.getRegisterCntMap();
        funcBlockMap = irGenerator.getFuncBlockMap();

        //extern malloc
        out.println("extern malloc");
        err.println("extern malloc");
        //global main
        for (DeclNode declNode : progNode.getDeclarations()) {
            if (!(declNode instanceof ClassDeclNode)) {
                out.println("global " + declNode.getDeclname());
                err.println("global " + declNode.getDeclname());
            }
        }
        //SECTION .text
        out.println("SECTION .text");
        err.println("SECTION .text");
        //f:
        for (DeclNode declNode : progNode.getDeclarations()) {
            if (declNode instanceof FuncDeclNode) {
                //main:
                //     push rbp
                //     move rbp, rsp
                out.printf("%s:\n\tpush rbp\n\tmov rbp, rsp\n\t", declNode.getDeclname());
                err.printf("%s:\n\tpush rbp\n\tmov rbp, rsp\n\t", declNode.getDeclname());
                int cntRegister = cntRegisterMap.get(declNode.getDeclname());
                //     sub rsp, 8
                out.printf("sub rsp, %d\n", cntRegister * 8);
                err.printf("sub rsp, %d\n", cntRegister * 8);
                if (declNode.getDeclname().equals("main"))
                    isPrintMain = true;
                else {
                    //push rbp, rbx, r12, r13, r14, r15
                    out.print("\t" +
                            "push rbx\n\t" +
                            "push r12\n\t" +
                            "push r13\n\t" +
                            "push r14\n\t" +
                            "push r15\n\t");
                    err.print("\t" +
                            "push rbx\n\t" +
                            "push r12\n\t" +
                            "push r13\n\t" +
                            "push r14\n\t" +
                            "push r15\n\t");
                    List<VarDeclNode> varDeclNodeList = ((FuncDeclNode) declNode).getFunctionParameterList().getVardeclnodeList();
                    for (int index = varDeclNodeList.size() - 1; index >= 0; --index) {
                        if (index > 5) {
                            out.printf("mov %s, qword [rbp + %d]\n\t",
                                    varDeclNodeList.get(index).getIntValue().accept(this),
                                    (index - 4) * 8);
                            err.printf("mov %s, qword [rbp + %d]\n\t",
                                    varDeclNodeList.get(index).getIntValue().accept(this),
                                    (index - 4) * 8);
                        } else {
                            switch (index) {
                                case 0:
                                    out.printf("mov %s, rdi\n", varDeclNodeList.get(index).getIntValue().accept(this));
                                    err.printf("mov %s, rdi\n", varDeclNodeList.get(index).getIntValue().accept(this));
                                    break;
                                case 1:
                                    out.printf("mov %s, rsi\n\t", varDeclNodeList.get(index).getIntValue().accept(this));
                                    err.printf("mov %s, rsi\n\t", varDeclNodeList.get(index).getIntValue().accept(this));
                                    break;
                                case 2:
                                    out.printf("mov %s, rdx\n\t", varDeclNodeList.get(index).getIntValue().accept(this));
                                    err.printf("mov %s, rdx\n\t", varDeclNodeList.get(index).getIntValue().accept(this));
                                    break;
                                case 3:
                                    out.printf("mov %s, rcx\n\t", varDeclNodeList.get(index).getIntValue().accept(this));
                                    err.printf("mov %s, rcx\n\t", varDeclNodeList.get(index).getIntValue().accept(this));
                                    break;
                                case 4:
                                    out.printf("mov %s, r8\n\t", varDeclNodeList.get(index).getIntValue().accept(this));
                                    err.printf("mov %s, r8\n\t", varDeclNodeList.get(index).getIntValue().accept(this));
                                    break;
                                case 5:
                                    out.printf("mov %s, r9\n\t", varDeclNodeList.get(index).getIntValue().accept(this));
                                    err.printf("mov %s, r9\n\t", varDeclNodeList.get(index).getIntValue().accept(this));
                                    break;
                            }
                        }
                    }
                }
                funcBlockMap.get(declNode.getDeclname()).accept(this);
                isPrintMain = false;
            }
        }
        //SECTION .data
        out.println("SECTION .data");
        err.println("SECTION .data");
        //x: dq 0
        for (DeclNode declNode : progNode.getDeclarations()) {
            if (declNode instanceof VarDeclNode) {
                VarDeclNode varDeclNode = (VarDeclNode) declNode;
                if (!(varDeclNode.getVartype() instanceof ArrayTypeNode
                        || varDeclNode.getVartype() instanceof ClassTypeNode)) {
                    if (varDeclNode.getVartype().getBasetype() != Type.Types.STRING) {
                        out.println(varDeclNode.getVarname() + ": dq 0");
                        err.println(varDeclNode.getVarname() + ": dq 0");
                    }
                }
            }
        }
        //SECTION .data
        out.println("SECTION .bss");
        err.println("SECTION .bss");
        //x: dq 0
        for (DeclNode declNode : progNode.getDeclarations()) {
            if (declNode instanceof VarDeclNode) {
                VarDeclNode varDeclNode = (VarDeclNode) declNode;
                if (varDeclNode.getVartype() instanceof ArrayTypeNode ||
                        (varDeclNode.getVartype() instanceof TypeNode && varDeclNode.getVartype().getBasetype() == Type.Types.STRING)) {
                    out.println(varDeclNode.getVarname() + ": dq 0");
                    err.println(varDeclNode.getVarname() + ": dq 0");
                }
            }
        }

    }

    @Override
    public void visit(BasicBlock basicBlock) {
        for (Inst inst : basicBlock.getInstList()) {
            indent();
            inst.accept(this);
        }
    }

    @Override
    public void visit(Jump jump) {
        //jmp L_*
        out.println("jmp " + jump.getNxtBlock().toLabel());
        err.println("jmp " + jump.getNxtBlock().toLabel());
        if (trySetLabel(jump.getNxtBlock()))
            jump.getNxtBlock().accept(this);
    }

    @Override
    public void visit(Cjump cjump) {
        //cmp r, 0
        out.printf("cmp %s, 0\n\t", c8t1(cjump.getCond().accept(this)));
        err.printf("cmp %s, 0\n\t", c8t1(cjump.getCond().accept(this)));
        //jz L_*
        out.println("jz " + cjump.getElseBlock().toLabel());
        err.println("jz " + cjump.getElseBlock().toLabel());
        if (trySetLabel(cjump.getThenBlock()))
            cjump.getThenBlock().accept(this);
        if (trySetLabel(cjump.getElseBlock()))
            cjump.getElseBlock().accept(this);
    }

    @Override
    public void visit(Assign assign) {
        //mov rcx, r:*
        out.printf("mov rcx, %s\n\t", assign.getRhs().accept(this));
        err.printf("mov rcx, %s\n\t", assign.getRhs().accept(this));
        //mov l:*, rcx
        out.printf("mov %s, rcx\n", assign.getLhs().accept(this));
        err.printf("mov %s, rcx\n", assign.getLhs().accept(this));
    }

    @Override
    public void visit(Call call) {
        //push rdi, rsi, rdx, rcx, r8, r9
        out.print("push rdi\n\t" +
                "push rsi\n\t" +
                "push rdx\n\t" +
                "push rcx\n\t" +
                "push r8\n\t" +
                "push r9\n\t");
        err.print("push rdi\n\t" +
                "push rsi\n\t" +
                "push rdx\n\t" +
                "push rcx\n\t" +
                "push r8\n\t" +
                "push r9\n\t");
        //mov rdi, rsi, rdx, rcx, r8, r9  args*
        //push args*
        List<IntValue> intValueList = call.getIntValues();
        for (int index = intValueList.size() - 1; index >= 0; --index) {
            if (index > 5) {
                out.printf("push %s\n\t", intValueList.get(index).accept(this));
                err.printf("push %s\n\t", intValueList.get(index).accept(this));
            } else {
                switch (index) {
                    case 0:
                        out.printf("mov rdi, %s\n\t", intValueList.get(index).accept(this));
                        err.printf("mov rdi, %s\n\t", intValueList.get(index).accept(this));
                        break;
                    case 1:
                        out.printf("mov rsi, %s\n\t", intValueList.get(index).accept(this));
                        err.printf("mov rsi, %s\n\t", intValueList.get(index).accept(this));
                        break;
                    case 2:
                        out.printf("mov rdx, %s\n\t", intValueList.get(index).accept(this));
                        err.printf("mov rdx, %s\n\t", intValueList.get(index).accept(this));
                        break;
                    case 3:
                        out.printf("mov rcx, %s\n\t", intValueList.get(index).accept(this));
                        err.printf("mov rcx, %s\n\t", intValueList.get(index).accept(this));
                        break;
                    case 4:
                        out.printf("mov r8, %s\n\t", intValueList.get(index).accept(this));
                        err.printf("mov r8, %s\n\t", intValueList.get(index).accept(this));
                        break;
                    case 5:
                        out.printf("mov r9, %s\n\t", intValueList.get(index).accept(this));
                        err.printf("mov r9, %s\n\t", intValueList.get(index).accept(this));
                        break;
                }
            }
        }
        //call f
        out.printf("call %s\n\t", call.getFuncName());
        err.printf("call %s\n\t", call.getFuncName());
        //pop args*
        out.print("pop r9\n\t" +
                "pop r8\n\t" +
                "pop rcx\n\t" +
                "pop rdx\n\t" +
                "pop rsi\n\t" +
                "pop rdi\n");
        err.print("pop r9\n\t" +
                "pop r8\n\t" +
                "pop rcx\n\t" +
                "pop rdx\n\t" +
                "pop rsi\n\t" +
                "pop rdi\n");
    }

    @Override
    public void visit(Bin bin) {
        //mov rbx, l:*
        out.printf("mov rbx, %s\n\t", bin.getLhs().accept(this));
        err.printf("mov rbx, %s\n\t", bin.getLhs().accept(this));
        //mov rcx, r:*
        out.printf("mov rcx, %s\n\t", bin.getRhs().accept(this));
        err.printf("mov rcx, %s\n\t", bin.getRhs().accept(this));

        switch (bin.getBinaryOP()) {
            case GREATER_EQUAL:
                //cmp rbx, rcx
                out.print("cmp rbx, rcx\n\t");
                err.print("cmp rbx, rcx\n\t");
                //setge r
                out.printf("setge %s\n", c8t1(bin.getAns().accept(this)));
                err.printf("setge %s\n", c8t1(bin.getAns().accept(this)));
                break;
            case LESS_EQUAL:
                //cmp rbx, rcx
                out.print("cmp rbx, rcx\n\t");
                err.print("cmp rbx, rcx\n\t");
                //setle r
                out.printf("setle %s\n", c8t1(bin.getAns().accept(this)));
                err.printf("setle %s\n", c8t1(bin.getAns().accept(this)));
                break;
            case EQUAL:
                //cmp rbx, rcx
                out.print("cmp rbx, rcx\n\t");
                err.print("cmp rbx, rcx\n\t");
                //sete r
                out.printf("sete %s\n", c8t1(bin.getAns().accept(this)));
                err.printf("sete %s\n", c8t1(bin.getAns().accept(this)));
                break;
            case INEQUAL:
                //cmp rbx, rcx
                out.print("cmp rbx, rcx\n\t");
                err.print("cmp rbx, rcx\n\t");
                //setne r
                out.printf("setne %s\n", c8t1(bin.getAns().accept(this)));
                err.printf("setne %s\n", c8t1(bin.getAns().accept(this)));
                break;
            case GREATER:
                //cmp rbx, rcx
                out.print("cmp rbx, rcx\n\t");
                err.print("cmp rbx, rcx\n\t");
                //setg r
                out.printf("setg %s\n", c8t1(bin.getAns().accept(this)));
                err.printf("setg %s\n", c8t1(bin.getAns().accept(this)));
                break;
            case LESS:
                //cmp rbx, rcx
                out.print("cmp rbx, rcx\n\t");
                err.print("cmp rbx, rcx\n\t");
                //setl r
                out.printf("setl %s\n", c8t1(bin.getAns().accept(this)));
                err.printf("setl %s\n", c8t1(bin.getAns().accept(this)));
                break;

            case BIT_XOR: {
                String r = bin.getAns().accept(this);
                //mov r, rbx
                out.printf("mov %s, rbx\n\t", r);
                err.printf("mov %s, rbx\n\t", r);
                //xor r, rcx
                out.printf("xor %s, rcx\n", r);
                err.printf("xor %s, rcx\n", r);
                break;
            }
            case BIT_AND: {
                String r = bin.getAns().accept(this);
                //mov r, rbx
                out.printf("mov %s, rbx\n\t", r);
                err.printf("mov %s, rbx\n\t", r);
                //and r, rcx
                out.printf("and %s, rcx\n", r);
                err.printf("and %s, rcx\n", r);
                break;
            }
            case BIR_OR: {
                String r = bin.getAns().accept(this);
                //mov r, rbx
                out.printf("mov %s, rbx\n\t", r);
                err.printf("mov %s, rbx\n\t", r);
                //or r, rcx
                out.printf("or %s, rcx\n", r);
                err.printf("or %s, rcx\n", r);
                break;
            }

            case SHR: {
                String r = bin.getAns().accept(this);
                //mov r, rbx
                out.printf("mov %s, rbx\n\t", r);
                err.printf("mov %s, rbx\n\t", r);
                //sar r, cl
                out.printf("sar %s, cl\n", r);
                err.printf("sar %s, cl\n", r);
                break;
            }
            case SHL: {
                String r = bin.getAns().accept(this);
                //mov r, rbx
                out.printf("mov %s, rbx\n\t", r);
                err.printf("mov %s, rbx\n\t", r);
                //sal r, cl
                out.printf("sal %s, cl\n", r);
                err.printf("sal %s, cl\n", r);
                break;
            }

            case ADD: {
                String r = bin.getAns().accept(this);
                //mov r, rbx
                out.printf("mov %s, rbx\n\t", r);
                err.printf("mov %s, rbx\n\t", r);
                //add r, rcx
                out.printf("add %s, rcx\n", r);
                err.printf("add %s, rcx\n", r);
                break;
            }
            case SUB: {
                String r = bin.getAns().accept(this);
                //mov r, rbx
                out.printf("mov %s, rbx\n\t", r);
                err.printf("mov %s, rbx\n\t", r);
                //sub r, rcx
                out.printf("sub %s, rcx\n", r);
                err.printf("sub %s, rcx\n", r);
                break;
            }

            case MUL:
                //mov rax, rbx
                out.print("mov rax, rbx\n\t");
                err.print("mov rax, rbx\n\t");
                //imul rcx
                out.print("imul rcx\n\t");
                err.print("imul rcx\n\t");
                //mov r, rax
                out.printf("mov %s, rax\n", bin.getAns().accept(this));
                err.printf("mov %s, rax\n", bin.getAns().accept(this));
                break;

            case MOD:
                //mov rax, rbx
                out.print("mov rax, rbx\n\t");
                err.print("mov rax, rbx\n\t");
                //cdq
                //idiv rcx
                out.print("cdq\n\tidiv rcx\n\t");
                err.print("cdq\n\tidiv rcx\n\t");
                //mov r, rdx
                out.printf("mov %s, rdx\n", bin.getAns().accept(this));
                err.printf("mov %s, rdx\n", bin.getAns().accept(this));
                break;
            case DIV:
                //mov rax, rbx
                out.print("mov rax, rbx\n\t");
                err.print("mov rax, rbx\n\t");
                //cdq
                //idiv rcx
                out.print("cdq\n\tidiv rcx\n\t");
                err.print("cdq\n\tidiv rcx\n\t");
                //mov r, rax
                out.printf("mov %s, rax\n", bin.getAns().accept(this));
                err.printf("mov %s, rax\n", bin.getAns().accept(this));
                break;
        }
    }

    @Override
    public void visit(Uni uni) {
        switch (uni.getUnaryOP()) {
            case SELF_INC:
                //inc *
                out.printf("inc %s\n\t", uni.getObj().accept(this));
                err.printf("inc %s\n\t", uni.getObj().accept(this));
                break;
            case SELF_DEC:
                //dec *
                out.printf("dec %s\n\t", uni.getObj().accept(this));
                err.printf("dec %s\n\t", uni.getObj().accept(this));
                break;
            case POSI:
                break;
            case NEGE:
                //neg *
                out.printf("neg %s\n\t", uni.getObj().accept(this));
                err.printf("neg %s\n\t", uni.getObj().accept(this));
                break;
            case BIT_NOT:
                //not *
                out.printf("not %s\n\t", uni.getObj().accept(this));
                err.printf("not %s\n\t", uni.getObj().accept(this));
                break;
            case LOGIC_NOT:
                //xor *, 1
                out.printf("xor %s, 1\n\t", uni.getObj().accept(this));
                err.printf("xor %s, 1\n\t", uni.getObj().accept(this));
                break;
        }

        out.println();
        err.println();

        if (uni.getObj() != uni.getAns()) {
            //mov rcx, *
            out.printf("mov rcx, %s\n\t", uni.getObj().accept(this));
            err.printf("mov rcx, %s\n\t", uni.getObj().accept(this));
            //mov r, rcx
            out.printf("mov %s, rcx\n", uni.getAns().accept(this));
            err.printf("mov %s, rcx\n", uni.getAns().accept(this));
        }
    }

    @Override
    public String visit(ConstValue constValue) {
        return Integer.toString(constValue.getAnInt());
    }

    @Override
    public String visit(MemAddr memAddr) {
        String addr = "[" + memAddr.getBaseAddr().accept(this);
        if (memAddr.getOffset() != null) {
            if (memAddr.getOffset() instanceof ConstValue) {
                ConstValue constValue = (ConstValue) memAddr.getOffset();
                if (constValue.getAnInt() == 0)
                    addr += "]";
                else addr += " + " + Integer.toString(constValue.getAnInt() * 8) + "]";
            } else addr += " + " + memAddr.getOffset().accept(this) + "*8]";
        } else addr += "]";
        return addr;
    }

    @Override
    public String visit(Register register) {
        return register.toString();
    }

    @Override
    public String visit(GloalVar gloalVar) {
        return "qword [" + gloalVar.getDeclname() + ']';
    }

    @Override
    public void visit(ReturnInst returnInst) {
        if (!isPrintMain) {
            //pop rbp, rbx, r12, r13, r14, r15
            out.print("pop r15\n\t" +
                    "pop r14\n\t" +
                    "pop r13\n\t" +
                    "pop r12\n\t" +
                    "pop rbx\n\t");
            err.print("pop r15\n\t" +
                    "pop r14\n\t" +
                    "pop r13\n\t" +
                    "pop r12\n\t" +
                    "pop rbx\n\t");
        }
        //leave
        //ret
        out.println("leave\n\tret");
        err.println("leave\n\tret");
    }

}
