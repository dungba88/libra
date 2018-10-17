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
		WS=1, AND=2, OR=3, NOT=4, IS_EQUALS=5, IS_EQUALS_NOT=6, IS_EMPTY=7, IS_NOT_EMPTY=8, 
		CONTAINS=9, IN=10, MATCHES=11, TRUE=12, FALSE=13, UNDEFINED=14, NULL=15, 
		ANY=16, NONE=17, ALL=18, OF=19, SATISFIES=20, GREATER_THAN=21, GREATER_THAN_EQUALS=22, 
		LESS_THAN=23, LESS_THAN_EQUALS=24, EQUALS=25, NOT_EQUALS=26, DBL_EQUALS=27, 
		PLUS=28, MINUS=29, TIMES=30, DIVIDE=31, MOD=32, POW=33, QUESTION=34, COLON=35, 
		LPAREN=36, RPAREN=37, LBRACE=38, RBRACE=39, COMMA=40, STRING=41, INTEGER=42, 
		DOUBLE=43, INDEX=44, VARIABLE=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "Digit", "Alpha", "AND", "OR", "NOT", "IS_EQUALS", "IS_EQUALS_NOT", 
		"IS_EMPTY", "IS_NOT_EMPTY", "CONTAINS", "IN", "MATCHES", "TRUE", "FALSE", 
		"UNDEFINED", "NULL", "ANY", "NONE", "ALL", "OF", "SATISFIES", "GREATER_THAN", 
		"GREATER_THAN_EQUALS", "LESS_THAN", "LESS_THAN_EQUALS", "EQUALS", "NOT_EQUALS", 
		"DBL_EQUALS", "PLUS", "MINUS", "TIMES", "DIVIDE", "MOD", "POW", "QUESTION", 
		"COLON", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "COMMA", "STRING", "INTEGER", 
		"DOUBLE", "INDEX", "VARIABLE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "'>'", "'>='", "'<'", 
		"'<='", "'='", "'!='", "'=='", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", 
		"'?'", "':'", "'('", "')'", "'{'", "'}'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "AND", "OR", "NOT", "IS_EQUALS", "IS_EQUALS_NOT", "IS_EMPTY", 
		"IS_NOT_EMPTY", "CONTAINS", "IN", "MATCHES", "TRUE", "FALSE", "UNDEFINED", 
		"NULL", "ANY", "NONE", "ALL", "OF", "SATISFIES", "GREATER_THAN", "GREATER_THAN_EQUALS", 
		"LESS_THAN", "LESS_THAN_EQUALS", "EQUALS", "NOT_EQUALS", "DBL_EQUALS", 
		"PLUS", "MINUS", "TIMES", "DIVIDE", "MOD", "POW", "QUESTION", "COLON", 
		"LPAREN", "RPAREN", "LBRACE", "RBRACE", "COMMA", "STRING", "INTEGER", 
		"DOUBLE", "INDEX", "VARIABLE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u01b8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\6\2c\n\2\r\2\16\2d\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5s\n\5\3\6\3\6\3\6\3\6\5\6y\n\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7\u0081\n\7\3\b\3\b\3\b\3\b\5\b\u0087\n\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0095\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a7\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00c1\n\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00d3\n\f"+
		"\3\r\3\r\3\r\3\r\5\r\u00d9\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e9\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u00f3\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00ff\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0113\n\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u011d\n\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u0125\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u012f"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0137\n\25\3\26\3\26\3\26\3\26"+
		"\5\26\u013d\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0151\n\27\3\30\3\30\3\31\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3"+
		")\3)\3*\3*\3+\3+\3,\3,\7,\u0181\n,\f,\16,\u0184\13,\3,\3,\3-\7-\u0189"+
		"\n-\f-\16-\u018c\13-\3-\6-\u018f\n-\r-\16-\u0190\3.\7.\u0194\n.\f.\16"+
		".\u0197\13.\3.\6.\u019a\n.\r.\16.\u019b\3.\3.\6.\u01a0\n.\r.\16.\u01a1"+
		"\3/\3/\6/\u01a6\n/\r/\16/\u01a7\3/\3/\3\60\6\60\u01ad\n\60\r\60\16\60"+
		"\u01ae\3\60\3\60\3\60\7\60\u01b4\n\60\f\60\16\60\u01b7\13\60\2\2\61\3"+
		"\3\5\2\7\2\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17"+
		"!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36"+
		"?\37A C!E\"G#I$K%M&O\'Q(S)U*W+Y,[-]._/\3\2\5\4\2\13\13\"\"\6\2\60\60C"+
		"\\aac|\5\2\f\f\17\17))\2\u01d4\2\3\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\3b\3\2\2\2\5h\3\2\2\2\7j\3\2\2\2\tr\3\2\2\2\13x\3\2\2\2\r\u0080\3\2"+
		"\2\2\17\u0086\3\2\2\2\21\u0094\3\2\2\2\23\u00a6\3\2\2\2\25\u00c0\3\2\2"+
		"\2\27\u00d2\3\2\2\2\31\u00d8\3\2\2\2\33\u00e8\3\2\2\2\35\u00f2\3\2\2\2"+
		"\37\u00fe\3\2\2\2!\u0112\3\2\2\2#\u011c\3\2\2\2%\u0124\3\2\2\2\'\u012e"+
		"\3\2\2\2)\u0136\3\2\2\2+\u013c\3\2\2\2-\u0150\3\2\2\2/\u0152\3\2\2\2\61"+
		"\u0154\3\2\2\2\63\u0157\3\2\2\2\65\u0159\3\2\2\2\67\u015c\3\2\2\29\u015e"+
		"\3\2\2\2;\u0161\3\2\2\2=\u0164\3\2\2\2?\u0166\3\2\2\2A\u0168\3\2\2\2C"+
		"\u016a\3\2\2\2E\u016c\3\2\2\2G\u016e\3\2\2\2I\u0170\3\2\2\2K\u0172\3\2"+
		"\2\2M\u0174\3\2\2\2O\u0176\3\2\2\2Q\u0178\3\2\2\2S\u017a\3\2\2\2U\u017c"+
		"\3\2\2\2W\u017e\3\2\2\2Y\u018a\3\2\2\2[\u0195\3\2\2\2]\u01a3\3\2\2\2_"+
		"\u01ac\3\2\2\2ac\t\2\2\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2ef\3\2"+
		"\2\2fg\b\2\2\2g\4\3\2\2\2hi\4\62;\2i\6\3\2\2\2jk\t\3\2\2k\b\3\2\2\2lm"+
		"\7C\2\2mn\7P\2\2ns\7F\2\2op\7c\2\2pq\7p\2\2qs\7f\2\2rl\3\2\2\2ro\3\2\2"+
		"\2s\n\3\2\2\2tu\7Q\2\2uy\7T\2\2vw\7q\2\2wy\7t\2\2xt\3\2\2\2xv\3\2\2\2"+
		"y\f\3\2\2\2z{\7P\2\2{|\7Q\2\2|\u0081\7V\2\2}~\7p\2\2~\177\7q\2\2\177\u0081"+
		"\7v\2\2\u0080z\3\2\2\2\u0080}\3\2\2\2\u0081\16\3\2\2\2\u0082\u0083\7K"+
		"\2\2\u0083\u0087\7U\2\2\u0084\u0085\7k\2\2\u0085\u0087\7u\2\2\u0086\u0082"+
		"\3\2\2\2\u0086\u0084\3\2\2\2\u0087\20\3\2\2\2\u0088\u0089\7K\2\2\u0089"+
		"\u008a\7U\2\2\u008a\u008b\7\"\2\2\u008b\u008c\7P\2\2\u008c\u008d\7Q\2"+
		"\2\u008d\u0095\7V\2\2\u008e\u008f\7k\2\2\u008f\u0090\7u\2\2\u0090\u0091"+
		"\7\"\2\2\u0091\u0092\7p\2\2\u0092\u0093\7q\2\2\u0093\u0095\7v\2\2\u0094"+
		"\u0088\3\2\2\2\u0094\u008e\3\2\2\2\u0095\22\3\2\2\2\u0096\u0097\7K\2\2"+
		"\u0097\u0098\7U\2\2\u0098\u0099\7\"\2\2\u0099\u009a\7G\2\2\u009a\u009b"+
		"\7O\2\2\u009b\u009c\7R\2\2\u009c\u009d\7V\2\2\u009d\u00a7\7[\2\2\u009e"+
		"\u009f\7k\2\2\u009f\u00a0\7u\2\2\u00a0\u00a1\7\"\2\2\u00a1\u00a2\7g\2"+
		"\2\u00a2\u00a3\7o\2\2\u00a3\u00a4\7r\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a7"+
		"\7{\2\2\u00a6\u0096\3\2\2\2\u00a6\u009e\3\2\2\2\u00a7\24\3\2\2\2\u00a8"+
		"\u00a9\7K\2\2\u00a9\u00aa\7U\2\2\u00aa\u00ab\7\"\2\2\u00ab\u00ac\7P\2"+
		"\2\u00ac\u00ad\7Q\2\2\u00ad\u00ae\7V\2\2\u00ae\u00af\7\"\2\2\u00af\u00b0"+
		"\7G\2\2\u00b0\u00b1\7O\2\2\u00b1\u00b2\7R\2\2\u00b2\u00b3\7V\2\2\u00b3"+
		"\u00c1\7[\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7u\2\2\u00b6\u00b7\7\"\2"+
		"\2\u00b7\u00b8\7p\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb"+
		"\7\"\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7o\2\2\u00bd\u00be\7r\2\2\u00be"+
		"\u00bf\7v\2\2\u00bf\u00c1\7{\2\2\u00c0\u00a8\3\2\2\2\u00c0\u00b4\3\2\2"+
		"\2\u00c1\26\3\2\2\2\u00c2\u00c3\7E\2\2\u00c3\u00c4\7Q\2\2\u00c4\u00c5"+
		"\7P\2\2\u00c5\u00c6\7V\2\2\u00c6\u00c7\7C\2\2\u00c7\u00c8\7K\2\2\u00c8"+
		"\u00c9\7P\2\2\u00c9\u00d3\7U\2\2\u00ca\u00cb\7e\2\2\u00cb\u00cc\7q\2\2"+
		"\u00cc\u00cd\7p\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0"+
		"\7k\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d3\7u\2\2\u00d2\u00c2\3\2\2\2\u00d2"+
		"\u00ca\3\2\2\2\u00d3\30\3\2\2\2\u00d4\u00d5\7K\2\2\u00d5\u00d9\7P\2\2"+
		"\u00d6\u00d7\7k\2\2\u00d7\u00d9\7p\2\2\u00d8\u00d4\3\2\2\2\u00d8\u00d6"+
		"\3\2\2\2\u00d9\32\3\2\2\2\u00da\u00db\7O\2\2\u00db\u00dc\7C\2\2\u00dc"+
		"\u00dd\7V\2\2\u00dd\u00de\7E\2\2\u00de\u00df\7J\2\2\u00df\u00e0\7G\2\2"+
		"\u00e0\u00e9\7U\2\2\u00e1\u00e2\7o\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4"+
		"\7v\2\2\u00e4\u00e5\7e\2\2\u00e5\u00e6\7j\2\2\u00e6\u00e7\7g\2\2\u00e7"+
		"\u00e9\7u\2\2\u00e8\u00da\3\2\2\2\u00e8\u00e1\3\2\2\2\u00e9\34\3\2\2\2"+
		"\u00ea\u00eb\7V\2\2\u00eb\u00ec\7T\2\2\u00ec\u00ed\7W\2\2\u00ed\u00f3"+
		"\7G\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0\7t\2\2\u00f0\u00f1\7w\2\2\u00f1"+
		"\u00f3\7g\2\2\u00f2\u00ea\3\2\2\2\u00f2\u00ee\3\2\2\2\u00f3\36\3\2\2\2"+
		"\u00f4\u00f5\7H\2\2\u00f5\u00f6\7C\2\2\u00f6\u00f7\7N\2\2\u00f7\u00f8"+
		"\7U\2\2\u00f8\u00ff\7G\2\2\u00f9\u00fa\7h\2\2\u00fa\u00fb\7c\2\2\u00fb"+
		"\u00fc\7n\2\2\u00fc\u00fd\7u\2\2\u00fd\u00ff\7g\2\2\u00fe\u00f4\3\2\2"+
		"\2\u00fe\u00f9\3\2\2\2\u00ff \3\2\2\2\u0100\u0101\7W\2\2\u0101\u0102\7"+
		"P\2\2\u0102\u0103\7F\2\2\u0103\u0104\7G\2\2\u0104\u0105\7H\2\2\u0105\u0106"+
		"\7K\2\2\u0106\u0107\7P\2\2\u0107\u0108\7G\2\2\u0108\u0113\7F\2\2\u0109"+
		"\u010a\7w\2\2\u010a\u010b\7p\2\2\u010b\u010c\7f\2\2\u010c\u010d\7g\2\2"+
		"\u010d\u010e\7h\2\2\u010e\u010f\7k\2\2\u010f\u0110\7p\2\2\u0110\u0111"+
		"\7g\2\2\u0111\u0113\7f\2\2\u0112\u0100\3\2\2\2\u0112\u0109\3\2\2\2\u0113"+
		"\"\3\2\2\2\u0114\u0115\7P\2\2\u0115\u0116\7W\2\2\u0116\u0117\7N\2\2\u0117"+
		"\u011d\7N\2\2\u0118\u0119\7p\2\2\u0119\u011a\7w\2\2\u011a\u011b\7n\2\2"+
		"\u011b\u011d\7n\2\2\u011c\u0114\3\2\2\2\u011c\u0118\3\2\2\2\u011d$\3\2"+
		"\2\2\u011e\u011f\7C\2\2\u011f\u0120\7P\2\2\u0120\u0125\7[\2\2\u0121\u0122"+
		"\7c\2\2\u0122\u0123\7p\2\2\u0123\u0125\7{\2\2\u0124\u011e\3\2\2\2\u0124"+
		"\u0121\3\2\2\2\u0125&\3\2\2\2\u0126\u0127\7P\2\2\u0127\u0128\7Q\2\2\u0128"+
		"\u0129\7P\2\2\u0129\u012f\7G\2\2\u012a\u012b\7p\2\2\u012b\u012c\7q\2\2"+
		"\u012c\u012d\7p\2\2\u012d\u012f\7g\2\2\u012e\u0126\3\2\2\2\u012e\u012a"+
		"\3\2\2\2\u012f(\3\2\2\2\u0130\u0131\7C\2\2\u0131\u0132\7N\2\2\u0132\u0137"+
		"\7N\2\2\u0133\u0134\7c\2\2\u0134\u0135\7n\2\2\u0135\u0137\7n\2\2\u0136"+
		"\u0130\3\2\2\2\u0136\u0133\3\2\2\2\u0137*\3\2\2\2\u0138\u0139\7Q\2\2\u0139"+
		"\u013d\7H\2\2\u013a\u013b\7q\2\2\u013b\u013d\7h\2\2\u013c\u0138\3\2\2"+
		"\2\u013c\u013a\3\2\2\2\u013d,\3\2\2\2\u013e\u013f\7U\2\2\u013f\u0140\7"+
		"C\2\2\u0140\u0141\7V\2\2\u0141\u0142\7K\2\2\u0142\u0143\7U\2\2\u0143\u0144"+
		"\7H\2\2\u0144\u0145\7K\2\2\u0145\u0146\7G\2\2\u0146\u0151\7U\2\2\u0147"+
		"\u0148\7u\2\2\u0148\u0149\7c\2\2\u0149\u014a\7v\2\2\u014a\u014b\7k\2\2"+
		"\u014b\u014c\7u\2\2\u014c\u014d\7h\2\2\u014d\u014e\7k\2\2\u014e\u014f"+
		"\7g\2\2\u014f\u0151\7u\2\2\u0150\u013e\3\2\2\2\u0150\u0147\3\2\2\2\u0151"+
		".\3\2\2\2\u0152\u0153\7@\2\2\u0153\60\3\2\2\2\u0154\u0155\7@\2\2\u0155"+
		"\u0156\7?\2\2\u0156\62\3\2\2\2\u0157\u0158\7>\2\2\u0158\64\3\2\2\2\u0159"+
		"\u015a\7>\2\2\u015a\u015b\7?\2\2\u015b\66\3\2\2\2\u015c\u015d\7?\2\2\u015d"+
		"8\3\2\2\2\u015e\u015f\7#\2\2\u015f\u0160\7?\2\2\u0160:\3\2\2\2\u0161\u0162"+
		"\7?\2\2\u0162\u0163\7?\2\2\u0163<\3\2\2\2\u0164\u0165\7-\2\2\u0165>\3"+
		"\2\2\2\u0166\u0167\7/\2\2\u0167@\3\2\2\2\u0168\u0169\7,\2\2\u0169B\3\2"+
		"\2\2\u016a\u016b\7\61\2\2\u016bD\3\2\2\2\u016c\u016d\7\'\2\2\u016dF\3"+
		"\2\2\2\u016e\u016f\7`\2\2\u016fH\3\2\2\2\u0170\u0171\7A\2\2\u0171J\3\2"+
		"\2\2\u0172\u0173\7<\2\2\u0173L\3\2\2\2\u0174\u0175\7*\2\2\u0175N\3\2\2"+
		"\2\u0176\u0177\7+\2\2\u0177P\3\2\2\2\u0178\u0179\7}\2\2\u0179R\3\2\2\2"+
		"\u017a\u017b\7\177\2\2\u017bT\3\2\2\2\u017c\u017d\7.\2\2\u017dV\3\2\2"+
		"\2\u017e\u0182\7)\2\2\u017f\u0181\n\4\2\2\u0180\u017f\3\2\2\2\u0181\u0184"+
		"\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0185\3\2\2\2\u0184"+
		"\u0182\3\2\2\2\u0185\u0186\7)\2\2\u0186X\3\2\2\2\u0187\u0189\7/\2\2\u0188"+
		"\u0187\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2"+
		"\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u018f\5\5\3\2\u018e"+
		"\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2"+
		"\2\2\u0191Z\3\2\2\2\u0192\u0194\7/\2\2\u0193\u0192\3\2\2\2\u0194\u0197"+
		"\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0199\3\2\2\2\u0197"+
		"\u0195\3\2\2\2\u0198\u019a\5\5\3\2\u0199\u0198\3\2\2\2\u019a\u019b\3\2"+
		"\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\3\2\2\2\u019d"+
		"\u019f\7\60\2\2\u019e\u01a0\5\5\3\2\u019f\u019e\3\2\2\2\u01a0\u01a1\3"+
		"\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\\\3\2\2\2\u01a3\u01a5"+
		"\7]\2\2\u01a4\u01a6\5\5\3\2\u01a5\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7"+
		"\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\7_"+
		"\2\2\u01aa^\3\2\2\2\u01ab\u01ad\5\7\4\2\u01ac\u01ab\3\2\2\2\u01ad\u01ae"+
		"\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b5\3\2\2\2\u01b0"+
		"\u01b4\5\7\4\2\u01b1\u01b4\5\5\3\2\u01b2\u01b4\5]/\2\u01b3\u01b0\3\2\2"+
		"\2\u01b3\u01b1\3\2\2\2\u01b3\u01b2\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3"+
		"\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6`\3\2\2\2\u01b7\u01b5\3\2\2\2!\2drx"+
		"\u0080\u0086\u0094\u00a6\u00c0\u00d2\u00d8\u00e8\u00f2\u00fe\u0112\u011c"+
		"\u0124\u012e\u0136\u013c\u0150\u0182\u018a\u0190\u0195\u019b\u01a1\u01a7"+
		"\u01ae\u01b3\u01b5\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}