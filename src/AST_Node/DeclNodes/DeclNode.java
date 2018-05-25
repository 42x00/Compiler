package AST_Node.DeclNodes;

import AST_Node.ASTNode;
import org.antlr.v4.runtime.ParserRuleContext;

abstract public class DeclNode extends ASTNode {
    protected String declname;
    protected Integer memAddr;

    public String getDeclname() {
        return declname;
    }

    public Integer getMemAddr() {
        return memAddr;
    }

    public void setMemAddr(Integer memAddr) {
        this.memAddr = memAddr;
    }

    public DeclNode() {
    }

    public DeclNode(String declname) {
        this.declname = declname;
    }
}
