grammar Syntaxerkenner_a3_;
import Lexer;

stat        : comp | expr | decl;

decl        : (ID '=')? comp;
comp        : expr | comp ('<' | '>') comp;

expr        : multExpr | expr '+' multExpr | expr '-' multExpr;
multExpr    : pow | multExpr '*' pow | multExpr '/' pow;
pow         : fact | pow ('^'<assoc=right> pow);

fact        : '('expr')' | INT;