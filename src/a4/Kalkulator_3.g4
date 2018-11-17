grammar Kalkulator_3;
import Lexer;

stat    :   expr NL
            | NL
            ;
expr    :   '(' expr ')'      # Bracket
            | expr MUL expr   # Mult
            | expr DIV expr   # Div
            | expr ADD expr   # Add
            | expr SUB expr   # Sub
            | INT             # int
            ;