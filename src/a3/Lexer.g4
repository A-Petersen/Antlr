lexer grammar Lexer;

INT         : DIGIT+;
ID          : ID_LETTER (ID_LETTER | DIGIT)*;
NL          : '\r'? '\n';

fragment ID_LETTER  : [a-zA-Z];
fragment DIGIT      : [0-9];