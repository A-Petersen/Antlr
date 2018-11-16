grammar Kalkulator;
import Lexer;

stat    :   expr NL                                # printExpr
            | NL                                   # blank;
expr    :   '(' expr ')'                           # brackets
            | <assoc=left> expr op=('*'|'/') expr  # MultDiv
            | <assoc=left> expr op=('+'|'-') expr  # AddSub
            | INT                                  # int
            ;