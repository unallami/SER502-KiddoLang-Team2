grammar KiddoLang;

// Lexer Rules
// --- Keywords ---
SET             : 'set' ;
TO              : 'to' ;
SAY             : 'say' ;
WHEN            : 'when' ;
OTHERWISE       : 'otherwise' ;
COUNT           : 'count' ;
FROM            : 'from' ;
TO              : 'to' ;
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


// --- Literals ---
NUMBER      : [0-9]+ ('.' [0-9]+)? ;
STRING      : '"' (~["\\] | '\\' .)*? '"' ;

// --- Identifiers ---
ID          : [a-zA-Z_][a-zA-Z0-9_]* ;
