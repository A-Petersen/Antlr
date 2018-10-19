lexer grammar IP;
PI      : IPPIECE '.' IPPIECE '.' IPPIECE '.' IPPIECE ;

WS      : [ \t\n\r]+ -> skip;
ABC     : [A-Z]+ -> skip;
ABCD    : [a-z]+ -> skip;

fragment IPPIECE :  [0-1]?[0-9]?[0-9] | [2][0-5][0-5];