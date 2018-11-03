grammar Syntaxerkenner_a3_;
import Lexer;

stat        : expr?;
expr        : verg | term_ | decl;

decl        : (ID '=')? verg;
verg        : term_ | verg ('<' | '>') verg;

term_       : term | term_ '+' term | term_ '-' term;
term        : potz | term '*' fact | term '/' fact;
potz        : fact | potz ('^'<assoc=right> potz);

fact        : '('expr')' | INT;