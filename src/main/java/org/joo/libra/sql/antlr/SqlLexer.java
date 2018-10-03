// Generated from SqlLexer.g4 by ANTLR 4.7.1

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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, OR=2, NOT=3, IS_EQUALS=4, IS_EQUALS_NOT=5, IS_EMPTY=6, IS_NOT_EMPTY=7, 
		CONTAINS=8, IN=9, MATCHES=10, TRUE=11, FALSE=12, UNDEFINED=13, NULL=14, 
		GREATER_THAN=15, GREATER_THAN_EQUALS=16, LESS_THAN=17, LESS_THAN_EQUALS=18, 
		EQUALS=19, NOT_EQUALS=20, DBL_EQUALS=21, PLUS=22, MINUS=23, TIMES=24, 
		DIVIDE=25, MOD=26, POW=27, SQRT=28, QUESTION=29, COLON=30, LPAREN=31, 
		RPAREN=32, LBRACK=33, RBRACK=34, COMMA=35, STRING=36, INTEGER=37, DOUBLE=38, 
		INDEX=39, VARIABLE=40, WS=41;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Digit", "Alpha", "AND", "OR", "NOT", "IS_EQUALS", "IS_EQUALS_NOT", "IS_EMPTY", 
		"IS_NOT_EMPTY", "CONTAINS", "IN", "MATCHES", "TRUE", "FALSE", "UNDEFINED", 
		"NULL", "GREATER_THAN", "GREATER_THAN_EQUALS", "LESS_THAN", "LESS_THAN_EQUALS", 
		"EQUALS", "NOT_EQUALS", "DBL_EQUALS", "PLUS", "MINUS", "TIMES", "DIVIDE", 
		"MOD", "POW", "SQRT", "QUESTION", "COLON", "LPAREN", "RPAREN", "LBRACK", 
		"RBRACK", "COMMA", "STRING", "INTEGER", "DOUBLE", "INDEX", "VARIABLE", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "'>'", "'>='", "'<'", "'<='", "'='", "'!='", "'=='", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'^'", null, "'?'", "':'", "'('", "')'", 
		"'['", "']'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AND", "OR", "NOT", "IS_EQUALS", "IS_EQUALS_NOT", "IS_EMPTY", "IS_NOT_EMPTY", 
		"CONTAINS", "IN", "MATCHES", "TRUE", "FALSE", "UNDEFINED", "NULL", "GREATER_THAN", 
		"GREATER_THAN_EQUALS", "LESS_THAN", "LESS_THAN_EQUALS", "EQUALS", "NOT_EQUALS", 
		"DBL_EQUALS", "PLUS", "MINUS", "TIMES", "DIVIDE", "MOD", "POW", "SQRT", 
		"QUESTION", "COLON", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "COMMA", 
		"STRING", "INTEGER", "DOUBLE", "INDEX", "VARIABLE", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u0186\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4d\n\4\3\5\3\5\3\5\3\5"+
		"\5\5j\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6r\n\6\3\7\3\7\3\7\3\7\5\7x\n\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0086\n\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0098\n\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b2\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00c4\n\13\3\f\3"+
		"\f\3\f\3\f\5\f\u00ca\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u00da\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00e4\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00f0"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u0104\n\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u010e\n\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u0136\n\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'"+
		"\3\'\7\'\u0148\n\'\f\'\16\'\u014b\13\'\3\'\3\'\3(\7(\u0150\n(\f(\16(\u0153"+
		"\13(\3(\6(\u0156\n(\r(\16(\u0157\3)\7)\u015b\n)\f)\16)\u015e\13)\3)\6"+
		")\u0161\n)\r)\16)\u0162\3)\3)\6)\u0167\n)\r)\16)\u0168\3*\3*\6*\u016d"+
		"\n*\r*\16*\u016e\3*\3*\3+\6+\u0174\n+\r+\16+\u0175\3+\3+\3+\7+\u017b\n"+
		"+\f+\16+\u017e\13+\3,\6,\u0181\n,\r,\16,\u0182\3,\3,\2\2-\3\2\5\2\7\3"+
		"\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21"+
		"%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!"+
		"E\"G#I$K%M&O\'Q(S)U*W+\3\2\5\6\2\60\60C\\aac|\5\2\f\f\17\17))\4\2\13\13"+
		"\"\"\2\u019e\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\3Y\3\2\2\2\5[\3\2\2\2\7c\3\2\2\2\ti\3\2\2\2\13q\3\2\2\2\rw\3"+
		"\2\2\2\17\u0085\3\2\2\2\21\u0097\3\2\2\2\23\u00b1\3\2\2\2\25\u00c3\3\2"+
		"\2\2\27\u00c9\3\2\2\2\31\u00d9\3\2\2\2\33\u00e3\3\2\2\2\35\u00ef\3\2\2"+
		"\2\37\u0103\3\2\2\2!\u010d\3\2\2\2#\u010f\3\2\2\2%\u0111\3\2\2\2\'\u0114"+
		"\3\2\2\2)\u0116\3\2\2\2+\u0119\3\2\2\2-\u011b\3\2\2\2/\u011e\3\2\2\2\61"+
		"\u0121\3\2\2\2\63\u0123\3\2\2\2\65\u0125\3\2\2\2\67\u0127\3\2\2\29\u0129"+
		"\3\2\2\2;\u012b\3\2\2\2=\u0135\3\2\2\2?\u0137\3\2\2\2A\u0139\3\2\2\2C"+
		"\u013b\3\2\2\2E\u013d\3\2\2\2G\u013f\3\2\2\2I\u0141\3\2\2\2K\u0143\3\2"+
		"\2\2M\u0145\3\2\2\2O\u0151\3\2\2\2Q\u015c\3\2\2\2S\u016a\3\2\2\2U\u0173"+
		"\3\2\2\2W\u0180\3\2\2\2YZ\4\62;\2Z\4\3\2\2\2[\\\t\2\2\2\\\6\3\2\2\2]^"+
		"\7C\2\2^_\7P\2\2_d\7F\2\2`a\7c\2\2ab\7p\2\2bd\7f\2\2c]\3\2\2\2c`\3\2\2"+
		"\2d\b\3\2\2\2ef\7Q\2\2fj\7T\2\2gh\7q\2\2hj\7t\2\2ie\3\2\2\2ig\3\2\2\2"+
		"j\n\3\2\2\2kl\7P\2\2lm\7Q\2\2mr\7V\2\2no\7p\2\2op\7q\2\2pr\7v\2\2qk\3"+
		"\2\2\2qn\3\2\2\2r\f\3\2\2\2st\7K\2\2tx\7U\2\2uv\7k\2\2vx\7u\2\2ws\3\2"+
		"\2\2wu\3\2\2\2x\16\3\2\2\2yz\7K\2\2z{\7U\2\2{|\7\"\2\2|}\7P\2\2}~\7Q\2"+
		"\2~\u0086\7V\2\2\177\u0080\7k\2\2\u0080\u0081\7u\2\2\u0081\u0082\7\"\2"+
		"\2\u0082\u0083\7p\2\2\u0083\u0084\7q\2\2\u0084\u0086\7v\2\2\u0085y\3\2"+
		"\2\2\u0085\177\3\2\2\2\u0086\20\3\2\2\2\u0087\u0088\7K\2\2\u0088\u0089"+
		"\7U\2\2\u0089\u008a\7\"\2\2\u008a\u008b\7G\2\2\u008b\u008c\7O\2\2\u008c"+
		"\u008d\7R\2\2\u008d\u008e\7V\2\2\u008e\u0098\7[\2\2\u008f\u0090\7k\2\2"+
		"\u0090\u0091\7u\2\2\u0091\u0092\7\"\2\2\u0092\u0093\7g\2\2\u0093\u0094"+
		"\7o\2\2\u0094\u0095\7r\2\2\u0095\u0096\7v\2\2\u0096\u0098\7{\2\2\u0097"+
		"\u0087\3\2\2\2\u0097\u008f\3\2\2\2\u0098\22\3\2\2\2\u0099\u009a\7K\2\2"+
		"\u009a\u009b\7U\2\2\u009b\u009c\7\"\2\2\u009c\u009d\7P\2\2\u009d\u009e"+
		"\7Q\2\2\u009e\u009f\7V\2\2\u009f\u00a0\7\"\2\2\u00a0\u00a1\7G\2\2\u00a1"+
		"\u00a2\7O\2\2\u00a2\u00a3\7R\2\2\u00a3\u00a4\7V\2\2\u00a4\u00b2\7[\2\2"+
		"\u00a5\u00a6\7k\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8\7\"\2\2\u00a8\u00a9"+
		"\7p\2\2\u00a9\u00aa\7q\2\2\u00aa\u00ab\7v\2\2\u00ab\u00ac\7\"\2\2\u00ac"+
		"\u00ad\7g\2\2\u00ad\u00ae\7o\2\2\u00ae\u00af\7r\2\2\u00af\u00b0\7v\2\2"+
		"\u00b0\u00b2\7{\2\2\u00b1\u0099\3\2\2\2\u00b1\u00a5\3\2\2\2\u00b2\24\3"+
		"\2\2\2\u00b3\u00b4\7E\2\2\u00b4\u00b5\7Q\2\2\u00b5\u00b6\7P\2\2\u00b6"+
		"\u00b7\7V\2\2\u00b7\u00b8\7C\2\2\u00b8\u00b9\7K\2\2\u00b9\u00ba\7P\2\2"+
		"\u00ba\u00c4\7U\2\2\u00bb\u00bc\7e\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be"+
		"\7p\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7k\2\2\u00c1"+
		"\u00c2\7p\2\2\u00c2\u00c4\7u\2\2\u00c3\u00b3\3\2\2\2\u00c3\u00bb\3\2\2"+
		"\2\u00c4\26\3\2\2\2\u00c5\u00c6\7K\2\2\u00c6\u00ca\7P\2\2\u00c7\u00c8"+
		"\7k\2\2\u00c8\u00ca\7p\2\2\u00c9\u00c5\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca"+
		"\30\3\2\2\2\u00cb\u00cc\7O\2\2\u00cc\u00cd\7C\2\2\u00cd\u00ce\7V\2\2\u00ce"+
		"\u00cf\7E\2\2\u00cf\u00d0\7J\2\2\u00d0\u00d1\7G\2\2\u00d1\u00da\7U\2\2"+
		"\u00d2\u00d3\7o\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6"+
		"\7e\2\2\u00d6\u00d7\7j\2\2\u00d7\u00d8\7g\2\2\u00d8\u00da\7u\2\2\u00d9"+
		"\u00cb\3\2\2\2\u00d9\u00d2\3\2\2\2\u00da\32\3\2\2\2\u00db\u00dc\7V\2\2"+
		"\u00dc\u00dd\7T\2\2\u00dd\u00de\7W\2\2\u00de\u00e4\7G\2\2\u00df\u00e0"+
		"\7v\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7w\2\2\u00e2\u00e4\7g\2\2\u00e3"+
		"\u00db\3\2\2\2\u00e3\u00df\3\2\2\2\u00e4\34\3\2\2\2\u00e5\u00e6\7H\2\2"+
		"\u00e6\u00e7\7C\2\2\u00e7\u00e8\7N\2\2\u00e8\u00e9\7U\2\2\u00e9\u00f0"+
		"\7G\2\2\u00ea\u00eb\7h\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7n\2\2\u00ed"+
		"\u00ee\7u\2\2\u00ee\u00f0\7g\2\2\u00ef\u00e5\3\2\2\2\u00ef\u00ea\3\2\2"+
		"\2\u00f0\36\3\2\2\2\u00f1\u00f2\7W\2\2\u00f2\u00f3\7P\2\2\u00f3\u00f4"+
		"\7F\2\2\u00f4\u00f5\7G\2\2\u00f5\u00f6\7H\2\2\u00f6\u00f7\7K\2\2\u00f7"+
		"\u00f8\7P\2\2\u00f8\u00f9\7G\2\2\u00f9\u0104\7F\2\2\u00fa\u00fb\7w\2\2"+
		"\u00fb\u00fc\7p\2\2\u00fc\u00fd\7f\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff"+
		"\7h\2\2\u00ff\u0100\7k\2\2\u0100\u0101\7p\2\2\u0101\u0102\7g\2\2\u0102"+
		"\u0104\7f\2\2\u0103\u00f1\3\2\2\2\u0103\u00fa\3\2\2\2\u0104 \3\2\2\2\u0105"+
		"\u0106\7P\2\2\u0106\u0107\7W\2\2\u0107\u0108\7N\2\2\u0108\u010e\7N\2\2"+
		"\u0109\u010a\7p\2\2\u010a\u010b\7w\2\2\u010b\u010c\7n\2\2\u010c\u010e"+
		"\7n\2\2\u010d\u0105\3\2\2\2\u010d\u0109\3\2\2\2\u010e\"\3\2\2\2\u010f"+
		"\u0110\7@\2\2\u0110$\3\2\2\2\u0111\u0112\7@\2\2\u0112\u0113\7?\2\2\u0113"+
		"&\3\2\2\2\u0114\u0115\7>\2\2\u0115(\3\2\2\2\u0116\u0117\7>\2\2\u0117\u0118"+
		"\7?\2\2\u0118*\3\2\2\2\u0119\u011a\7?\2\2\u011a,\3\2\2\2\u011b\u011c\7"+
		"#\2\2\u011c\u011d\7?\2\2\u011d.\3\2\2\2\u011e\u011f\7?\2\2\u011f\u0120"+
		"\7?\2\2\u0120\60\3\2\2\2\u0121\u0122\7-\2\2\u0122\62\3\2\2\2\u0123\u0124"+
		"\7/\2\2\u0124\64\3\2\2\2\u0125\u0126\7,\2\2\u0126\66\3\2\2\2\u0127\u0128"+
		"\7\61\2\2\u01288\3\2\2\2\u0129\u012a\7\'\2\2\u012a:\3\2\2\2\u012b\u012c"+
		"\7`\2\2\u012c<\3\2\2\2\u012d\u012e\7U\2\2\u012e\u012f\7S\2\2\u012f\u0130"+
		"\7T\2\2\u0130\u0136\7V\2\2\u0131\u0132\7u\2\2\u0132\u0133\7s\2\2\u0133"+
		"\u0134\7t\2\2\u0134\u0136\7v\2\2\u0135\u012d\3\2\2\2\u0135\u0131\3\2\2"+
		"\2\u0136>\3\2\2\2\u0137\u0138\7A\2\2\u0138@\3\2\2\2\u0139\u013a\7<\2\2"+
		"\u013aB\3\2\2\2\u013b\u013c\7*\2\2\u013cD\3\2\2\2\u013d\u013e\7+\2\2\u013e"+
		"F\3\2\2\2\u013f\u0140\7]\2\2\u0140H\3\2\2\2\u0141\u0142\7_\2\2\u0142J"+
		"\3\2\2\2\u0143\u0144\7.\2\2\u0144L\3\2\2\2\u0145\u0149\7)\2\2\u0146\u0148"+
		"\n\3\2\2\u0147\u0146\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014d\7)"+
		"\2\2\u014dN\3\2\2\2\u014e\u0150\7/\2\2\u014f\u014e\3\2\2\2\u0150\u0153"+
		"\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0155\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0154\u0156\5\3\2\2\u0155\u0154\3\2\2\2\u0156\u0157\3\2"+
		"\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158P\3\2\2\2\u0159\u015b"+
		"\7/\2\2\u015a\u0159\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c"+
		"\u015d\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0161\5\3"+
		"\2\2\u0160\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0160\3\2\2\2\u0162"+
		"\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166\7\60\2\2\u0165\u0167\5"+
		"\3\2\2\u0166\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0166\3\2\2\2\u0168"+
		"\u0169\3\2\2\2\u0169R\3\2\2\2\u016a\u016c\7]\2\2\u016b\u016d\5\3\2\2\u016c"+
		"\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2"+
		"\2\2\u016f\u0170\3\2\2\2\u0170\u0171\7_\2\2\u0171T\3\2\2\2\u0172\u0174"+
		"\5\5\3\2\u0173\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0173\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176\u017c\3\2\2\2\u0177\u017b\5\5\3\2\u0178\u017b\5\3"+
		"\2\2\u0179\u017b\5S*\2\u017a\u0177\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u0179"+
		"\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d"+
		"V\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0181\t\4\2\2\u0180\u017f\3\2\2\2"+
		"\u0181\u0182\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184"+
		"\3\2\2\2\u0184\u0185\b,\2\2\u0185X\3\2\2\2\35\2ciqw\u0085\u0097\u00b1"+
		"\u00c3\u00c9\u00d9\u00e3\u00ef\u0103\u010d\u0135\u0149\u0151\u0157\u015c"+
		"\u0162\u0168\u016e\u0175\u017a\u017c\u0182\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}