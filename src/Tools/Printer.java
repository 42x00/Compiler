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

    public void optim() {
        int index = 0;
        while (index < codeLines.size()) {
            CodeLine line = codeLines.get(index);
            if (line.printKind == PrintKind.JUMP && codeLines.get(index + 1).printKind == PrintKind.LABEL){
                if (line.string1.equals(codeLines.get(index + 1).string1))
                    codeLines.remove(index);
                continue;
            }
            ++index;
        }
    }

    public void print() {
        optim();
        int index = 0;
        while (index < codeLines.size()) {
            CodeLine line = codeLines.get(index);
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
                    out.printf("cmp %s, %s\n", line.string1, line.string2);
                    break;
                case JNZ:
                    out.printf("jnz %s\n", line.string1);
                    break;
                case MOV:
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
