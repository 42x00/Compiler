package AST_Node;

import AST_Node.DeclNodes.DeclNode;

import java.util.ArrayList;
import java.util.List;

public class ProgNode extends ASTNode{
    public List<DeclNode> declarations;

    public ProgNode() {
        this.declarations = new ArrayList<>();
    }

    public ProgNode(List<DeclNode> declarations) {
        this.declarations = declarations;
    }

    public void setDeclarations(List<DeclNode> declarations) {
        this.declarations = declarations;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
