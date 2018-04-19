grammar test;

primaryExpression
    :   'this'
    |   Identifier
    |   Constant
    |   StringLiteral
    |   '(' expression ')'
    ;

postfixExpression
    :   primaryExpression
    |   postfixExpression '[' expression ']'
    |   postfixExpression '(' argumentExpressionList? ')'
    |   postfixExpression '.' Identifier
    |   postfixExpression '++'
    |   postfixExpression '--'
    ;

argumentExpressionList
    :   expression
    |   argumentExpressionList ',' expression
    ;

unaryExpression
    :   postfixExpression
    |   '++' unaryExpression
    |   '--' unaryExpression
    |   unaryOperator castExpression
    ;

unaryOperator
    :   '&' | '|' | '+' | '-' | '~' | '!'
    ;

castExpression
    :   unaryExpression
    |   DigitSequence // for
    ;

multiplicativeExpression
    :   castExpression
    |   multiplicativeExpression '*' castExpression
    |   multiplicativeExpression '/' castExpression
    |   multiplicativeExpression '%' castExpression
    ;

additiveExpression
    :   multiplicativeExpression
    |   additiveExpression '+' multiplicativeExpression
    |   additiveExpression '-' multiplicativeExpression
    ;

shiftExpression
    :   additiveExpression
    |   shiftExpression '<<' additiveExpression
    |   shiftExpression '>>' additiveExpression
    ;

relationalExpression
    :   shiftExpression
    |   relationalExpression '<' shiftExpression
    |   relationalExpression '>' shiftExpression
    |   relationalExpression '<=' shiftExpression
    |   relationalExpression '>=' shiftExpression
    ;

equalityExpression
    :   relationalExpression
    |   equalityExpression '==' relationalExpression
    |   equalityExpression '!=' relationalExpression
    ;

andExpression
    :   equalityExpression
    |   andExpression '&' equalityExpression
    ;

exclusiveOrExpression
    :   andExpression
    |   exclusiveOrExpression '^' andExpression
    ;

inclusiveOrExpression
    :   exclusiveOrExpression
    |   inclusiveOrExpression '|' exclusiveOrExpression
    ;

logicalAndExpression
    :   inclusiveOrExpression
    |   logicalAndExpression '&&' inclusiveOrExpression
    ;

logicalOrExpression
    :   logicalAndExpression
    |   logicalOrExpression '||' logicalAndExpression
    ;

expression
    :   newExpression
    |   logicalOrExpression
    |   unaryExpression '=' expression
    |   DigitSequence // for
    ;

declaration
    :   declarationSpecifiers initDeclaratorList ';'
	| 	declarationSpecifiers ';'
    ;

declarationSpecifiers
    :   declarationSpecifier+
    ;

declarationSpecifier
    :   typeSpecifier
    |   functionSpecifier
    |   declarationSpecifier '[' ']'
    ;

initDeclaratorList
    :   initDeclarator
    |   initDeclaratorList ',' initDeclarator
    ;

initDeclarator
    :   declarator
    |   declarator '=' expression
    ;

typeSpecifier
    :   'void'
    |   'string'
    |   'int'
    |   typedefName
    ;

functionSpecifier
    :   'inline'
    ;

declarator
    :   Identifier
    |   '(' declarator ')'
//    |   declarator '[' expression? ']'
    |   declarator '(' parameterList? ')'
//    |   declarator '(' identifierList? ')'
    ;

nestedParenthesesBlock
    :   (   ~('(' | ')')
        |   '(' nestedParenthesesBlock ')'
        )*
    ;

parameterList
    :   parameterDeclaration
    |   parameterList ',' parameterDeclaration
    ;

parameterDeclaration
    :   declarationSpecifiers declarator
    ;

identifierList
    :   Identifier
    |   identifierList ',' Identifier
    ;

typedefName
    :   Identifier
    ;

statement
    :   compoundStatement
    |   expressionStatement
    |   selectionStatement
    |   iterationStatement
    |   jumpStatement
    ;

compoundStatement
    :   '{' blockItemList? '}'
    ;

blockItemList
    :   blockItem
    |   blockItemList blockItem
    ;

blockItem
    :   statement
    |   declaration
    ;

expressionStatement
    :   expression? ';'
    ;

selectionStatement
    :   'if' '(' expression ')' statement ('else' statement)?
    ;

iterationStatement
    :   While '(' expression ')' statement
    |   For '(' forCondition ')' statement
    ;

//    |   'for' '(' expression? ';' expression?  ';' forUpdate? ')' statement
//    |   For '(' declaration  expression? ';' expression? ')' statement

forCondition
	:   forDeclaration ';' forExpression? ';' forExpression?
	|   expression? ';' forExpression? ';' forExpression?
	;

forDeclaration
    :   declarationSpecifiers initDeclaratorList
	| 	declarationSpecifiers
    ;

forExpression
    :   expression
    //|   forExpression ',' expression
    ;

jumpStatement
    :   'continue' ';'
    |   'break' ';'
    |   'return' expression? ';'
    ;

compilationUnit
    :   translationUnit? EOF
    ;

translationUnit
    :   externalDeclaration
    |   translationUnit externalDeclaration
    ;

externalDeclaration
    :   classDefinition
    |   functionDefinition
    |   declaration
    |   ';' // stray ;
    ;

classDefinition
    :   'class' Identifier '{' classDeclarationList '}'
    ;

classDeclarationList
    :   classDeclaration
    |   classDeclarationList classDeclaration
    ;

classDeclaration
    :   declaration
    |   functionDefinition
    ;

functionDefinition
    :   declarationSpecifiers? declarator /*declarationList?*/ compoundStatement
    ;
/*
declarationList
    :   declaration
    |   declarationList declaration
    ;
*/

newExpression
    :   'new' declarationSpecifiers
    ;

Break : 'break';
// Char : 'char';
Continue : 'continue';
Else : 'else';
For : 'for';
If : 'if';
Inline : 'inline';
Int : 'int';
String : 'string';
Return : 'return';
Void : 'void';
While : 'while';
Class : 'class';
New : 'new';
This : 'this';
True : 'true';
False : 'false';


LeftParen : '(';
RightParen : ')';
LeftBracket : '[';
RightBracket : ']';
LeftBrace : '{';
RightBrace : '}';

Less : '<';
LessEqual : '<=';
Greater : '>';
GreaterEqual : '>=';
LeftShift : '<<';
RightShift : '>>';

Plus : '+';
PlusPlus : '++';
Minus : '-';
MinusMinus : '--';
Star : '*';
Div : '/';
Mod : '%';

And : '&';
Or : '|';
AndAnd : '&&';
OrOr : '||';
Caret : '^';
Not : '!';
Tilde : '~';

Colon : ':';
Semi : ';';
Comma : ',';

Assign : '=';

Equal : '==';
NotEqual : '!=';

Dot : '.';

Identifier
    :   Nondigit
        (   Nondigit
        |   Digit
        )*
    ;

BooleanConstant
    :   True
    |   False
    ;

fragment
Nondigit
    :   [a-zA-Z_]
    ;

fragment
Digit
    :   [0-9]
    ;

Constant
    :   IntegerConstant
    |   BooleanConstant
    //|   EnumerationConstant
    //|   CharacterConstant
    ;

fragment
IntegerConstant
    :   NonzeroDigit Digit*
    ;

fragment
NonzeroDigit
    :   [1-9]
    ;

fragment
Sign
    :   '+' | '-'
    ;

DigitSequence
    :   Digit+
    ;

fragment
CharacterConstant
    :   '\'' CCharSequence '\''
    ;

fragment
CCharSequence
    :   CChar+
    ;

fragment
CChar
    :   ~['\\\r\n]
    |   EscapeSequence
    ;
fragment
EscapeSequence
    :   '\\' ['"?abfnrtv\\]
    ;
StringLiteral
    :   '"' SCharSequence? '"'
    ;
fragment
SCharSequence
    :   SChar+
    ;
fragment
SChar
    :   ~["\\\r\n]
    |   EscapeSequence
    |   '\\\n'   // Added line
    |   '\\\r\n' // Added line
    ;

Whitespace
    :   [ \t]+
        -> skip
    ;

Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;

BlockComment
    :   '/*' .*? '*/'
        -> skip
    ;

LineComment
    :   '//' ~[\r\n]*
        -> skip
    ;