grammar Halstead;

OPERATOR    : (SCSPEC | TYPE_QUAL | RESERVED | OPERATORS)
                {setText(getText().replaceAll(" ", "").replaceAll("\n", "").replaceAll("\t", ""));};
OPERAND     : IDENTIFIER | TYPESPEC | CONSTANT;
IGNORE      : COMMENT | LINE_COMMENT | BRACKETS_CLOSED | INCLUDE_COLUMN | KEYWORD | COLON;



// OPERAND
IDENTIFIER      : ID_LETTER (ID_LETTER | DIGIT)*;
TYPESPEC        : 'bool' | 'char' | 'double' | 'float' | 'int' | 'long' | 'short'
                    | 'signed' | 'unsigned' | 'void';
CONSTANT        : 'const' .*? ';';

fragment ID_LETTER  : [a-zA-Z] | '_';
fragment DIGIT      : [0-9];

// OPERATOR
SCSPEC          : 'auto' | 'extern' | 'inline' | 'register' | 'static' | 'typedef'
                    | 'virtual' | 'mutable';
TYPE_QUAL       : 'const' | 'friend' | 'volatile';
RESERVED        : 'asm' | 'break' | 'case' | 'class' | 'continue' | 'default'
                    | 'delete' | 'while' WHITESPACE? '(' | 'else' | 'enum' | 'for' WHITESPACE? '(' | 'goto'
                    | 'if' WHITESPACE? '(' | 'new' | 'operator' | 'private' | 'protected' | 'public'
                    | 'return' | 'sizeof' | 'struct' | 'switch' WHITESPACE? '(' | 'this' | 'union'
                    | 'namespace' | 'using' | 'try' | 'catch' | 'throw' | 'const_cast'
                    | 'static_cast' | 'dynamic_cast' | 'reinterpret_cast' | 'typeid'
                    | 'template' | 'explicit' | 'true' | 'false' | 'typename';
OPERATORS       : '!'|'!='|'%'|'%='|'&'|'&&'|'&='|'('|'*'|'*='
                    |'+'|'++'|'+='|','|'-'|'--'|'-='|'->'|'...'|'/'
                    |'/='|'::'|'<'|'<<'|'<<='|'<='|'=='|'>'|'>='|'>>'
                    |'>>='|'?'|'['|'^'|'^='|'{'|'||'|'='|'~'|';';

// IGNORE
COMMENT         : '/*' .*? '*/';
LINE_COMMENT    : '//' .*? '|r'? '\n';
BRACKETS_CLOSED : ')' | ']' | '}';
INCLUDE_COLUMN  : '#include' .*? '|r'? '\n';
KEYWORD         : 'do';
COLON           : ':';

// WHITESPACE
WHITESPACE      : [ \t\n\r]+ -> skip;
