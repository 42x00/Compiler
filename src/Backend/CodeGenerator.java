package Backend;

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
import Tools.Printer;
import Type.Type;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import static java.lang.System.out;

public class CodeGenerator implements IRVisitor {
    static private Set<Integer> labelSet = new HashSet<>();
    static private Printer codePrinter = new Printer();

    private boolean isPrintMain = false;

//    private void indent() {
//        out.print('\t');
//    }

    private boolean trySetLabel(BasicBlock basicBlock) {
        if (labelSet.contains(basicBlock.getOrd())) return true;
        return false;
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

    private void setBuiltInFunction() {
        try {
            StringBuffer sb = new StringBuffer("");
            FileReader reader = new FileReader("src/BuiltinFunction.asm");
            BufferedReader br = new BufferedReader(reader);
            String str = null;
            while ((str = br.readLine()) != null) {
                sb.append(str + "\n");
                out.println(str);
            }
            br.close();
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void generate(IRGenerator irGenerator, ProgNode progNode) {
        //extern malloc, printf
        out.println("extern malloc");
        out.println("extern printf");
        out.println("extern puts");
        out.println("extern getchar");
        out.println("extern putchar");
        out.println("extern sprintf");
        out.println("extern __stack_chk_fail");
        out.println("extern printf");
        out.println("extern strlen");
        out.println("extern memcpy");
        out.println("extern scanf");
        out.println();

        //global main
        for (DeclNode declNode : progNode.getDeclarations()) {
            if (!(declNode instanceof ClassDeclNode)) {
                if (declNode.getDeclname().equals("main")) {
                    out.println("global " + declNode.getDeclname());
                } else {
                    out.println("global " + "_global_" + declNode.getDeclname());
                }
            }
        }

        out.println();
        //SECTION .text
        out.println("SECTION .text");
        //f:
        for (DeclNode declNode : progNode.getDeclarations()) {
            if (declNode instanceof FuncDeclNode) {
                //main:
                //     push rbp
                //     move rbp, rsp
                if (declNode.getDeclname().equals("main")) {
                    codePrinter.add(Printer.PrintKind.LABEL, "main");
                } else {
                    codePrinter.add(Printer.PrintKind.LABEL, "_global_" + declNode.getDeclname());
                }
                codePrinter.add(Printer.PrintKind.PUSH, "rbp");
                codePrinter.add(Printer.PrintKind.MOV, "rbp", "rsp");
                int cntRegister = ((FuncDeclNode) declNode).getCntRegister();
                //     sub rsp, 8
                codePrinter.add(Printer.PrintKind.SUB, "rsp", cntRegister * 8);
                if (declNode.getDeclname().equals("main"))
                    isPrintMain = true;
                else {
                    //push rbp, rbx, r12, r13, r14, r15
                    codePrinter.add(Printer.PrintKind.PUSH, "r12");
                    codePrinter.add(Printer.PrintKind.PUSH, "r13");
                    codePrinter.add(Printer.PrintKind.PUSH, "r14");
                    codePrinter.add(Printer.PrintKind.PUSH, "r15");
                }
                ((FuncDeclNode) declNode).getStartBlock().accept(this);
                isPrintMain = false;
            }
        }

        for (DeclNode declNode : progNode.getDeclarations()) {
            if (declNode instanceof ClassDeclNode) {
                ClassDeclNode classDeclNode = (ClassDeclNode) declNode;
                for (DeclNode declNodeInClass : classDeclNode.getClassdecllist()) {
                    if (declNodeInClass instanceof FuncDeclNode) {
                        String funcName = classDeclNode.getDeclname() + "." + declNodeInClass.getDeclname();
                        //_class._f:
                        //     push rbp
                        //     move rbp, rsp
                        codePrinter.add(Printer.PrintKind.LABEL, "_global_" + funcName);
                        codePrinter.add(Printer.PrintKind.PUSH, "rbp");
                        codePrinter.add(Printer.PrintKind.MOV, "rbp", "rsp");
                        int cntRegister = ((FuncDeclNode) declNodeInClass).getCntRegister();
                        //     sub rsp, 8
                        codePrinter.add(Printer.PrintKind.SUB, "rsp", cntRegister * 8);
                        //push rbp, rbx, r12, r13, r14, r15
                        codePrinter.add(Printer.PrintKind.PUSH, "r12");
                        codePrinter.add(Printer.PrintKind.PUSH, "r13");
                        codePrinter.add(Printer.PrintKind.PUSH, "r14");
                        codePrinter.add(Printer.PrintKind.PUSH, "r15");
                        ((FuncDeclNode) declNodeInClass).getStartBlock().accept(this);
                        isPrintMain = false;
                    }
                }
            }
        }

        codePrinter.print();

        setBuiltInFunction();

        //SECTION .data
        out.println("SECTION .data");

        out.println("intbuffer: dq 0");
        out.println("format1: db \"%lld\", 0");
        out.println("format2: db \"%s\", 0");

        //x: dq 0
        for (
                DeclNode declNode : progNode.getDeclarations())

        {
            if (declNode instanceof VarDeclNode) {
                VarDeclNode varDeclNode = (VarDeclNode) declNode;
                if (!(varDeclNode.getVartype() instanceof ArrayTypeNode
                        || varDeclNode.getVartype() instanceof ClassTypeNode)) {
                    if (varDeclNode.getVartype().getBasetype() != Type.Types.STRING) {
                        out.println("_global_" + varDeclNode.getVarname() + ": dq 0");
                    }
                }
            }
        }

        //_string_1: dq *, 0
        for (Map.Entry<String, String> entry : irGenerator.getStringMap().entrySet()) {
            String stringDecl = entry.getKey() + ": db ";
            String valueString = entry.getValue();
            int index = 1;
            int rawLength = valueString.length() - 1;
            int stringLength = 0;
            while (index < rawLength) {
                if (valueString.charAt(index) == '\\') {
                    ++index;
                    switch (valueString.charAt(index)) {
                        case 'a':
                            stringDecl += Integer.toString(7) + ", ";
                            break;
                        case 'b':
                            stringDecl += Integer.toString(8) + ", ";
                            break;
                        case 'f':
                            stringDecl += Integer.toString(12) + ", ";
                            break;
                        case 'n':
                            stringDecl += Integer.toString(10) + ", ";
                            break;
                        case 'r':
                            stringDecl += Integer.toString(13) + ", ";
                            break;
                        case 't':
                            stringDecl += Integer.toString(9) + ", ";
                            break;
                        case 'v':
                            stringDecl += Integer.toString(11) + ", ";
                            break;
                        case '\\':
                            stringDecl += Integer.toString(92) + ", ";
                            break;
                        case '\'':
                            stringDecl += Integer.toString(39) + ", ";
                            break;
                        case '\"':
                            stringDecl += Integer.toString(34) + ", ";
                            break;
                        case '?':
                            stringDecl += Integer.toString(63) + ", ";
                            break;
                        case '0':
                            stringDecl += Integer.toString(0) + ", ";
                            break;
                    }
                } else {
                    int char2Int = (int) valueString.charAt(index);
                    stringDecl += Integer.toString(char2Int) + ", ";
                }
                ++stringLength;
                ++index;
            }
            stringDecl += "0";

            out.println(entry.getKey() + "_size: dq " + Integer.toString(stringLength));
            out.println(stringDecl);
        }

        //SECTION .bss
        out.println("SECTION .bss");

        out.println("stringbuffer: resb 256");

        //x: dq 0
        for (DeclNode declNode : progNode.getDeclarations()) {
            if (declNode instanceof VarDeclNode) {
                VarDeclNode varDeclNode = (VarDeclNode) declNode;
                if (varDeclNode.getVartype() instanceof ArrayTypeNode ||
                        (varDeclNode.getVartype() instanceof TypeNode && varDeclNode.getVartype().getBasetype() == Type.Types.STRING)) {
                    out.println("_global_" + varDeclNode.getVarname() + ": dq 0");
                }
            }
        }

    }

    @Override
    public void visit(BasicBlock basicBlock) {
        for (Inst inst : basicBlock.getInstList()) {
            inst.accept(this);
        }
    }

    @Override
    public void visit(Jump jump) {
        //jmp L_*
        codePrinter.add(Printer.PrintKind.JUMP, jump.getNxtBlock().toLabel());
        if (!trySetLabel(jump.getNxtBlock())) {
            labelSet.add(jump.getNxtBlock().getOrd());
            codePrinter.add(Printer.PrintKind.LABEL, jump.getNxtBlock().toString());
            jump.getNxtBlock().accept(this);
        }
    }

    @Override
    public void visit(Cjump cjump) {
        //cmp r, 0
        codePrinter.add(Printer.PrintKind.CMP, c8t1(cjump.getCond().accept(this)), "false");
        //jz L_*
        if (trySetLabel(cjump.getThenBlock())) {
            codePrinter.add(Printer.PrintKind.JNZ, cjump.getThenBlock().toLabel());
            if (!trySetLabel(cjump.getElseBlock())) {
                labelSet.add(cjump.getElseBlock().getOrd());
                codePrinter.add(Printer.PrintKind.LABEL, cjump.getElseBlock().toString());
                cjump.getElseBlock().accept(this);
            }
            return;
        }
        codePrinter.add(Printer.PrintKind.JZ, cjump.getElseBlock().toLabel());
        labelSet.add(cjump.getThenBlock().getOrd());
        codePrinter.add(Printer.PrintKind.LABEL, cjump.getThenBlock().toString());
        cjump.getThenBlock().accept(this);
        if (!trySetLabel(cjump.getElseBlock())) {
            labelSet.add(cjump.getElseBlock().getOrd());
            codePrinter.add(Printer.PrintKind.LABEL, cjump.getElseBlock().toString());
            cjump.getElseBlock().accept(this);
        }
    }

    private boolean isRealRegister(IntValue intValue) {
        if (intValue instanceof Register) {
            if (((Register) intValue).getOrd() < 16)
                return true;
            return false;
        }
        return false;
    }

    @Override
    public void visit(Assign assign) {
        if (isRealRegister(assign.getLhs()) || isRealRegister(assign.getRhs())) {
            codePrinter.add(Printer.PrintKind.MOV, assign.getLhs().accept(this), assign.getRhs().accept(this));
            return;
        }
        //mov rbx, r:*
        codePrinter.add(Printer.PrintKind.MOV, "rbx", assign.getRhs().accept(this));
        //mov l:*, rbx
        codePrinter.add(Printer.PrintKind.MOV, assign.getLhs().accept(this), "rbx");
    }

    @Override
    public void visit(Push push) {
        codePrinter.add(Printer.PrintKind.PUSH, push.getIntValue().accept(this));
    }

    @Override
    public void visit(Call call) {
        //push rdi, rsi, rdx, rcx, r8, r9
        //mov rdi, rsi, rdx, rcx, r8, r9  args*
        //call f
        codePrinter.add(Printer.PrintKind.CALL, call.getFuncName());
        //pop args*
        codePrinter.add(Printer.PrintKind.POP, "r9");
        codePrinter.add(Printer.PrintKind.POP, "r8");
        codePrinter.add(Printer.PrintKind.POP, "rsi");
        codePrinter.add(Printer.PrintKind.POP, "rdi");
    }

    @Override
    public void visit(Bin bin) {
//        //mov rbx, l:*
        codePrinter.add(Printer.PrintKind.MOV, "rbx", bin.getLhs().accept(this));
        //mov rcx, r:*
        codePrinter.add(Printer.PrintKind.MOV, "rcx", bin.getRhs().accept(this));

        switch (bin.getBinaryOP()) {
            case GREATER_EQUAL:
                //cmp rbx, rcx
                codePrinter.add(Printer.PrintKind.CMP, bin.getLhs().accept(this), bin.getRhs().accept(this));
                //setge r
                codePrinter.add(Printer.PrintKind.GREATER_EQUAL, c8t1(bin.getAns().accept(this)));
                break;
            case LESS_EQUAL:
                //cmp rbx, rcx
                codePrinter.add(Printer.PrintKind.CMP, bin.getLhs().accept(this), bin.getRhs().accept(this));
                //setle r
                codePrinter.add(Printer.PrintKind.LESS_EQUAL, c8t1(bin.getAns().accept(this)));
                break;
            case EQUAL:
                //cmp rbx, rcx
                codePrinter.add(Printer.PrintKind.CMP, bin.getLhs().accept(this), bin.getRhs().accept(this));
                //sete r
                codePrinter.add(Printer.PrintKind.EQUAL, c8t1(bin.getAns().accept(this)));
                break;
            case INEQUAL:
                //cmp rbx, rcx
                codePrinter.add(Printer.PrintKind.CMP, bin.getLhs().accept(this), bin.getRhs().accept(this));
                //setne r
                codePrinter.add(Printer.PrintKind.INEQUAL, c8t1(bin.getAns().accept(this)));
                break;
            case GREATER:
                //cmp rbx, rcx
                codePrinter.add(Printer.PrintKind.CMP, bin.getLhs().accept(this), bin.getRhs().accept(this));
                //setg r
                codePrinter.add(Printer.PrintKind.GREATER, c8t1(bin.getAns().accept(this)));
                break;
            case LESS:
                //cmp rbx, rcx
                codePrinter.add(Printer.PrintKind.CMP, bin.getLhs().accept(this), bin.getRhs().accept(this));
                //setl r
                codePrinter.add(Printer.PrintKind.LESS, c8t1(bin.getAns().accept(this)));
                break;


            case BIT_XOR: {
                String r = bin.getAns().accept(this);
                //mov r, rbx
                codePrinter.add(Printer.PrintKind.MOV, r, bin.getLhs().accept(this));
                //xor r, rcx
                codePrinter.add(Printer.PrintKind.BIT_XOR, r, bin.getRhs().accept(this));
                break;
            }
            case BIT_AND: {
                String r = bin.getAns().accept(this);
                //mov r, rbx
                codePrinter.add(Printer.PrintKind.MOV, r, bin.getLhs().accept(this));
                //and r, rcx
                codePrinter.add(Printer.PrintKind.BIT_AND, r, bin.getRhs().accept(this));
                break;
            }
            case BIR_OR: {
                String r = bin.getAns().accept(this);
                //mov r, rbx
                codePrinter.add(Printer.PrintKind.MOV, r, bin.getLhs().accept(this));
                //or r, rcx
                codePrinter.add(Printer.PrintKind.BIR_OR, r, bin.getRhs().accept(this));
                break;
            }

            case SHR: {
                String r = bin.getAns().accept(this);
                //mov r, rbx
                codePrinter.add(Printer.PrintKind.MOV, r, bin.getLhs().accept(this));
                //sar r, cl
                codePrinter.add(Printer.PrintKind.SHR, r, bin.getRhs().accept(this));
                break;
            }
            case SHL: {
                String r = bin.getAns().accept(this);
                //mov r, rbx
                codePrinter.add(Printer.PrintKind.MOV, r, bin.getLhs().accept(this));
                //sal r, cl
                codePrinter.add(Printer.PrintKind.SHL, r, bin.getRhs().accept(this));
                break;
            }

            case ADD: {
                String r = bin.getAns().accept(this);
                String rhs = bin.getRhs().accept(this);
                if (r.equals(rhs)){
                    codePrinter.add(Printer.PrintKind.MOV,"rcx", rhs);
                    rhs = "rcx";
                }
                //mov r, rbx
                codePrinter.add(Printer.PrintKind.MOV, r, bin.getLhs().accept(this));
                //add r, rcx
                codePrinter.add(Printer.PrintKind.ADD, r, rhs);
                break;
            }
            case SUB: {
                String r = bin.getAns().accept(this);
                String rhs = bin.getRhs().accept(this);
                if (r.equals(rhs)){
                    codePrinter.add(Printer.PrintKind.MOV,"rcx", rhs);
                    rhs = "rcx";
                }
                //mov r, rbx
                codePrinter.add(Printer.PrintKind.MOV, r, bin.getLhs().accept(this));
                //sub r, rcx
                codePrinter.add(Printer.PrintKind.SUB, r, rhs);
                break;
            }

            case MUL:
                //mov rax, rbx
                codePrinter.add(Printer.PrintKind.MOV, "rax", bin.getLhs().accept(this));
                //imul rcx
                codePrinter.add(Printer.PrintKind.MUL, bin.getRhs().accept(this));
                //mov r, rax
                codePrinter.add(Printer.PrintKind.MOV, bin.getAns().accept(this), "rax");
                break;

            case MOD:
                //mov rax, rbx
                codePrinter.add(Printer.PrintKind.MOV, "rax", bin.getLhs().accept(this));
                //cdq
                //idiv rcx
                codePrinter.add(Printer.PrintKind.CDQ);
                codePrinter.add(Printer.PrintKind.MOD, bin.getRhs().accept(this));
                //mov r, rdx
                codePrinter.add(Printer.PrintKind.MOV, bin.getAns().accept(this), "rdx");
                break;
            case DIV:
                //mov rax, rbx
                codePrinter.add(Printer.PrintKind.MOV, "rax", bin.getLhs().accept(this));
                //cdq
                //idiv rcx
                codePrinter.add(Printer.PrintKind.CDQ);
                codePrinter.add(Printer.PrintKind.DIV, bin.getRhs().accept(this));
                //mov r, rax
                codePrinter.add(Printer.PrintKind.MOV, bin.getAns().accept(this), "rax");
                break;
        }
    }

    @Override
    public void visit(Uni uni) {
        if (uni.getUnaryOP() == UnaryExprNode.UnaryOP.SELF_INC) {
            codePrinter.add(Printer.PrintKind.SELF_INC, uni.getObj().accept(this));
            if (uni.getObj() != uni.getAns()) {
                //mov rcx, *
                codePrinter.add(Printer.PrintKind.MOV, "rcx", uni.getObj().accept(this));
                //mov r, rcx
                codePrinter.add(Printer.PrintKind.MOV, uni.getAns().accept(this), "rcx");
            }
            return;
        }
        if (uni.getUnaryOP() == UnaryExprNode.UnaryOP.SELF_DEC) {
            codePrinter.add(Printer.PrintKind.SELF_DEC, uni.getObj().accept(this));
            if (uni.getObj() != uni.getAns()) {
                //mov rcx, *
                codePrinter.add(Printer.PrintKind.MOV, "rcx", uni.getObj().accept(this));
                //mov r, rcx
                codePrinter.add(Printer.PrintKind.MOV, uni.getAns().accept(this), "rcx");
            }
            return;
        }
        if (uni.getObj() != uni.getAns()) {
            //mov rcx, *
            codePrinter.add(Printer.PrintKind.MOV, "rcx", uni.getObj().accept(this));
            //mov r, rcx
            codePrinter.add(Printer.PrintKind.MOV, uni.getAns().accept(this), "rcx");
        }
        switch (uni.getUnaryOP()) {
            case POSI:
                //neg *
                break;
            case NEGE:
                //neg *
                codePrinter.add(Printer.PrintKind.NEGE, uni.getAns().accept(this));
                return;
            case BIT_NOT:
                //not *
                codePrinter.add(Printer.PrintKind.BIT_NOT, uni.getAns().accept(this));
                break;
            case LOGIC_NOT:
                //xor *, 1
//                out.printf("xor %s, 1\n", uni.getAns().accept(this));
                codePrinter.add(Printer.PrintKind.LOGIC_NOT, uni.getAns().accept(this));
                break;
        }
    }

    @Override
    public String visit(ConstValue constValue) {
        return Integer.toString(constValue.getAnInt());
    }

    @Override
    public String visit(MemAddr memAddr) {
        String addr = "qword [" + memAddr.getBaseAddr().accept(this);
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
        if (gloalVar.isAddr()) return gloalVar.getDeclname();
        return "qword [" + gloalVar.getDeclname() + ']';
    }

    @Override
    public void visit(ReturnInst returnInst) {
        if (!isPrintMain) {
            //pop rbp, rbx, r12, r13, r14, r15
            codePrinter.add(Printer.PrintKind.POP, "r15");
            codePrinter.add(Printer.PrintKind.POP, "r14");
            codePrinter.add(Printer.PrintKind.POP, "r13");
            codePrinter.add(Printer.PrintKind.POP, "r12");
        }
        //leave
        //ret
        codePrinter.add(Printer.PrintKind.LEAVE);
        codePrinter.add(Printer.PrintKind.RET);
    }

}
