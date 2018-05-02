package AST_Node.DeclNodes;

import AST_Node.ASTVisitor;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;

public class VarDeclListNode extends DeclNode {
    private List<VarDeclNode> vardeclnodeList;

    public VarDeclListNode() {
        this.vardeclnodeList = new ArrayList<>();
    }

    public VarDeclListNode(VarDeclNode varDeclNode) {
        this.vardeclnodeList = new ArrayList<>();
        vardeclnodeList.add(varDeclNode);
    }

    public int getParamSize(){
        return vardeclnodeList.size();
    }

    public List<VarDeclNode> getVardeclnodeList() {
        return vardeclnodeList;
    }

    public void addDecl(VarDeclNode varDeclNode){
        vardeclnodeList.add(varDeclNode);
    }

    @Override
    public void setCtx(ParserRuleContext ctx) {
        this.ctx = ctx;
    }
}
