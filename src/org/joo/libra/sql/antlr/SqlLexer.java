// Generated from /home/griever/Documents/javawork/libra/src/org/joo/libra/sql/antlr/SqlLexer.g4 by ANTLR 4.7

package org.joo.libra.sql.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, OR=2, NOT=3, IS_EQUALS=4, CONTAINS=5, MATCHES=6, TRUE=7, FALSE=8, 
		UNDEFINED=9, NULL=10, EMPTY=11, GREATER_THAN=12, GREATER_THAN_EQUALS=13, 
		LESS_THAN=14, LESS_THAN_EQUALS=15, EQUALS=16, NOT_EQUALS=17, DBL_EQUALS=18, 
		PLUS=19, MINUS=20, TIMES=21, DIVIDE=22, LPAREN=23, RPAREN=24, INTEGER=25, 
		DOUBLE=26, STRING=27, WS=28, VARIABLE=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"AND", "OR", "NOT", "IS_EQUALS", "CONTAINS", "MATCHES", "TRUE", "FALSE", 
		"UNDEFINED", "NULL", "EMPTY", "GREATER_THAN", "GREATER_THAN_EQUALS", "LESS_THAN", 
		"LESS_THAN_EQUALS", "EQUALS", "NOT_EQUALS", "DBL_EQUALS", "PLUS", "MINUS", 
		"TIMES", "DIVIDE", "LPAREN", "RPAREN", "INTEGER", "DOUBLE", "STRING", 
		"WS", "VARIABLE"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AND", "OR", "NOT", "IS_EQUALS", "CONTAINS", "MATCHES", "TRUE", 
		"FALSE", "UNDEFINED", "NULL", "EMPTY", "GREATER_THAN", "GREATER_THAN_EQUALS", 
		"LESS_THAN", "LESS_THAN_EQUALS", "EQUALS", "NOT_EQUALS", "DBL_EQUALS", 
		"PLUS", "MINUS", "TIMES", "DIVIDE", "LPAREN", "RPAREN", "INTEGER", "DOUBLE", 
		"STRING", "WS", "VARIABLE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public SqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SqlLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u00fe\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\5\2D\n\2\3\3\3\3\3\3\3\3\5\3J\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4R\n\4\3\5\3\5\3\5\3\5\5\5X\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6j\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7z\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0084"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0090\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a4"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ae\n\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ba\n\f\3\r\3\r\3\16\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\6\32\u00db"+
		"\n\32\r\32\16\32\u00dc\3\33\6\33\u00e0\n\33\r\33\16\33\u00e1\3\33\3\33"+
		"\6\33\u00e6\n\33\r\33\16\33\u00e7\3\34\3\34\7\34\u00ec\n\34\f\34\16\34"+
		"\u00ef\13\34\3\34\3\34\3\35\6\35\u00f4\n\35\r\35\16\35\u00f5\3\35\3\35"+
		"\3\36\6\36\u00fb\n\36\r\36\16\36\u00fc\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37\3\2\5\5\2\f\f\17\17))\4\2"+
		"\13\13\"\"\5\2C\\aac|\2\u010e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3C\3\2\2\2\5I\3\2\2\2\7Q\3\2\2\2\t"+
		"W\3\2\2\2\13i\3\2\2\2\ry\3\2\2\2\17\u0083\3\2\2\2\21\u008f\3\2\2\2\23"+
		"\u00a3\3\2\2\2\25\u00ad\3\2\2\2\27\u00b9\3\2\2\2\31\u00bb\3\2\2\2\33\u00bd"+
		"\3\2\2\2\35\u00c0\3\2\2\2\37\u00c2\3\2\2\2!\u00c5\3\2\2\2#\u00c7\3\2\2"+
		"\2%\u00ca\3\2\2\2\'\u00cd\3\2\2\2)\u00cf\3\2\2\2+\u00d1\3\2\2\2-\u00d3"+
		"\3\2\2\2/\u00d5\3\2\2\2\61\u00d7\3\2\2\2\63\u00da\3\2\2\2\65\u00df\3\2"+
		"\2\2\67\u00e9\3\2\2\29\u00f3\3\2\2\2;\u00fa\3\2\2\2=>\7C\2\2>?\7P\2\2"+
		"?D\7F\2\2@A\7c\2\2AB\7p\2\2BD\7f\2\2C=\3\2\2\2C@\3\2\2\2D\4\3\2\2\2EF"+
		"\7Q\2\2FJ\7T\2\2GH\7q\2\2HJ\7t\2\2IE\3\2\2\2IG\3\2\2\2J\6\3\2\2\2KL\7"+
		"P\2\2LM\7Q\2\2MR\7V\2\2NO\7p\2\2OP\7q\2\2PR\7v\2\2QK\3\2\2\2QN\3\2\2\2"+
		"R\b\3\2\2\2ST\7K\2\2TX\7U\2\2UV\7k\2\2VX\7u\2\2WS\3\2\2\2WU\3\2\2\2X\n"+
		"\3\2\2\2YZ\7E\2\2Z[\7Q\2\2[\\\7P\2\2\\]\7V\2\2]^\7C\2\2^_\7K\2\2_`\7P"+
		"\2\2`j\7U\2\2ab\7e\2\2bc\7q\2\2cd\7p\2\2de\7v\2\2ef\7c\2\2fg\7k\2\2gh"+
		"\7p\2\2hj\7u\2\2iY\3\2\2\2ia\3\2\2\2j\f\3\2\2\2kl\7O\2\2lm\7C\2\2mn\7"+
		"V\2\2no\7E\2\2op\7J\2\2pq\7G\2\2qz\7U\2\2rs\7o\2\2st\7c\2\2tu\7v\2\2u"+
		"v\7e\2\2vw\7j\2\2wx\7g\2\2xz\7u\2\2yk\3\2\2\2yr\3\2\2\2z\16\3\2\2\2{|"+
		"\7V\2\2|}\7T\2\2}~\7W\2\2~\u0084\7G\2\2\177\u0080\7v\2\2\u0080\u0081\7"+
		"t\2\2\u0081\u0082\7w\2\2\u0082\u0084\7g\2\2\u0083{\3\2\2\2\u0083\177\3"+
		"\2\2\2\u0084\20\3\2\2\2\u0085\u0086\7H\2\2\u0086\u0087\7C\2\2\u0087\u0088"+
		"\7N\2\2\u0088\u0089\7U\2\2\u0089\u0090\7G\2\2\u008a\u008b\7h\2\2\u008b"+
		"\u008c\7c\2\2\u008c\u008d\7n\2\2\u008d\u008e\7u\2\2\u008e\u0090\7g\2\2"+
		"\u008f\u0085\3\2\2\2\u008f\u008a\3\2\2\2\u0090\22\3\2\2\2\u0091\u0092"+
		"\7W\2\2\u0092\u0093\7P\2\2\u0093\u0094\7F\2\2\u0094\u0095\7G\2\2\u0095"+
		"\u0096\7H\2\2\u0096\u0097\7K\2\2\u0097\u0098\7P\2\2\u0098\u0099\7G\2\2"+
		"\u0099\u00a4\7F\2\2\u009a\u009b\7w\2\2\u009b\u009c\7p\2\2\u009c\u009d"+
		"\7f\2\2\u009d\u009e\7g\2\2\u009e\u009f\7h\2\2\u009f\u00a0\7k\2\2\u00a0"+
		"\u00a1\7p\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a4\7f\2\2\u00a3\u0091\3\2\2"+
		"\2\u00a3\u009a\3\2\2\2\u00a4\24\3\2\2\2\u00a5\u00a6\7P\2\2\u00a6\u00a7"+
		"\7W\2\2\u00a7\u00a8\7N\2\2\u00a8\u00ae\7N\2\2\u00a9\u00aa\7p\2\2\u00aa"+
		"\u00ab\7w\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ae\7n\2\2\u00ad\u00a5\3\2\2"+
		"\2\u00ad\u00a9\3\2\2\2\u00ae\26\3\2\2\2\u00af\u00b0\7G\2\2\u00b0\u00b1"+
		"\7O\2\2\u00b1\u00b2\7R\2\2\u00b2\u00b3\7V\2\2\u00b3\u00ba\7[\2\2\u00b4"+
		"\u00b5\7g\2\2\u00b5\u00b6\7o\2\2\u00b6\u00b7\7r\2\2\u00b7\u00b8\7v\2\2"+
		"\u00b8\u00ba\7{\2\2\u00b9\u00af\3\2\2\2\u00b9\u00b4\3\2\2\2\u00ba\30\3"+
		"\2\2\2\u00bb\u00bc\7@\2\2\u00bc\32\3\2\2\2\u00bd\u00be\7@\2\2\u00be\u00bf"+
		"\7?\2\2\u00bf\34\3\2\2\2\u00c0\u00c1\7>\2\2\u00c1\36\3\2\2\2\u00c2\u00c3"+
		"\7>\2\2\u00c3\u00c4\7?\2\2\u00c4 \3\2\2\2\u00c5\u00c6\7?\2\2\u00c6\"\3"+
		"\2\2\2\u00c7\u00c8\7#\2\2\u00c8\u00c9\7?\2\2\u00c9$\3\2\2\2\u00ca\u00cb"+
		"\7?\2\2\u00cb\u00cc\7?\2\2\u00cc&\3\2\2\2\u00cd\u00ce\7-\2\2\u00ce(\3"+
		"\2\2\2\u00cf\u00d0\7/\2\2\u00d0*\3\2\2\2\u00d1\u00d2\7,\2\2\u00d2,\3\2"+
		"\2\2\u00d3\u00d4\7\61\2\2\u00d4.\3\2\2\2\u00d5\u00d6\7*\2\2\u00d6\60\3"+
		"\2\2\2\u00d7\u00d8\7+\2\2\u00d8\62\3\2\2\2\u00d9\u00db\4\62;\2\u00da\u00d9"+
		"\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\64\3\2\2\2\u00de\u00e0\4\62;\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2\2"+
		"\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5"+
		"\7\60\2\2\u00e4\u00e6\4\62;\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2"+
		"\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\66\3\2\2\2\u00e9\u00ed"+
		"\7)\2\2\u00ea\u00ec\n\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2"+
		"\2\2\u00f0\u00f1\7)\2\2\u00f18\3\2\2\2\u00f2\u00f4\t\3\2\2\u00f3\u00f2"+
		"\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00f8\b\35\2\2\u00f8:\3\2\2\2\u00f9\u00fb\t\4\2\2"+
		"\u00fa\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd"+
		"\3\2\2\2\u00fd<\3\2\2\2\24\2CIQWiy\u0083\u008f\u00a3\u00ad\u00b9\u00dc"+
		"\u00e1\u00e7\u00ed\u00f5\u00fc\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}