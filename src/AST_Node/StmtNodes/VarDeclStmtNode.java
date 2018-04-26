package AST_Node.StmtNodes;

import AST_Node.ASTVisitor;
import AST_Node.DeclNodes.VarDeclNode;

public class VarDeclStmtNode extends StmtNode{
    public VarDeclNode vardeclnode;

    public VarDeclStmtNode(VarDeclNode vardeclnode) {
        this.vardeclnode = vardeclnode;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
