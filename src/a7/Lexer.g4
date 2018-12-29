lexer grammar Lexer;

INT         : DIGIT+;
ID          : ID_LETTER (ID_LETTER | DIGIT)*;
WS          : [ \t\n\r]+ -> skip ;
MUL         : '*';
DIV         : '/';
ADD         : '+';
SUB         : '-';
POW         : '^';
EQU         : '==';
NEQ         : '!=';
BIG         : '>';
SMA         : '<';


fragment ID_LETTER  : [a-zA-Z];
fragment DIGIT      : [0-9];