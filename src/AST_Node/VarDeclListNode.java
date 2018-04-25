package AST_Node;

import java.util.ArrayList;
import java.util.List;

public class VarDeclListNode extends DeclNode{
    public List<VarDeclNode> vardeclnodeList;

    public VarDeclListNode() {
        this.vardeclnodeList = new ArrayList<>();
    }

    public VarDeclListNode(List<VarDeclNode> vardeclnodeList) {
        this.vardeclnodeList = vardeclnodeList;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
