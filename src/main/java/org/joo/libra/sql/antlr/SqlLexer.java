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
		DIVIDE=25, MOD=26, POW=27, QUESTION=28, COLON=29, LPAREN=30, RPAREN=31, 
		LBRACK=32, RBRACK=33, COMMA=34, STRING=35, INTEGER=36, DOUBLE=37, INDEX=38, 
		VARIABLE=39, WS=40;
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
		"MOD", "POW", "QUESTION", "COLON", "LPAREN", "RPAREN", "LBRACK", "RBRACK", 
		"COMMA", "STRING", "INTEGER", "DOUBLE", "INDEX", "VARIABLE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "'>'", "'>='", "'<'", "'<='", "'='", "'!='", "'=='", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'?'", "':'", "'('", "')'", 
		"'['", "']'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AND", "OR", "NOT", "IS_EQUALS", "IS_EQUALS_NOT", "IS_EMPTY", "IS_NOT_EMPTY", 
		"CONTAINS", "IN", "MATCHES", "TRUE", "FALSE", "UNDEFINED", "NULL", "GREATER_THAN", 
		"GREATER_THAN_EQUALS", "LESS_THAN", "LESS_THAN_EQUALS", "EQUALS", "NOT_EQUALS", 
		"DBL_EQUALS", "PLUS", "MINUS", "TIMES", "DIVIDE", "MOD", "POW", "QUESTION", 
		"COLON", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "COMMA", "STRING", "INTEGER", 
		"DOUBLE", "INDEX", "VARIABLE", "WS"
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
		"\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4b\n\4\3\5\3\5\3\5\3\5\5\5h\n"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6p\n\6\3\7\3\7\3\7\3\7\5\7v\n\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0084\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0096\n\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\n\u00b0\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00c2\n\13\3\f\3\f\3\f\3"+
		"\f\5\f\u00c8\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00d8\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e2\n"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ee\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u0102\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u010c\n\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$"+
		"\3$\3%\3%\3&\3&\7&\u013c\n&\f&\16&\u013f\13&\3&\3&\3\'\7\'\u0144\n\'\f"+
		"\'\16\'\u0147\13\'\3\'\6\'\u014a\n\'\r\'\16\'\u014b\3(\7(\u014f\n(\f("+
		"\16(\u0152\13(\3(\6(\u0155\n(\r(\16(\u0156\3(\3(\6(\u015b\n(\r(\16(\u015c"+
		"\3)\3)\6)\u0161\n)\r)\16)\u0162\3)\3)\3*\6*\u0168\n*\r*\16*\u0169\3*\3"+
		"*\3*\7*\u016f\n*\f*\16*\u0172\13*\3+\6+\u0175\n+\r+\16+\u0176\3+\3+\2"+
		"\2,\3\2\5\2\7\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16"+
		"\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35"+
		"=\36?\37A C!E\"G#I$K%M&O\'Q(S)U*\3\2\5\6\2\60\60C\\aac|\5\2\f\f\17\17"+
		"))\4\2\13\13\"\"\2\u0191\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\3W\3\2\2\2\5Y\3\2\2\2\7a\3\2\2\2\tg\3\2\2\2\13o\3\2\2\2\ru\3"+
		"\2\2\2\17\u0083\3\2\2\2\21\u0095\3\2\2\2\23\u00af\3\2\2\2\25\u00c1\3\2"+
		"\2\2\27\u00c7\3\2\2\2\31\u00d7\3\2\2\2\33\u00e1\3\2\2\2\35\u00ed\3\2\2"+
		"\2\37\u0101\3\2\2\2!\u010b\3\2\2\2#\u010d\3\2\2\2%\u010f\3\2\2\2\'\u0112"+
		"\3\2\2\2)\u0114\3\2\2\2+\u0117\3\2\2\2-\u0119\3\2\2\2/\u011c\3\2\2\2\61"+
		"\u011f\3\2\2\2\63\u0121\3\2\2\2\65\u0123\3\2\2\2\67\u0125\3\2\2\29\u0127"+
		"\3\2\2\2;\u0129\3\2\2\2=\u012b\3\2\2\2?\u012d\3\2\2\2A\u012f\3\2\2\2C"+
		"\u0131\3\2\2\2E\u0133\3\2\2\2G\u0135\3\2\2\2I\u0137\3\2\2\2K\u0139\3\2"+
		"\2\2M\u0145\3\2\2\2O\u0150\3\2\2\2Q\u015e\3\2\2\2S\u0167\3\2\2\2U\u0174"+
		"\3\2\2\2WX\4\62;\2X\4\3\2\2\2YZ\t\2\2\2Z\6\3\2\2\2[\\\7C\2\2\\]\7P\2\2"+
		"]b\7F\2\2^_\7c\2\2_`\7p\2\2`b\7f\2\2a[\3\2\2\2a^\3\2\2\2b\b\3\2\2\2cd"+
		"\7Q\2\2dh\7T\2\2ef\7q\2\2fh\7t\2\2gc\3\2\2\2ge\3\2\2\2h\n\3\2\2\2ij\7"+
		"P\2\2jk\7Q\2\2kp\7V\2\2lm\7p\2\2mn\7q\2\2np\7v\2\2oi\3\2\2\2ol\3\2\2\2"+
		"p\f\3\2\2\2qr\7K\2\2rv\7U\2\2st\7k\2\2tv\7u\2\2uq\3\2\2\2us\3\2\2\2v\16"+
		"\3\2\2\2wx\7K\2\2xy\7U\2\2yz\7\"\2\2z{\7P\2\2{|\7Q\2\2|\u0084\7V\2\2}"+
		"~\7k\2\2~\177\7u\2\2\177\u0080\7\"\2\2\u0080\u0081\7p\2\2\u0081\u0082"+
		"\7q\2\2\u0082\u0084\7v\2\2\u0083w\3\2\2\2\u0083}\3\2\2\2\u0084\20\3\2"+
		"\2\2\u0085\u0086\7K\2\2\u0086\u0087\7U\2\2\u0087\u0088\7\"\2\2\u0088\u0089"+
		"\7G\2\2\u0089\u008a\7O\2\2\u008a\u008b\7R\2\2\u008b\u008c\7V\2\2\u008c"+
		"\u0096\7[\2\2\u008d\u008e\7k\2\2\u008e\u008f\7u\2\2\u008f\u0090\7\"\2"+
		"\2\u0090\u0091\7g\2\2\u0091\u0092\7o\2\2\u0092\u0093\7r\2\2\u0093\u0094"+
		"\7v\2\2\u0094\u0096\7{\2\2\u0095\u0085\3\2\2\2\u0095\u008d\3\2\2\2\u0096"+
		"\22\3\2\2\2\u0097\u0098\7K\2\2\u0098\u0099\7U\2\2\u0099\u009a\7\"\2\2"+
		"\u009a\u009b\7P\2\2\u009b\u009c\7Q\2\2\u009c\u009d\7V\2\2\u009d\u009e"+
		"\7\"\2\2\u009e\u009f\7G\2\2\u009f\u00a0\7O\2\2\u00a0\u00a1\7R\2\2\u00a1"+
		"\u00a2\7V\2\2\u00a2\u00b0\7[\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7u\2\2"+
		"\u00a5\u00a6\7\"\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9"+
		"\7v\2\2\u00a9\u00aa\7\"\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7o\2\2\u00ac"+
		"\u00ad\7r\2\2\u00ad\u00ae\7v\2\2\u00ae\u00b0\7{\2\2\u00af\u0097\3\2\2"+
		"\2\u00af\u00a3\3\2\2\2\u00b0\24\3\2\2\2\u00b1\u00b2\7E\2\2\u00b2\u00b3"+
		"\7Q\2\2\u00b3\u00b4\7P\2\2\u00b4\u00b5\7V\2\2\u00b5\u00b6\7C\2\2\u00b6"+
		"\u00b7\7K\2\2\u00b7\u00b8\7P\2\2\u00b8\u00c2\7U\2\2\u00b9\u00ba\7e\2\2"+
		"\u00ba\u00bb\7q\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd\7v\2\2\u00bd\u00be"+
		"\7c\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7p\2\2\u00c0\u00c2\7u\2\2\u00c1"+
		"\u00b1\3\2\2\2\u00c1\u00b9\3\2\2\2\u00c2\26\3\2\2\2\u00c3\u00c4\7K\2\2"+
		"\u00c4\u00c8\7P\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c8\7p\2\2\u00c7\u00c3"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\30\3\2\2\2\u00c9\u00ca\7O\2\2\u00ca"+
		"\u00cb\7C\2\2\u00cb\u00cc\7V\2\2\u00cc\u00cd\7E\2\2\u00cd\u00ce\7J\2\2"+
		"\u00ce\u00cf\7G\2\2\u00cf\u00d8\7U\2\2\u00d0\u00d1\7o\2\2\u00d1\u00d2"+
		"\7c\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7e\2\2\u00d4\u00d5\7j\2\2\u00d5"+
		"\u00d6\7g\2\2\u00d6\u00d8\7u\2\2\u00d7\u00c9\3\2\2\2\u00d7\u00d0\3\2\2"+
		"\2\u00d8\32\3\2\2\2\u00d9\u00da\7V\2\2\u00da\u00db\7T\2\2\u00db\u00dc"+
		"\7W\2\2\u00dc\u00e2\7G\2\2\u00dd\u00de\7v\2\2\u00de\u00df\7t\2\2\u00df"+
		"\u00e0\7w\2\2\u00e0\u00e2\7g\2\2\u00e1\u00d9\3\2\2\2\u00e1\u00dd\3\2\2"+
		"\2\u00e2\34\3\2\2\2\u00e3\u00e4\7H\2\2\u00e4\u00e5\7C\2\2\u00e5\u00e6"+
		"\7N\2\2\u00e6\u00e7\7U\2\2\u00e7\u00ee\7G\2\2\u00e8\u00e9\7h\2\2\u00e9"+
		"\u00ea\7c\2\2\u00ea\u00eb\7n\2\2\u00eb\u00ec\7u\2\2\u00ec\u00ee\7g\2\2"+
		"\u00ed\u00e3\3\2\2\2\u00ed\u00e8\3\2\2\2\u00ee\36\3\2\2\2\u00ef\u00f0"+
		"\7W\2\2\u00f0\u00f1\7P\2\2\u00f1\u00f2\7F\2\2\u00f2\u00f3\7G\2\2\u00f3"+
		"\u00f4\7H\2\2\u00f4\u00f5\7K\2\2\u00f5\u00f6\7P\2\2\u00f6\u00f7\7G\2\2"+
		"\u00f7\u0102\7F\2\2\u00f8\u00f9\7w\2\2\u00f9\u00fa\7p\2\2\u00fa\u00fb"+
		"\7f\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fd\7h\2\2\u00fd\u00fe\7k\2\2\u00fe"+
		"\u00ff\7p\2\2\u00ff\u0100\7g\2\2\u0100\u0102\7f\2\2\u0101\u00ef\3\2\2"+
		"\2\u0101\u00f8\3\2\2\2\u0102 \3\2\2\2\u0103\u0104\7P\2\2\u0104\u0105\7"+
		"W\2\2\u0105\u0106\7N\2\2\u0106\u010c\7N\2\2\u0107\u0108\7p\2\2\u0108\u0109"+
		"\7w\2\2\u0109\u010a\7n\2\2\u010a\u010c\7n\2\2\u010b\u0103\3\2\2\2\u010b"+
		"\u0107\3\2\2\2\u010c\"\3\2\2\2\u010d\u010e\7@\2\2\u010e$\3\2\2\2\u010f"+
		"\u0110\7@\2\2\u0110\u0111\7?\2\2\u0111&\3\2\2\2\u0112\u0113\7>\2\2\u0113"+
		"(\3\2\2\2\u0114\u0115\7>\2\2\u0115\u0116\7?\2\2\u0116*\3\2\2\2\u0117\u0118"+
		"\7?\2\2\u0118,\3\2\2\2\u0119\u011a\7#\2\2\u011a\u011b\7?\2\2\u011b.\3"+
		"\2\2\2\u011c\u011d\7?\2\2\u011d\u011e\7?\2\2\u011e\60\3\2\2\2\u011f\u0120"+
		"\7-\2\2\u0120\62\3\2\2\2\u0121\u0122\7/\2\2\u0122\64\3\2\2\2\u0123\u0124"+
		"\7,\2\2\u0124\66\3\2\2\2\u0125\u0126\7\61\2\2\u01268\3\2\2\2\u0127\u0128"+
		"\7\'\2\2\u0128:\3\2\2\2\u0129\u012a\7`\2\2\u012a<\3\2\2\2\u012b\u012c"+
		"\7A\2\2\u012c>\3\2\2\2\u012d\u012e\7<\2\2\u012e@\3\2\2\2\u012f\u0130\7"+
		"*\2\2\u0130B\3\2\2\2\u0131\u0132\7+\2\2\u0132D\3\2\2\2\u0133\u0134\7]"+
		"\2\2\u0134F\3\2\2\2\u0135\u0136\7_\2\2\u0136H\3\2\2\2\u0137\u0138\7.\2"+
		"\2\u0138J\3\2\2\2\u0139\u013d\7)\2\2\u013a\u013c\n\3\2\2\u013b\u013a\3"+
		"\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u0140\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0141\7)\2\2\u0141L\3\2\2\2\u0142"+
		"\u0144\7/\2\2\u0143\u0142\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2"+
		"\2\2\u0145\u0146\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0148"+
		"\u014a\5\3\2\2\u0149\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0149\3\2"+
		"\2\2\u014b\u014c\3\2\2\2\u014cN\3\2\2\2\u014d\u014f\7/\2\2\u014e\u014d"+
		"\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151"+
		"\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0155\5\3\2\2\u0154\u0153\3\2"+
		"\2\2\u0155\u0156\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\u015a\7\60\2\2\u0159\u015b\5\3\2\2\u015a\u0159\3"+
		"\2\2\2\u015b\u015c\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"P\3\2\2\2\u015e\u0160\7]\2\2\u015f\u0161\5\3\2\2\u0160\u015f\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\3\2"+
		"\2\2\u0164\u0165\7_\2\2\u0165R\3\2\2\2\u0166\u0168\5\5\3\2\u0167\u0166"+
		"\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a"+
		"\u0170\3\2\2\2\u016b\u016f\5\5\3\2\u016c\u016f\5\3\2\2\u016d\u016f\5Q"+
		")\2\u016e\u016b\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016d\3\2\2\2\u016f"+
		"\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171T\3\2\2\2"+
		"\u0172\u0170\3\2\2\2\u0173\u0175\t\4\2\2\u0174\u0173\3\2\2\2\u0175\u0176"+
		"\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\u0179\b+\2\2\u0179V\3\2\2\2\34\2agou\u0083\u0095\u00af\u00c1\u00c7\u00d7"+
		"\u00e1\u00ed\u0101\u010b\u013d\u0145\u014b\u0150\u0156\u015c\u0162\u0169"+
		"\u016e\u0170\u0176\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}