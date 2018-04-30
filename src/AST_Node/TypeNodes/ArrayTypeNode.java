package AST_Node.TypeNodes;

import AST_Node.ASTVisitor;
import AST_Node.ExprNodes.ExprNode;
import Type.*;
import static java.lang.System.err;

public class ArrayTypeNode extends TypeNode {
    private int arraysize;
    private TypeNode arrayelement;
    private ExprNode arraysizeexpr;

    public ExprNode getArraysizeexpr() {
        return arraysizeexpr;
    }

    public ArrayTypeNode(TypeNode obj) {
        if (obj.basetype == Type.Types.VOID) {
            err.println("Void Array!");
            throw new Error();
        }
        this.basetype = obj.basetype;
        this.dim = obj.dim + 1;
        this.arrayelement = obj;
    }

    public TypeNode getArrayelement() {
        return arrayelement;
    }

    public ArrayTypeNode(TypeNode obj, ExprNode expr) {
        this.basetype = obj.basetype;
        this.dim = obj.dim + 1;
        this.arrayelement = obj;
        this.arraysizeexpr = expr;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

    public void setArraysize(int arraysize) {
        this.arraysize = arraysize;
    }
}
