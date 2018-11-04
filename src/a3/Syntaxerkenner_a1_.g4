grammar Syntaxerkenner_a1_;
import Lexer;

decl    : comp | ID '=' comp;
comp    : expr | comp ('<' | '>') expr;
expr    : term | expr ('+' | '-') term;
term    : pow | term ('/' | '*') pow;
pow     : fact |<assoc=right> fact '^' pow;
fact    : INT | '('decl')';