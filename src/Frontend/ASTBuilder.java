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
                case("void"): return new TypeNode(Type.Types.VOID); break;
                case("int"): return  new TypeNode(Type.Types.INT); break;
                case("string"): return new TypeNode(Type.Types.STRING); break;
            }
        }
    }



}