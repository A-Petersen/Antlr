lexer grammar Lexer;

INT         : DIGIT+;
ID          : ID_LETTER (ID_LETTER)*;
NL          : '\r'? '\n';
MUL         : '*';
DIV         : '/';
ADD         : '+';
SUB         : '-';
POW         : '^';
EQU         : '==';
BIG         : '>';
SMA         : '<';
WS          : [ \t]+ -> skip;

fragment ID_LETTER  : [a-zA-Z];
fragment DIGIT      : [0-9];