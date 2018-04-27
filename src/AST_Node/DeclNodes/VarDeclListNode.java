package AST_Node.DeclNodes;

import AST_Node.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class VarDeclListNode extends DeclNode {
    public List<VarDeclNode> vardeclnodeList;

    public VarDeclListNode() {
        this.vardeclnodeList = new ArrayList<>();
    }

    public VarDeclListNode(List<VarDeclNode> vardeclnodeList) {
        this.vardeclnodeList = vardeclnodeList;
    }

    public VarDeclListNode(VarDeclNode varDeclNode) {
        this.vardeclnodeList = new ArrayList<>();
        vardeclnodeList.add(varDeclNode);
    }
}
