grammar Clobal;
import Lexer;
@header {
}

file:   (functionDecl | varDecl)+  ; 

functionDecl
    :   type ID '('')' block 
    ;

block:  '{' stat* '}' ;  

stat:   block             
    |   ifStat	
    |   forStat				  
    |   returnStat ';'    
    |   assignStat  ';'  
    |   printStat  ';'   
    |   expr ';'     
    ;
     
assignStat:  ID '=' expr ;

ifStat: 'if' '('expr ')' stat ('else' stat)? ;

forStat: 'for' '(' assignStat ';' expr ';' assignStat ')' block ;

returnStat: 'return' expr ;

printStat: 'printf' '(' expr ')';

varDecl:   type ID ';' ;

type:   'int'  ;  

expr:   '-' expr       #Negation
    |   '!' expr       #Negation
    |   expr op=('*'|'/') expr #BinOp
    |   expr op=('+'|'-') expr #BinOp
    |   expr op=('=='|'!='|'<'|'>') expr   #BinOp
    |   expr '?' expr ':' expr     #Case
    |   ID                #id
    |   INT               #int
    |   '(' expr ')'      #bracket
    |   ID '(' ')'        #Function
    ;

WS          : [ \t\n\r]+ -> skip ;

