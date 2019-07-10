lexer grammar SqlLexer;

//@header {
//package org.joo.libra.sql.antlr;
//}

import SqlLexerCommon;

WS: 					(' ' | '\t')+ -> channel(HIDDEN) ;
