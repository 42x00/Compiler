package AST_Node;

import java.util.List;

public class VarDeclListNode extends DeclNode{
    public List<VarDeclNode> vardeclnodeList;

    public VarDeclListNode() {
    }

    public VarDeclListNode(List<VarDeclNode> vardeclnodeList) {
        this.vardeclnodeList = vardeclnodeList;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
