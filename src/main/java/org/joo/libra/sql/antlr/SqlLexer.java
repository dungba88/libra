// Generated from /home/griever/Documents/javawork/libra/src/main/java/org/joo/libra/sql/antlr/SqlLexer.g4 by ANTLR 4.7

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
		AND=1, OR=2, NOT=3, IS_EQUALS=4, IS_EQUALS_NOT=5, CONTAINS=6, MATCHES=7, 
		TRUE=8, FALSE=9, UNDEFINED=10, NULL=11, EMPTY=12, GREATER_THAN=13, GREATER_THAN_EQUALS=14, 
		LESS_THAN=15, LESS_THAN_EQUALS=16, EQUALS=17, NOT_EQUALS=18, DBL_EQUALS=19, 
		PLUS=20, MINUS=21, TIMES=22, DIVIDE=23, LPAREN=24, RPAREN=25, INTEGER=26, 
		DOUBLE=27, STRING=28, WS=29, VARIABLE=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"AND", "OR", "NOT", "IS_EQUALS", "IS_EQUALS_NOT", "CONTAINS", "MATCHES", 
		"TRUE", "FALSE", "UNDEFINED", "NULL", "EMPTY", "GREATER_THAN", "GREATER_THAN_EQUALS", 
		"LESS_THAN", "LESS_THAN_EQUALS", "EQUALS", "NOT_EQUALS", "DBL_EQUALS", 
		"PLUS", "MINUS", "TIMES", "DIVIDE", "LPAREN", "RPAREN", "INTEGER", "DOUBLE", 
		"STRING", "WS", "VARIABLE"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AND", "OR", "NOT", "IS_EQUALS", "IS_EQUALS_NOT", "CONTAINS", "MATCHES", 
		"TRUE", "FALSE", "UNDEFINED", "NULL", "EMPTY", "GREATER_THAN", "GREATER_THAN_EQUALS", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u010e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\5\2F\n\2\3\3\3\3\3\3\3\3\5\3L\n\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4T\n\4\3\5\3\5\3\5\3\5\5\5Z\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6h\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7z\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b\u008a\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0094"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a0\n\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\5\13\u00b4\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00be\n\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ca\n\r\3\16\3\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\6\33\u00eb\n\33\r\33\16\33\u00ec\3\34\6\34\u00f0\n\34\r\34\16\34\u00f1"+
		"\3\34\3\34\6\34\u00f6\n\34\r\34\16\34\u00f7\3\35\3\35\7\35\u00fc\n\35"+
		"\f\35\16\35\u00ff\13\35\3\35\3\35\3\36\6\36\u0104\n\36\r\36\16\36\u0105"+
		"\3\36\3\36\3\37\6\37\u010b\n\37\r\37\16\37\u010c\2\2 \3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= \3\2\5\5\2\f\f"+
		"\17\17))\4\2\13\13\"\"\6\2\60\60C\\aac|\2\u011f\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3E\3"+
		"\2\2\2\5K\3\2\2\2\7S\3\2\2\2\tY\3\2\2\2\13g\3\2\2\2\ry\3\2\2\2\17\u0089"+
		"\3\2\2\2\21\u0093\3\2\2\2\23\u009f\3\2\2\2\25\u00b3\3\2\2\2\27\u00bd\3"+
		"\2\2\2\31\u00c9\3\2\2\2\33\u00cb\3\2\2\2\35\u00cd\3\2\2\2\37\u00d0\3\2"+
		"\2\2!\u00d2\3\2\2\2#\u00d5\3\2\2\2%\u00d7\3\2\2\2\'\u00da\3\2\2\2)\u00dd"+
		"\3\2\2\2+\u00df\3\2\2\2-\u00e1\3\2\2\2/\u00e3\3\2\2\2\61\u00e5\3\2\2\2"+
		"\63\u00e7\3\2\2\2\65\u00ea\3\2\2\2\67\u00ef\3\2\2\29\u00f9\3\2\2\2;\u0103"+
		"\3\2\2\2=\u010a\3\2\2\2?@\7C\2\2@A\7P\2\2AF\7F\2\2BC\7c\2\2CD\7p\2\2D"+
		"F\7f\2\2E?\3\2\2\2EB\3\2\2\2F\4\3\2\2\2GH\7Q\2\2HL\7T\2\2IJ\7q\2\2JL\7"+
		"t\2\2KG\3\2\2\2KI\3\2\2\2L\6\3\2\2\2MN\7P\2\2NO\7Q\2\2OT\7V\2\2PQ\7p\2"+
		"\2QR\7q\2\2RT\7v\2\2SM\3\2\2\2SP\3\2\2\2T\b\3\2\2\2UV\7K\2\2VZ\7U\2\2"+
		"WX\7k\2\2XZ\7u\2\2YU\3\2\2\2YW\3\2\2\2Z\n\3\2\2\2[\\\7K\2\2\\]\7U\2\2"+
		"]^\7\"\2\2^_\7P\2\2_`\7Q\2\2`h\7V\2\2ab\7k\2\2bc\7u\2\2cd\7\"\2\2de\7"+
		"p\2\2ef\7q\2\2fh\7v\2\2g[\3\2\2\2ga\3\2\2\2h\f\3\2\2\2ij\7E\2\2jk\7Q\2"+
		"\2kl\7P\2\2lm\7V\2\2mn\7C\2\2no\7K\2\2op\7P\2\2pz\7U\2\2qr\7e\2\2rs\7"+
		"q\2\2st\7p\2\2tu\7v\2\2uv\7c\2\2vw\7k\2\2wx\7p\2\2xz\7u\2\2yi\3\2\2\2"+
		"yq\3\2\2\2z\16\3\2\2\2{|\7O\2\2|}\7C\2\2}~\7V\2\2~\177\7E\2\2\177\u0080"+
		"\7J\2\2\u0080\u0081\7G\2\2\u0081\u008a\7U\2\2\u0082\u0083\7o\2\2\u0083"+
		"\u0084\7c\2\2\u0084\u0085\7v\2\2\u0085\u0086\7e\2\2\u0086\u0087\7j\2\2"+
		"\u0087\u0088\7g\2\2\u0088\u008a\7u\2\2\u0089{\3\2\2\2\u0089\u0082\3\2"+
		"\2\2\u008a\20\3\2\2\2\u008b\u008c\7V\2\2\u008c\u008d\7T\2\2\u008d\u008e"+
		"\7W\2\2\u008e\u0094\7G\2\2\u008f\u0090\7v\2\2\u0090\u0091\7t\2\2\u0091"+
		"\u0092\7w\2\2\u0092\u0094\7g\2\2\u0093\u008b\3\2\2\2\u0093\u008f\3\2\2"+
		"\2\u0094\22\3\2\2\2\u0095\u0096\7H\2\2\u0096\u0097\7C\2\2\u0097\u0098"+
		"\7N\2\2\u0098\u0099\7U\2\2\u0099\u00a0\7G\2\2\u009a\u009b\7h\2\2\u009b"+
		"\u009c\7c\2\2\u009c\u009d\7n\2\2\u009d\u009e\7u\2\2\u009e\u00a0\7g\2\2"+
		"\u009f\u0095\3\2\2\2\u009f\u009a\3\2\2\2\u00a0\24\3\2\2\2\u00a1\u00a2"+
		"\7W\2\2\u00a2\u00a3\7P\2\2\u00a3\u00a4\7F\2\2\u00a4\u00a5\7G\2\2\u00a5"+
		"\u00a6\7H\2\2\u00a6\u00a7\7K\2\2\u00a7\u00a8\7P\2\2\u00a8\u00a9\7G\2\2"+
		"\u00a9\u00b4\7F\2\2\u00aa\u00ab\7w\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad"+
		"\7f\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7h\2\2\u00af\u00b0\7k\2\2\u00b0"+
		"\u00b1\7p\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b4\7f\2\2\u00b3\u00a1\3\2\2"+
		"\2\u00b3\u00aa\3\2\2\2\u00b4\26\3\2\2\2\u00b5\u00b6\7P\2\2\u00b6\u00b7"+
		"\7W\2\2\u00b7\u00b8\7N\2\2\u00b8\u00be\7N\2\2\u00b9\u00ba\7p\2\2\u00ba"+
		"\u00bb\7w\2\2\u00bb\u00bc\7n\2\2\u00bc\u00be\7n\2\2\u00bd\u00b5\3\2\2"+
		"\2\u00bd\u00b9\3\2\2\2\u00be\30\3\2\2\2\u00bf\u00c0\7G\2\2\u00c0\u00c1"+
		"\7O\2\2\u00c1\u00c2\7R\2\2\u00c2\u00c3\7V\2\2\u00c3\u00ca\7[\2\2\u00c4"+
		"\u00c5\7g\2\2\u00c5\u00c6\7o\2\2\u00c6\u00c7\7r\2\2\u00c7\u00c8\7v\2\2"+
		"\u00c8\u00ca\7{\2\2\u00c9\u00bf\3\2\2\2\u00c9\u00c4\3\2\2\2\u00ca\32\3"+
		"\2\2\2\u00cb\u00cc\7@\2\2\u00cc\34\3\2\2\2\u00cd\u00ce\7@\2\2\u00ce\u00cf"+
		"\7?\2\2\u00cf\36\3\2\2\2\u00d0\u00d1\7>\2\2\u00d1 \3\2\2\2\u00d2\u00d3"+
		"\7>\2\2\u00d3\u00d4\7?\2\2\u00d4\"\3\2\2\2\u00d5\u00d6\7?\2\2\u00d6$\3"+
		"\2\2\2\u00d7\u00d8\7#\2\2\u00d8\u00d9\7?\2\2\u00d9&\3\2\2\2\u00da\u00db"+
		"\7?\2\2\u00db\u00dc\7?\2\2\u00dc(\3\2\2\2\u00dd\u00de\7-\2\2\u00de*\3"+
		"\2\2\2\u00df\u00e0\7/\2\2\u00e0,\3\2\2\2\u00e1\u00e2\7,\2\2\u00e2.\3\2"+
		"\2\2\u00e3\u00e4\7\61\2\2\u00e4\60\3\2\2\2\u00e5\u00e6\7*\2\2\u00e6\62"+
		"\3\2\2\2\u00e7\u00e8\7+\2\2\u00e8\64\3\2\2\2\u00e9\u00eb\4\62;\2\u00ea"+
		"\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\66\3\2\2\2\u00ee\u00f0\4\62;\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1"+
		"\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f5\7\60\2\2\u00f4\u00f6\4\62;\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3"+
		"\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f88\3\2\2\2\u00f9\u00fd"+
		"\7)\2\2\u00fa\u00fc\n\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fd\3\2"+
		"\2\2\u0100\u0101\7)\2\2\u0101:\3\2\2\2\u0102\u0104\t\3\2\2\u0103\u0102"+
		"\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107\u0108\b\36\2\2\u0108<\3\2\2\2\u0109\u010b\t\4\2\2"+
		"\u010a\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d"+
		"\3\2\2\2\u010d>\3\2\2\2\25\2EKSYgy\u0089\u0093\u009f\u00b3\u00bd\u00c9"+
		"\u00ec\u00f1\u00f7\u00fd\u0105\u010c\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}