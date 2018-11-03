grammar Syntaxerkenner_a1_;
import Lexer;

//expr    : (expr ('+' | '-'))? term;
//term    : (term ('*' | '/'))? fact;
expr    : term | expr '+' term | expr '-' term;
term    : fact | term '/' fact | term '*' fact;
fact    : INT | '('expr')';