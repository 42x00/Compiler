package AST_Node;

public class VarDeclNode extends DeclNode{
    private TypeNode vartype;
    private String varname;
    private ExprNode varinit;

    public VarDeclNode(String varname, ExprNode varinit) {
        this.varname = varname;
        this.varinit = varinit;
    }

    public VarDeclNode(String varname) {
        this.varname = varname;
    }

    public VarDeclNode(TypeNode vartype) {
        this.vartype = vartype;
    }

    public VarDeclNode(TypeNode vartype, String varname) {
        this.vartype = vartype;
        this.varname = varname;
    }

    public VarDeclNode(TypeNode vartype, String varname, ExprNode varinit) {
        this.vartype = vartype;
        this.varname = varname;
        this.varinit = varinit;
    }

    public TypeNode getVartype() {
        return vartype;
    }

    public void setVartype(TypeNode vartype) {
        this.vartype = vartype;
    }

    public String getVarname() {
        return varname;
    }

    public void setVarname(String varname) {
        this.varname = varname;
    }

    public ExprNode getVarinit() {
        return varinit;
    }

    public void setVarinit(ExprNode varinit) {
        this.varinit = varinit;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
