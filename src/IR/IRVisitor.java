package IR;

import IR.IRNodes.*;

public interface IRVisitor{
    void visit(Assign assign);
    void visit(BasicBlock basicBlock);
    void visit(Bin bin);
    void visit(Call call);
    void visit(Cjump cjump);
    String visit(ConstValue constValue);
    String visit(GloalVar gloalVar);
    void visit(Jump jump);
    String visit(MemAddr memAddr);
    void visit(Push push);
    String visit(Register register);
    void visit(ReturnInst returnInst);
    void visit(Uni uni);
}
