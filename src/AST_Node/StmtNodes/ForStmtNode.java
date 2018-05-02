package AST_Node.StmtNodes;

import AST_Node.ASTVisitor;
import AST_Node.DeclNodes.VarDeclNode;
import AST_Node.ExprNodes.ExprNode;
import Tools.Scope.Scope;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;

public class ForStmtNode extends StmtNode{
    private StmtNode forstmt;
    private ExprNode forexprinit, forexprend, forexprupdate;
    private List<VarDeclNode> forinit;

    public ForStmtNode() {
        this.forinit = new ArrayList<>();
    }

    public ForStmtNode(ExprNode forexprinit, ExprNode forexprend, ExprNode forexprupdate) {
        this.forexprinit = forexprinit;
        this.forexprend = forexprend;
        this.forexprupdate = forexprupdate;
        this.forinit = new ArrayList<>();
    }

    public ForStmtNode(ExprNode forexprend, ExprNode forexprupdate) {
        this.forexprend = forexprend;
        this.forexprupdate = forexprupdate;
        this.forinit = new ArrayList<>();
    }

    public void addInitDecl(VarDeclNode varDeclNode){
        forinit.add(varDeclNode);
    }

    public StmtNode getForstmt() {
        return forstmt;
    }

    public ExprNode getForexprinit() {
        return forexprinit;
    }

    public ExprNode getForexprend() {
        return forexprend;
    }

    public ExprNode getForexprupdate() {
        return forexprupdate;
    }

    public List<VarDeclNode> getForinit() {
        return forinit;
    }

    public void setForstmt(StmtNode forstmt) {
        this.forstmt = forstmt;
    }

    public void setForinit(List<VarDeclNode> forinit) {
        this.forinit = forinit;
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
