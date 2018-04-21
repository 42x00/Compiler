package AST_Node;

public class VarDeclNode extends DeclNode{
    private TypeNode vartype;
    private String varname;
    private ExprNode varinit;
    private Location location;

    public VarDeclNode(TypeNode vartype, String varname, ExprNode varinit, Location location) {
        this.vartype = vartype;
        this.varname = varname;
        this.varinit = varinit;
        this.location = location;
}

    public TypeNode getVartype() {
        return vartype;
    }

    public String getVarname() {
        return varname;
    }

    public ExprNode getVarinit() {
        return varinit;
    }

    public Location getLocation() {
        return location;
    }

    @Override

    public Location location() {
        return location;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
