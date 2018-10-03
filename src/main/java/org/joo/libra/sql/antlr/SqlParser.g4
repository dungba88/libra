parser grammar SqlParser;

@header {
package org.joo.libra.sql.antlr;
}

options { tokenVocab=SqlLexer; }

predicate : expression	#expressionExpr
			;

expression : NOT inner=expression							#notExpr
			| left=expression AND right=expression			#andExpr
     		| left=expression OR right=expression			#orExpr
     		| term											#termExpr
     		;

term : left=factor op=GREATER_THAN right=factor				#compareExpr
       | left=factor op=GREATER_THAN_EQUALS right=factor	#compareExpr
       | left=factor op=LESS_THAN right=factor				#compareExpr
       | left=factor op=LESS_THAN_EQUALS right=factor		#compareExpr
       | left=factor op=EQUALS right=factor					#equalExpr
       | left=factor op=DBL_EQUALS right=factor				#equalExpr
       | left=factor op=NOT_EQUALS right=factor				#notEqualExpr
       | left=factor op=IS_EQUALS_NOT right=factor			#notEqualExpr
       | left=factor op=IS_EQUALS right=factor				#equalExpr
       | left=factor op=IS_EMPTY							#emptyExpr
       | left=factor op=IS_NOT_EMPTY						#emptyExpr
       | left=factor op=CONTAINS right=factor				#containsExpr
       | left=factor op=MATCHES right=factor				#matchesExpr
       | factor												#factorExpr
       ;

factor : DOUBLE										#numberExpr
	   | INTEGER									#numberExpr
       | STRING										#stringExpr
       | TRUE										#booleanExpr
       | FALSE										#booleanExpr
       | UNDEFINED									#nullExpr
       | NULL										#nullExpr
       | VARIABLE									#variableExpr
       | LPAREN expression RPAREN					#parenExpr
       | left=factor op=POW right=factor						#mathExpr
       | left=factor op=TIMES right=factor						#mathExpr
       | left=factor op=DIVIDE right=factor						#mathExpr
       | left=factor op=PLUS right=factor						#mathExpr
       | left=factor op=MINUS right=factor						#mathExpr
       | left=factor op=MOD right=factor						#mathExpr
       ;