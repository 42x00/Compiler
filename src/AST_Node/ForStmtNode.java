package AST_Node;

import java.util.List;

public class ForStmtNode extends StmtNode{
    public StmtNode forstmt;
    public ExprNode forexprinit, forexprend, forexprupdate;
    public List<VarDeclNode> forinit;

    public ForStmtNode(ExprNode forexprinit, ExprNode forexprend, ExprNode forexprupdate) {
        this.forexprinit = forexprinit;
        this.forexprend = forexprend;
        this.forexprupdate = forexprupdate;
    }

    public ForStmtNode(ExprNode forexprend, ExprNode forexprupdate) {
        this.forexprend = forexprend;
        this.forexprupdate = forexprupdate;
    }

    public void setForstmt(StmtNode forstmt) {
        this.forstmt = forstmt;
    }

    public void setForinit(List<VarDeclNode> forinit) {
        this.forinit = forinit;
    }
}
