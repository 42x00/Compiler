package Tools;

import AST_Node.DeclNodes.ClassDeclNode;
import AST_Node.DeclNodes.DeclNode;
import AST_Node.DeclNodes.VarDeclNode;
import AST_Node.ExprNodes.UnaryExprNode;
import AST_Node.ProgNode;
import AST_Node.TypeNodes.TypeNode;
import IR.IRNodes.*;
import IR.IRVisitor;
import Type.Type;

import java.util.HashSet;
import java.util.Set;

import static java.lang.System.out;

public class CodeGenerator implements IRVisitor {
    static private Set<Integer> labelSet = new HashSet<>();

    private void indent() {
        out.print('\t');
    }

    private boolean trySetLabel(BasicBlock basicBlock) {
        if (labelSet.contains(basicBlock.getOrd())) return false;
        labelSet.add(basicBlock.getOrd());
        basicBlock.setLabel();
        return true;
    }

    private String c8t1(String s) {
        switch (s) {
            case "rsi":
                return "sil";
            case "rdi":
                return "dil";
            default:
                return s + 'b';
        }
    }

    public void generate(BasicBlock startBlock, ProgNode progNode) {
        for (DeclNode declNode : progNode.getDeclarations()) {
            if (!(declNode instanceof ClassDeclNode)) {
                out.println("global " + declNode.getDeclname());
            }
        }
        out.println("SECTION .text");
        out.println("main:");
        indent();
        out.println("push rbp");
        indent();
        out.println("mov rbp, rsp");

        startBlock.accept(this);

        out.println("SECTION .data");
        for (DeclNode declNode : progNode.getDeclarations()) {
            if (declNode instanceof VarDeclNode) {
                VarDeclNode varDeclNode = (VarDeclNode) declNode;
                if (varDeclNode.getVartype() instanceof TypeNode) {
                    if (varDeclNode.getVartype().getBasetype() == Type.Types.INT) {
                        out.println(varDeclNode.getVarname() + ": dq 0");
                    }
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
        if (trySetLabel(jump.getNxtBlock()))
            jump.getNxtBlock().accept(this);
    }

    @Override
    public void visit(Cjump cjump) {
        //cmp r, 0
        out.printf("cmp %s, 0\n\t", cjump.getCond().accept(this));
        //jz L_*
        out.println("jz " + cjump.getElseBlock().toLabel());
        if (trySetLabel(cjump.getThenBlock()))
            cjump.getThenBlock().accept(this);
        if (trySetLabel(cjump.getElseBlock()))
            cjump.getElseBlock().accept(this);
    }

    @Override
    public void visit(Assign assign) {
        if ((assign.getLhs() instanceof MemAddr || assign.getLhs() instanceof GloalVar) && (assign.getRhs() instanceof MemAddr || assign.getRhs() instanceof GloalVar)) {
            //mov rcx, r:qword []
            out.printf("mov rcx, %s\n", assign.getRhs().accept(this));
            indent();
            //mov l:qword [], r:qword []
            out.printf("mov %s, %s\n", assign.getLhs().accept(this), assign.getRhs().accept(this));
            return;
        }
        //mov l:*, r:*
        out.printf("mov %s, %s\n", assign.getLhs().accept(this), assign.getRhs().accept(this));
    }

    @Override
    public void visit(Bin bin) {
        //push rbx
        //push rcx
        out.print("push rbx\n\tpush rcx\n\t");

        //mov rbx, l:*
        out.printf("mov rbx, %s\n", bin.getLhs().accept(this));
        indent();
        //mov rcx, r:*
        out.printf("mov rcx, %s\n", bin.getRhs().accept(this));
        indent();

        switch (bin.getBinaryOP()) {
            case GREATER_EQUAL:
                //cmp rbx, rcx
                out.print("cmp rbx, rcx\n\t");
                //setge r
                out.printf("setge %s\n", c8t1(bin.getAns().accept(this)));
                break;
            case LESS_EQUAL:
                //cmp rbx, rcx
                out.print("cmp rbx, rcx\n\t");
                //setle r
                out.printf("setle %s\n", c8t1(bin.getAns().accept(this)));
                break;
            case EQUAL:
                //cmp rbx, rcx
                out.print("cmp rbx, rcx\n\t");
                //sete r
                out.printf("sete %s\n", c8t1(bin.getAns().accept(this)));
                break;
            case INEQUAL:
                //cmp rbx, rcx
                out.print("cmp rbx, rcx\n\t");
                //setne r
                out.printf("setne %s\n", c8t1(bin.getAns().accept(this)));
                break;
            case GREATER:
                //cmp rbx, rcx
                out.print("cmp rbx, rcx\n\t");
                //setg r
                out.printf("setg %s\n", c8t1(bin.getAns().accept(this)));
                break;
            case LESS:
                //cmp rbx, rcx
                out.print("cmp rbx, rcx\n\t");
                //setl r
                out.printf("setl %s\n", c8t1(bin.getAns().accept(this)));
                break;

            case BIT_XOR: {
                String r = bin.getAns().accept(this);
                //mov r, rbx
                out.printf("mov %s, rbx\n\t", r);
                //xor r, rcx
                out.printf("xor %s, rcx\n", r);
                break;
            }
            case BIT_AND: {
                String r = bin.getAns().accept(this);
                //mov r, rbx
                out.printf("mov %s, rbx\n\t", r);
                //and r, rcx
                out.printf("and %s, rcx\n", r);
                break;
            }
            case BIR_OR: {
                String r = bin.getAns().accept(this);
                //mov r, rbx
                out.printf("mov %s, rbx\n\t", r);
                //or r, rcx
                out.printf("or %s, rcx\n", r);
                break;
            }

            case SHR: {
                String r = bin.getAns().accept(this);
                //mov r, rbx
                out.printf("mov %s, rbx\n\t", r);
                //sar r, cl
                out.printf("sar %s, cl\n", r);
                break;
            }
            case SHL: {
                String r = bin.getAns().accept(this);
                //mov r, rbx
                out.printf("mov %s, rbx\n\t", r);
                //sal r, cl
                out.printf("sar %s, cl\n", r);
                break;
            }

            case ADD: {
                String r = bin.getAns().accept(this);
                //mov r, rbx
                out.printf("mov %s, rbx\n\t", r);
                //add r, rcx
                out.printf("add %s, rcx\n", r);
                break;
            }
            case SUB: {
                String r = bin.getAns().accept(this);
                //mov r, rbx
                out.printf("mov %s, rbx\n\t", r);
                //sub r, rcx
                out.printf("sub %s, rcx\n", r);
                break;
            }

            case MUL:
                //push rax
                //push rdx
                out.print("push rax\n\tpush rdx\n\t");
                //mov rax, rbx
                out.print("mov rax, rbx\n\t");
                //imul rcx
                out.print("imul rcx\n\t");
                //mov r, rax
                out.printf("mod %s, rax", bin.getAns().accept(this));
                //pop rdx
                //pop rax
                out.println("\tpop rdx\n\tpop rax");
                break;

            case MOD:
                //push rax
                //push rdx
                out.print("push rax\n\tpush rdx\n\t");
                //mov rax, rbx
                out.print("mov rax, rbx\n\t");
                //cdq
                //idiv rcx
                out.print("cdq\n\tidiv rcx\n\t");
                //mov r, rdx
                out.printf("mod %s, rdx", bin.getAns().accept(this));
                //pop rdx
                //pop rax
                out.println("\tpop rdx\n\tpop rax");
                break;
            case DIV:
                //push rax
                //push rdx
                out.print("push rax\n\tpush rdx\n\t");
                //mov rax, rbx
                out.print("mov rax, rbx\n\t");
                //cdq
                //idiv rcx
                out.print("cdq\n\tidiv rcx\n\t");
                //mov r, rax
                out.printf("mod %s, rax", bin.getAns().accept(this));
                //pop rdx
                //pop rax
                out.println("\tpop rdx\n\tpop rax");
                break;
        }

        //pop rcx
        //pop rbx
        out.println("\tpop rcx\n\tpop rbx");
    }

    @Override
    public void visit(Uni uni) {
        if (uni.getUnaryOP() == UnaryExprNode.UnaryOP.SELF_INC) {
            out.printf("inc %s\n", uni.getObj().accept(this));
        } else {
            out.printf("dec %s\n", uni.getObj().accept(this));
        }

    }

    @Override
    public String visit(ConstValue constValue) {
        return Integer.toString(constValue.getAnInt());
    }

    @Override
    public String visit(MemAddr memAddr) {
        return "[ mem ]";
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
        //mov rax, r:*
        out.printf("mov rax, %s\n\t", returnInst.getIntValue().accept(this));
        //leave
        //ret
        out.println("leave\n\tret");
    }

}
