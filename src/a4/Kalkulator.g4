grammar Kalkulator;
import Lexer;

prog    :   stat+;

stat    :   'clear' NL                          # clear
            | expr NL                           # printExpr
            | ID '=' expr NL                    # assign
            | NL                                # blank;

expr    :   '(' expr ')'                        # brackets
            | <assoc=right> expr op='^' expr    # Pow
            | expr op=('*'|'/') expr            # MultDiv
            | expr op=('+'|'-') expr            # AddSub
            | expr op='==' expr                 # Equals
            | expr op=('>'|'<') expr            # BigSmall
            | expr op='?' expr op=':' expr      # Conditional
            | INT                               # int
            | ID                                # id
            ;