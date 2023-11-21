grammar cc;

start   : hw EOF;

hw : hardware input outputs latches update simulate ;

hardware : '.hardware' IDENT;

input : '.inputs' IDENT+ ;

outputs : '.outputs' IDENT+ ;

latches : '.latches' (IDENT '->' IDENT)* ;

update : '.update' (IDENT '=' exp)* ;

exp : IDENT		    #Var
    | '!' exp		#Not
    | exp '&&' exp	#And
    | exp '||' exp	#Or
    | '(' exp ')'	#Paren
    |			    #Nothing
    ;

simulate : '.simulate' (signal '=' BOOLSQ)+  ;
signal : IDENT ;
BOOLSQ : (BOOLEAN)+ ;

BOOLEAN :    '0' | '1' ;

IDENT : [a-zA-Z] [a-zA-Z0-9]* ;

WHITESPACE : [ \t\n]+ -> skip;

COMMENT : '//' ~[\n]* -> skip;
LONGCOMMENT : '/*' (~[*] | '*'~[/])* '*/' -> skip;

