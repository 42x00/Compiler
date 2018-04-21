package AST_Node;

import java.util.List;

public class ProgramNode extends ASTNode{
    private List<DeclNode> declarations;
    private Location location;

    public ProgramNode(List<DeclNode> declarations, Location location) {
        this.declarations = declarations;
        this.location = location;
    }

    @Override
    public Location location() {
        return location;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
