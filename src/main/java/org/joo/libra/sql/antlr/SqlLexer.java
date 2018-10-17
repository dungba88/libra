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
		GREATER_THAN=16, GREATER_THAN_EQUALS=17, LESS_THAN=18, LESS_THAN_EQUALS=19, 
		EQUALS=20, NOT_EQUALS=21, DBL_EQUALS=22, PLUS=23, MINUS=24, TIMES=25, 
		DIVIDE=26, MOD=27, POW=28, QUESTION=29, COLON=30, LPAREN=31, RPAREN=32, 
		LBRACE=33, RBRACE=34, COMMA=35, STRING=36, INTEGER=37, DOUBLE=38, INDEX=39, 
		VARIABLE=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "Digit", "Alpha", "AND", "OR", "NOT", "IS_EQUALS", "IS_EQUALS_NOT", 
		"IS_EMPTY", "IS_NOT_EMPTY", "CONTAINS", "IN", "MATCHES", "TRUE", "FALSE", 
		"UNDEFINED", "NULL", "GREATER_THAN", "GREATER_THAN_EQUALS", "LESS_THAN", 
		"LESS_THAN_EQUALS", "EQUALS", "NOT_EQUALS", "DBL_EQUALS", "PLUS", "MINUS", 
		"TIMES", "DIVIDE", "MOD", "POW", "QUESTION", "COLON", "LPAREN", "RPAREN", 
		"LBRACE", "RBRACE", "COMMA", "STRING", "INTEGER", "DOUBLE", "INDEX", "VARIABLE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "'>'", "'>='", "'<'", "'<='", "'='", "'!='", "'=='", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'?'", "':'", "'('", "')'", 
		"'{'", "'}'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "AND", "OR", "NOT", "IS_EQUALS", "IS_EQUALS_NOT", "IS_EMPTY", 
		"IS_NOT_EMPTY", "CONTAINS", "IN", "MATCHES", "TRUE", "FALSE", "UNDEFINED", 
		"NULL", "GREATER_THAN", "GREATER_THAN_EQUALS", "LESS_THAN", "LESS_THAN_EQUALS", 
		"EQUALS", "NOT_EQUALS", "DBL_EQUALS", "PLUS", "MINUS", "TIMES", "DIVIDE", 
		"MOD", "POW", "QUESTION", "COLON", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
		"COMMA", "STRING", "INTEGER", "DOUBLE", "INDEX", "VARIABLE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u017a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\6\2Y\n\2\r\2\16\2Z\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5i\n\5\3\6\3\6\3\6\3\6\5\6o\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7w\n\7\3"+
		"\b\3\b\3\b\3\b\5\b}\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u008b\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u009d\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u00b7\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\5\f\u00c9\n\f\3\r\3\r\3\r\3\r\5\r\u00cf\n\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00df"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00e9\n\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00f5\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u0109\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0113"+
		"\n\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\7"+
		"\'\u0143\n\'\f\'\16\'\u0146\13\'\3\'\3\'\3(\7(\u014b\n(\f(\16(\u014e\13"+
		"(\3(\6(\u0151\n(\r(\16(\u0152\3)\7)\u0156\n)\f)\16)\u0159\13)\3)\6)\u015c"+
		"\n)\r)\16)\u015d\3)\3)\6)\u0162\n)\r)\16)\u0163\3*\3*\6*\u0168\n*\r*\16"+
		"*\u0169\3*\3*\3+\6+\u016f\n+\r+\16+\u0170\3+\3+\3+\7+\u0176\n+\f+\16+"+
		"\u0179\13+\2\2,\3\3\5\2\7\2\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31"+
		"\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32"+
		"\67\339\34;\35=\36?\37A C!E\"G#I$K%M&O\'Q(S)U*\3\2\5\4\2\13\13\"\"\6\2"+
		"\60\60C\\aac|\5\2\f\f\17\17))\2\u0191\2\3\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\3X\3\2\2\2\5^\3\2\2\2\7`\3\2\2\2\th\3\2\2\2\13n\3"+
		"\2\2\2\rv\3\2\2\2\17|\3\2\2\2\21\u008a\3\2\2\2\23\u009c\3\2\2\2\25\u00b6"+
		"\3\2\2\2\27\u00c8\3\2\2\2\31\u00ce\3\2\2\2\33\u00de\3\2\2\2\35\u00e8\3"+
		"\2\2\2\37\u00f4\3\2\2\2!\u0108\3\2\2\2#\u0112\3\2\2\2%\u0114\3\2\2\2\'"+
		"\u0116\3\2\2\2)\u0119\3\2\2\2+\u011b\3\2\2\2-\u011e\3\2\2\2/\u0120\3\2"+
		"\2\2\61\u0123\3\2\2\2\63\u0126\3\2\2\2\65\u0128\3\2\2\2\67\u012a\3\2\2"+
		"\29\u012c\3\2\2\2;\u012e\3\2\2\2=\u0130\3\2\2\2?\u0132\3\2\2\2A\u0134"+
		"\3\2\2\2C\u0136\3\2\2\2E\u0138\3\2\2\2G\u013a\3\2\2\2I\u013c\3\2\2\2K"+
		"\u013e\3\2\2\2M\u0140\3\2\2\2O\u014c\3\2\2\2Q\u0157\3\2\2\2S\u0165\3\2"+
		"\2\2U\u016e\3\2\2\2WY\t\2\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2"+
		"[\\\3\2\2\2\\]\b\2\2\2]\4\3\2\2\2^_\4\62;\2_\6\3\2\2\2`a\t\3\2\2a\b\3"+
		"\2\2\2bc\7C\2\2cd\7P\2\2di\7F\2\2ef\7c\2\2fg\7p\2\2gi\7f\2\2hb\3\2\2\2"+
		"he\3\2\2\2i\n\3\2\2\2jk\7Q\2\2ko\7T\2\2lm\7q\2\2mo\7t\2\2nj\3\2\2\2nl"+
		"\3\2\2\2o\f\3\2\2\2pq\7P\2\2qr\7Q\2\2rw\7V\2\2st\7p\2\2tu\7q\2\2uw\7v"+
		"\2\2vp\3\2\2\2vs\3\2\2\2w\16\3\2\2\2xy\7K\2\2y}\7U\2\2z{\7k\2\2{}\7u\2"+
		"\2|x\3\2\2\2|z\3\2\2\2}\20\3\2\2\2~\177\7K\2\2\177\u0080\7U\2\2\u0080"+
		"\u0081\7\"\2\2\u0081\u0082\7P\2\2\u0082\u0083\7Q\2\2\u0083\u008b\7V\2"+
		"\2\u0084\u0085\7k\2\2\u0085\u0086\7u\2\2\u0086\u0087\7\"\2\2\u0087\u0088"+
		"\7p\2\2\u0088\u0089\7q\2\2\u0089\u008b\7v\2\2\u008a~\3\2\2\2\u008a\u0084"+
		"\3\2\2\2\u008b\22\3\2\2\2\u008c\u008d\7K\2\2\u008d\u008e\7U\2\2\u008e"+
		"\u008f\7\"\2\2\u008f\u0090\7G\2\2\u0090\u0091\7O\2\2\u0091\u0092\7R\2"+
		"\2\u0092\u0093\7V\2\2\u0093\u009d\7[\2\2\u0094\u0095\7k\2\2\u0095\u0096"+
		"\7u\2\2\u0096\u0097\7\"\2\2\u0097\u0098\7g\2\2\u0098\u0099\7o\2\2\u0099"+
		"\u009a\7r\2\2\u009a\u009b\7v\2\2\u009b\u009d\7{\2\2\u009c\u008c\3\2\2"+
		"\2\u009c\u0094\3\2\2\2\u009d\24\3\2\2\2\u009e\u009f\7K\2\2\u009f\u00a0"+
		"\7U\2\2\u00a0\u00a1\7\"\2\2\u00a1\u00a2\7P\2\2\u00a2\u00a3\7Q\2\2\u00a3"+
		"\u00a4\7V\2\2\u00a4\u00a5\7\"\2\2\u00a5\u00a6\7G\2\2\u00a6\u00a7\7O\2"+
		"\2\u00a7\u00a8\7R\2\2\u00a8\u00a9\7V\2\2\u00a9\u00b7\7[\2\2\u00aa\u00ab"+
		"\7k\2\2\u00ab\u00ac\7u\2\2\u00ac\u00ad\7\"\2\2\u00ad\u00ae\7p\2\2\u00ae"+
		"\u00af\7q\2\2\u00af\u00b0\7v\2\2\u00b0\u00b1\7\"\2\2\u00b1\u00b2\7g\2"+
		"\2\u00b2\u00b3\7o\2\2\u00b3\u00b4\7r\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b7"+
		"\7{\2\2\u00b6\u009e\3\2\2\2\u00b6\u00aa\3\2\2\2\u00b7\26\3\2\2\2\u00b8"+
		"\u00b9\7E\2\2\u00b9\u00ba\7Q\2\2\u00ba\u00bb\7P\2\2\u00bb\u00bc\7V\2\2"+
		"\u00bc\u00bd\7C\2\2\u00bd\u00be\7K\2\2\u00be\u00bf\7P\2\2\u00bf\u00c9"+
		"\7U\2\2\u00c0\u00c1\7e\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7p\2\2\u00c3"+
		"\u00c4\7v\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7p\2\2"+
		"\u00c7\u00c9\7u\2\2\u00c8\u00b8\3\2\2\2\u00c8\u00c0\3\2\2\2\u00c9\30\3"+
		"\2\2\2\u00ca\u00cb\7K\2\2\u00cb\u00cf\7P\2\2\u00cc\u00cd\7k\2\2\u00cd"+
		"\u00cf\7p\2\2\u00ce\u00ca\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\32\3\2\2\2"+
		"\u00d0\u00d1\7O\2\2\u00d1\u00d2\7C\2\2\u00d2\u00d3\7V\2\2\u00d3\u00d4"+
		"\7E\2\2\u00d4\u00d5\7J\2\2\u00d5\u00d6\7G\2\2\u00d6\u00df\7U\2\2\u00d7"+
		"\u00d8\7o\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7v\2\2\u00da\u00db\7e\2\2"+
		"\u00db\u00dc\7j\2\2\u00dc\u00dd\7g\2\2\u00dd\u00df\7u\2\2\u00de\u00d0"+
		"\3\2\2\2\u00de\u00d7\3\2\2\2\u00df\34\3\2\2\2\u00e0\u00e1\7V\2\2\u00e1"+
		"\u00e2\7T\2\2\u00e2\u00e3\7W\2\2\u00e3\u00e9\7G\2\2\u00e4\u00e5\7v\2\2"+
		"\u00e5\u00e6\7t\2\2\u00e6\u00e7\7w\2\2\u00e7\u00e9\7g\2\2\u00e8\u00e0"+
		"\3\2\2\2\u00e8\u00e4\3\2\2\2\u00e9\36\3\2\2\2\u00ea\u00eb\7H\2\2\u00eb"+
		"\u00ec\7C\2\2\u00ec\u00ed\7N\2\2\u00ed\u00ee\7U\2\2\u00ee\u00f5\7G\2\2"+
		"\u00ef\u00f0\7h\2\2\u00f0\u00f1\7c\2\2\u00f1\u00f2\7n\2\2\u00f2\u00f3"+
		"\7u\2\2\u00f3\u00f5\7g\2\2\u00f4\u00ea\3\2\2\2\u00f4\u00ef\3\2\2\2\u00f5"+
		" \3\2\2\2\u00f6\u00f7\7W\2\2\u00f7\u00f8\7P\2\2\u00f8\u00f9\7F\2\2\u00f9"+
		"\u00fa\7G\2\2\u00fa\u00fb\7H\2\2\u00fb\u00fc\7K\2\2\u00fc\u00fd\7P\2\2"+
		"\u00fd\u00fe\7G\2\2\u00fe\u0109\7F\2\2\u00ff\u0100\7w\2\2\u0100\u0101"+
		"\7p\2\2\u0101\u0102\7f\2\2\u0102\u0103\7g\2\2\u0103\u0104\7h\2\2\u0104"+
		"\u0105\7k\2\2\u0105\u0106\7p\2\2\u0106\u0107\7g\2\2\u0107\u0109\7f\2\2"+
		"\u0108\u00f6\3\2\2\2\u0108\u00ff\3\2\2\2\u0109\"\3\2\2\2\u010a\u010b\7"+
		"P\2\2\u010b\u010c\7W\2\2\u010c\u010d\7N\2\2\u010d\u0113\7N\2\2\u010e\u010f"+
		"\7p\2\2\u010f\u0110\7w\2\2\u0110\u0111\7n\2\2\u0111\u0113\7n\2\2\u0112"+
		"\u010a\3\2\2\2\u0112\u010e\3\2\2\2\u0113$\3\2\2\2\u0114\u0115\7@\2\2\u0115"+
		"&\3\2\2\2\u0116\u0117\7@\2\2\u0117\u0118\7?\2\2\u0118(\3\2\2\2\u0119\u011a"+
		"\7>\2\2\u011a*\3\2\2\2\u011b\u011c\7>\2\2\u011c\u011d\7?\2\2\u011d,\3"+
		"\2\2\2\u011e\u011f\7?\2\2\u011f.\3\2\2\2\u0120\u0121\7#\2\2\u0121\u0122"+
		"\7?\2\2\u0122\60\3\2\2\2\u0123\u0124\7?\2\2\u0124\u0125\7?\2\2\u0125\62"+
		"\3\2\2\2\u0126\u0127\7-\2\2\u0127\64\3\2\2\2\u0128\u0129\7/\2\2\u0129"+
		"\66\3\2\2\2\u012a\u012b\7,\2\2\u012b8\3\2\2\2\u012c\u012d\7\61\2\2\u012d"+
		":\3\2\2\2\u012e\u012f\7\'\2\2\u012f<\3\2\2\2\u0130\u0131\7`\2\2\u0131"+
		">\3\2\2\2\u0132\u0133\7A\2\2\u0133@\3\2\2\2\u0134\u0135\7<\2\2\u0135B"+
		"\3\2\2\2\u0136\u0137\7*\2\2\u0137D\3\2\2\2\u0138\u0139\7+\2\2\u0139F\3"+
		"\2\2\2\u013a\u013b\7}\2\2\u013bH\3\2\2\2\u013c\u013d\7\177\2\2\u013dJ"+
		"\3\2\2\2\u013e\u013f\7.\2\2\u013fL\3\2\2\2\u0140\u0144\7)\2\2\u0141\u0143"+
		"\n\4\2\2\u0142\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0148\7)"+
		"\2\2\u0148N\3\2\2\2\u0149\u014b\7/\2\2\u014a\u0149\3\2\2\2\u014b\u014e"+
		"\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u0150\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014f\u0151\5\5\3\2\u0150\u014f\3\2\2\2\u0151\u0152\3\2"+
		"\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153P\3\2\2\2\u0154\u0156"+
		"\7/\2\2\u0155\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015c\5\5"+
		"\3\2\u015b\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015b\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161\7\60\2\2\u0160\u0162\5"+
		"\5\3\2\u0161\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0161\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164R\3\2\2\2\u0165\u0167\7]\2\2\u0166\u0168\5\5\3\2\u0167"+
		"\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2"+
		"\2\2\u016a\u016b\3\2\2\2\u016b\u016c\7_\2\2\u016cT\3\2\2\2\u016d\u016f"+
		"\5\7\4\2\u016e\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u016e\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171\u0177\3\2\2\2\u0172\u0176\5\7\4\2\u0173\u0176\5\5"+
		"\3\2\u0174\u0176\5S*\2\u0175\u0172\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0174"+
		"\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"V\3\2\2\2\u0179\u0177\3\2\2\2\34\2Zhnv|\u008a\u009c\u00b6\u00c8\u00ce"+
		"\u00de\u00e8\u00f4\u0108\u0112\u0144\u014c\u0152\u0157\u015d\u0163\u0169"+
		"\u0170\u0175\u0177\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}