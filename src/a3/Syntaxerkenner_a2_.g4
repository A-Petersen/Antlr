grammar Syntaxerkenner_a2_;
import Lexer;

prog    : stat+;
stat    : decl? NL;
decl    : (ID '=')? comp;
comp    : expr (('<' | '>') expr)*;
expr    : term (('+' | '-') term)*;
term    : pow (('*' | '/') pow)*;
pow     : <assoc=right> fact ('^' fact)*;
fact    : ('+' | '-') fact | '(' decl ')' | INT;