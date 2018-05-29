package Tools;

import AST_Node.DeclNodes.ClassDeclNode;
import AST_Node.DeclNodes.DeclNode;
import AST_Node.DeclNodes.VarDeclNode;
import AST_Node.ExprNodes.BinaryExprNode;
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
        out.println("jmp " + jump.getNxtBlock().toLabel());
        if (trySetLabel(jump.getNxtBlock()))
            jump.getNxtBlock().accept(this);
    }

    @Override
    public void visit(Cjump cjump) {
        out.print("cmp ");
        cjump.getCond().accept(this);
        out.println(", 0");
        indent();
        out.println("jz " + cjump.getElseBlock().toLabel());
        if (trySetLabel(cjump.getThenBlock()))
            cjump.getThenBlock().accept(this);
        if (trySetLabel(cjump.getElseBlock()))
            cjump.getElseBlock().accept(this);
    }

    @Override
    public void visit(Assign assign) {
        if ((assign.getLhs() instanceof MemAddr || assign.getLhs() instanceof GloalVar) && (assign.getRhs() instanceof MemAddr || assign.getRhs() instanceof GloalVar)) {
            //mov rcx, qword [rbp - ?]
            //mov rcx, qword [x]
            out.print("mov rcx, ");
            assign.getRhs().accept(this);
            out.println();
            indent();
            //mov qword [rbp - ?], qword [rbp - ?]
            out.print("mov ");
            assign.getLhs().accept(this);
            out.print(", ");
            assign.getRhs().accept(this);
            out.println();
            return;
        }
        //mov xxx, xxx
        out.print("mov ");
        assign.getLhs().accept(this);
        out.print(", ");
        assign.getRhs().accept(this);
        out.println();

    }

    @Override
    public void visit(Bin bin) {
        IntValue lhs = bin.getLhs();
        IntValue rhs = bin.getRhs();

        switch (bin.getBinaryOP()) {
            case GREATER_EQUAL:
                //cmp r:l r:r
                out.print("cmp ");
                lhs.accept(this);
                out.print(", ");
                rhs.accept(this);
                out.println();
                indent();
                //setge r
                out.print("setge ");
                bin.getAns().accept(this);
                out.println();
                break;
            case LESS_EQUAL:
                //cmp r:l r:r
                out.print("cmp ");
                lhs.accept(this);
                out.print(", ");
                rhs.accept(this);
                out.println();
                indent();
                //setle r
                out.print("setle ");
                bin.getAns().accept(this);
                out.println();
                break;
            case EQUAL:
                //cmp r:l r:r
                out.print("cmp ");
                lhs.accept(this);
                out.print(", ");
                rhs.accept(this);
                out.println();
                indent();
                //sete r
                out.print("sete ");
                bin.getAns().accept(this);
                out.println();
                break;
            case INEQUAL:
                //cmp r:l r:r
                out.print("cmp ");
                lhs.accept(this);
                out.print(", ");
                rhs.accept(this);
                out.println();
                indent();
                //setne r
                out.print("setne ");
                bin.getAns().accept(this);
                out.println();
                break;
            case GREATER:
                //cmp r:l r:r
                out.print("cmp ");
                lhs.accept(this);
                out.print(", ");
                rhs.accept(this);
                out.println();
                indent();
                //setg r
                out.print("setg ");
                bin.getAns().accept(this);
                out.println();
                break;
            case LESS:
                //cmp r:l r:r
                out.print("cmp ");
                lhs.accept(this);
                out.print(", ");
                rhs.accept(this);
                out.println();
                indent();
                //setl r
                out.print("setl ");
                bin.getAns().accept(this);
                out.println();
                break;

            case BIT_XOR:
                //mov r, r:l
                out.print("mov ");
                bin.getAns().accept(this);
                out.print(", ");
                lhs.accept(this);
                out.println();
                indent();
                //xor r, r:r
                out.print("xor ");
                bin.getAns().accept(this);
                out.print(", ");
                rhs.accept(this);
                out.println();
                break;
            case BIT_AND:
                //mov r, r:l
                out.print("mov ");
                bin.getAns().accept(this);
                out.print(", ");
                lhs.accept(this);
                out.println();
                indent();
                //and r, r:r
                out.print("and ");
                bin.getAns().accept(this);
                out.print(", ");
                rhs.accept(this);
                out.println();
                break;
            case BIR_OR:
                //mov r, r:l
                out.print("mov ");
                bin.getAns().accept(this);
                out.print(", ");
                lhs.accept(this);
                out.println();
                indent();
                //or r, r:r
                out.print("or ");
                bin.getAns().accept(this);
                out.print(", ");
                rhs.accept(this);
                out.println();
                break;
            case SHR:
                //mov r, r:l
                out.print("mov ");
                bin.getAns().accept(this);
                out.print(", ");
                lhs.accept(this);
                out.println();
                indent();
                //sar r, cl
                out.print("sar ");
                bin.getAns().accept(this);
                out.println(", cl");
                break;
            case SHL:
                //mov r, r:l
                out.print("mov ");
                bin.getAns().accept(this);
                out.print(", ");
                lhs.accept(this);
                out.println();
                indent();
                //sal r, cl
                out.print("sal ");
                bin.getAns().accept(this);
                out.println(", cl");
                break;
            case ADD:
                //mov r, r:l
                out.print("mov ");
                bin.getAns().accept(this);
                out.print(", ");
                lhs.accept(this);
                out.println();
                indent();
                //add r, r:r
                out.print("add ");
                bin.getAns().accept(this);
                out.print(", ");
                rhs.accept(this);
                out.println();
                break;
            case SUB:
                //mov r, r:l
                out.print("mov ");
                bin.getAns().accept(this);
                out.print(", ");
                lhs.accept(this);
                out.println();
                indent();
                //sub r, r:r
                out.print("sub ");
                bin.getAns().accept(this);
                out.print(", ");
                rhs.accept(this);
                out.println();
                break;
            case MUL:
                //mov rax, r:l
                out.print("mov rax, ");
                lhs.accept(this);
                out.println();
                indent();
                //imul r:r
                out.print("imul , ");
                rhs.accept(this);
                out.println();
                //mov r, rax
                out.print("mov ");
                bin.getAns().accept(this);
                out.println(", rax");
                break;
            case MOD:
                //mov rax, r:l
                out.print("mov rax, ");
                lhs.accept(this);
                out.println();
                indent();
                //idiv r:r
                out.print("idiv , ");
                rhs.accept(this);
                out.println();
                //mov r, rdx
                out.print("mov ");
                bin.getAns().accept(this);
                out.println(", rdx");
                break;
            case DIV:
                //mov rax, r:l
                out.print("mov rax, ");
                lhs.accept(this);
                out.println();
                indent();
                //idiv r:r
                out.print("idiv , ");
                rhs.accept(this);
                out.println();
                //mov r, rax
                out.print("mov ");
                bin.getAns().accept(this);
                out.println(", rax");
                break;
        }


//        //Mem & Mem
//        if ((bin.getLhs() instanceof MemAddr || bin.getLhs() instanceof GloalVar) && (bin.getRhs() instanceof MemAddr || bin.getRhs() instanceof GloalVar)) {
//            //mov rcx, qword [rbp - ?]
//            out.print("mov rcx, ");
//            bin.getRhs().accept(this);
//            out.println();
//            indent();
//            switch (bin.getBinaryOP()) {
//                case GREATER_EQUAL:
//                    //cmp qword [], rcx
//                    out.print("cmp ");
//                    bin.getLhs().accept(this);
//                    out.println(", rcx");
//                    indent();
//                    //setge r
//                    out.print("setge ");
//                    bin.getAns().accept(this);
//                    out.println();
//                    break;
//                case LESS_EQUAL:
//                    //cmp qword [], rcx
//                    out.print("cmp ");
//                    bin.getLhs().accept(this);
//                    out.println(", rcx");
//                    indent();
//                    //setle r
//                    out.print("setle ");
//                    bin.getAns().accept(this);
//                    out.println();
//                    break;
//                case EQUAL:
//                    //cmp qword [], rcx
//                    out.print("cmp ");
//                    bin.getLhs().accept(this);
//                    out.println(", rcx");
//                    indent();
//                    //sete r
//                    out.print("sete ");
//                    bin.getAns().accept(this);
//                    out.println();
//                    break;
//                case INEQUAL:
//                    //cmp qword [], rcx
//                    out.print("cmp ");
//                    bin.getLhs().accept(this);
//                    out.println(", rcx");
//                    indent();
//                    //setne r
//                    out.print("setne ");
//                    bin.getAns().accept(this);
//                    out.println();
//                    break;
//                case GREATER:
//                    //cmp qword [], rcx
//                    out.print("cmp ");
//                    bin.getLhs().accept(this);
//                    out.println(", rcx");
//                    indent();
//                    //setg r
//                    out.print("setg ");
//                    bin.getAns().accept(this);
//                    out.println();
//                    break;
//                case LESS:
//                    //cmp qword [], rcx
//                    out.print("cmp ");
//                    bin.getLhs().accept(this);
//                    out.println(", rcx");
//                    indent();
//                    //setl r
//                    out.print("setl ");
//                    bin.getAns().accept(this);
//                    out.println();
//                    break;
//
//                case BIT_XOR:
//                    //mov r, qword []
//                    out.print("mov ");
//                    bin.getAns().accept(this);
//                    out.print(", ");
//                    bin.getLhs().accept(this);
//                    out.println();
//                    indent();
//                    //xor r, rcx
//                    out.print("xor ");
//                    bin.getAns().accept(this);
//                    out.println(", rcx");
//                    break;
//                case BIT_AND:
//                    //mov r, qword []
//                    out.print("mov ");
//                    bin.getAns().accept(this);
//                    out.print(", ");
//                    bin.getLhs().accept(this);
//                    out.println();
//                    indent();
//                    //and r, rcx
//                    out.print("and ");
//                    bin.getAns().accept(this);
//                    out.println(", rcx");
//                    break;
//                case BIR_OR:
//                    //mov r, qword []
//                    out.print("mov ");
//                    bin.getAns().accept(this);
//                    out.print(", ");
//                    bin.getLhs().accept(this);
//                    out.println();
//                    indent();
//                    //or r, rcx
//                    out.print("or ");
//                    bin.getAns().accept(this);
//                    out.println(", rcx");
//                    break;
//
//                case SHR:
//                    //mov r, qword []
//                    out.print("mov ");
//                    bin.getAns().accept(this);
//                    out.print(", ");
//                    bin.getLhs().accept(this);
//                    out.println();
//                    indent();
//                    //sar cl, r
//                    out.print("sar cl, ");
//                    bin.getAns().accept(this);
//                    out.println();
//                    break;
//                case SHL:
//                    //mov r, qword []
//                    out.print("mov ");
//                    bin.getAns().accept(this);
//                    out.print(", ");
//                    bin.getLhs().accept(this);
//                    out.println();
//                    indent();
//                    //sal cl, r
//                    out.print("sal cl, ");
//                    bin.getAns().accept(this);
//                    out.println();
//                    break;
//
//                case ADD:
//                    //mov r, qword []
//                    out.print("mov ");
//                    bin.getAns().accept(this);
//                    out.print(", ");
//                    bin.getLhs().accept(this);
//                    out.println();
//                    indent();
//                    //add rcx, r
//                    out.print("add rcx, ");
//                    bin.getAns().accept(this);
//                    break;
//                case SUB:
//                    //mov r, qword []
//                    out.print("mov ");
//                    bin.getAns().accept(this);
//                    out.print(", ");
//                    bin.getLhs().accept(this);
//                    out.println();
//                    indent();
//                    //sub rcx, r
//                    out.print("sub rcx, ");
//                    bin.getAns().accept(this);
//                    break;
//                case MUL:
//                    //mov rax, qword []
//                    out.print("mov rax, ");
//                    bin.getAns().accept(this);
//                    out.println();
//                    indent();
//                    //imul rcx
//                    out.println("imul rcx");
//                    indent();
//                    //mov r, rax
//                    out.print("mov ");
//                    bin.getAns().accept(this);
//                    out.println(", rax");
//                    break;
//                case MOD:
//                    //mov rax, qword []
//                    out.print("mov rax, ");
//                    bin.getAns().accept(this);
//                    out.println();
//                    indent();
//                    //idiv rcx
//                    out.println("cdq");
//                    out.println("idiv rcx");
//                    indent();
//                    //mov r, rdx
//                    out.print("mov ");
//                    bin.getAns().accept(this);
//                    out.println(", rdx");
//                    break;
//                case DIV:
//                    //mov rax, qword []
//                    out.print("mov rax, ");
//                    bin.getAns().accept(this);
//                    out.println();
//                    indent();
//                    //idiv rcx
//                    out.println("cdq");
//                    out.println("idiv rcx");
//                    indent();
//                    //mov r, rax
//                    out.print("mov ");
//                    bin.getAns().accept(this);
//                    out.println(", rax");
//                    break;
//            }
//            return;
//        }


    }

    @Override
    public void visit(Uni uni) {
        if (uni.getUnaryOP() == UnaryExprNode.UnaryOP.SELF_INC) {
            out.print("inc ");
            uni.getObj().accept(this);
        } else {
            out.print("dec ");
            uni.getObj().accept(this);
        }

    }

    @Override
    public void visit(ConstValue constValue) {
        out.print(constValue.getAnInt());
    }

    @Override
    public void visit(MemAddr memAddr) {

    }

    @Override
    public void visit(Register register) {
        out.print('r' + Integer.toString(register.getOrd()));
    }

    @Override
    public void visit(ReturnInst returnInst) {
        out.print("mov rax, ");
        returnInst.getIntValue().accept(this);
        out.println();
        indent();
        out.println("pop rbp");
        indent();
        out.println("ret");
    }

    @Override
    public void visit(GloalVar gloalVar) {
        out.print("qword [" + gloalVar.getDeclname() + ']');
    }
}
