grammar Syntaxerkenner_a2_;
import Lexer;

prog    : stat+;
stat    : expr? NL;
expr    : term (('+' | '-') term)*;
term    : fact (('*' | '/') fact)*;
fact    : ('+' | '-') fact | '(' expr ')' | INT;