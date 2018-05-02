package AST_Node.StmtNodes;

import AST_Node.ASTVisitor;
import AST_Node.DeclNodes.VarDeclNode;
import org.antlr.v4.runtime.ParserRuleContext;

public class VarDeclStmtNode extends StmtNode{
    private VarDeclNode vardeclnode;

    public VarDeclStmtNode(VarDeclNode vardeclnode) {
        this.vardeclnode = vardeclnode;
    }

    public VarDeclNode getVardeclnode() {
        return vardeclnode;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void setCtx(ParserRuleContext ctx) {
        this.ctx = ctx;
    }

}
