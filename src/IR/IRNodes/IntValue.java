package IR.IRNodes;

import IR.IRVisitor;

abstract public class IntValue {
    abstract public String accept(IRVisitor visitor);
}
