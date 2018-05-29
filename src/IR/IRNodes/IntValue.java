package IR.IRNodes;

import IR.IRVisitor;

abstract public class IntValue {
    public void accept(IRVisitor visitor){}
    public void toLvalue(){}
}
