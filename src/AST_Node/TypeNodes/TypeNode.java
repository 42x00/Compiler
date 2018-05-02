package AST_Node.TypeNodes;

import AST_Node.ASTNode;
import AST_Node.ASTVisitor;
import Type.*;
import org.antlr.v4.runtime.ParserRuleContext;

public class TypeNode extends ASTNode {
    protected Type.Types basetype;
    protected int dim;

    public TypeNode(){
        basetype = Type.Types.NULL;
        dim = 0;
    }

    public TypeNode(Type.Types basetype) {
        this.dim = 0;
        this.basetype = basetype;
    }

    public TypeNode(Type.Types basetype, ParserRuleContext ctx) {
        this.dim = 0;
        this.basetype = basetype;
        this.ctx = ctx;
    }

    public boolean isEqual(TypeNode obj) {
        return  (basetype == obj.basetype && dim == obj.dim);
    }

    public boolean isEqual(Type.Types types){
        return this.isEqual(new TypeNode(types));
    }

    public void setBasetype(Type.Types basetype) {
        this.basetype = basetype;
    }

    public void setDim(int dim) {
        this.dim = dim;
    }

    public Type.Types getBasetype() {
        return basetype;
    }

    public int getDim() {
        return dim;
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
