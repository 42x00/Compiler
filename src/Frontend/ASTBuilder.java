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

public class ASTBuilder extends LMxBaseVisitor<ASTNode> {

    @Override
    public ASTNode visitProgram(LMxParser.ProgramContext ctx) {
        ProgNode progNode = new ProgNode();
        for (ParserRuleContext programDeclaration : ctx.programDeclaration()) {
            ASTNode declaration = visit(programDeclaration);
            if (declaration instanceof VarDeclListNode){
                for (VarDeclNode vardeclnode : ((VarDeclListNode) declaration).getVardeclnodeList()){
                    progNode.addDecl((DeclNode) vardeclnode);
                }
            }
            else progNode.addDecl((DeclNode) declaration);
        }
        progNode.setCtx(ctx);
        return progNode;
    }

    @Override
    public ASTNode visitProgramDeclaration(LMxParser.ProgramDeclarationContext ctx) {
        if (ctx.functionDefinition() != null) return visit(ctx.functionDefinition());
        else if (ctx.classDefinition() != null) return visit(ctx.classDefinition());
        else return visit(ctx.declaration());
    }

    @Override
    public ASTNode visitFunctionDefinition(LMxParser.FunctionDefinitionContext ctx) {
        TypeNode returntype = null;
        if (ctx.declarationSpecifier() != null) returntype =(TypeNode) visit(ctx.declarationSpecifier());
        FuncDeclNode funcdeclnode =(FuncDeclNode) visit(ctx.directDeclarator());
        CompStmtNode compoundstatement = (CompStmtNode) visit(ctx.compoundStatement());
        funcdeclnode.setFunctionReturnType(returntype);
        funcdeclnode.setFunctionStatements(compoundstatement);
        funcdeclnode.setCtx(ctx);
        return funcdeclnode;
    }

    @Override
    public ASTNode visitDeclarationSpecifier_type(LMxParser.DeclarationSpecifier_typeContext ctx) {
        return visit(ctx.typeSpecifier());
    }

    @Override
    public ASTNode visitTypeSpecifier(LMxParser.TypeSpecifierContext ctx) {
        if (ctx.typedefName() == null) {
            switch (ctx.getText()){
                case("void"): return new TypeNode(Type.Types.VOID, ctx);
                case("int"): return  new TypeNode(Type.Types.INT, ctx);
                case("string"): return new TypeNode(Type.Types.STRING, ctx);
                case("bool"): return new TypeNode(Type.Types.BOOL, ctx);
                default: return null;
            }
        }
        else {
            return new ClassTypeNode(ctx.typedefName().Identifier().getText(), ctx);
        }
    }

    @Override
    public ASTNode visitDeclarationSpecifier_array(LMxParser.DeclarationSpecifier_arrayContext ctx) {
        TypeNode basetype =(TypeNode) visit(ctx.declarationSpecifier());
        ArrayTypeNode arrayTypeNode = new ArrayTypeNode(basetype);
        arrayTypeNode.setCtx(ctx);
        return arrayTypeNode;
    }

    @Override
    public ASTNode visitDirectDeclarator_Identifier(LMxParser.DirectDeclarator_IdentifierContext ctx) {
        FuncDeclNode funcDeclNode = new FuncDeclNode(ctx.Identifier().getText());
        funcDeclNode.setCtx(ctx);
        return funcDeclNode;
    }

    @Override
    public ASTNode visitDirectDeclarator_recycle(LMxParser.DirectDeclarator_recycleContext ctx) {
        return visit(ctx.directDeclarator());
    }

    @Override
    public ASTNode visitDirectDeclarator_with_parameterList(LMxParser.DirectDeclarator_with_parameterListContext ctx) {
        FuncDeclNode funcdeclnode =(FuncDeclNode) visit(ctx.directDeclarator());
        if (ctx.parameterList() != null) funcdeclnode.setFunctionParameterList((VarDeclListNode) visit(ctx.parameterList()));
        funcdeclnode.setCtx(ctx);
        return funcdeclnode;
    }

    @Override
    public ASTNode visitParameterList_multi(LMxParser.ParameterList_multiContext ctx) {
        VarDeclListNode vardecllistnode = (VarDeclListNode) visit(ctx.parameterList());
        vardecllistnode.addDecl((VarDeclNode) visit(ctx.parameterDeclaration()));
        return vardecllistnode;
    }

    @Override
    public ASTNode visitParameterList_single(LMxParser.ParameterList_singleContext ctx) {
        VarDeclNode varDeclNode = (VarDeclNode) visit(ctx.parameterDeclaration());
        VarDeclListNode _VarDeclListNode = new VarDeclListNode(varDeclNode);
        _VarDeclListNode.setCtx(ctx);
        return _VarDeclListNode;
    }

    @Override
    public ASTNode visitParameterDeclaration(LMxParser.ParameterDeclarationContext ctx) {
        TypeNode vartype = (TypeNode) visit(ctx.declarationSpecifier());
        FuncDeclNode funcdeclnode_name = (FuncDeclNode) visit(ctx.directDeclarator());
        VarDeclNode varDeclNode = new VarDeclNode(vartype,funcdeclnode_name.getFunctionName());
        varDeclNode.setCtx(ctx);
        return varDeclNode;
    }

    @Override
    public ASTNode visitCompoundStatement(LMxParser.CompoundStatementContext ctx) {
        CompStmtNode compStmtNode = new CompStmtNode();
        for (ParserRuleContext blockitem : ctx.blockItem()){
            ASTNode visitblockitem = visit(blockitem);
            if (visitblockitem instanceof VarDeclListNode){
                for (VarDeclNode vardeclnode : ((VarDeclListNode) visitblockitem).getVardeclnodeList()){
                    compStmtNode.addStmt((StmtNode) new VarDeclStmtNode(vardeclnode));
                }
            }
            else if (visitblockitem instanceof VarDeclNode){
                compStmtNode.addStmt((StmtNode) new VarDeclStmtNode((VarDeclNode) visitblockitem));
            }
            else if (visitblockitem instanceof ExprNode){
                compStmtNode.addStmt((StmtNode) new ExprStmtNode((ExprNode) visitblockitem));
            }
            else{
                compStmtNode.addStmt((StmtNode) visit(blockitem));
            }
        }
        compStmtNode.setCtx(ctx);
        return compStmtNode;
    }

    @Override
    public ASTNode visitBlockItem(LMxParser.BlockItemContext ctx) {
        if (ctx.statement() != null) return visit(ctx.statement());
        else return visit(ctx.declaration());
    }

    @Override
    public ASTNode visitDeclaration_none(LMxParser.Declaration_noneContext ctx) {
        VarDeclNode varDeclNode = new VarDeclNode((TypeNode) visit(ctx.declarationSpecifier()));
        varDeclNode.setCtx(ctx);
        return varDeclNode;
    }

    @Override
    public ASTNode visitDeclaration_init(LMxParser.Declaration_initContext ctx) {
        TypeNode vartype = (TypeNode) visit(ctx.declarationSpecifier());
        VarDeclListNode vardecllistnode = (VarDeclListNode) visit(ctx.initDeclaratorList());
        for (VarDeclNode vardeclnode : vardecllistnode.getVardeclnodeList()){
            vardeclnode.setVartype(vartype);
        }
        return vardecllistnode;
    }

    @Override
    public ASTNode visitInitDeclaratorList_multi(LMxParser.InitDeclaratorList_multiContext ctx) {
        VarDeclListNode vardecllistnode = (VarDeclListNode) visit(ctx.initDeclaratorList());
        vardecllistnode.getVardeclnodeList().add((VarDeclNode) visit(ctx.initDeclarator()));
        return vardecllistnode;
    }

    @Override
    public ASTNode visitInitDeclaratorList_single(LMxParser.InitDeclaratorList_singleContext ctx) {
        VarDeclListNode vardecllistnode = new VarDeclListNode();
        vardecllistnode.getVardeclnodeList().add((VarDeclNode) visit(ctx.initDeclarator()));
        return vardecllistnode;
    }

    @Override
    public ASTNode visitInitDeclarator_none(LMxParser.InitDeclarator_noneContext ctx) {
        FuncDeclNode funcdeclnode_name = (FuncDeclNode) visit(ctx.directDeclarator());
        VarDeclNode varDeclNode = new VarDeclNode(funcdeclnode_name.getFunctionName());
        varDeclNode.setCtx(ctx);
        return varDeclNode;
    }

    @Override
    public ASTNode visitInitDeclarator_init(LMxParser.InitDeclarator_initContext ctx) {
        FuncDeclNode funcdeclnode_name = (FuncDeclNode) visit(ctx.directDeclarator());
        VarDeclNode varDeclNode = new VarDeclNode(funcdeclnode_name.getFunctionName(), (ExprNode) visit(ctx.expression()));
        varDeclNode.setCtx(ctx);
        return varDeclNode;
    }

    @Override
    public ASTNode visitStatement(LMxParser.StatementContext ctx) {
        if (ctx.compoundStatement() != null) return visit(ctx.compoundStatement());
        else if (ctx.expressionStatement() != null) return visit(ctx.expressionStatement());
        else if (ctx.selectionStatement() != null) return visit(ctx.selectionStatement());
        else if (ctx.iterationStatement() != null) return visit(ctx.iterationStatement());
        else return visit(ctx.jumpStatement());
    }

    @Override
    public ASTNode visitExpressionStatement(LMxParser.ExpressionStatementContext ctx) {
        ExprStmtNode exprStmtNode = new ExprStmtNode();
        if (ctx.expression() != null)
            exprStmtNode = new ExprStmtNode((ExprNode) visit(ctx.expression()));
        exprStmtNode.setCtx(ctx);
        return exprStmtNode;
    }

    @Override
    public ASTNode visitSelectionStatement(LMxParser.SelectionStatementContext ctx) {
        IfStmtNode ifstmtnode = new IfStmtNode((ExprNode) visit(ctx.expression()), (StmtNode) visit(ctx.statement(0)));
        if (ctx.statement(1) != null){
            ifstmtnode.setElsestmt((StmtNode) visit(ctx.statement(1)));
        }
        ifstmtnode.setCtx(ctx);
        return ifstmtnode;
    }

    @Override
    public ASTNode visitIterationStatement_while(LMxParser.IterationStatement_whileContext ctx) {
        WhileStmtNode whileStmtNode = new WhileStmtNode((ExprNode) visit(ctx.expression()), (StmtNode) visit(ctx.statement()));
        whileStmtNode.setCtx(ctx);
        return whileStmtNode;
    }

    @Override
    public ASTNode visitIterationStatement_for(LMxParser.IterationStatement_forContext ctx) {
        ForStmtNode forstmtnode = (ForStmtNode) visit(ctx.forCondition());
        forstmtnode.setForstmt((StmtNode) visit(ctx.statement()));
        forstmtnode.setCtx(ctx);
        return forstmtnode;
    }

    @Override
    public ASTNode visitForCondition_none(LMxParser.ForCondition_noneContext ctx) {
        ExprNode forexprinit = null, forexprend = null, forexprupdate = null;
        if (ctx.expression() != null) forexprinit = (ExprNode) visit(ctx.expression());
        if (ctx.forExprEnd() != null) forexprend = (ExprNode) visit(ctx.forExprEnd());
        if (ctx.forExprUpdate() != null) forexprupdate = (ExprNode) visit(ctx.forExprUpdate());
        ForStmtNode _ForStmtNode = new ForStmtNode(forexprinit,forexprend,forexprupdate);
        _ForStmtNode.setCtx(ctx);
        return _ForStmtNode;
    }

    @Override
    public ASTNode visitForCondition_init(LMxParser.ForCondition_initContext ctx) {
        ExprNode forexprend = null, forexprupdate = null;
        if (ctx.forExprEnd() != null) forexprend = (ExprNode) visit(ctx.forExprEnd());
        if (ctx.forExprUpdate() != null) forexprupdate = (ExprNode) visit(ctx.forExprUpdate());
        ForStmtNode forstmtnode = new ForStmtNode(forexprend,forexprupdate);
        ASTNode forinit = visit(ctx.forDeclaration());
        if (forinit instanceof VarDeclNode){
            forstmtnode.addInitDecl((VarDeclNode) forinit);
        }
        else forstmtnode.setForinit(((VarDeclListNode) forinit).getVardeclnodeList());
        forstmtnode.setCtx(ctx);
        return forstmtnode;
    }

    @Override
    public ASTNode visitForExprEnd(LMxParser.ForExprEndContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public ASTNode visitForExprUpdate(LMxParser.ForExprUpdateContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public ASTNode visitForDeclaration_init(LMxParser.ForDeclaration_initContext ctx) {
        TypeNode vartype = (TypeNode) visit(ctx.declarationSpecifier());
        VarDeclListNode vardecllistnode = (VarDeclListNode) visit(ctx.initDeclaratorList());
        for (VarDeclNode vardeclnode : vardecllistnode.getVardeclnodeList()){
            vardeclnode.setVartype(vartype);
        }
        return vardecllistnode;
    }

    @Override
    public ASTNode visitForDeclaration_none(LMxParser.ForDeclaration_noneContext ctx) {
        VarDeclNode _VarDeclNode = new VarDeclNode((TypeNode) visit(ctx.declarationSpecifier()));
        _VarDeclNode.setCtx(ctx);
        return _VarDeclNode;
    }

    @Override
    public ASTNode visitJumpStatement_continue(LMxParser.JumpStatement_continueContext ctx) {
        ContinueStmtNode _ContinueStmtNode = new ContinueStmtNode();
        _ContinueStmtNode.setCtx(ctx);
        return _ContinueStmtNode;
    }

    @Override
    public ASTNode visitJumpStatement_break(LMxParser.JumpStatement_breakContext ctx) {
        BreakStmtNode _BreakStmtNode = new BreakStmtNode();
        _BreakStmtNode.setCtx(ctx);
        return _BreakStmtNode;
    }

    @Override
    public ASTNode visitJumpStatement_return(LMxParser.JumpStatement_returnContext ctx) {
        ReturnStmtNode returnStmtNode = new ReturnStmtNode();
        if (ctx.expression() != null) returnStmtNode = new ReturnStmtNode((ExprNode) visit(ctx.expression()));
        returnStmtNode.setCtx(ctx);
        return returnStmtNode;
    }

    @Override
    public ASTNode visitClassDeclaration_none(LMxParser.ClassDeclaration_noneContext ctx) {
        ClassDeclNode _ClassDeclNode = new ClassDeclNode(ctx.Identifier().getText());
        _ClassDeclNode.setCtx(ctx);
        return _ClassDeclNode;
    }

    @Override
    public ASTNode visitClassDeclaration_decl(LMxParser.ClassDeclaration_declContext ctx) {
        ClassDeclNode classDeclNode = new ClassDeclNode(ctx.Identifier().getText());
        for (ParserRuleContext classdeclaration : ctx.classDeclaration()){
            ASTNode visitclassdeclaration = visit(classdeclaration);
            if (visitclassdeclaration instanceof VarDeclListNode){
                for (VarDeclNode vardeclnode : ((VarDeclListNode) visitclassdeclaration).getVardeclnodeList()){
                    classDeclNode.addDecl((DeclNode) vardeclnode);
                }
            }
            else classDeclNode.addDecl((DeclNode) visitclassdeclaration);
        }
        classDeclNode.setCtx(ctx);
        return classDeclNode;
    }

    @Override
    public ASTNode visitExpression(LMxParser.ExpressionContext ctx) {
        if (ctx.newDeclarator() != null) return visit(ctx.newDeclarator());
        else if (ctx.DigitSequence() != null) {
            IntExprNode _IntExprNode = new IntExprNode(Integer.parseInt(ctx.DigitSequence().getText()));
            _IntExprNode.setCtx(ctx);
            return _IntExprNode;
        }
        else if (ctx.logicalOrExpression() != null) return visit(ctx.logicalOrExpression());
        else {
            BinaryExprNode binaryExprNode = new BinaryExprNode(BinaryExprNode.BinaryOP.ASSIGN,
                    (ExprNode) visit(ctx.unaryExpression()),
                    (ExprNode) visit(ctx.expression()));
            binaryExprNode.setCtx(ctx);
            return binaryExprNode;
        }
    }

    @Override
    public ASTNode visitNewDeclarator_error(LMxParser.NewDeclarator_errorContext ctx) {
        throw new Error("Cross Array Define Error!");
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
        NewExprNode _NewExprNode = new NewExprNode(basetype);
        _NewExprNode.setCtx(ctx);
        return _NewExprNode;
    }

    @Override
    public ASTNode visitNewDeclarator_nonarray(LMxParser.NewDeclarator_nonarrayContext ctx) {
        TypeNode typeNode =(TypeNode) visit(ctx.typeSpecifier());
        if (ctx.LeftParen() != null && !(typeNode instanceof ClassTypeNode))
            throw new Error("NewExpr () with non Class!");
        NewExprNode _NewExprNode = new NewExprNode(typeNode);
        _NewExprNode.setCtx(ctx);
        return _NewExprNode;
    }

    @Override
    public ASTNode visitLogicalOrExpression_unary(LMxParser.LogicalOrExpression_unaryContext ctx) {
        return visit(ctx.logicalAndExpression());

    }

    @Override
    public ASTNode visitLogicalOrExpression_binary(LMxParser.LogicalOrExpression_binaryContext ctx) {
        BinaryExprNode binaryExprNode = new BinaryExprNode(BinaryExprNode.BinaryOP.LOGICAL_OR,
                (ExprNode) visit(ctx.logicalOrExpression()),
                (ExprNode) visit(ctx.logicalAndExpression()));
        binaryExprNode.setCtx(ctx);
        return binaryExprNode;
    }

    @Override
    public ASTNode visitLogicalAndExpression_unary(LMxParser.LogicalAndExpression_unaryContext ctx) {
        return visit(ctx.inclusiveOrExpression());
    }

    @Override
    public ASTNode visitLogicalAndExpression_binary(LMxParser.LogicalAndExpression_binaryContext ctx) {
        BinaryExprNode binaryExprNode = new BinaryExprNode(BinaryExprNode.BinaryOP.LOGICAL_AND,
                (ExprNode) visit(ctx.logicalAndExpression()),
                (ExprNode) visit(ctx.inclusiveOrExpression()));
        binaryExprNode.setCtx(ctx);
        return binaryExprNode;
    }

    @Override
    public ASTNode visitInclusiveOrExpression_unary(LMxParser.InclusiveOrExpression_unaryContext ctx) {
        return visit(ctx.exclusiveOrExpression());
    }

    @Override
    public ASTNode visitInclusiveOrExpression_binary(LMxParser.InclusiveOrExpression_binaryContext ctx) {
        BinaryExprNode binaryExprNode = new BinaryExprNode(BinaryExprNode.BinaryOP.BIR_OR,
                (ExprNode) visit(ctx.inclusiveOrExpression()),
                (ExprNode) visit(ctx.exclusiveOrExpression()));
        binaryExprNode.setCtx(ctx);
        return binaryExprNode;
    }

    @Override
    public ASTNode visitExclusiveOrExpression_unary(LMxParser.ExclusiveOrExpression_unaryContext ctx) {
        return visit(ctx.andExpression());
    }

    @Override
    public ASTNode visitExclusiveOrExpression_binary(LMxParser.ExclusiveOrExpression_binaryContext ctx) {
        BinaryExprNode binaryExprNode = new BinaryExprNode(BinaryExprNode.BinaryOP.BIT_XOR,
                (ExprNode) visit(ctx.exclusiveOrExpression()),
                (ExprNode) visit(ctx.andExpression()));
        binaryExprNode.setCtx(ctx);
        return binaryExprNode;
    }

    @Override
    public ASTNode visitAndExpression_unary(LMxParser.AndExpression_unaryContext ctx) {
        return visit(ctx.equalityExpression());
    }

    @Override
    public ASTNode visitAndExpression_binary(LMxParser.AndExpression_binaryContext ctx) {
        BinaryExprNode binaryExprNode = new BinaryExprNode(BinaryExprNode.BinaryOP.BIT_AND,
                (ExprNode) visit(ctx.andExpression()),
                (ExprNode) visit(ctx.equalityExpression()));
        binaryExprNode.setCtx(ctx);
        return binaryExprNode;
    }

    @Override
    public ASTNode visitEqualityExpression_unary(LMxParser.EqualityExpression_unaryContext ctx) {
        return visit(ctx.relationalExpression());
    }

    @Override
    public ASTNode visitEqualityExpression_equal(LMxParser.EqualityExpression_equalContext ctx) {
        BinaryExprNode binaryExprNode = new BinaryExprNode(BinaryExprNode.BinaryOP.EQUAL,
                (ExprNode) visit(ctx.equalityExpression()),
                (ExprNode) visit(ctx.relationalExpression()));
        binaryExprNode.setCtx(ctx);
        return binaryExprNode;
    }

    @Override
    public ASTNode visitEqualityExpression_inequal(LMxParser.EqualityExpression_inequalContext ctx) {
        BinaryExprNode binaryExprNode = new BinaryExprNode(BinaryExprNode.BinaryOP.INEQUAL,
                (ExprNode) visit(ctx.equalityExpression()),
                (ExprNode) visit(ctx.relationalExpression()));
        binaryExprNode.setCtx(ctx);
        return binaryExprNode;
    }

    @Override
    public ASTNode visitRelationalExpression_ge(LMxParser.RelationalExpression_geContext ctx) {
        BinaryExprNode binaryExprNode = new BinaryExprNode(BinaryExprNode.BinaryOP.GREATER,
                (ExprNode) visit(ctx.relationalExpression()),
                (ExprNode) visit(ctx.shiftExpression()));
        binaryExprNode.setCtx(ctx);
        return binaryExprNode;
    }

    @Override
    public ASTNode visitRelationalExpression_unary(LMxParser.RelationalExpression_unaryContext ctx) {
        return visit(ctx.shiftExpression());
    }

    @Override
    public ASTNode visitRelationalExpression_geq(LMxParser.RelationalExpression_geqContext ctx) {
        BinaryExprNode binaryExprNode = new BinaryExprNode(BinaryExprNode.BinaryOP.GREATER_EQUAL,
                (ExprNode) visit(ctx.relationalExpression()),
                (ExprNode) visit(ctx.shiftExpression()));
        binaryExprNode.setCtx(ctx);
        return binaryExprNode;
    }

    @Override
    public ASTNode visitRelationalExpression_le(LMxParser.RelationalExpression_leContext ctx) {
        BinaryExprNode binaryExprNode = new BinaryExprNode(BinaryExprNode.BinaryOP.LESS,
                (ExprNode) visit(ctx.relationalExpression()),
                (ExprNode) visit(ctx.shiftExpression()));
        binaryExprNode.setCtx(ctx);
        return binaryExprNode;
    }

    @Override
    public ASTNode visitRelationalExpression_leq(LMxParser.RelationalExpression_leqContext ctx) {
        BinaryExprNode binaryExprNode = new BinaryExprNode(BinaryExprNode.BinaryOP.LESS_EQUAL,
                (ExprNode) visit(ctx.relationalExpression()),
                (ExprNode) visit(ctx.shiftExpression()));
        binaryExprNode.setCtx(ctx);
        return binaryExprNode;
    }

    @Override
    public ASTNode visitShiftExpression_shr(LMxParser.ShiftExpression_shrContext ctx) {
        BinaryExprNode binaryExprNode = new BinaryExprNode(BinaryExprNode.BinaryOP.SHR,
                (ExprNode) visit(ctx.shiftExpression()),
                (ExprNode) visit(ctx.additiveExpression()));
        binaryExprNode.setCtx(ctx);
        return binaryExprNode;
    }

    @Override
    public ASTNode visitShiftExpression_unary(LMxParser.ShiftExpression_unaryContext ctx) {
        return visit(ctx.additiveExpression());
    }

    @Override
    public ASTNode visitShiftExpression_shl(LMxParser.ShiftExpression_shlContext ctx) {
        BinaryExprNode binaryExprNode = new BinaryExprNode(BinaryExprNode.BinaryOP.SHL,
                (ExprNode) visit(ctx.shiftExpression()),
                (ExprNode) visit(ctx.additiveExpression()));
        binaryExprNode.setCtx(ctx);
        return binaryExprNode;
    }

    @Override
    public ASTNode visitAdditiveExpression_sub(LMxParser.AdditiveExpression_subContext ctx) {
        BinaryExprNode binaryExprNode = new BinaryExprNode(BinaryExprNode.BinaryOP.SUB,
                (ExprNode) visit(ctx.additiveExpression()),
                (ExprNode) visit(ctx.multiplicativeExpression()));
        binaryExprNode.setCtx(ctx);
        return binaryExprNode;
    }

    @Override
    public ASTNode visitAdditiveExpression_add(LMxParser.AdditiveExpression_addContext ctx) {
        BinaryExprNode binaryExprNode = new BinaryExprNode(BinaryExprNode.BinaryOP.ADD,
                (ExprNode) visit(ctx.additiveExpression()),
                (ExprNode) visit(ctx.multiplicativeExpression()));
        binaryExprNode.setCtx(ctx);
        return binaryExprNode;
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
        BinaryExprNode binaryExprNode = new BinaryExprNode(BinaryExprNode.BinaryOP.MOD,
                (ExprNode) visit(ctx.multiplicativeExpression()),
                (ExprNode) visit(ctx.castExpression()));
        binaryExprNode.setCtx(ctx);
        return binaryExprNode;
    }

    @Override
    public ASTNode visitMultiplicativeExpression_div(LMxParser.MultiplicativeExpression_divContext ctx) {
        BinaryExprNode binaryExprNode = new BinaryExprNode(BinaryExprNode.BinaryOP.DIV,
                (ExprNode) visit(ctx.multiplicativeExpression()),
                (ExprNode) visit(ctx.castExpression()));
        binaryExprNode.setCtx(ctx);
        return binaryExprNode;
    }

    @Override
    public ASTNode visitMultiplicativeExpression_mul(LMxParser.MultiplicativeExpression_mulContext ctx) {
        BinaryExprNode binaryExprNode = new BinaryExprNode(BinaryExprNode.BinaryOP.MUL,
                (ExprNode) visit(ctx.multiplicativeExpression()),
                (ExprNode) visit(ctx.castExpression()));
        binaryExprNode.setCtx(ctx);
        return binaryExprNode;
    }


    @Override
    public ASTNode visitCastExpression(LMxParser.CastExpressionContext ctx) {
        if (ctx.unaryExpression() != null) return visit(ctx.unaryExpression());
        IntExprNode _IntExprNode = new IntExprNode(Integer.parseInt(ctx.DigitSequence().getText()));
        _IntExprNode.setCtx(ctx);
        return _IntExprNode;
    }

    @Override
    public ASTNode visitUnaryExpression_prefix_inc(LMxParser.UnaryExpression_prefix_incContext ctx) {
        UnaryExprNode _UnaryExprNode = new UnaryExprNode(UnaryExprNode.UnaryOP.SELF_INC, (ExprNode) visit(ctx.unaryExpression()));
        _UnaryExprNode.setCtx(ctx);
        return _UnaryExprNode;
    }

    @Override
    public ASTNode visitUnaryExpression_prefix_dec(LMxParser.UnaryExpression_prefix_decContext ctx) {
        UnaryExprNode _UnaryExprNode = new UnaryExprNode(UnaryExprNode.UnaryOP.SELF_DEC, (ExprNode) visit(ctx.unaryExpression()));
        _UnaryExprNode.setCtx(ctx);
        return _UnaryExprNode;
    }

    @Override
    public ASTNode visitUnaryExpression_prefix(LMxParser.UnaryExpression_prefixContext ctx) {
        String unaryoperator = ctx.unaryOperator().getText();
        if (unaryoperator.equals("+")){
            UnaryExprNode _UnaryExprNode = new UnaryExprNode(UnaryExprNode.UnaryOP.POSI, (ExprNode) visit(ctx.castExpression()));
            _UnaryExprNode.setCtx(ctx);
            return _UnaryExprNode;
        }
        else if (unaryoperator.equals("-")){
            UnaryExprNode _UnaryExprNode = new UnaryExprNode(UnaryExprNode.UnaryOP.NEGE, (ExprNode) visit(ctx.castExpression()));
            _UnaryExprNode.setCtx(ctx);
            return _UnaryExprNode;
        }
        else if (unaryoperator.equals("~")){
            UnaryExprNode _UnaryExprNode = new UnaryExprNode(UnaryExprNode.UnaryOP.BIT_NOT, (ExprNode) visit(ctx.castExpression()));
            _UnaryExprNode.setCtx(ctx);
            return _UnaryExprNode;
        }
        else if (unaryoperator.equals("!")) {
            UnaryExprNode _UnaryExprNode = new UnaryExprNode(UnaryExprNode.UnaryOP.LOGIC_NOT, (ExprNode) visit(ctx.castExpression()));
            _UnaryExprNode.setCtx(ctx);
            return _UnaryExprNode;
        }
        else {
            UnaryExprNode _UnaryExprNode = new UnaryExprNode();
            _UnaryExprNode.setCtx(ctx);
            return _UnaryExprNode;
        }
    }


    @Override
    public ASTNode visitPrimaryExpression(LMxParser.PrimaryExpressionContext ctx) {
        String gettext = ctx.getText();
        if (ctx.Identifier() != null) {
            IDExprNode _IDExprNode = new IDExprNode(gettext);
            _IDExprNode.setCtx(ctx);
            return _IDExprNode;
        }
        else if (ctx.Constant() != null) {
            IntExprNode _IntExprNode = new IntExprNode(Integer.parseInt(gettext));
            _IntExprNode.setCtx(ctx);
            return _IntExprNode;
        }
        else if (ctx.StringLiteral() != null) {
            StringExprNode _StringExprNode = new StringExprNode(gettext);
            _StringExprNode.setCtx(ctx);
            return _StringExprNode;
        }
        else if (ctx.expression() != null) return visit(ctx.expression());
        else {
            switch (gettext){
                case "true": {
                    BoolExprNode _BoolExprNode = new BoolExprNode(true);
                    _BoolExprNode.setCtx(ctx);
                    return _BoolExprNode;
                }
                case "false" : {
                    BoolExprNode _BoolExprNode = new BoolExprNode(false);
                    _BoolExprNode.setCtx(ctx);
                    return _BoolExprNode;
                }
                case "null" : {
                    NullExprNode _NullExprNode = new NullExprNode();
                    _NullExprNode.setCtx(ctx);
                    return _NullExprNode;
                }
                case "this" : {
                    ClassThisExprNode _ClassThisExprNode = new ClassThisExprNode();
                    _ClassThisExprNode.setCtx(ctx);
                    return _ClassThisExprNode;
                }
                default : return null;
            }
        }
    }

    @Override
    public ASTNode visitPostfixExpression_inc(LMxParser.PostfixExpression_incContext ctx) {
        SuffixExprNode _SuffixExprNode = new SuffixExprNode(SuffixExprNode.SuffixOP.SELF_INC, (ExprNode) visit(ctx.postfixExpression()));
        _SuffixExprNode.setCtx(ctx);
        return _SuffixExprNode;
    }

    @Override
    public ASTNode visitPostfixExpression_dec(LMxParser.PostfixExpression_decContext ctx) {
        SuffixExprNode _SuffixExprNode = new SuffixExprNode(SuffixExprNode.SuffixOP.SELF_DEC, (ExprNode) visit(ctx.postfixExpression()));
        _SuffixExprNode.setCtx(ctx);
        return _SuffixExprNode;
    }

    @Override
    public ASTNode visitPostfixExpression_array(LMxParser.PostfixExpression_arrayContext ctx) {
        ArrayIndexExprNode _ArrayIndexExprNode = new ArrayIndexExprNode((ExprNode) visit(ctx.postfixExpression()), (ExprNode) visit(ctx.expression()));
        _ArrayIndexExprNode.setCtx(ctx);
        return _ArrayIndexExprNode;
    }

    @Override
    public ASTNode visitPostfixExpression_func(LMxParser.PostfixExpression_funcContext ctx) {
        FuncCallExprNode funcCallExprNode = null;
        if (ctx.argumentExpressionList() != null) {
            funcCallExprNode = (FuncCallExprNode) visit(ctx.argumentExpressionList());
            funcCallExprNode.setFunction((ExprNode) visit(ctx.postfixExpression()));
        }
        else funcCallExprNode = new FuncCallExprNode((ExprNode) visit(ctx.postfixExpression()));
        funcCallExprNode.setCtx(ctx);
        return funcCallExprNode;
    }

    @Override
    public ASTNode visitArgumentExpressionList_single(LMxParser.ArgumentExpressionList_singleContext ctx) {
        FuncCallExprNode funccallexprnode = new FuncCallExprNode();
        funccallexprnode.addExpr((ExprNode) visit(ctx.expression()));
        funccallexprnode.setCtx(ctx);
        return funccallexprnode;
    }

    @Override
    public ASTNode visitArgumentExpressionList_multi(LMxParser.ArgumentExpressionList_multiContext ctx) {
        FuncCallExprNode funccallexprnode = (FuncCallExprNode) visit(ctx.argumentExpressionList());
        funccallexprnode.addExpr((ExprNode) visit(ctx.expression()));
        funccallexprnode.setCtx(ctx);
        return funccallexprnode;
    }

    @Override
    public ASTNode visitPostfixExpression_class(LMxParser.PostfixExpression_classContext ctx) {
        ClassMethodExprNode _ClassMethodExprNode = new ClassMethodExprNode((ExprNode) visit(ctx.postfixExpression()), ctx.Identifier().getText());
        _ClassMethodExprNode.setCtx(ctx);
        return _ClassMethodExprNode;
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