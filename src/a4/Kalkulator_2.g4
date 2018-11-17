grammar Kalkulator_2;
import Lexer;

@header {
package a4;
import java.util.*;
}

@parser::members {
    Map<String, Integer> memory = new HashMap<String, Integer>();

    int calc(int left, int op, int right) {

        switch (op) {
            case MUL : return left * right;
            case DIV : return left / right;
            case ADD : return left + right;
            case SUB : return left - right;
            case POW : return (int)Math.pow((double)left, (double)right);
            case BIG : return left > right ? 1 : 0;
            case SMA : return left < right ? 1 : 0;
            case EQU : return left == right ? 1 : 0;
        }
        return 0;
    }
}

prog    :   stat+              {System.out.println($stat.v);}
            ;

stat    :   expr NL             {System.out.println($expr.v);}
            | ID '=' expr NL    {memory.put($ID.text, $expr.v);}
            | 'clear' NL        {memory.clear();}
            | NL;

expr returns [int v]
            :   '(' expr ')'        {$v = $expr.v;}
            | <assoc=right> a=expr '^' b=expr           {$v = calc($a.v, $op.type, $b.v);}
            | a=expr op=('*'|'/') b=expr   {$v = calc($a.v, $op.type, $b.v);}
            | a=expr op=('+'|'-') b=expr   {$v = calc($a.v, $op.type, $b.v);}
            | a=expr op=('<'|'>') b=expr   {$v = calc($a.v, $op.type, $b.v);}
            | a=expr '==' b=expr    {$v = calc($a.v, $op.type, $b.v);}
            | INT                   {$v = $INT.int;}
            | ID                    {   String id = $ID.text;
                                        $v = memory.containsKey(id) ? memory.get(id) : 0;
                                    }
            | a=expr '?' b=expr ':' c=expr   {$v = $a.v == 1 ? $b.v : $c.v;}
            ;