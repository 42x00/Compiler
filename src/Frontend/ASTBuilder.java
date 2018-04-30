package Frontend;

import AST_Node.*;
import AST_Node.ExprNodes.*;
import AST_Node.StmtNodes.*;
import AST_Node.TypeNodes.*;
import AST_Node.DeclNodes.*;
import Parser.LMxBaseVisitor;
import Parser.LMxParser;
import Type.Type;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;

public class ASTBuilder extends LMxBaseVisitor<ASTNode> {

    @Override
    public ASTNode visitProgram(LMxParser.ProgramContext ctx) {
        List<DeclNode> declarations = new ArrayList<>();
        for (ParserRuleContext programDeclaration : ctx.programDeclaration()) {
            ASTNode declaration = visit(programDeclaration);
            if (declaration instanceof VarDeclListNode){
                for (VarDeclNode vardeclnode : ((VarDeclListNode) declaration).vardeclnodeList){
                    declarations.add((DeclNode) vardeclnode);
                }
            }
            else {
                declarations.add((DeclNode) declaration);
            }
        }
        return new ProgNode(declarations);
    }

    @Override
    public ASTNode visitProgramDeclaration(LMxParser.ProgramDeclarationContext ctx) {
        if (ctx.functionDefinition() != null) return visit(ctx.functionDefinition());
        else if (ctx.classDefinition() != null) return visit(ctx.classDefinition());
        else return visit(ctx.declaration());
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
        return visit(ctx.typeSpecifier());
    }

    @Override
    public ASTNode visitTypeSpecifier(LMxParser.TypeSpecifierContext ctx) {
        if (ctx.typedefName() == null) {
            switch (ctx.getText()){
                case("void"): return new TypeNode(Type.Types.VOID);
                case("int"): return  new TypeNode(Type.Types.INT);
                case("string"): return new TypeNode(Type.Types.STRING);
                case("bool"): return new TypeNode(Type.Types.BOOL);
                default: return null;
            }
        }
        else {
            return new ClassTypeNode(ctx.typedefName().Identifier().getText());
        }
    }

    @Override
    public ASTNode visitDeclarationSpecifier_array(LMxParser.DeclarationSpecifier_arrayContext ctx) {
        ASTNode basetype = visit(ctx.declarationSpecifier());
        if (basetype instanceof ClassTypeNode)
            return new ArrayTypeNode((ClassTypeNode) basetype);
        else if (basetype instanceof ArrayTypeNode)
            return new ArrayTypeNode((ArrayTypeNode) basetype);
        else return new ArrayTypeNode((TypeNode) basetype);
    }

    @Override
    public ASTNode visitDirectDeclarator_Identifier(LMxParser.DirectDeclarator_IdentifierContext ctx) {
        return new FuncDeclNode(ctx.Identifier().getText());
    }

    @Override
    public ASTNode visitDirectDeclarator_recycle(LMxParser.DirectDeclarator_recycleContext ctx) {
        return visit(ctx.directDeclarator());
    }

    @Override
    public ASTNode visitDirectDeclarator_with_parameterList(LMxParser.DirectDeclarator_with_parameterListContext ctx) {
        FuncDeclNode funcdeclnode_name_params =(FuncDeclNode) visit(ctx.directDeclarator());
        if (ctx.parameterList() != null) funcdeclnode_name_params.setFunctionParameterList((VarDeclListNode) visit(ctx.parameterList()));
        return funcdeclnode_name_params;
    }

    @Override
    public ASTNode visitParameterList_multi(LMxParser.ParameterList_multiContext ctx) {
        VarDeclListNode vardecllistnode = (VarDeclListNode) visit(ctx.parameterList());
        vardecllistnode.vardeclnodeList.add((VarDeclNode) visit(ctx.parameterDeclaration()));
        return vardecllistnode;
    }

    @Override
    public ASTNode visitParameterList_single(LMxParser.ParameterList_singleContext ctx) {
        VarDeclNode varDeclNode = (VarDeclNode) visit(ctx.parameterDeclaration());
        return new VarDeclListNode(varDeclNode);
    }

    @Override
    public ASTNode visitParameterDeclaration(LMxParser.ParameterDeclarationContext ctx) {
        TypeNode vartype = (TypeNode) visit(ctx.declarationSpecifier());
        FuncDeclNode funcdeclnode_name = (FuncDeclNode) visit(ctx.directDeclarator());
        return new VarDeclNode(vartype,funcdeclnode_name.getFunctionName());
    }

    @Override
    public ASTNode visitCompoundStatement(LMxParser.CompoundStatementContext ctx) {
        List<StmtNode> stmtnodelist = new ArrayList<>();
        for (ParserRuleContext blockitem : ctx.blockItem()){
            ASTNode visitblockitem = visit(blockitem);
            if (visitblockitem instanceof VarDeclListNode){
                for (VarDeclNode vardeclnode : ((VarDeclListNode) visitblockitem).vardeclnodeList){
                    stmtnodelist.add((StmtNode) new VarDeclStmtNode(vardeclnode));
                }
            }
            else if (visitblockitem instanceof VarDeclNode){
                stmtnodelist.add((StmtNode) new VarDeclStmtNode((VarDeclNode) visitblockitem));
            }
            else if (visitblockitem instanceof ExprNode){
                stmtnodelist.add((StmtNode) new ExprStmtNode((ExprNode) visitblockitem));
            }
            else{
                stmtnodelist.add((StmtNode) visit(blockitem));
            }
        }
        return new CompStmtNode(stmtnodelist);
    }

    @Override
    public ASTNode visitBlockItem(LMxParser.BlockItemContext ctx) {
        if (ctx.statement() != null) return visit(ctx.statement());
        else return visit(ctx.declaration());
    }

    @Override
    public ASTNode visitDeclaration_none(LMxParser.Declaration_noneContext ctx) {
        return new VarDeclNode((TypeNode) visit(ctx.declarationSpecifier()));
    }

    @Override
    public ASTNode visitDeclaration_init(LMxParser.Declaration_initContext ctx) {
        TypeNode vartype = (TypeNode) visit(ctx.declarationSpecifier());
        VarDeclListNode vardecllistnode = (VarDeclListNode) visit(ctx.initDeclaratorList());
        for (VarDeclNode vardeclnode : vardecllistnode.vardeclnodeList){
            vardeclnode.setVartype(vartype);
        }
        return vardecllistnode;
    }

    @Override
    public ASTNode visitInitDeclaratorList_multi(LMxParser.InitDeclaratorList_multiContext ctx) {
        VarDeclListNode vardecllistnode = (VarDeclListNode) visit(ctx.initDeclaratorList());
        vardecllistnode.vardeclnodeList.add((VarDeclNode) visit(ctx.initDeclarator()));
        return vardecllistnode;
    }

    @Override
    public ASTNode visitInitDeclaratorList_single(LMxParser.InitDeclaratorList_singleContext ctx) {
        VarDeclListNode vardecllistnode = new VarDeclListNode();
        vardecllistnode.vardeclnodeList.add((VarDeclNode) visit(ctx.initDeclarator()));
        return vardecllistnode;
    }

    @Override
    public ASTNode visitInitDeclarator_none(LMxParser.InitDeclarator_noneContext ctx) {
        FuncDeclNode funcdeclnode_name = (FuncDeclNode) visit(ctx.directDeclarator());
        return new VarDeclNode(funcdeclnode_name.getFunctionName());
    }

    @Override
    public ASTNode visitInitDeclarator_init(LMxParser.InitDeclarator_initContext ctx) {
        FuncDeclNode funcdeclnode_name = (FuncDeclNode) visit(ctx.directDeclarator());
        return new VarDeclNode(funcdeclnode_name.getFunctionName(), (ExprNode) visit(ctx.expression()));
    }

    @Override
    public ASTNode visitStatement(LMxParser.StatementContext ctx) {
        if (ctx.compoundStatement() != null) {
            return visit(ctx.compoundStatement());
        }
        else if (ctx.expressionStatement() != null){
            if (ctx.expressionStatement().expression() != null) {
                return new ExprStmtNode((ExprNode) visit(ctx.expressionStatement().expression()));
            }
            else return new ExprStmtNode();
        }
        else if (ctx.selectionStatement() != null){
            return visit(ctx.selectionStatement());
        }
        else if (ctx.iterationStatement() != null){
            return visit(ctx.iterationStatement());
        }
        else return visit(ctx.jumpStatement());
    }

    @Override
    public ASTNode visitSelectionStatement(LMxParser.SelectionStatementContext ctx) {
        IfStmtNode ifstmtnode = new IfStmtNode((ExprNode) visit(ctx.expression()), (StmtNode) visit(ctx.statement(0)));
        if (ctx.statement(1) != null){
            ifstmtnode.setElsestmt((StmtNode) visit(ctx.statement(1)));
        }
        return ifstmtnode;
    }

    @Override
    public ASTNode visitIterationStatement_while(LMxParser.IterationStatement_whileContext ctx) {
        return new WhileStmtNode((ExprNode) visit(ctx.expression()), (StmtNode) visit(ctx.statement()));
    }

    @Override
    public ASTNode visitIterationStatement_for(LMxParser.IterationStatement_forContext ctx) {
        ForStmtNode forstmtnode = (ForStmtNode) visit(ctx.forCondition());
        forstmtnode.setForstmt((StmtNode) visit(ctx.statement()));
        return forstmtnode;
    }

    @Override
    public ASTNode visitForCondition_none(LMxParser.ForCondition_noneContext ctx) {
        ExprNode forexprinit = null, forexprend = null, forexprupdate = null;
        if (ctx.expression() != null) forexprinit = (ExprNode) visit(ctx.expression());
        if (ctx.forExpression(0) != null) forexprend = (ExprNode) visit(ctx.forExpression(0));
        if (ctx.forExpression(1) != null) forexprupdate = (ExprNode) visit(ctx.forExpression(1));
        return new ForStmtNode(forexprinit,forexprend,forexprupdate);
    }

    @Override
    public ASTNode visitForCondition_init(LMxParser.ForCondition_initContext ctx) {
        ExprNode forexprend = null, forexprupdate = null;
        if (ctx.forExpression(0) != null) forexprend = (ExprNode) visit(ctx.forExpression(0));
        if (ctx.forExpression(1) != null) forexprupdate = (ExprNode) visit(ctx.forExpression(1));
        ForStmtNode forstmtnode = new ForStmtNode(forexprend,forexprupdate);
        ASTNode forinit = visit(ctx.forDeclaration());
        if (forinit instanceof VarDeclNode){
            forstmtnode.forinit.add((VarDeclNode) forinit);
        }
        else forstmtnode.setForinit(((VarDeclListNode) forinit).vardeclnodeList);
        return forstmtnode;
    }

    @Override
    public ASTNode visitForExpression(LMxParser.ForExpressionContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public ASTNode visitForDeclaration_init(LMxParser.ForDeclaration_initContext ctx) {
        TypeNode vartype = (TypeNode) visit(ctx.declarationSpecifier());
        VarDeclListNode vardecllistnode = (VarDeclListNode) visit(ctx.initDeclaratorList());
        for (VarDeclNode vardeclnode : vardecllistnode.vardeclnodeList){
            vardeclnode.setVartype(vartype);
        }
        return vardecllistnode;
    }

    @Override
    public ASTNode visitForDeclaration_none(LMxParser.ForDeclaration_noneContext ctx) {
        return new VarDeclNode((TypeNode) visit(ctx.declarationSpecifier()));
    }

    @Override
    public ASTNode visitJumpStatement_continue(LMxParser.JumpStatement_continueContext ctx) {
        return new ContinueStmtNode();
    }

    @Override
    public ASTNode visitJumpStatement_break(LMxParser.JumpStatement_breakContext ctx) {
        return new BreakStmtNode();
    }

    @Override
    public ASTNode visitJumpStatement_return(LMxParser.JumpStatement_returnContext ctx) {
        if (ctx.expression() != null) return new ReturnStmtNode((ExprNode) visit(ctx.expression()));
        else return new ReturnStmtNode();
    }

    @Override
    public ASTNode visitClassDeclaration_none(LMxParser.ClassDeclaration_noneContext ctx) {
        return new ClassDeclNode(ctx.Identifier().getText());
    }

    @Override
    public ASTNode visitClassDeclaration_decl(LMxParser.ClassDeclaration_declContext ctx) {
        List<DeclNode> declnodelist = new ArrayList<>();
        for (ParserRuleContext classdeclaration : ctx.classDeclaration()){
            ASTNode visitclassdeclaration = visit(classdeclaration);
            if (visitclassdeclaration instanceof VarDeclListNode){
                for (VarDeclNode vardeclnode : ((VarDeclListNode) visitclassdeclaration).vardeclnodeList){
                    declnodelist.add((DeclNode) vardeclnode);
                }
            }
            else declnodelist.add((DeclNode) visitclassdeclaration);
        }
        return new ClassDeclNode(ctx.Identifier().getText(), declnodelist);
    }

    @Override
    public ASTNode visitExpression(LMxParser.ExpressionContext ctx) {
        if (ctx.newDeclarator() != null){
            return visit(ctx.newDeclarator());
        }
        else if (ctx.DigitSequence() != null){
            return new IntExprNode(Integer.parseInt(ctx.DigitSequence().getText()));
        }
        else if (ctx.logicalOrExpression() != null){
            return visit(ctx.logicalOrExpression());
        }
        else {
            return new BinaryExprNode(BinaryExprNode.BinaryOP.ASSIGN,
                    (ExprNode) visit(ctx.unaryExpression()),
                    (ExprNode) visit(ctx.expression()));
        }
    }

    @Override
    public ASTNode visitNewDeclarator_error(LMxParser.NewDeclarator_errorContext ctx) {
        throw new Error();
    }

    @Override
    public ASTNode visitNewDeclarator_array(LMxParser.NewDeclarator_arrayContext ctx) {
        TypeNode basetype = (TypeNode) visit(ctx.typeSpecifier());
        int nonexprleftbracket = ctx.LeftBracket().size() - ctx.expression().size();
        for (int i = 0; i < nonexprleftbracket; ++i){
            basetype = new ArrayTypeNode(basetype);
        }
        for (int i = ctx.expression().size() - 1; i >= 0; --i){
            basetype = new ArrayTypeNode(basetype, (ExprNode) visit(ctx.expression(i)));
        }
        return new NewExprNode(basetype);
    }

    @Override
    public ASTNode visitNewDeclarator_nonarray(LMxParser.NewDeclarator_nonarrayContext ctx) {
        return new NewExprNode((TypeNode) visit(ctx.typeSpecifier()));
    }

    @Override
    public ASTNode visitLogicalOrExpression_unary(LMxParser.LogicalOrExpression_unaryContext ctx) {
        return visit(ctx.logicalAndExpression());

    }

    @Override
    public ASTNode visitLogicalOrExpression_binary(LMxParser.LogicalOrExpression_binaryContext ctx) {
        return new BinaryExprNode(BinaryExprNode.BinaryOP.LOGICAL_OR,
                (ExprNode) visit(ctx.logicalOrExpression()),
                (ExprNode) visit(ctx.logicalAndExpression()));
    }

    @Override
    public ASTNode visitLogicalAndExpression_unary(LMxParser.LogicalAndExpression_unaryContext ctx) {
        return visit(ctx.inclusiveOrExpression());
    }

    @Override
    public ASTNode visitLogicalAndExpression_binary(LMxParser.LogicalAndExpression_binaryContext ctx) {
        return new BinaryExprNode(BinaryExprNode.BinaryOP.LOGICAL_AND,
                (ExprNode) visit(ctx.logicalAndExpression()),
                (ExprNode) visit(ctx.inclusiveOrExpression()));
    }

    @Override
    public ASTNode visitInclusiveOrExpression_unary(LMxParser.InclusiveOrExpression_unaryContext ctx) {
        return visit(ctx.exclusiveOrExpression());
    }

    @Override
    public ASTNode visitInclusiveOrExpression_binary(LMxParser.InclusiveOrExpression_binaryContext ctx) {
        return new BinaryExprNode(BinaryExprNode.BinaryOP.BIR_OR,
                (ExprNode) visit(ctx.inclusiveOrExpression()),
                (ExprNode) visit(ctx.exclusiveOrExpression()));
    }

    @Override
    public ASTNode visitExclusiveOrExpression_unary(LMxParser.ExclusiveOrExpression_unaryContext ctx) {
        return visit(ctx.andExpression());
    }

    @Override
    public ASTNode visitExclusiveOrExpression_binary(LMxParser.ExclusiveOrExpression_binaryContext ctx) {
        return new BinaryExprNode(BinaryExprNode.BinaryOP.BIT_XOR,
                (ExprNode) visit(ctx.exclusiveOrExpression()),
                (ExprNode) visit(ctx.andExpression()));
    }

    @Override
    public ASTNode visitAndExpression_unary(LMxParser.AndExpression_unaryContext ctx) {
        return visit(ctx.equalityExpression());
    }

    @Override
    public ASTNode visitAndExpression_binary(LMxParser.AndExpression_binaryContext ctx) {
        return new BinaryExprNode(BinaryExprNode.BinaryOP.BIT_AND,
                (ExprNode) visit(ctx.andExpression()),
                (ExprNode) visit(ctx.equalityExpression()));
    }

    @Override
    public ASTNode visitEqualityExpression_unary(LMxParser.EqualityExpression_unaryContext ctx) {
        return visit(ctx.relationalExpression());
    }

    @Override
    public ASTNode visitEqualityExpression_equal(LMxParser.EqualityExpression_equalContext ctx) {
        return new BinaryExprNode(BinaryExprNode.BinaryOP.EQUAL,
                (ExprNode) visit(ctx.equalityExpression()),
                (ExprNode) visit(ctx.relationalExpression()));
    }

    @Override
    public ASTNode visitEqualityExpression_inequal(LMxParser.EqualityExpression_inequalContext ctx) {
        return new BinaryExprNode(BinaryExprNode.BinaryOP.INEQUAL,
                (ExprNode) visit(ctx.equalityExpression()),
                (ExprNode) visit(ctx.relationalExpression()));
    }

    @Override
    public ASTNode visitRelationalExpression_ge(LMxParser.RelationalExpression_geContext ctx) {
        return new BinaryExprNode(BinaryExprNode.BinaryOP.GREATER,
                (ExprNode) visit(ctx.relationalExpression()),
                (ExprNode) visit(ctx.shiftExpression()));
    }

    @Override
    public ASTNode visitRelationalExpression_unary(LMxParser.RelationalExpression_unaryContext ctx) {
        return visit(ctx.shiftExpression());
    }

    @Override
    public ASTNode visitRelationalExpression_geq(LMxParser.RelationalExpression_geqContext ctx) {
        return new BinaryExprNode(BinaryExprNode.BinaryOP.GREATER_EQUAL,
                (ExprNode) visit(ctx.relationalExpression()),
                (ExprNode) visit(ctx.shiftExpression()));
    }

    @Override
    public ASTNode visitRelationalExpression_le(LMxParser.RelationalExpression_leContext ctx) {
        return new BinaryExprNode(BinaryExprNode.BinaryOP.LESS,
                (ExprNode) visit(ctx.relationalExpression()),
                (ExprNode) visit(ctx.shiftExpression()));
    }

    @Override
    public ASTNode visitRelationalExpression_leq(LMxParser.RelationalExpression_leqContext ctx) {
        return new BinaryExprNode(BinaryExprNode.BinaryOP.LESS_EQUAL,
                (ExprNode) visit(ctx.relationalExpression()),
                (ExprNode) visit(ctx.shiftExpression()));
    }

    @Override
    public ASTNode visitShiftExpression_shr(LMxParser.ShiftExpression_shrContext ctx) {
        return new BinaryExprNode(BinaryExprNode.BinaryOP.SHR,
                (ExprNode) visit(ctx.shiftExpression()),
                (ExprNode) visit(ctx.additiveExpression()));
    }

    @Override
    public ASTNode visitShiftExpression_unary(LMxParser.ShiftExpression_unaryContext ctx) {
        return visit(ctx.additiveExpression());
    }

    @Override
    public ASTNode visitShiftExpression_shl(LMxParser.ShiftExpression_shlContext ctx) {
        return new BinaryExprNode(BinaryExprNode.BinaryOP.SHL,
                (ExprNode) visit(ctx.shiftExpression()),
                (ExprNode) visit(ctx.additiveExpression()));
    }

    @Override
    public ASTNode visitAdditiveExpression_sub(LMxParser.AdditiveExpression_subContext ctx) {
        return new BinaryExprNode(BinaryExprNode.BinaryOP.SUB,
                (ExprNode) visit(ctx.additiveExpression()),
                (ExprNode) visit(ctx.multiplicativeExpression()));
    }

    @Override
    public ASTNode visitAdditiveExpression_add(LMxParser.AdditiveExpression_addContext ctx) {
        return new BinaryExprNode(BinaryExprNode.BinaryOP.ADD,
                (ExprNode) visit(ctx.additiveExpression()),
                (ExprNode) visit(ctx.multiplicativeExpression()));
    }

    @Override
    public ASTNode visitAdditiveExpression_unary(LMxParser.AdditiveExpression_unaryContext ctx) {
        return visit(ctx.multiplicativeExpression());
    }

    @Override
    public ASTNode visitMultiplicativeExpression_unary(LMxParser.MultiplicativeExpression_unaryContext ctx) {
        return visit(ctx.castExpression());
    }

    @Override
    public ASTNode visitMultiplicativeExpression_mod(LMxParser.MultiplicativeExpression_modContext ctx) {
        return new BinaryExprNode(BinaryExprNode.BinaryOP.MOD,
                (ExprNode) visit(ctx.multiplicativeExpression()),
                (ExprNode) visit(ctx.castExpression()));
    }

    @Override
    public ASTNode visitMultiplicativeExpression_div(LMxParser.MultiplicativeExpression_divContext ctx) {
        return new BinaryExprNode(BinaryExprNode.BinaryOP.DIV,
                (ExprNode) visit(ctx.multiplicativeExpression()),
                (ExprNode) visit(ctx.castExpression()));
    }

    @Override
    public ASTNode visitMultiplicativeExpression_mul(LMxParser.MultiplicativeExpression_mulContext ctx) {
        return new BinaryExprNode(BinaryExprNode.BinaryOP.MUL,
                (ExprNode) visit(ctx.multiplicativeExpression()),
                (ExprNode) visit(ctx.castExpression()));
    }


    @Override
    public ASTNode visitCastExpression(LMxParser.CastExpressionContext ctx) {
        if (ctx.unaryExpression() != null) return visit(ctx.unaryExpression());
        return new IntExprNode(Integer.parseInt(ctx.DigitSequence().getText()));
    }

    @Override
    public ASTNode visitUnaryExpression_prefix_inc(LMxParser.UnaryExpression_prefix_incContext ctx) {
        return new UnaryExprNode(UnaryExprNode.UnaryOP.SELF_INC, (ExprNode) visit(ctx.unaryExpression()));
    }

    @Override
    public ASTNode visitUnaryExpression_prefix_dec(LMxParser.UnaryExpression_prefix_decContext ctx) {
        return new UnaryExprNode(UnaryExprNode.UnaryOP.SELF_DEC, (ExprNode) visit(ctx.unaryExpression()));
    }

    @Override
    public ASTNode visitUnaryExpression_prefix(LMxParser.UnaryExpression_prefixContext ctx) {
        String unaryoperator = ctx.unaryOperator().getText();
        if (unaryoperator == "+"){
            return new UnaryExprNode(UnaryExprNode.UnaryOP.POSI, (ExprNode) visit(ctx.castExpression()));
        }
        else if (unaryoperator == "-"){
            return new UnaryExprNode(UnaryExprNode.UnaryOP.NEGE, (ExprNode) visit(ctx.castExpression()));
        }
        else if (unaryoperator == "~"){
            return new UnaryExprNode((UnaryExprNode.UnaryOP.BIT_NOT), (ExprNode) visit(ctx.castExpression()));
        }
        else return new UnaryExprNode(UnaryExprNode.UnaryOP.LOGIC_NOT, (ExprNode) visit(ctx.castExpression()));
    }


    @Override
    public ASTNode visitPrimaryExpression(LMxParser.PrimaryExpressionContext ctx) {
        String gettext = ctx.getText();
        if (ctx.Identifier() != null) return new IDExprNode(gettext);
        else if (ctx.Constant() != null) return new IntExprNode(Integer.parseInt(gettext));
        else if (ctx.StringLiteral() != null) return new StringExprNode(gettext);
        else if (ctx.expression() != null) return visit(ctx.expression());
        else {
            switch (gettext){
                case "true": return new BoolExprNode(true);
                case "false" : return new BoolExprNode(false);
                case "null" : return new NullExprNode();
                case "this" : return new ClassThisExprNode();
                default : return null;
            }
        }
    }

    @Override
    public ASTNode visitPostfixExpression_inc(LMxParser.PostfixExpression_incContext ctx) {
        return new SuffixExprNode(SuffixExprNode.SuffixOP.SELF_INC, (ExprNode) visit(ctx.postfixExpression()));
    }

    @Override
    public ASTNode visitPostfixExpression_dec(LMxParser.PostfixExpression_decContext ctx) {
        return new SuffixExprNode(SuffixExprNode.SuffixOP.SELF_DEC, (ExprNode) visit(ctx.postfixExpression()));
    }

    @Override
    public ASTNode visitPostfixExpression_array(LMxParser.PostfixExpression_arrayContext ctx) {
        return new ArrayIndexExprNode((ExprNode) visit(ctx.postfixExpression()), (ExprNode) visit(ctx.expression()));
    }

    @Override
    public ASTNode visitPostfixExpression_func(LMxParser.PostfixExpression_funcContext ctx) {
        if (ctx.argumentExpressionList() == null){
            return new FuncCallExprNode((ExprNode) visit(ctx.postfixExpression()));
        }
        else {
            FuncCallExprNode funccallexprnode = (FuncCallExprNode) visit(ctx.argumentExpressionList());
            funccallexprnode.setFunction((ExprNode) visit(ctx.postfixExpression()));
            return funccallexprnode;
        }
    }

    @Override
    public ASTNode visitArgumentExpressionList_single(LMxParser.ArgumentExpressionList_singleContext ctx) {
        FuncCallExprNode funccallexprnode = new FuncCallExprNode();
        funccallexprnode.parameters.add((ExprNode) visit(ctx.expression()));
        return funccallexprnode;
    }

    @Override
    public ASTNode visitArgumentExpressionList_multi(LMxParser.ArgumentExpressionList_multiContext ctx) {
        FuncCallExprNode funccallexprnode = (FuncCallExprNode) visit(ctx.argumentExpressionList());
        funccallexprnode.parameters.add((ExprNode) visit(ctx.expression()));
        return funccallexprnode;
    }

    @Override
    public ASTNode visitPostfixExpression_class(LMxParser.PostfixExpression_classContext ctx) {
        return new ClassMethodExprNode((ExprNode) visit(ctx.postfixExpression()), ctx.Identifier().getText());
    }

    @Override
    public ASTNode visitPostfixExpression_primary(LMxParser.PostfixExpression_primaryContext ctx) {
        return visit(ctx.primaryExpression());
    }

    @Override
    public ASTNode visitUnaryExpression_postfix(LMxParser.UnaryExpression_postfixContext ctx) {
        return visit(ctx.postfixExpression());
    }


}