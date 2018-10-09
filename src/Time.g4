grammar Time;
r       : TIME+;
TIME    : ([0-1][0-9] | [2][0-3]) ':' [0-5][0-9] (':' [0-5][0-9])? ;
WS      : [ \t\n\r]+ -> skip;
ABC     : [A-Z]+ -> skip;
ABCD    : [a-z]+ -> skip;