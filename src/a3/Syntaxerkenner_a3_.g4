grammar Syntaxerkenner_a3_;
import Lexer;

stat        : comp | expr | decl;

decl        : (ID '=')? comp;
comp        : expr | comp ('<' | '>') comp;

expr       : multExpr | expr '+' multExpr | expr '-' multExpr;
multExpr        : pow | multExpr '*' fact | multExpr '/' fact;
pow        : fact | pow ('^'<assoc=right> pow);

fact        : '('expr')' | INT;