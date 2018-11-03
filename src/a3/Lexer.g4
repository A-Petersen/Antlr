lexer grammar Lexer;

INT         : DIGIT+;
ID          : ID_LETTER (ID_LETTER | DIGIT)*;

fragment ID_LETTER  : [a-zA-Z] | '_';
fragment DIGIT      : [0-9];