package IR.IRNodes;

import IR.IRVisitor;

import java.util.HashSet;
import java.util.Set;

abstract public class Inst {
    public void accept(IRVisitor visitor) {
    }

    protected Set<Register> def = new HashSet<>();
    protected Set<Register> use = new HashSet<>();
    protected Set<Register> in = new HashSet<>();
    protected Set<Register> out = new HashSet<>();

    public Set<Register> getDef() {
        return def;
    }

    public Set<Register> getUse() {
        return use;
    }

    public Set<Register> getIn() {
        return in;
    }

    public Set<Register> getOut() {
        return out;
    }

    public void clearIn() {
        this.in = new HashSet<>();
    }

    public void clearOut() {
        this.out = new HashSet<>();
    }

    public void addUse(IntValue intValue){
        this.use.add((Register) intValue);
    }

    public void addDef(IntValue intValue){
        this.def.add((Register) intValue);
    }
}
