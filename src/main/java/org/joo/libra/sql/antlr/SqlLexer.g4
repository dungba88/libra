lexer grammar SqlLexer;

@header {
package org.joo.libra.sql.antlr;
}

AND:					('AND' | 'and') ;
OR:						('OR' | 'or') ;
NOT:					('NOT' | 'not') ;

IS_EQUALS:				('IS' | 'is') ;
IS_EQUALS_NOT:			('IS NOT' | 'is not') ;
CONTAINS:				('CONTAINS' | 'contains') ;
MATCHES:				('MATCHES' | 'matches') ;
TRUE:					('TRUE' | 'true') ;
FALSE:					('FALSE' | 'false') ;
UNDEFINED:				('UNDEFINED' | 'undefined') ;
NULL:					('NULL' | 'null') ;
EMPTY:					('EMPTY' | 'empty') ;

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
LPAREN:					'(' ;
RPAREN:					')' ;
INTEGER:				'0'..'9'+ ;
DOUBLE:					'0'..'9'+'.''0'..'9'+ ;
STRING:					'\'' ~('\r' | '\n' | '\'')* '\'' ;
WS: 					(' ' | '\t')+ -> channel(HIDDEN) ;
VARIABLE:				[a-zA-Z_]+ ;
