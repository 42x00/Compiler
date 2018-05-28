package IR.IRNodes;

import IR.IRVisitor;

abstract public class Inst {
    public void accept(IRVisitor visitor){}
}
