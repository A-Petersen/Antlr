grammar Syntaxerkenner_a3_x_;
import Lexer;

expr    :   '(' expr ')' |
            <assoc=right> expr '^' expr |
            <assoc=left> expr ('*'|'/') expr |
            <assoc=left> expr ('+'|'-') expr |
            expr ('>'|'<') expr |
            ID '=' expr |
            INT;