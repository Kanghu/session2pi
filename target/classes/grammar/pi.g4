grammar pi;

/**
 * Parser rules
 */
expression             : proc | value;

proc                   : EMPTY                                                                       /* Empty process */
                       | REPL proc                                                                   /* Replication */
                       | NEW name ',' name IN proc                                                   /* Fresh channel */
                       | proc AND proc                                                               /* Composition */
                       | output                                                                      /* Output */
                       | input                                                                       /* Input */
                       | branch                                                                      /* Branch */
                       | select                                                                      /* Select */
                       | conditional                                                                 /* Conditional */
                       | subproc
                       | LET name '=' value IN proc;

output                 : name SEND value CONTINUE proc;

input                  : name RECV name CONTINUE proc;

branch                 : name BRANCH '{' (num ':' proc ',' WHITESPACE?)* (num ':' proc) '}';

select                 : name SELECT num CONTINUE proc;

conditional            : IF bool THEN proc ELSE proc;

subproc                : '(' proc ')';

tuple               : '[' (value WITH WHITESPACE? )* value ']';

value               : (bool | name | num |
                       arithExpr | logicExpr |
                       pair | pairExpr |
                       list | subval);

arithExpr           : (name) ('+' | '-' | '/' | '*') (name | value);

logicExpr           : name '=' value;

pairExpr            : (FST | SND) '(' value ')';

pair                : '(' value ',' value ')';

name                : LIT (LIT | num)*;

bool                : (TRUE | FALSE);

num                 : '-'? INT+;

list                : CONS '(' value WITH list ')' | NIL;

subval              : '(' value ')';

/*
 * Lexer Rules
 */
WHITESPACE          : (' ' | '\t') -> channel(HIDDEN);
NEWLINE             : ('\r'? '\n' | '\r')+ -> channel(HIDDEN);
EMPTY               : 'O';

RECV                : '?';
SEND                : '!';
REPL                : '*';
NEW                 : 'new';
IN                  : 'in';
IF                  : 'if';
THEN                : 'then';
ELSE                : 'else';
AND                 : WHITESPACE? '|' WHITESPACE? ;
CONTINUE            : '.';
WITH                : ',';

FST                 : 'fst';
SND                 : 'snd';
CONS                : 'cons';
NIL                 : 'nil';

LET                 : 'let';

BRANCH              : '>';
SELECT              : '<';

INT                 : [0-9];
LIT                 : [a-z];
TRUE                : 'true';
FALSE               : 'false';



