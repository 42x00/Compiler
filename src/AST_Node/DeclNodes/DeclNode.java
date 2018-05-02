package AST_Node.DeclNodes;

import AST_Node.ASTNode;
import org.antlr.v4.runtime.ParserRuleContext;

abstract public class DeclNode extends ASTNode {
    protected String declname;

    public String getDeclname() {
        return declname;
    }

    public DeclNode() {
    }

    public DeclNode(String declname) {
        this.declname = declname;
    }
}
