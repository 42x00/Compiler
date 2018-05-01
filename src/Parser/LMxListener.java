package Parser;// Generated from LMx.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LMxParser}.
 */
public interface LMxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LMxParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(LMxParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(LMxParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarationSpecifier_array}
	 * labeled alternative in {@link LMxParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifier_array(LMxParser.DeclarationSpecifier_arrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarationSpecifier_array}
	 * labeled alternative in {@link LMxParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifier_array(LMxParser.DeclarationSpecifier_arrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarationSpecifier_type}
	 * labeled alternative in {@link LMxParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifier_type(LMxParser.DeclarationSpecifier_typeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarationSpecifier_type}
	 * labeled alternative in {@link LMxParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifier_type(LMxParser.DeclarationSpecifier_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixExpression_inc}
	 * labeled alternative in {@link LMxParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression_inc(LMxParser.PostfixExpression_incContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixExpression_inc}
	 * labeled alternative in {@link LMxParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression_inc(LMxParser.PostfixExpression_incContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixExpression_func}
	 * labeled alternative in {@link LMxParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression_func(LMxParser.PostfixExpression_funcContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixExpression_func}
	 * labeled alternative in {@link LMxParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression_func(LMxParser.PostfixExpression_funcContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixExpression_class}
	 * labeled alternative in {@link LMxParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression_class(LMxParser.PostfixExpression_classContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixExpression_class}
	 * labeled alternative in {@link LMxParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression_class(LMxParser.PostfixExpression_classContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixExpression_primary}
	 * labeled alternative in {@link LMxParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression_primary(LMxParser.PostfixExpression_primaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixExpression_primary}
	 * labeled alternative in {@link LMxParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression_primary(LMxParser.PostfixExpression_primaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixExpression_dec}
	 * labeled alternative in {@link LMxParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression_dec(LMxParser.PostfixExpression_decContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixExpression_dec}
	 * labeled alternative in {@link LMxParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression_dec(LMxParser.PostfixExpression_decContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixExpression_array}
	 * labeled alternative in {@link LMxParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression_array(LMxParser.PostfixExpression_arrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixExpression_array}
	 * labeled alternative in {@link LMxParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression_array(LMxParser.PostfixExpression_arrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argumentExpressionList_single}
	 * labeled alternative in {@link LMxParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList_single(LMxParser.ArgumentExpressionList_singleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argumentExpressionList_single}
	 * labeled alternative in {@link LMxParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList_single(LMxParser.ArgumentExpressionList_singleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argumentExpressionList_multi}
	 * labeled alternative in {@link LMxParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList_multi(LMxParser.ArgumentExpressionList_multiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argumentExpressionList_multi}
	 * labeled alternative in {@link LMxParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList_multi(LMxParser.ArgumentExpressionList_multiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpression_postfix}
	 * labeled alternative in {@link LMxParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression_postfix(LMxParser.UnaryExpression_postfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpression_postfix}
	 * labeled alternative in {@link LMxParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression_postfix(LMxParser.UnaryExpression_postfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpression_prefix_inc}
	 * labeled alternative in {@link LMxParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression_prefix_inc(LMxParser.UnaryExpression_prefix_incContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpression_prefix_inc}
	 * labeled alternative in {@link LMxParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression_prefix_inc(LMxParser.UnaryExpression_prefix_incContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpression_prefix_dec}
	 * labeled alternative in {@link LMxParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression_prefix_dec(LMxParser.UnaryExpression_prefix_decContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpression_prefix_dec}
	 * labeled alternative in {@link LMxParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression_prefix_dec(LMxParser.UnaryExpression_prefix_decContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpression_prefix}
	 * labeled alternative in {@link LMxParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression_prefix(LMxParser.UnaryExpression_prefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpression_prefix}
	 * labeled alternative in {@link LMxParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression_prefix(LMxParser.UnaryExpression_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(LMxParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(LMxParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(LMxParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(LMxParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicativeExpression_unary}
	 * labeled alternative in {@link LMxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression_unary(LMxParser.MultiplicativeExpression_unaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicativeExpression_unary}
	 * labeled alternative in {@link LMxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression_unary(LMxParser.MultiplicativeExpression_unaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicativeExpression_mod}
	 * labeled alternative in {@link LMxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression_mod(LMxParser.MultiplicativeExpression_modContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicativeExpression_mod}
	 * labeled alternative in {@link LMxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression_mod(LMxParser.MultiplicativeExpression_modContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicativeExpression_div}
	 * labeled alternative in {@link LMxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression_div(LMxParser.MultiplicativeExpression_divContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicativeExpression_div}
	 * labeled alternative in {@link LMxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression_div(LMxParser.MultiplicativeExpression_divContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicativeExpression_mul}
	 * labeled alternative in {@link LMxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression_mul(LMxParser.MultiplicativeExpression_mulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicativeExpression_mul}
	 * labeled alternative in {@link LMxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression_mul(LMxParser.MultiplicativeExpression_mulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpression_sub}
	 * labeled alternative in {@link LMxParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression_sub(LMxParser.AdditiveExpression_subContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpression_sub}
	 * labeled alternative in {@link LMxParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression_sub(LMxParser.AdditiveExpression_subContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpression_add}
	 * labeled alternative in {@link LMxParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression_add(LMxParser.AdditiveExpression_addContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpression_add}
	 * labeled alternative in {@link LMxParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression_add(LMxParser.AdditiveExpression_addContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpression_unary}
	 * labeled alternative in {@link LMxParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression_unary(LMxParser.AdditiveExpression_unaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpression_unary}
	 * labeled alternative in {@link LMxParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression_unary(LMxParser.AdditiveExpression_unaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shiftExpression_shr}
	 * labeled alternative in {@link LMxParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression_shr(LMxParser.ShiftExpression_shrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shiftExpression_shr}
	 * labeled alternative in {@link LMxParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression_shr(LMxParser.ShiftExpression_shrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shiftExpression_unary}
	 * labeled alternative in {@link LMxParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression_unary(LMxParser.ShiftExpression_unaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shiftExpression_unary}
	 * labeled alternative in {@link LMxParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression_unary(LMxParser.ShiftExpression_unaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shiftExpression_shl}
	 * labeled alternative in {@link LMxParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression_shl(LMxParser.ShiftExpression_shlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shiftExpression_shl}
	 * labeled alternative in {@link LMxParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression_shl(LMxParser.ShiftExpression_shlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpression_ge}
	 * labeled alternative in {@link LMxParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression_ge(LMxParser.RelationalExpression_geContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpression_ge}
	 * labeled alternative in {@link LMxParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression_ge(LMxParser.RelationalExpression_geContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpression_unary}
	 * labeled alternative in {@link LMxParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression_unary(LMxParser.RelationalExpression_unaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpression_unary}
	 * labeled alternative in {@link LMxParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression_unary(LMxParser.RelationalExpression_unaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpression_geq}
	 * labeled alternative in {@link LMxParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression_geq(LMxParser.RelationalExpression_geqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpression_geq}
	 * labeled alternative in {@link LMxParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression_geq(LMxParser.RelationalExpression_geqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpression_le}
	 * labeled alternative in {@link LMxParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression_le(LMxParser.RelationalExpression_leContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpression_le}
	 * labeled alternative in {@link LMxParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression_le(LMxParser.RelationalExpression_leContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpression_leq}
	 * labeled alternative in {@link LMxParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression_leq(LMxParser.RelationalExpression_leqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpression_leq}
	 * labeled alternative in {@link LMxParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression_leq(LMxParser.RelationalExpression_leqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpression_unary}
	 * labeled alternative in {@link LMxParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression_unary(LMxParser.EqualityExpression_unaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpression_unary}
	 * labeled alternative in {@link LMxParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression_unary(LMxParser.EqualityExpression_unaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpression_equal}
	 * labeled alternative in {@link LMxParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression_equal(LMxParser.EqualityExpression_equalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpression_equal}
	 * labeled alternative in {@link LMxParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression_equal(LMxParser.EqualityExpression_equalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpression_inequal}
	 * labeled alternative in {@link LMxParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression_inequal(LMxParser.EqualityExpression_inequalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpression_inequal}
	 * labeled alternative in {@link LMxParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression_inequal(LMxParser.EqualityExpression_inequalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpression_unary}
	 * labeled alternative in {@link LMxParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression_unary(LMxParser.AndExpression_unaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpression_unary}
	 * labeled alternative in {@link LMxParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression_unary(LMxParser.AndExpression_unaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpression_binary}
	 * labeled alternative in {@link LMxParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression_binary(LMxParser.AndExpression_binaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpression_binary}
	 * labeled alternative in {@link LMxParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression_binary(LMxParser.AndExpression_binaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exclusiveOrExpression_unary}
	 * labeled alternative in {@link LMxParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression_unary(LMxParser.ExclusiveOrExpression_unaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exclusiveOrExpression_unary}
	 * labeled alternative in {@link LMxParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression_unary(LMxParser.ExclusiveOrExpression_unaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exclusiveOrExpression_binary}
	 * labeled alternative in {@link LMxParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression_binary(LMxParser.ExclusiveOrExpression_binaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exclusiveOrExpression_binary}
	 * labeled alternative in {@link LMxParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression_binary(LMxParser.ExclusiveOrExpression_binaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inclusiveOrExpression_binary}
	 * labeled alternative in {@link LMxParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression_binary(LMxParser.InclusiveOrExpression_binaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inclusiveOrExpression_binary}
	 * labeled alternative in {@link LMxParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression_binary(LMxParser.InclusiveOrExpression_binaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inclusiveOrExpression_unary}
	 * labeled alternative in {@link LMxParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression_unary(LMxParser.InclusiveOrExpression_unaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inclusiveOrExpression_unary}
	 * labeled alternative in {@link LMxParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression_unary(LMxParser.InclusiveOrExpression_unaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalAndExpression_unary}
	 * labeled alternative in {@link LMxParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression_unary(LMxParser.LogicalAndExpression_unaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalAndExpression_unary}
	 * labeled alternative in {@link LMxParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression_unary(LMxParser.LogicalAndExpression_unaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalAndExpression_binary}
	 * labeled alternative in {@link LMxParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression_binary(LMxParser.LogicalAndExpression_binaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalAndExpression_binary}
	 * labeled alternative in {@link LMxParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression_binary(LMxParser.LogicalAndExpression_binaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalOrExpression_binary}
	 * labeled alternative in {@link LMxParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression_binary(LMxParser.LogicalOrExpression_binaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalOrExpression_binary}
	 * labeled alternative in {@link LMxParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression_binary(LMxParser.LogicalOrExpression_binaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalOrExpression_unary}
	 * labeled alternative in {@link LMxParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression_unary(LMxParser.LogicalOrExpression_unaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalOrExpression_unary}
	 * labeled alternative in {@link LMxParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression_unary(LMxParser.LogicalOrExpression_unaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LMxParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LMxParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaration_init}
	 * labeled alternative in {@link LMxParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_init(LMxParser.Declaration_initContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaration_init}
	 * labeled alternative in {@link LMxParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_init(LMxParser.Declaration_initContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaration_none}
	 * labeled alternative in {@link LMxParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_none(LMxParser.Declaration_noneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaration_none}
	 * labeled alternative in {@link LMxParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_none(LMxParser.Declaration_noneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initDeclaratorList_single}
	 * labeled alternative in {@link LMxParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList_single(LMxParser.InitDeclaratorList_singleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initDeclaratorList_single}
	 * labeled alternative in {@link LMxParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList_single(LMxParser.InitDeclaratorList_singleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initDeclaratorList_multi}
	 * labeled alternative in {@link LMxParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList_multi(LMxParser.InitDeclaratorList_multiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initDeclaratorList_multi}
	 * labeled alternative in {@link LMxParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList_multi(LMxParser.InitDeclaratorList_multiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initDeclarator_none}
	 * labeled alternative in {@link LMxParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator_none(LMxParser.InitDeclarator_noneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initDeclarator_none}
	 * labeled alternative in {@link LMxParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator_none(LMxParser.InitDeclarator_noneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initDeclarator_init}
	 * labeled alternative in {@link LMxParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator_init(LMxParser.InitDeclarator_initContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initDeclarator_init}
	 * labeled alternative in {@link LMxParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator_init(LMxParser.InitDeclarator_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(LMxParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(LMxParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newDeclarator_error}
	 * labeled alternative in {@link LMxParser#newDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNewDeclarator_error(LMxParser.NewDeclarator_errorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newDeclarator_error}
	 * labeled alternative in {@link LMxParser#newDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNewDeclarator_error(LMxParser.NewDeclarator_errorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newDeclarator_array}
	 * labeled alternative in {@link LMxParser#newDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNewDeclarator_array(LMxParser.NewDeclarator_arrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newDeclarator_array}
	 * labeled alternative in {@link LMxParser#newDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNewDeclarator_array(LMxParser.NewDeclarator_arrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newDeclarator_nonarray}
	 * labeled alternative in {@link LMxParser#newDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNewDeclarator_nonarray(LMxParser.NewDeclarator_nonarrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newDeclarator_nonarray}
	 * labeled alternative in {@link LMxParser#newDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNewDeclarator_nonarray(LMxParser.NewDeclarator_nonarrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code directDeclarator_Identifier}
	 * labeled alternative in {@link LMxParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectDeclarator_Identifier(LMxParser.DirectDeclarator_IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code directDeclarator_Identifier}
	 * labeled alternative in {@link LMxParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectDeclarator_Identifier(LMxParser.DirectDeclarator_IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code directDeclarator_with_parameterList}
	 * labeled alternative in {@link LMxParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectDeclarator_with_parameterList(LMxParser.DirectDeclarator_with_parameterListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code directDeclarator_with_parameterList}
	 * labeled alternative in {@link LMxParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectDeclarator_with_parameterList(LMxParser.DirectDeclarator_with_parameterListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code directDeclarator_recycle}
	 * labeled alternative in {@link LMxParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectDeclarator_recycle(LMxParser.DirectDeclarator_recycleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code directDeclarator_recycle}
	 * labeled alternative in {@link LMxParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectDeclarator_recycle(LMxParser.DirectDeclarator_recycleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parameterList_multi}
	 * labeled alternative in {@link LMxParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList_multi(LMxParser.ParameterList_multiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parameterList_multi}
	 * labeled alternative in {@link LMxParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList_multi(LMxParser.ParameterList_multiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parameterList_single}
	 * labeled alternative in {@link LMxParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList_single(LMxParser.ParameterList_singleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parameterList_single}
	 * labeled alternative in {@link LMxParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList_single(LMxParser.ParameterList_singleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(LMxParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(LMxParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void enterTypedefName(LMxParser.TypedefNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void exitTypedefName(LMxParser.TypedefNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LMxParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LMxParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(LMxParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(LMxParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(LMxParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(LMxParser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(LMxParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(LMxParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(LMxParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(LMxParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iterationStatement_while}
	 * labeled alternative in {@link LMxParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement_while(LMxParser.IterationStatement_whileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iterationStatement_while}
	 * labeled alternative in {@link LMxParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement_while(LMxParser.IterationStatement_whileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iterationStatement_for}
	 * labeled alternative in {@link LMxParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement_for(LMxParser.IterationStatement_forContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iterationStatement_for}
	 * labeled alternative in {@link LMxParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement_for(LMxParser.IterationStatement_forContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forCondition_init}
	 * labeled alternative in {@link LMxParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition_init(LMxParser.ForCondition_initContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forCondition_init}
	 * labeled alternative in {@link LMxParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition_init(LMxParser.ForCondition_initContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forCondition_none}
	 * labeled alternative in {@link LMxParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition_none(LMxParser.ForCondition_noneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forCondition_none}
	 * labeled alternative in {@link LMxParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition_none(LMxParser.ForCondition_noneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forDeclaration_init}
	 * labeled alternative in {@link LMxParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForDeclaration_init(LMxParser.ForDeclaration_initContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forDeclaration_init}
	 * labeled alternative in {@link LMxParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForDeclaration_init(LMxParser.ForDeclaration_initContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forDeclaration_none}
	 * labeled alternative in {@link LMxParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForDeclaration_none(LMxParser.ForDeclaration_noneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forDeclaration_none}
	 * labeled alternative in {@link LMxParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForDeclaration_none(LMxParser.ForDeclaration_noneContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#forExprEnd}.
	 * @param ctx the parse tree
	 */
	void enterForExprEnd(LMxParser.ForExprEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#forExprEnd}.
	 * @param ctx the parse tree
	 */
	void exitForExprEnd(LMxParser.ForExprEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#forExprUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForExprUpdate(LMxParser.ForExprUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#forExprUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForExprUpdate(LMxParser.ForExprUpdateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jumpStatement_continue}
	 * labeled alternative in {@link LMxParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement_continue(LMxParser.JumpStatement_continueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jumpStatement_continue}
	 * labeled alternative in {@link LMxParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement_continue(LMxParser.JumpStatement_continueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jumpStatement_break}
	 * labeled alternative in {@link LMxParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement_break(LMxParser.JumpStatement_breakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jumpStatement_break}
	 * labeled alternative in {@link LMxParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement_break(LMxParser.JumpStatement_breakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jumpStatement_return}
	 * labeled alternative in {@link LMxParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement_return(LMxParser.JumpStatement_returnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jumpStatement_return}
	 * labeled alternative in {@link LMxParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement_return(LMxParser.JumpStatement_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LMxParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LMxParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#programDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProgramDeclaration(LMxParser.ProgramDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#programDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProgramDeclaration(LMxParser.ProgramDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(LMxParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(LMxParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classDeclaration_decl}
	 * labeled alternative in {@link LMxParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration_decl(LMxParser.ClassDeclaration_declContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classDeclaration_decl}
	 * labeled alternative in {@link LMxParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration_decl(LMxParser.ClassDeclaration_declContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classDeclaration_none}
	 * labeled alternative in {@link LMxParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration_none(LMxParser.ClassDeclaration_noneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classDeclaration_none}
	 * labeled alternative in {@link LMxParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration_none(LMxParser.ClassDeclaration_noneContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(LMxParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(LMxParser.ClassDeclarationContext ctx);
}