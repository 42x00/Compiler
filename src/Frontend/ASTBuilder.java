package Frontend;

import AST_Node.*;

import Type.Type;
import org.antlr.v4.runtime.ParserRuleContext;
import Parser.LMxBaseVisitor;
import Parser.LMxParser;

import java.util.ArrayList;
import java.util.List;

public class ASTBuilder extends LMxBaseVisitor<ASTNode> {
    @Override
    public ASTNode visitProgram(LMxParser.ProgramContext ctx) {
        List<DeclNode> declarations = new ArrayList<>();
        for (ParserRuleContext programDeclaration : ctx.programDeclaration()) {
            ASTNode declaration = visit(programDeclaration);
            declarations.add((DeclNode) declaration);
        }
        return new ProgNode(declarations);
    }

    @Override
    public ASTNode visitProgramDeclaration(LMxParser.ProgramDeclarationContext ctx) {
        if (ctx.functionDefinition() != null) return (FuncDeclNode) visit(ctx.functionDefinition());
        else if (ctx.classDefinition() != null) return (ClassDeclNode) visit(ctx.classDefinition());
        else return (VarDeclListNode) visit(ctx.declaration());
    }

    @Override
    public ASTNode visitFunctionDefinition(LMxParser.FunctionDefinitionContext ctx) {
        TypeNode returntype;
        if (ctx.declarationSpecifier() == null) returntype = null;
        else returntype =(TypeNode) visit(ctx.declarationSpecifier());
        FuncDeclNode funcdeclnode_name_params =(FuncDeclNode) visit(ctx.directDeclarator());
        CompStmtNode compoundstatement = (CompStmtNode) visit(ctx.compoundStatement());
        return new FuncDeclNode(returntype,funcdeclnode_name_params.getFunctionName(),funcdeclnode_name_params.getFunctionParameterList(),compoundstatement);
    }

    @Override
    public ASTNode visitDeclarationSpecifier_type(LMxParser.DeclarationSpecifier_typeContext ctx) {
        if (ctx.typeSpecifier().typedefName() == null) {
            switch (ctx.typeSpecifier().toString()){
                case("void"): return new TypeNode(Type.Types.VOID);
                case("int"): return  new TypeNode(Type.Types.INT);
                case("string"): return new TypeNode(Type.Types.STRING);
            }
        }
        else {
            return new ClassTypeNode(ctx.typeSpecifier().typedefName().Identifier().toString());
        }
        return null;
    }

    @Override
    public ASTNode visitDeclarationSpecifier_array(LMxParser.DeclarationSpecifier_arrayContext ctx) {
        TypeNode basetype = (TypeNode) visit(ctx.declarationSpecifier());
        return new ArrayTypeNode(basetype);
    }

    @Override
    public ASTNode visitDirectDeclarator_Identifier(LMxParser.DirectDeclarator_IdentifierContext ctx) {
        FuncDeclNode funcdeclnode_name = new FuncDeclNode();
        funcdeclnode_name.setFunctionName(ctx.Identifier().toString());
        return funcdeclnode_name;
    }

    @Override
    public ASTNode visitDirectDeclarator_recycle(LMxParser.DirectDeclarator_recycleContext ctx) {
        return (FuncDeclNode) visit(ctx.directDeclarator());
    }

    @Override
    public ASTNode visitDirectDeclarator_with_parameterList(LMxParser.DirectDeclarator_with_parameterListContext ctx) {
        FuncDeclNode funcdeclnode_name_params =(FuncDeclNode) visit(ctx.directDeclarator());
        funcdeclnode_name_params.setFunctionParameterList((VarDeclListNode) visit(ctx.parameterList()));
        return funcdeclnode_name_params;
    }

    @Override
    public ASTNode visitParameterDeclaration_multi(LMxParser.ParameterDeclaration_multiContext ctx) {
        VarDeclListNode tmpvardecllistnode = (VarDeclListNode) visit(ctx.parameterList());
        tmpvardecllistnode.vardeclnodeList.add((VarDeclNode) visit(ctx.parameterDeclaration()));
        return tmpvardecllistnode;
    }

    @Override
    public ASTNode visitParameterDeclaration_single(LMxParser.ParameterDeclaration_singleContext ctx) {
        TypeNode vartype = (TypeNode) visit(ctx.parameterDeclaration().declarationSpecifier());
        FuncDeclNode funcdeclnode_name = (FuncDeclNode) visit(ctx.parameterDeclaration().directDeclarator());
        return new VarDeclNode(vartype,funcdeclnode_name.getFunctionName());
    }

    @Override
    public ASTNode visitCompoundStatement(LMxParser.CompoundStatementContext ctx) {
        List<StmtNode> stmtnodelist = new ArrayList<>();
        for (ParserRuleContext blockitem : ctx.blockItem()){
            stmtnodelist.add((StmtNode) visit(blockitem));
        }
        return new CompStmtNode(stmtnodelist);
    }

    @Override
    public ASTNode visitBlockItem(LMxParser.BlockItemContext ctx) {
        if (ctx.statement() != null) return (StmtNode) visit(ctx.statement());
        else return (StmtNode) visit(ctx.declaration());
    }

    @Override
    public ASTNode visitDeclaration(LMxParser.DeclarationContext ctx) {

    }
}