package AST_Node.DeclNodes;

import AST_Node.ASTNode;

abstract public class DeclNode extends ASTNode {
    public String declname;

    public DeclNode() {
    }

    public DeclNode(String declname) {
        this.declname = declname;
    }
}
