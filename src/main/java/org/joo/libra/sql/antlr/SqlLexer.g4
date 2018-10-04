lexer grammar SqlLexer;

@header {
package org.joo.libra.sql.antlr;
}

fragment Digit: 		'0'..'9' ;
fragment Alpha: 		'.' | '_' | 'A'..'Z' | 'a'..'z' ;

AND:					('AND' | 'and') ;
OR:						('OR' | 'or') ;
NOT:					('NOT' | 'not') ;

IS_EQUALS:				('IS' | 'is') ;
IS_EQUALS_NOT:			('IS NOT' | 'is not') ;
IS_EMPTY:				('IS EMPTY' | 'is empty') ;
IS_NOT_EMPTY:			('IS NOT EMPTY' | 'is not empty') ;
CONTAINS:				('CONTAINS' | 'contains') ;
IN:						('IN' | 'in') ;
MATCHES:				('MATCHES' | 'matches') ;
TRUE:					('TRUE' | 'true') ;
FALSE:					('FALSE' | 'false') ;
UNDEFINED:				('UNDEFINED' | 'undefined') ;
NULL:					('NULL' | 'null') ;

GREATER_THAN:			'>' ;
GREATER_THAN_EQUALS:	'>=' ;
LESS_THAN:				'<' ;
LESS_THAN_EQUALS:		'<=' ;
EQUALS:					'=' ;
NOT_EQUALS:				'!=' ;
DBL_EQUALS:				'==' ;
PLUS:					'+' ;
MINUS:					'-' ;
TIMES:					'*' ;
DIVIDE:					'/' ;
MOD:					'%' ;
POW:					'^' ;
QUESTION:				'?' ;
COLON:					':' ;
LPAREN:					'(' ;
RPAREN:					')' ;
LBRACK:					'{' ;
RBRACK:					'}' ;
COMMA:					',' ;
STRING:					'\'' ~('\r' | '\n' | '\'')* '\'' ;
INTEGER:				'-'* Digit+ ;
DOUBLE:					'-'* Digit+'.'Digit+ ;
INDEX:					'[' Digit+ ']' ;
VARIABLE:				Alpha+ (Alpha | Digit | INDEX)* ;
WS: 					(' ' | '\t')+ -> channel(HIDDEN) ;
