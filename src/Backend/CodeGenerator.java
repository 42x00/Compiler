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
import Type.Type;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import static java.lang.System.out;

public class CodeGenerator implements IRVisitor {
    static private Set<Integer> labelSet = new HashSet<>();

    private boolean isPrintMain = false;

    private void indent() {
        out.print('\t');
    }

    private boolean trySetLabel(BasicBlock basicBlock) {
        if (labelSet.contains(basicBlock.getOrd())) return true;
        return false;
    }

    private String c8t1(String s) {
        if (s.equals("1")) {
            int lyk = 1;
        }
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
        out.println("extern malloc");
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
                    out.printf("%s:\n\tpush rbp\n\tmov rbp, rsp\n\t", declNode.getDeclname());
                } else {
                    out.printf("_global_%s:\n\tpush rbp\n\tmov rbp, rsp\n\t", declNode.getDeclname());
                }
                int cntRegister = ((FuncDeclNode) declNode).getCntRegister();
                //     sub rsp, 8
                out.printf("sub rsp, %d\n", cntRegister * 8);
                if (declNode.getDeclname().equals("main"))
                    isPrintMain = true;
                else {
                    //push rbp, rbx, r12, r13, r14, r15
                    out.print("\t" +
//                            "push rbx\n\t" +
                            "push r12\n\t" +
                            "push r13\n\t" +
                            "push r14\n\t" +
                            "push r15\n\t");
                    out.print('\t');
                    List<VarDeclNode> varDeclNodeList = ((FuncDeclNode) declNode).getFunctionParameterList().getVardeclnodeList();
                    for (int index = varDeclNodeList.size() - 1; index >= 0; --index) {
                        if (index > 5) {
                            (new Assign(varDeclNodeList.get(index).getIntValue(),
                                    new MemAddr(new Register(Register.RegisterName.RBP),
                                            new ConstValue(index - 4)))).accept(this);
                            indent();
                        } else {
                            switch (index) {
                                case 0:
                                    out.printf("mov %s, rdi\n", varDeclNodeList.get(index).getIntValue().accept(this));
                                    break;
                                case 1:
                                    out.printf("mov %s, rsi\n\t", varDeclNodeList.get(index).getIntValue().accept(this));
                                    break;
                                case 2:
                                    out.printf("mov %s, rdx\n\t", varDeclNodeList.get(index).getIntValue().accept(this));
                                    break;
                                case 3:
                                    out.printf("mov %s, rcx\n\t", varDeclNodeList.get(index).getIntValue().accept(this));
                                    break;
                                case 4:
                                    out.printf("mov %s, r8\n\t", varDeclNodeList.get(index).getIntValue().accept(this));
                                    break;
                                case 5:
                                    out.printf("mov %s, r9\n\t", varDeclNodeList.get(index).getIntValue().accept(this));
                                    break;
                            }
                        }
                    }
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
                        out.printf("_global_%s:\n\tpush rbp\n\tmov rbp, rsp\n\t", funcName);
                        int cntRegister = ((FuncDeclNode) declNodeInClass).getCntRegister();
                        //     sub rsp, 8
                        out.printf("sub rsp, %d\n", cntRegister * 8);
                        //push rbp, rbx, r12, r13, r14, r15
                    out.print("\t" +
//                            "push rbx\n\t" +
                            "push r12\n\t" +
                            "push r13\n\t" +
                            "push r14\n\t" +
                            "push r15\n\t");
                        out.print('\t');
                        List<VarDeclNode> varDeclNodeList = ((FuncDeclNode) declNodeInClass).getFunctionParameterList().getVardeclnodeList();
                        for (int index = varDeclNodeList.size() - 1; index >= 0; --index) {
                            if (index > 4) {
                                (new Assign(varDeclNodeList.get(index).getIntValue(),
                                        new MemAddr(new Register(Register.RegisterName.RBP),
                                                new ConstValue(index - 3)))).accept(this);
                                indent();
                            } else {
                                switch (index) {
                                    case 0:
                                        out.printf("mov %s, rsi\n\t", varDeclNodeList.get(index).getIntValue().accept(this));
                                        break;
                                    case 1:
                                        out.printf("mov %s, rdx\n\t", varDeclNodeList.get(index).getIntValue().accept(this));
                                        break;
                                    case 2:
                                        out.printf("mov %s, rcx\n\t", varDeclNodeList.get(index).getIntValue().accept(this));
                                        break;
                                    case 3:
                                        out.printf("mov %s, r8\n\t", varDeclNodeList.get(index).getIntValue().accept(this));
                                        break;
                                    case 4:
                                        out.printf("mov %s, r9\n\t", varDeclNodeList.get(index).getIntValue().accept(this));
                                        break;
                                }
                            }
                        }
                        out.printf("mov %s, rdi\n\t", classDeclNode.getIntValue());
                        ((FuncDeclNode) declNodeInClass).getStartBlock().accept(this);
                        isPrintMain = false;
                    }
                }
            }
        }

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
        for (
                Map.Entry<String, String> entry : irGenerator.getStringMap().

                entrySet())

        {
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
        for (
                DeclNode declNode : progNode.getDeclarations())

        {
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
            indent();
            inst.accept(this);
        }
    }

    @Override
    public void visit(Jump jump) {
        //jmp L_*
        out.println("jmp " + jump.getNxtBlock().toLabel());
        if (!trySetLabel(jump.getNxtBlock())) {
            labelSet.add(jump.getNxtBlock().getOrd());
            jump.getNxtBlock().setLabel();
            jump.getNxtBlock().accept(this);
        }
    }

    @Override
    public void visit(Cjump cjump) {
        //cmp r, 0
        out.printf("cmp %s, 0\n\t", c8t1(cjump.getCond().accept(this)));
        //jz L_*
        if (trySetLabel(cjump.getThenBlock())) {
            out.println("jnz " + cjump.getThenBlock().toLabel());
            if (!trySetLabel(cjump.getElseBlock())) {
                labelSet.add(cjump.getElseBlock().getOrd());
                cjump.getElseBlock().setLabel();
                cjump.getElseBlock().accept(this);
            }
            return;
        }
        out.println("jz " + cjump.getElseBlock().toLabel());
        labelSet.add(cjump.getThenBlock().getOrd());
        cjump.getThenBlock().setLabel();
        cjump.getThenBlock().accept(this);
        if (!trySetLabel(cjump.getElseBlock())) {
            labelSet.add(cjump.getElseBlock().getOrd());
            cjump.getElseBlock().setLabel();
            cjump.getElseBlock().accept(this);
        }
    }

    private boolean isRealRegister(IntValue intValue){
        if (intValue instanceof Register){
            if (((Register) intValue).getOrd() < 16)
                return true;
            return false;
        }
        return false;
    }

    @Override
    public void visit(Assign assign) {
        if (isRealRegister(assign.getLhs()) || isRealRegister(assign.getRhs())){
            out.printf("mov %s, %s\n\t",assign.getLhs().accept(this), assign.getRhs().accept(this));
            return;
        }
        //mov rbx, r:*
        out.printf("mov rbx, %s\n\t", assign.getRhs().accept(this));
        //mov l:*, rbx
        out.printf("mov %s, rbx\n", assign.getLhs().accept(this));
    }

    @Override
    public void visit(Call call) {
        //push rdi, rsi, rdx, rcx, r8, r9
//        out.print("push rdi\n\t" +
//                "push rsi\n\t" +
//                "push rdx\n\t" +
//                "push rcx\n\t" +
//                "push r8\n\t" +
//                "push r9\n\t");
        //mov rdi, rsi, rdx, rcx, r8, r9  args*
        //push args*
        List<IntValue> intValueList = call.getIntValues();
        for (int index = intValueList.size() - 1; index >= 0; --index) {
            if (index > 5) {
                out.printf("push %s\n\t", intValueList.get(index).accept(this));
            } else {
                switch (index) {
                    case 0:
                        out.printf("mov rdi, %s\n\t", intValueList.get(index).accept(this));
                        break;
                    case 1:
                        out.printf("mov rsi, %s\n\t", intValueList.get(index).accept(this));
                        break;
                    case 2:
                        out.printf("mov rdx, %s\n\t", intValueList.get(index).accept(this));
                        break;
                    case 3:
                        out.printf("mov rcx, %s\n\t", intValueList.get(index).accept(this));
                        break;
                    case 4:
                        out.printf("mov r8, %s\n\t", intValueList.get(index).accept(this));
                        break;
                    case 5:
                        out.printf("mov r9, %s\n\t", intValueList.get(index).accept(this));
                        break;
                }
            }
        }
        //call f
        out.printf("call %s\n", call.getFuncName());
        //pop args*
//        out.print("pop r9\n\t" +
//                "pop r8\n\t" +
//                "pop rcx\n\t" +
//                "pop rdx\n\t" +
//                "pop rsi\n\t" +
//                "pop rdi\n");
//        err.print("pop r9\n\t" +
//                "pop r8\n\t" +
//                "pop rcx\n\t" +
//                "pop rdx\n\t" +
//                "pop rsi\n\t" +
//                "pop rdi\n");
    }

    @Override
    public void visit(Bin bin) {
        //mov rbx, l:*
        out.printf("mov rbx, %s\n\t", bin.getLhs().accept(this));
        //mov rcx, r:*
        out.printf("mov rcx, %s\n\t", bin.getRhs().accept(this));

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
                out.printf("sal %s, cl\n", r);
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
                //mov rax, rbx
                out.print("mov rax, rbx\n\t");
                //imul rcx
                out.print("imul rcx\n\t");
                //mov r, rax
                out.printf("mov %s, rax\n", bin.getAns().accept(this));
                break;

            case MOD:
                //mov rax, rbx
                out.print("mov rax, rbx\n\t");
                //cdq
                //idiv rcx
                out.print("cdq\n\tidiv rcx\n\t");
                //mov r, rdx
                out.printf("mov %s, rdx\n", bin.getAns().accept(this));
                break;
            case DIV:
                //mov rax, rbx
                out.print("mov rax, rbx\n\t");
                //cdq
                //idiv rcx
                out.print("cdq\n\tidiv rcx\n\t");
                //mov r, rax
                out.printf("mov %s, rax\n", bin.getAns().accept(this));
                break;
        }
    }

    @Override
    public void visit(Uni uni) {
        if (uni.getUnaryOP() == UnaryExprNode.UnaryOP.SELF_INC) {
            out.printf("inc %s\n", uni.getObj().accept(this));
            if (uni.getObj() != uni.getAns()) {
                //mov rcx, *
                out.printf("mov rcx, %s\n\t", uni.getObj().accept(this));
                //mov r, rcx
                out.printf("mov %s, rcx\n", uni.getAns().accept(this));
            }
            return;
        }
        if (uni.getUnaryOP() == UnaryExprNode.UnaryOP.SELF_DEC) {
            out.printf("dec %s\n", uni.getObj().accept(this));
            if (uni.getObj() != uni.getAns()) {
                //mov rcx, *
                out.printf("mov rcx, %s\n\t", uni.getObj().accept(this));
                //mov r, rcx
                out.printf("mov %s, rcx\n", uni.getAns().accept(this));
            }
            return;
        }
        if (uni.getObj() != uni.getAns()) {
            //mov rcx, *
            out.printf("mov rcx, %s\n\t", uni.getObj().accept(this));
            //mov r, rcx
            out.printf("mov %s, rcx\n", uni.getAns().accept(this));
        }
        switch (uni.getUnaryOP()) {
            case POSI:
                //neg *
                break;
            case NEGE:
                //neg *
                out.printf("neg %s\n", uni.getAns().accept(this));
                return;
            case BIT_NOT:
                //not *
                out.printf("not %s\n", uni.getAns().accept(this));
                break;
            case LOGIC_NOT:
                //xor *, 1
                out.printf("xor %s, 1\n", uni.getAns().accept(this));
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
//            out.print("pop r15\n\t" +
//                    "pop r14\n\t" +
//                    "pop r13\n\t" +
//                    "pop r12\n\t" +
//                    "pop rbx\n\t");
//            err.print("pop r15\n\t" +
//                    "pop r14\n\t" +
//                    "pop r13\n\t" +
//                    "pop r12\n\t" +
//                    "pop rbx\n\t");
        }
        //leave
        //ret
        out.println("leave\n\tret");
    }

}
