grammar KiddoLang;

// ======================
//     Parser Rules
// ======================

program         : statement+ ;

statement
    : assignment
    | printStatement
    | ifStatement
    | loopStatement
    | ternaryExpr ';'
    ;

assignment      : SET ID TO expr SEMI ;

printStatement  : SAY expr SEMI ;

ifStatement     : WHEN LPAREN expr RPAREN block (OTHERWISE block)? ;

loopStatement   : forLoop | whileLoop ;

// ======================
//     Lexer Rules
// ======================

// --- Keywords ---
SET             : 'set' ;
TO              : 'to' ;
SAY             : 'say' ;
WHEN            : 'when' ;
OTHERWISE       : 'otherwise' ;
COUNT           : 'count' ;
FROM            : 'from' ;
REPEAT          : 'repeat' ;
UNTIL           : 'until' ;
AND             : 'and' ;
OR              : 'or' ;
NOT             : 'not' ;
YES             : 'yes' ;
NO              : 'no' ;

// --- Operators & Punctuation ---
PLUS            : '+' ;
MINUS           : '-' ;
MULT            : '*' ;
DIV             : '/' ;
GT              : '>' ;
LT              : '<' ;
EQ              : '==' ;
QMARK           : '?' ;
COLON           : ':' ;
LPAREN          : '(' ;
RPAREN          : ')' ;
LBRACE          : '{' ;
RBRACE          : '}' ;
SEMI            : ';' ;

// --- Identifiers & Literals ---
ID              : [a-zA-Z_][a-zA-Z0-9_]* ;
INT             : [0-9]+ ;
FLOAT           : [0-9]+ '.' [0-9]+ ;
STRING          : '"' (~["\\] | '\\' .)* '"' ;

// --- Whitespace & Comments ---
WS              : [ \t\r\n]+ -> skip ;
COMMENT         : '//' ~[\r\n]* -> skip ;

