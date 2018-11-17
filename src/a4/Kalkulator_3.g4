grammar Kalkulator_3;
import Lexer;

prog    : stat+;

stat    :   expr NL             # Calc
            | NL                # Nl
            | ID '=' expr NL    # Assign
            | 'clear' NL        # Clear
            ;

expr    :   '(' expr ')'      # Bracket
            | <assoc=right> expr POW expr   # Pow
            | expr MUL expr   # Mult
            | expr DIV expr   # Div
            | expr ADD expr   # Add
            | expr SUB expr   # Sub
            | expr EQU expr   # Equal
            | expr SMA expr   # Small
            | expr BIG expr   # Big
            | expr '?' expr ':' expr    # Cond
            | 'if''(' expr ')''{' expr '}''else''{' expr '}'    # IfElse
            | INT                       # int
            | ID                        # Id
            ;