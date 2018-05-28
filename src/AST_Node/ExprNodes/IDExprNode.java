package AST_Node.ExprNodes;

import AST_Node.ASTVisitor;
import AST_Node.DeclNodes.DeclNode;
import AST_Node.DeclNodes.VarDeclNode;
import org.antlr.v4.runtime.ParserRuleContext;

public class IDExprNode extends ExprNode{
    private String id;
    private VarDeclNode varDeclNode;

    public IDExprNode(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public VarDeclNode getVarDeclNode() {
        return varDeclNode;
    }

    public void setVarDeclNode(VarDeclNode varDeclNode) {
        this.varDeclNode = varDeclNode;
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
