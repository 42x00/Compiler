package AST_Node.DeclNodes;

import AST_Node.ASTVisitor;
import AST_Node.ExprNodes.ExprNode;
import AST_Node.TypeNodes.TypeNode;
import IR.IRNodes.IntValue;
import Type.*;
import org.antlr.v4.runtime.ParserRuleContext;

public class VarDeclNode extends DeclNode {
    private TypeNode vartype;
    private ExprNode varinit;
    private IntValue intValue;
    private int offsetIndex;

    public VarDeclNode(String varname, ExprNode varinit) {
        this.declname = varname;
        this.varinit = varinit;
    }

    public VarDeclNode(String varname) {
        this.declname = varname;
    }

    public VarDeclNode(TypeNode vartype) {
        if (vartype.isEqual(Type.Types.VOID)){
            throw new Error("Void Var!");
        }
        this.vartype = vartype;
    }

    public VarDeclNode(TypeNode vartype, String varname) {
        if (vartype.isEqual(Type.Types.VOID)){
            throw new Error("Void Var!");
        }
        this.vartype = vartype;
        this.declname = varname;
    }

    public VarDeclNode(TypeNode vartype, String varname, ExprNode varinit) {
        if (vartype.isEqual(Type.Types.VOID)){
            throw new Error("Void Var!");
        }
        this.vartype = vartype;
        this.declname = varname;
        this.varinit = varinit;
    }

    public TypeNode getVartype() {
        return vartype;
    }

    public void setVartype(TypeNode vartype) {
        if (vartype.isEqual(Type.Types.VOID)){
            throw new Error("Void Var!");
        }
        this.vartype = vartype;
    }

    public String getVarname() {
        return this.declname;
    }

    public void setVarname(String varname) {
        this.declname = varname;
    }

    public ExprNode getVarinit() {
        return varinit;
    }

    public void setVarinit(ExprNode varinit) {
        this.varinit = varinit;
    }

    public IntValue getIntValue() {
        return intValue;
    }

    public void setIntValue(IntValue intValue) {
        this.intValue = intValue;
    }

    public void setOffsetIndex(int offsetIndex) {
        this.offsetIndex = offsetIndex;
    }

    public int getOffsetIndex() {
        return offsetIndex;
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
