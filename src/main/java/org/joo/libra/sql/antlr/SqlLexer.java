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
		PLUS=20, MINUS=21, TIMES=22, DIVIDE=23, LPAREN=24, RPAREN=25, STRING=26, 
		INTEGER=27, DOUBLE=28, VARIABLE=29, WS=30;
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
		"PLUS", "MINUS", "TIMES", "DIVIDE", "LPAREN", "RPAREN", "STRING", "Digit", 
		"Alpha", "INTEGER", "DOUBLE", "VARIABLE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AND", "OR", "NOT", "IS_EQUALS", "IS_EQUALS_NOT", "CONTAINS", "MATCHES", 
		"TRUE", "FALSE", "UNDEFINED", "NULL", "EMPTY", "GREATER_THAN", "GREATER_THAN_EQUALS", 
		"LESS_THAN", "LESS_THAN_EQUALS", "EQUALS", "NOT_EQUALS", "DBL_EQUALS", 
		"PLUS", "MINUS", "TIMES", "DIVIDE", "LPAREN", "RPAREN", "STRING", "INTEGER", 
		"DOUBLE", "VARIABLE", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u011d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\2\3\2\5\2J\n\2\3\3\3\3\3\3\3\3\5\3P\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4X\n\4\3\5\3\5\3\5\3\5\5\5^\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6l\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7~\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008e\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u0098\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a4\n"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\5\13\u00b8\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u00c2\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ce\n\r"+
		"\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\7\33\u00f0\n\33\f\33\16\33\u00f3\13\33\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\6\36\u00fc\n\36\r\36\16\36\u00fd\3\37\6\37\u0101"+
		"\n\37\r\37\16\37\u0102\3\37\3\37\6\37\u0107\n\37\r\37\16\37\u0108\3 \6"+
		" \u010c\n \r \16 \u010d\3 \3 \7 \u0112\n \f \16 \u0115\13 \3!\6!\u0118"+
		"\n!\r!\16!\u0119\3!\3!\2\2\"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\29\2;\35=\36?\37A \3\2\5\5\2\f\f\17\17))\6\2\60\60"+
		"C\\aac|\4\2\13\13\"\"\2\u012e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3I\3\2\2\2\5O\3\2\2\2\7W"+
		"\3\2\2\2\t]\3\2\2\2\13k\3\2\2\2\r}\3\2\2\2\17\u008d\3\2\2\2\21\u0097\3"+
		"\2\2\2\23\u00a3\3\2\2\2\25\u00b7\3\2\2\2\27\u00c1\3\2\2\2\31\u00cd\3\2"+
		"\2\2\33\u00cf\3\2\2\2\35\u00d1\3\2\2\2\37\u00d4\3\2\2\2!\u00d6\3\2\2\2"+
		"#\u00d9\3\2\2\2%\u00db\3\2\2\2\'\u00de\3\2\2\2)\u00e1\3\2\2\2+\u00e3\3"+
		"\2\2\2-\u00e5\3\2\2\2/\u00e7\3\2\2\2\61\u00e9\3\2\2\2\63\u00eb\3\2\2\2"+
		"\65\u00ed\3\2\2\2\67\u00f6\3\2\2\29\u00f8\3\2\2\2;\u00fb\3\2\2\2=\u0100"+
		"\3\2\2\2?\u010b\3\2\2\2A\u0117\3\2\2\2CD\7C\2\2DE\7P\2\2EJ\7F\2\2FG\7"+
		"c\2\2GH\7p\2\2HJ\7f\2\2IC\3\2\2\2IF\3\2\2\2J\4\3\2\2\2KL\7Q\2\2LP\7T\2"+
		"\2MN\7q\2\2NP\7t\2\2OK\3\2\2\2OM\3\2\2\2P\6\3\2\2\2QR\7P\2\2RS\7Q\2\2"+
		"SX\7V\2\2TU\7p\2\2UV\7q\2\2VX\7v\2\2WQ\3\2\2\2WT\3\2\2\2X\b\3\2\2\2YZ"+
		"\7K\2\2Z^\7U\2\2[\\\7k\2\2\\^\7u\2\2]Y\3\2\2\2][\3\2\2\2^\n\3\2\2\2_`"+
		"\7K\2\2`a\7U\2\2ab\7\"\2\2bc\7P\2\2cd\7Q\2\2dl\7V\2\2ef\7k\2\2fg\7u\2"+
		"\2gh\7\"\2\2hi\7p\2\2ij\7q\2\2jl\7v\2\2k_\3\2\2\2ke\3\2\2\2l\f\3\2\2\2"+
		"mn\7E\2\2no\7Q\2\2op\7P\2\2pq\7V\2\2qr\7C\2\2rs\7K\2\2st\7P\2\2t~\7U\2"+
		"\2uv\7e\2\2vw\7q\2\2wx\7p\2\2xy\7v\2\2yz\7c\2\2z{\7k\2\2{|\7p\2\2|~\7"+
		"u\2\2}m\3\2\2\2}u\3\2\2\2~\16\3\2\2\2\177\u0080\7O\2\2\u0080\u0081\7C"+
		"\2\2\u0081\u0082\7V\2\2\u0082\u0083\7E\2\2\u0083\u0084\7J\2\2\u0084\u0085"+
		"\7G\2\2\u0085\u008e\7U\2\2\u0086\u0087\7o\2\2\u0087\u0088\7c\2\2\u0088"+
		"\u0089\7v\2\2\u0089\u008a\7e\2\2\u008a\u008b\7j\2\2\u008b\u008c\7g\2\2"+
		"\u008c\u008e\7u\2\2\u008d\177\3\2\2\2\u008d\u0086\3\2\2\2\u008e\20\3\2"+
		"\2\2\u008f\u0090\7V\2\2\u0090\u0091\7T\2\2\u0091\u0092\7W\2\2\u0092\u0098"+
		"\7G\2\2\u0093\u0094\7v\2\2\u0094\u0095\7t\2\2\u0095\u0096\7w\2\2\u0096"+
		"\u0098\7g\2\2\u0097\u008f\3\2\2\2\u0097\u0093\3\2\2\2\u0098\22\3\2\2\2"+
		"\u0099\u009a\7H\2\2\u009a\u009b\7C\2\2\u009b\u009c\7N\2\2\u009c\u009d"+
		"\7U\2\2\u009d\u00a4\7G\2\2\u009e\u009f\7h\2\2\u009f\u00a0\7c\2\2\u00a0"+
		"\u00a1\7n\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a4\7g\2\2\u00a3\u0099\3\2\2"+
		"\2\u00a3\u009e\3\2\2\2\u00a4\24\3\2\2\2\u00a5\u00a6\7W\2\2\u00a6\u00a7"+
		"\7P\2\2\u00a7\u00a8\7F\2\2\u00a8\u00a9\7G\2\2\u00a9\u00aa\7H\2\2\u00aa"+
		"\u00ab\7K\2\2\u00ab\u00ac\7P\2\2\u00ac\u00ad\7G\2\2\u00ad\u00b8\7F\2\2"+
		"\u00ae\u00af\7w\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7f\2\2\u00b1\u00b2"+
		"\7g\2\2\u00b2\u00b3\7h\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7p\2\2\u00b5"+
		"\u00b6\7g\2\2\u00b6\u00b8\7f\2\2\u00b7\u00a5\3\2\2\2\u00b7\u00ae\3\2\2"+
		"\2\u00b8\26\3\2\2\2\u00b9\u00ba\7P\2\2\u00ba\u00bb\7W\2\2\u00bb\u00bc"+
		"\7N\2\2\u00bc\u00c2\7N\2\2\u00bd\u00be\7p\2\2\u00be\u00bf\7w\2\2\u00bf"+
		"\u00c0\7n\2\2\u00c0\u00c2\7n\2\2\u00c1\u00b9\3\2\2\2\u00c1\u00bd\3\2\2"+
		"\2\u00c2\30\3\2\2\2\u00c3\u00c4\7G\2\2\u00c4\u00c5\7O\2\2\u00c5\u00c6"+
		"\7R\2\2\u00c6\u00c7\7V\2\2\u00c7\u00ce\7[\2\2\u00c8\u00c9\7g\2\2\u00c9"+
		"\u00ca\7o\2\2\u00ca\u00cb\7r\2\2\u00cb\u00cc\7v\2\2\u00cc\u00ce\7{\2\2"+
		"\u00cd\u00c3\3\2\2\2\u00cd\u00c8\3\2\2\2\u00ce\32\3\2\2\2\u00cf\u00d0"+
		"\7@\2\2\u00d0\34\3\2\2\2\u00d1\u00d2\7@\2\2\u00d2\u00d3\7?\2\2\u00d3\36"+
		"\3\2\2\2\u00d4\u00d5\7>\2\2\u00d5 \3\2\2\2\u00d6\u00d7\7>\2\2\u00d7\u00d8"+
		"\7?\2\2\u00d8\"\3\2\2\2\u00d9\u00da\7?\2\2\u00da$\3\2\2\2\u00db\u00dc"+
		"\7#\2\2\u00dc\u00dd\7?\2\2\u00dd&\3\2\2\2\u00de\u00df\7?\2\2\u00df\u00e0"+
		"\7?\2\2\u00e0(\3\2\2\2\u00e1\u00e2\7-\2\2\u00e2*\3\2\2\2\u00e3\u00e4\7"+
		"/\2\2\u00e4,\3\2\2\2\u00e5\u00e6\7,\2\2\u00e6.\3\2\2\2\u00e7\u00e8\7\61"+
		"\2\2\u00e8\60\3\2\2\2\u00e9\u00ea\7*\2\2\u00ea\62\3\2\2\2\u00eb\u00ec"+
		"\7+\2\2\u00ec\64\3\2\2\2\u00ed\u00f1\7)\2\2\u00ee\u00f0\n\2\2\2\u00ef"+
		"\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\7)\2\2\u00f5"+
		"\66\3\2\2\2\u00f6\u00f7\4\62;\2\u00f78\3\2\2\2\u00f8\u00f9\t\3\2\2\u00f9"+
		":\3\2\2\2\u00fa\u00fc\5\67\34\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd\3\2\2"+
		"\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe<\3\2\2\2\u00ff\u0101"+
		"\5\67\34\2\u0100\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0100\3\2\2\2"+
		"\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\7\60\2\2\u0105\u0107"+
		"\5\67\34\2\u0106\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0106\3\2\2\2"+
		"\u0108\u0109\3\2\2\2\u0109>\3\2\2\2\u010a\u010c\59\35\2\u010b\u010a\3"+
		"\2\2\2\u010c\u010d\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u0113\3\2\2\2\u010f\u0112\59\35\2\u0110\u0112\5\67\34\2\u0111\u010f\3"+
		"\2\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114@\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0118\t\4\2\2"+
		"\u0117\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a"+
		"\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\b!\2\2\u011cB\3\2\2\2\27\2IO"+
		"W]k}\u008d\u0097\u00a3\u00b7\u00c1\u00cd\u00f1\u00fd\u0102\u0108\u010d"+
		"\u0111\u0113\u0119\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}