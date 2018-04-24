grammar LMx;

primaryExpression // 3
    :   Identifier
    |   Constant
    |   StringLiteral
    |   '(' expression ')'
    ;

declarationSpecifier // 16
    :   typeSpecifier
    |   declarationSpecifier '[' ']'
    ;

postfixExpression // 28
    :   primaryExpression
    |   postfixExpression '[' expression ']'
    |   postfixExpression '(' argumentExpressionList? ')'
    |   postfixExpression '.' Identifier
    |   postfixExpression '++'
    |   postfixExpression '--'
    ;

argumentExpressionList // 42
    :   expression
    |   argumentExpressionList ',' expression
    ;

unaryExpression // 47
    :   postfixExpression
    |   '++' unaryExpression
    |   '--' unaryExpression
    |   unaryOperator castExpression
    ;

unaryOperator // 58
    :   '&' | '|' | '+' | '-' | '~' | '!'
    ;

castExpression // 62
    :   unaryExpression
    |   DigitSequence
    ;

multiplicativeExpression // 69
    :   castExpression
    |   multiplicativeExpression '*' castExpression
    |   multiplicativeExpression '/' castExpression
    |   multiplicativeExpression '%' castExpression
    ;

additiveExpression // 76
    :   multiplicativeExpression
    |   additiveExpression '+' multiplicativeExpression
    |   additiveExpression '-' multiplicativeExpression
    ;

shiftExpression // 82
    :   additiveExpression
    |   shiftExpression '<<' additiveExpression
    |   shiftExpression '>>' additiveExpression
    ;

relationalExpression // 88
    :   shiftExpression
    |   relationalExpression '<' shiftExpression
    |   relationalExpression '>' shiftExpression
    |   relationalExpression '<=' shiftExpression
    |   relationalExpression '>=' shiftExpression
    ;

equalityExpression // 96
    :   relationalExpression
    |   equalityExpression '==' relationalExpression
    |   equalityExpression '!=' relationalExpression
    ;

andExpression // 102
    :   equalityExpression
    |   andExpression '&' equalityExpression
    ;

exclusiveOrExpression // 107
    :   andExpression
    |   exclusiveOrExpression '^' andExpression
    ;

inclusiveOrExpression // 112
    :   exclusiveOrExpression
    |   inclusiveOrExpression '|' exclusiveOrExpression
    ;

logicalAndExpression // 117
    :   inclusiveOrExpression
    |   logicalAndExpression '&&' inclusiveOrExpression
    ;

logicalOrExpression // 122
    :   logicalAndExpression
    |   logicalOrExpression '||' logicalAndExpression
    ;

expression // 141
    :   newDeclarator
    |   logicalOrExpression
    |   unaryExpression '=' expression
    |   DigitSequence
    ;

declaration // 150
    :   declarationSpecifier initDeclaratorList ';'
	| 	declarationSpecifier ';'
    ;

initDeclaratorList // 172
    :   initDeclarator
    |   initDeclaratorList ',' initDeclarator
    ;

initDeclarator // 177
    :   directDeclarator
    |   directDeclarator '=' expression
    ;

typeSpecifier // 191
    :   ('void'
    |   'int'
    |   'string')
    |   typedefName
    ; 

newDeclarator // 
    :   'new'   declarationSpecifier
    ;

directDeclarator // 299
    :   Identifier
    |   '(' directDeclarator ')'
    |   directDeclarator '(' parameterList? ')'
    ;

parameterList // 355
    :   parameterDeclaration
    |   parameterList ',' parameterDeclaration
    ;

parameterDeclaration // 360
    :   declarationSpecifier directDeclarator
    ;

typedefName // 393
    :   Identifier
    ;

statement // 426
    :   compoundStatement
    |   expressionStatement
    |   selectionStatement
    |   iterationStatement
    |   jumpStatement
    ;

compoundStatement // 442
    :   '{' blockItemList? '}'
    ;

blockItemList // 446
    :   blockItem
    |   blockItemList blockItem
    ;

blockItem // 451
    :   statement
    |   declaration
    ;

expressionStatement // 456
    :   expression? ';'
    ;

selectionStatement // 460
    :   'if' '(' expression ')' statement ('else' statement)?
    ;

iterationStatement // 465
    :   While '(' expression ')' statement
    |   For '(' forCondition ')' statement
    ;

forCondition // 474
	:   forDeclaration ';' forExpression? ';' forExpression?
	|   expression? ';' forExpression? ';' forExpression?
	;

forDeclaration // 479
    :   declarationSpecifier initDeclaratorList
	| 	declarationSpecifier
    ;

forExpression // 484
    :   expression
    ;

jumpStatement // 489
    :   'continue' ';'
    |   'break' ';'
    |   'return' expression? ';'
    ;

compilationUnit // 497
    :   translationUnit? EOF
    ;

translationUnit // 501
    :   externalDeclaration
    |   translationUnit externalDeclaration
    ;

externalDeclaration // 506
    :   functionDefinition
    |   classDefinition
    |   declaration
    |   ';'
    ;

functionDefinition // 512
    :   declarationSpecifier? directDeclarator compoundStatement
    ;

classDefinition // 
    :   'class' Identifier? '{' classDeclarationList '}'
    |   'class' Identifier
    ;

classDeclarationList //
    :   classDeclaration
    |   classDeclarationList classDeclaration
    ;

classDeclaration // 
    :   declaration
    |   functionDefinition
    ;

Break : 'break';
Continue : 'continue';
Else : 'else';
For : 'for';
If : 'if';
Int : 'int';
String : 'string';
Return : 'return';
Void : 'void';
While : 'while';
Class : 'class';
New : 'new';
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

Identifier // 622
    :   Nondigit
        (   Nondigit
        |   Digit
        )*
    ;

fragment
Nondigit // 637
    :   [a-zA-Z_]
    ;

fragment
Digit // 642
    :   [0-9]
    ;

Constant // 657
    :   IntegerConstant
    |   BooleanConstant
    ;

fragment
IntegerConstant // 665
    :   NonzeroDigit Digit*
    ;

fragment
NonzeroDigit // 698
    :   [1-9]
    ;

DigitSequence // 770
    :   Digit+
    ;

BooleanConstant // 797
    :   True
    |   False
    ;

fragment
EscapeSequence // 816
    :   '\\' ['"?abfnrtv\\]
    ;

StringLiteral // 836
    :   '"' SCharSequence? '"'
    ;

fragment
SCharSequence // 847
    :   SChar+
    ;

fragment
SChar // 851
    :   ~["\\\r\n]
    |   EscapeSequence
    |   '\\\n'  
    |   '\\\r\n' 
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



