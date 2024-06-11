grammar gramatica;

program
    : expression* EOF
    ;

expression
    : termo1=termo (operator outroTermo+=termo)*
    ;

//expressionVariable
//    : type ID '=' fator ';'
//    ; 
//
//expressionOperation
//    : ID '=' termo ';' 
//    ;

termo
    : fator1=fator (operator outroFator+=fator)* 
    ;
   

operator
    : '*' | '/' | '+' | '-' | '%'
    ;

fator:
    '(' expression ')'
    | algo
    ;

algo
    : DOUBLE
//    | BOOL 
//    | FLOAT 
//    | ID
//    | INT
    ;

type
    : 'int'
    | 'float'
    | 'double'
    ;

ID : [a-zA-Z]+ [a-zA-Z0-9]* ;
INT : [0-9]+ ;
BOOL : 'true' | 'false' ;
FLOAT : [0-9]+ '.' [0-9]+ ;
DOUBLE : [0-9]+ ('.' [0-9]+)? ;
WS : [ \t\r\n]+ -> skip ;

