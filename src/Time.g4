lexer grammar Time;
//END     : TIME+;
XYZ     : [xyz];
TIME    : HH ':' MM (':' MM)? ;
WS      : [ \t\n\r]+ -> skip;
ABC     : [A-Z]+ -> skip;
ABCD    : [a-z]+ -> skip;

fragment HH :  [0-1][0-9] | [2][0-3];
fragment MM :  [0-5][0-9];