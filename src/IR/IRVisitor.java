package IR;

import IR.IRNodes.*;

public interface IRVisitor{
    void visit(Assign assign);
    void visit(BasicBlock basicBlock);
    void visit(Bin bin);
    void visit(Cjump cjump);
    void visit(ConstValue constValue);
    void visit(Jump jump);
    void visit(MemAddr memAddr);
    void visit(Register register);
    void visit(ReturnInst returnInst);
    void visit(Uni uni);
}
