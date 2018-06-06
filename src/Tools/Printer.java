package Tools;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class Printer {
    static public enum PrintKind {
        MOV, PUSH, CMP, LABEL, JUMP, JNZ, JZ, CALL, POP, CDQ, LEAVE, RET,
        MUL, DIV, MOD,
        ADD, SUB,
        SHL, SHR,
        BIT_AND, BIT_XOR, BIR_OR, ASSIGN,
        LESS, LESS_EQUAL, GREATER, GREATER_EQUAL, EQUAL, INEQUAL,
        SELF_INC, SELF_DEC, POSI, NEGE, LOGIC_NOT, BIT_NOT
    }

    static public class CodeLine {
        public PrintKind printKind;
        public String string1;
        public String string2;
        public String string3;

        public CodeLine(PrintKind printKind) {
            this.printKind = printKind;
        }

        public CodeLine(PrintKind printKind, String string1) {
            this.printKind = printKind;
            this.string1 = string1;
        }

        public CodeLine(PrintKind printKind, String string1, String string2) {
            this.printKind = printKind;
            this.string1 = string1;
            this.string2 = string2;
        }

        public CodeLine(PrintKind printKind, String string1, String string2, String string3) {
            this.printKind = printKind;
            this.string1 = string1;
            this.string2 = string2;
            this.string3 = string3;
        }
    }

    List<CodeLine> codeLines = new ArrayList<>();

    public void add(PrintKind printKind) {
        codeLines.add(new CodeLine(printKind));
    }

    public void add(PrintKind printKind, String string) {
        codeLines.add(new CodeLine(printKind, string));
    }

    public void add(PrintKind printKind, String string1, String string2) {
        codeLines.add(new CodeLine(printKind, string1, string2));
    }

    public void add(PrintKind printKind, int anInt) {
        codeLines.add(new CodeLine(printKind, Integer.toString(anInt)));
    }

    public void add(PrintKind printKind, String string1, int anInt) {
        codeLines.add(new CodeLine(printKind, string1, Integer.toString(anInt)));
    }

    private String c8t1(String s) {
        if (s.startsWith("qword")) {
            return "byte" + s.substring(5);
        }
        switch (s) {
            case "rbx":
                return "bl";
            default:
                return s + 'b';
        }
    }

    public void optim() {
        int index = 0;
        while (index < codeLines.size() - 1) {
            CodeLine line = codeLines.get(index);
            if (line.printKind == PrintKind.JUMP && codeLines.get(index + 1).printKind == PrintKind.LABEL) {
                if (line.string1.equals(codeLines.get(index + 1).string1)) {
                    codeLines.remove(index);
                    continue;
                }
            }
            if (line.printKind == PrintKind.CMP) {
                if (line.string2.equals("false"))
                    line.string2 = "0";
                if (!isAddr(line.string1) && notRegister(line.string1)) {
                    codeLines.add(index, new CodeLine(PrintKind.MOV, "cl", line.string1));
                    line.string1 = "cl";
                    ++index;
                }
            }
            switch (line.printKind) {
                case CMP:
                case MOV:
                case BIT_AND:
                case BIT_XOR:
                case BIR_OR:
                case ADD:
                case SUB:
                    if (isAddr(line.string1) && isAddr(line.string2)) {
                        codeLines.add(index, new CodeLine(PrintKind.MOV, "rcx", line.string2));
                        line.string2 = "rcx";
                        ++index;
                        break;
                    }
                    break;

                case SHL:
                case SHR:
                    codeLines.add(index, new CodeLine(PrintKind.MOV, "rcx", line.string2));
                    line.string2 = "cl";
                    ++index;
                    break;

                case DIV:
                case MOD:
                case MUL:
                    if (notRegister(line.string1)) {
                        codeLines.add(index, new CodeLine(PrintKind.MOV, "rcx", line.string1));
                        line.string1 = "rcx";
                        ++index;
                        break;
                    }
//                case LESS:
//                case EQUAL:
//                case GREATER:
//                case INEQUAL:
//                case CALL:
//                case CDQ:
//                case LESS_EQUAL:
//                case GREATER_EQUAL:
//                case LOGIC_NOT:
//                case NEGE:
//                case BIT_NOT:
//                case POSI:
//                case ASSIGN:
//                case SELF_INC:
//                case SELF_DEC:
            }
            ++index;
        }

    }

    public boolean isByte(String string) {
        return string.startsWith("byte");
    }

    public boolean isAddr(String string) {
        return string.startsWith("qword");
    }

    public boolean notRegister(String string) {
        return !string.startsWith("r");
    }

    public void print() {
        optim();
        int index = 0;
        while (index < codeLines.size()) {
            CodeLine line = codeLines.get(index);
            if (line.printKind == PrintKind.CMP && line.string1.equals("cl")){
                int lyk = 1;
            }
            if (line.printKind != PrintKind.LABEL)
                out.print('\t');
            switch (line.printKind) {
                case SELF_DEC:
                    out.printf("dec %s\n", line.string1);
                    break;
                case SELF_INC:
                    out.printf("inc %s\n", line.string1);
                    break;
                case ASSIGN:
                    out.printf("mov %s, %s\n", line.string1, line.string2);
                    break;
                case POSI:
                    break;
                case BIT_NOT:
                    out.printf("not %s\n", line.string1);
                    break;
                case NEGE:
                    out.printf("neg %s\n", line.string1);
                    break;
                case LOGIC_NOT:
                    out.printf("xor %s, 1\n", line.string1);
                    break;
                case GREATER_EQUAL:
                    out.printf("setge %s\n", line.string1);
                    break;
                case LESS_EQUAL:
                    out.printf("setle %s\n", line.string1);
                    break;
                case CDQ:
                    out.println("cdq");
                    break;
                case CALL:
                    out.printf("call %s\n", line.string1);
                    break;
                case INEQUAL:
                    out.printf("setne %s\n", line.string1);
                    break;
                case GREATER:
                    out.printf("setg %s\n", line.string1);
                    break;
                case BIT_XOR:
                    out.printf("xor %s, %s\n", line.string1, line.string2);
                    break;
                case BIT_AND:
                    out.printf("and %s, %s\n", line.string1, line.string2);
                    break;
                case SUB:
                    out.printf("sub %s, %s\n", line.string1, line.string2);
                    break;
                case SHR:
                    out.printf("sar %s, %s\n", line.string1, line.string2);
                    break;
                case SHL:
                    out.printf("shl %s, %s\n", line.string1, line.string2);
                    break;
                case BIR_OR:
                    out.printf("or %s, %s\n", line.string1, line.string2);
                    break;
                case EQUAL:
                    out.printf("sete %s\n", line.string1);
                    break;
                case LESS:
                    out.printf("setl %s\n", line.string1);
                    break;
                case MUL:
                    out.printf("imul %s\n", line.string1);
                    break;
                case MOD:
                    out.printf("idiv %s\n", line.string1);
                    break;
                case DIV:
                    out.printf("idiv %s\n", line.string1);
                    break;
                case ADD:
                    out.printf("add %s, %s\n", line.string1, line.string2);
                    break;
                case JZ:
                    out.printf("jz %s\n", line.string1);
                    break;
                case CMP:
                    if (line.string1.equals("cl")) line.string2 = c8t1(line.string2);
                    out.printf("cmp %s, %s\n", line.string1, line.string2);
                    break;
                case JNZ:
                    out.printf("jnz %s\n", line.string1);
                    break;
                case MOV:
                    if (!line.string1.equals(line.string2))
                        out.printf("mov %s, %s\n", line.string1, line.string2);
                    break;
                case POP:
                    out.printf("pop %s\n", line.string1);
                    break;
                case RET:
                    out.println("ret");
                    break;
                case JUMP:
                    out.printf("jmp %s\n", line.string1);
                    break;
                case PUSH:
                    out.printf("push %s\n", line.string1);
                    break;
                case LABEL:
                    out.println(line.string1 + ":");
                    break;
                case LEAVE:
                    out.println("leave");
                    break;
            }
            ++index;
        }
    }
}
