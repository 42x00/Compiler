package AST_Node.TypeNodes;

import AST_Node.ASTVisitor;
import AST_Node.DeclNodes.FuncDeclNode;
import AST_Node.DeclNodes.VarDeclListNode;
import Type.Type;
import org.antlr.v4.runtime.ParserRuleContext;

public class FuncTypeNode extends TypeNode{
    private boolean isConstructFunction;
    private TypeNode functionReturnType;
    private VarDeclListNode functionParameterList;

    public FuncTypeNode() {
        isConstructFunction = false;
        functionReturnType = new TypeNode();
        functionParameterList = new VarDeclListNode();
    }

    public FuncTypeNode(FuncDeclNode funcDeclNode) {
        isConstructFunction = funcDeclNode.isConstructFunction();
        functionReturnType = funcDeclNode.getFunctionReturnType();
        functionParameterList = funcDeclNode.getFunctionParameterList();
        if (funcDeclNode.getFunctionReturnType() != null){
            this.basetype = functionReturnType.basetype;
            this.dim = functionReturnType.dim;
        }
    }

    public boolean isConstructFunction() {
        return isConstructFunction;
    }

    public TypeNode getFunctionReturnType() {
        return functionReturnType;
    }

    public VarDeclListNode getFunctionParameterList() {
        return functionParameterList;
    }

    public int getParamSize(){
        return functionParameterList.getParamSize();
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
