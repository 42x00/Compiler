package Tools;

import AST_Node.DeclNodes.ClassDeclNode;
import AST_Node.DeclNodes.DeclNode;
import AST_Node.ExprNodes.UnaryExprNode;
import AST_Node.ProgNode;
import IR.IRNodes.*;
import IR.IRVisitor;

import static java.lang.System.in;
import static java.lang.System.out;

public class CodeGenerator implements IRVisitor {
    private void indent() {
        out.print('\t');
    }

    public void generate(BasicBlock startBlock, ProgNode progNode) {
        out.println("default rel");
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
        out.println("move rbp, rsp");
        startBlock.accept(this);
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
        jump.getNxtBlock().setLabel();
        jump.getNxtBlock().accept(this);
    }

    @Override
    public void visit(Cjump cjump) {
        out.print("cmp ");
        cjump.getCond().accept(this);
        out.println(", 0");
        indent();
        out.println("jz " + cjump.getElseBlock().toLabel());
        cjump.getThenBlock().setLabel();
        cjump.getThenBlock().accept(this);
        cjump.getElseBlock().setLabel();
        cjump.getElseBlock().accept(this);
    }

    @Override
    public void visit(Assign assign) {
        out.print("movq ");
        assign.getLhs().accept(this);
        out.print(", ");
        assign.getRhs().accept(this);
        out.println();
    }

    @Override
    public void visit(Bin bin) {
        switch (bin.getBinaryOP()) {
            case GREATER_EQUAL:
                out.print("cmp ");
                bin.getLhs().accept(this);
                out.print(", ");
                bin.getRhs().accept(this);
                out.println();
                indent();
                out.print("setge ");
                bin.getAns().accept(this);
                out.println();
                break;
            case LESS_EQUAL:out.print("cmp ");
                bin.getLhs().accept(this);
                out.print(", ");
                bin.getRhs().accept(this);
                out.println();
                indent();
                out.print("setle ");
                bin.getAns().accept(this);
                out.println();
                break;
            case EQUAL:out.print("cmp ");
                bin.getLhs().accept(this);
                out.print(", ");
                bin.getRhs().accept(this);
                out.println();
                indent();
                out.print("sete ");
                bin.getAns().accept(this);
                out.println();
                break;
            case INEQUAL:out.print("cmp ");
                bin.getLhs().accept(this);
                out.print(", ");
                bin.getRhs().accept(this);
                out.println();
                indent();
                out.print("setne ");
                bin.getAns().accept(this);
                out.println();
                break;
            case GREATER:out.print("cmp ");
                bin.getLhs().accept(this);
                out.print(", ");
                bin.getRhs().accept(this);
                out.println();
                indent();
                out.print("setg ");
                bin.getAns().accept(this);
                out.println();
                break;
            case LESS:
                out.print("cmp ");
                bin.getLhs().accept(this);
                out.print(", ");
                bin.getRhs().accept(this);
                out.println();
                indent();
                out.print("setl ");
                bin.getAns().accept(this);
                out.println();
                break;
            case BIT_XOR:
                out.print("xor ");
                bin.getLhs().accept(this);
                out.print(", ");
                bin.getRhs().accept(this);
                out.println();
                break;
            case BIT_AND:
                out.print("and ");
                bin.getLhs().accept(this);
                out.print(", ");
                bin.getRhs().accept(this);
                out.println();
                break;
            case BIR_OR:
                out.print("or ");
                bin.getLhs().accept(this);
                out.print(", ");
                bin.getRhs().accept(this);
                out.println();
                break;
            case SHR:
                out.print("sar ");
                bin.getLhs().accept(this);
                out.print(", ");
                bin.getRhs().accept(this);
                out.println();
                break;
            case SHL:
                out.print("shl ");
                bin.getLhs().accept(this);
                out.print(", ");
                bin.getRhs().accept(this);
                out.println();
                break;
            case ADD:
                out.print("add ");
                bin.getLhs().accept(this);
                out.print(", ");
                bin.getRhs().accept(this);
                out.println();
                break;
            case SUB:
                out.print("sub ");
                bin.getLhs().accept(this);
                out.print(", ");
                bin.getRhs().accept(this);
                out.println();
                break;
            case MUL:
                out.print("imul ");
                bin.getLhs().accept(this);
                out.print(", ");
                bin.getRhs().accept(this);
                out.println();
                break;
            case MOD:
                out.print("idiv ");
                bin.getLhs().accept(this);
                out.print(", ");
                bin.getRhs().accept(this);
                out.println();
                break;
            case DIV:
                out.print("idiv ");
                bin.getLhs().accept(this);
                out.print(", ");
                bin.getRhs().accept(this);
                out.println();
                break;
        }
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
        out.print("movq " + "rax, ");
        returnInst.getIntValue().accept(this);
        out.println();
        indent();
        out.println("pop rbp");
        indent();
        out.println("ret");
    }

    @Override
    public void visit(GloalVar gloalVar) {
        out.print(gloalVar.getDeclname());
    }
}
