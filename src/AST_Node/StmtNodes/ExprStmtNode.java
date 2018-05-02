package AST_Node.StmtNodes;

import AST_Node.ASTVisitor;
import AST_Node.ExprNodes.ExprNode;
import org.antlr.v4.runtime.ParserRuleContext;

public class ExprStmtNode extends StmtNode{
    private ExprNode exprnode;

    public ExprStmtNode() {
    }

    public ExprStmtNode(ExprNode exprnode) {
        this.exprnode = exprnode;
    }

    public ExprNode getExprnode() {
        return exprnode;
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
