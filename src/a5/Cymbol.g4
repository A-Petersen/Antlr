grammar Cymbol;

file    :   (functionDecl | varDecl)+;

varDecl :   type ID ('=' expr)? ';'
        ;

type    :   'float' | 'int' | 'void' | 'boolean';

functionDecl
    :       type ID '('formalParameters?')' block
    ;

formalParameters
    :   formalParameter (',' formalParameter)*
    ;

formalParameter
    :   type ID
    ;


block:  '{' stat* '}'
     ;

stat    :   block                   #Bloc
        |   varDecl                 #VarDec
        |   'if' '(' expr ')' stat ('else' stat)?   #IfElse
        |   'return' expr? ';'      #Return
        |   expr '=' expr  ';'      #Assign
        |   expr ';'                #Semi
        ;

expr    :   ID '(' exprList? ')'    #Call
        |   expr '[' expr ']'       #Index
        |   '-' expr                #Negate
        |   '!' expr                #Not
        |   expr ('*' | '/') expr   #MultDiv
        |   expr ('+' | '-') expr   #AddSub
        |   expr ('=='|'!='|'<'|'>'|'<='|'>=') expr    #Comp
        |   ID                      #Var
        |   INT                     #Int
        |   '(' expr ')'            #Parens
        ;

exprList:   expr (',' expr)*;

ID      : LETTER (LETTER | [0-9])*;
fragment
LETTER  :   [a-zA-Z_];
INT     :   [0-9]+;
WS      :   [ \t\n\r]+ -> skip ;

SL_COMMENT
    :   '//' .*? '\n' -> skip
;