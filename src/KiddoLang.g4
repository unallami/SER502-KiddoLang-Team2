grammar KiddoLang;

// Lexer Rules
PRINT   : 'print' ;
IF      : 'if' ;
ELSE    : 'else' ;
FOR     : 'for' ;
WHILE   : 'while' ;
TRUE    : 'true' ;
FALSE   : 'false' ;
AND     : 'and' ;
OR      : 'or' ;
NOT     : 'not' ;

ID      : [a-zA-Z_][a-zA-Z0-9_]* ;
INT     : [0-9]+ ;
FLOAT   : [0-9]+ '.' [0-9]+ ;
STRING  : '"' (~["\\] | '\\' .)* '"' ;

PLUS    : '+' ;
MINUS   : '-' ;
MULT    : '*' ;
DIV     : '/' ;
GT      : '>' ;
LT      : '<' ;
EQ      : '==' ;
ASSIGN  : '=' ;
QMARK   : '?' ;
COLON   : ':' ;

LPAREN  : '(' ;
RPAREN  : ')' ;
LBRACE  : '{' ;
RBRACE  : '}' ;
SEMI    : ';' ;

WS      : [ \t\r\n]+ -> skip ;
COMMENT : '//' ~[\r\n]* -> skip ;