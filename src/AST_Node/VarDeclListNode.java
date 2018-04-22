package AST_Node;

import java.util.List;

public class VarDeclListNode extends ASTNode{
    public List<VarDeclNode> vardeclnodeList;

    public VarDeclListNode() {
    }

    public VarDeclListNode(List<VarDeclNode> vardeclnodeList) {
        this.vardeclnodeList = vardeclnodeList;
    }
}
