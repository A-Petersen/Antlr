grammar Kalkulator_2;
import Lexer;

@header {
package a4;
import java.util.*;
}

@parser::members {
    int calc(int left, int op, int right) {
        switch (op) {
            case MUL : return left * right;
            case DIV : return left / right;
            case ADD : return left + right;
            case SUB : return left - right;
        }
        return 0;
    }
}


stat    :   expr NL     {System.out.println($expr.v);}
            | NL;

expr returns [int v]
            :   '(' expr ')'        {$v = $expr.v;}
            | <assoc=left> a=expr op=('*'|'/') b=expr  {$v = calc($a.v, $op.type, $b.v);}
            | <assoc=left> a=expr op=('+'|'-') b=expr  {$v = calc($a.v, $op.type, $b.v);}
            | INT                   {$v = $INT.int;}
            ;