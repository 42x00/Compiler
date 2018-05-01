package Parser;// Generated from LMx.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LMxParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LMxVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LMxParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(LMxParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarationSpecifier_array}
	 * labeled alternative in {@link LMxParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifier_array(LMxParser.DeclarationSpecifier_arrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarationSpecifier_type}
	 * labeled alternative in {@link LMxParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifier_type(LMxParser.DeclarationSpecifier_typeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfixExpression_inc}
	 * labeled alternative in {@link LMxParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression_inc(LMxParser.PostfixExpression_incContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfixExpression_func}
	 * labeled alternative in {@link LMxParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression_func(LMxParser.PostfixExpression_funcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfixExpression_class}
	 * labeled alternative in {@link LMxParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression_class(LMxParser.PostfixExpression_classContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfixExpression_primary}
	 * labeled alternative in {@link LMxParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression_primary(LMxParser.PostfixExpression_primaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfixExpression_dec}
	 * labeled alternative in {@link LMxParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression_dec(LMxParser.PostfixExpression_decContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfixExpression_array}
	 * labeled alternative in {@link LMxParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression_array(LMxParser.PostfixExpression_arrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argumentExpressionList_single}
	 * labeled alternative in {@link LMxParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentExpressionList_single(LMxParser.ArgumentExpressionList_singleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argumentExpressionList_multi}
	 * labeled alternative in {@link LMxParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentExpressionList_multi(LMxParser.ArgumentExpressionList_multiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpression_postfix}
	 * labeled alternative in {@link LMxParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression_postfix(LMxParser.UnaryExpression_postfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpression_prefix_inc}
	 * labeled alternative in {@link LMxParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression_prefix_inc(LMxParser.UnaryExpression_prefix_incContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpression_prefix_dec}
	 * labeled alternative in {@link LMxParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression_prefix_dec(LMxParser.UnaryExpression_prefix_decContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpression_prefix}
	 * labeled alternative in {@link LMxParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression_prefix(LMxParser.UnaryExpression_prefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(LMxParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(LMxParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicativeExpression_unary}
	 * labeled alternative in {@link LMxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression_unary(LMxParser.MultiplicativeExpression_unaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicativeExpression_mod}
	 * labeled alternative in {@link LMxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression_mod(LMxParser.MultiplicativeExpression_modContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicativeExpression_div}
	 * labeled alternative in {@link LMxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression_div(LMxParser.MultiplicativeExpression_divContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicativeExpression_mul}
	 * labeled alternative in {@link LMxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression_mul(LMxParser.MultiplicativeExpression_mulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpression_sub}
	 * labeled alternative in {@link LMxParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression_sub(LMxParser.AdditiveExpression_subContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpression_add}
	 * labeled alternative in {@link LMxParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression_add(LMxParser.AdditiveExpression_addContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpression_unary}
	 * labeled alternative in {@link LMxParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression_unary(LMxParser.AdditiveExpression_unaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shiftExpression_shr}
	 * labeled alternative in {@link LMxParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression_shr(LMxParser.ShiftExpression_shrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shiftExpression_unary}
	 * labeled alternative in {@link LMxParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression_unary(LMxParser.ShiftExpression_unaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shiftExpression_shl}
	 * labeled alternative in {@link LMxParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression_shl(LMxParser.ShiftExpression_shlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpression_ge}
	 * labeled alternative in {@link LMxParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression_ge(LMxParser.RelationalExpression_geContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpression_unary}
	 * labeled alternative in {@link LMxParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression_unary(LMxParser.RelationalExpression_unaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpression_geq}
	 * labeled alternative in {@link LMxParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression_geq(LMxParser.RelationalExpression_geqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpression_le}
	 * labeled alternative in {@link LMxParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression_le(LMxParser.RelationalExpression_leContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpression_leq}
	 * labeled alternative in {@link LMxParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression_leq(LMxParser.RelationalExpression_leqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpression_unary}
	 * labeled alternative in {@link LMxParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression_unary(LMxParser.EqualityExpression_unaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpression_equal}
	 * labeled alternative in {@link LMxParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression_equal(LMxParser.EqualityExpression_equalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpression_inequal}
	 * labeled alternative in {@link LMxParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression_inequal(LMxParser.EqualityExpression_inequalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpression_unary}
	 * labeled alternative in {@link LMxParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression_unary(LMxParser.AndExpression_unaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpression_binary}
	 * labeled alternative in {@link LMxParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression_binary(LMxParser.AndExpression_binaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exclusiveOrExpression_unary}
	 * labeled alternative in {@link LMxParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression_unary(LMxParser.ExclusiveOrExpression_unaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exclusiveOrExpression_binary}
	 * labeled alternative in {@link LMxParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression_binary(LMxParser.ExclusiveOrExpression_binaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inclusiveOrExpression_binary}
	 * labeled alternative in {@link LMxParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression_binary(LMxParser.InclusiveOrExpression_binaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inclusiveOrExpression_unary}
	 * labeled alternative in {@link LMxParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression_unary(LMxParser.InclusiveOrExpression_unaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalAndExpression_unary}
	 * labeled alternative in {@link LMxParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression_unary(LMxParser.LogicalAndExpression_unaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalAndExpression_binary}
	 * labeled alternative in {@link LMxParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression_binary(LMxParser.LogicalAndExpression_binaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalOrExpression_binary}
	 * labeled alternative in {@link LMxParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression_binary(LMxParser.LogicalOrExpression_binaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalOrExpression_unary}
	 * labeled alternative in {@link LMxParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression_unary(LMxParser.LogicalOrExpression_unaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(LMxParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaration_init}
	 * labeled alternative in {@link LMxParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_init(LMxParser.Declaration_initContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaration_none}
	 * labeled alternative in {@link LMxParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_none(LMxParser.Declaration_noneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code initDeclaratorList_single}
	 * labeled alternative in {@link LMxParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclaratorList_single(LMxParser.InitDeclaratorList_singleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code initDeclaratorList_multi}
	 * labeled alternative in {@link LMxParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclaratorList_multi(LMxParser.InitDeclaratorList_multiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code initDeclarator_none}
	 * labeled alternative in {@link LMxParser#initDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclarator_none(LMxParser.InitDeclarator_noneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code initDeclarator_init}
	 * labeled alternative in {@link LMxParser#initDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclarator_init(LMxParser.InitDeclarator_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(LMxParser.TypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newDeclarator_error}
	 * labeled alternative in {@link LMxParser#newDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewDeclarator_error(LMxParser.NewDeclarator_errorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newDeclarator_array}
	 * labeled alternative in {@link LMxParser#newDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewDeclarator_array(LMxParser.NewDeclarator_arrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newDeclarator_nonarray}
	 * labeled alternative in {@link LMxParser#newDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewDeclarator_nonarray(LMxParser.NewDeclarator_nonarrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code directDeclarator_Identifier}
	 * labeled alternative in {@link LMxParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectDeclarator_Identifier(LMxParser.DirectDeclarator_IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code directDeclarator_with_parameterList}
	 * labeled alternative in {@link LMxParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectDeclarator_with_parameterList(LMxParser.DirectDeclarator_with_parameterListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code directDeclarator_recycle}
	 * labeled alternative in {@link LMxParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectDeclarator_recycle(LMxParser.DirectDeclarator_recycleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parameterList_multi}
	 * labeled alternative in {@link LMxParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList_multi(LMxParser.ParameterList_multiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parameterList_single}
	 * labeled alternative in {@link LMxParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList_single(LMxParser.ParameterList_singleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(LMxParser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#typedefName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedefName(LMxParser.TypedefNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(LMxParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(LMxParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItem(LMxParser.BlockItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(LMxParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(LMxParser.SelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iterationStatement_while}
	 * labeled alternative in {@link LMxParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement_while(LMxParser.IterationStatement_whileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iterationStatement_for}
	 * labeled alternative in {@link LMxParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement_for(LMxParser.IterationStatement_forContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forCondition_init}
	 * labeled alternative in {@link LMxParser#forCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCondition_init(LMxParser.ForCondition_initContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forCondition_none}
	 * labeled alternative in {@link LMxParser#forCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCondition_none(LMxParser.ForCondition_noneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forDeclaration_init}
	 * labeled alternative in {@link LMxParser#forDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDeclaration_init(LMxParser.ForDeclaration_initContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forDeclaration_none}
	 * labeled alternative in {@link LMxParser#forDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDeclaration_none(LMxParser.ForDeclaration_noneContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#forExprEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExprEnd(LMxParser.ForExprEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#forExprUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExprUpdate(LMxParser.ForExprUpdateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jumpStatement_continue}
	 * labeled alternative in {@link LMxParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement_continue(LMxParser.JumpStatement_continueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jumpStatement_break}
	 * labeled alternative in {@link LMxParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement_break(LMxParser.JumpStatement_breakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jumpStatement_return}
	 * labeled alternative in {@link LMxParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement_return(LMxParser.JumpStatement_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LMxParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#programDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramDeclaration(LMxParser.ProgramDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(LMxParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classDeclaration_decl}
	 * labeled alternative in {@link LMxParser#classDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration_decl(LMxParser.ClassDeclaration_declContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classDeclaration_none}
	 * labeled alternative in {@link LMxParser#classDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration_none(LMxParser.ClassDeclaration_noneContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(LMxParser.ClassDeclarationContext ctx);
}