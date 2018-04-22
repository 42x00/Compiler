package AST_Node;

import java.util.List;

public class ProgNode extends ASTNode{
    List<DeclNode> declarations;

    public ProgNode(List<DeclNode> declarations) {
        this.declarations = declarations;
    }
}
