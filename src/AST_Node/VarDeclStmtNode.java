package AST_Node;

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
