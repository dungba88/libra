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
		DIVIDE=25, MOD=26, POW=27, LPAREN=28, RPAREN=29, LBRACK=30, RBRACK=31, 
		COMMA=32, STRING=33, INTEGER=34, DOUBLE=35, INDEX=36, VARIABLE=37, WS=38;
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
		"MOD", "POW", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "COMMA", "STRING", 
		"INTEGER", "DOUBLE", "INDEX", "VARIABLE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "'>'", "'>='", "'<'", "'<='", "'='", "'!='", "'=='", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'('", "')'", "'['", "']'", 
		"','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AND", "OR", "NOT", "IS_EQUALS", "IS_EQUALS_NOT", "IS_EMPTY", "IS_NOT_EMPTY", 
		"CONTAINS", "IN", "MATCHES", "TRUE", "FALSE", "UNDEFINED", "NULL", "GREATER_THAN", 
		"GREATER_THAN_EQUALS", "LESS_THAN", "LESS_THAN_EQUALS", "EQUALS", "NOT_EQUALS", 
		"DBL_EQUALS", "PLUS", "MINUS", "TIMES", "DIVIDE", "MOD", "POW", "LPAREN", 
		"RPAREN", "LBRACK", "RBRACK", "COMMA", "STRING", "INTEGER", "DOUBLE", 
		"INDEX", "VARIABLE", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u0172\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4^\n\4\3\5\3\5\3\5\3\5\5\5d\n\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6l\n\6\3\7\3\7\3\7\3\7\5\7r\n\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0080\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0092\n\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u00ac\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13\u00be\n\13\3\f\3\f\3\f\3\f\5\f\u00c4"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d4"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00de\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ea\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00fe\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0108"+
		"\n\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\7$\u0134\n$"+
		"\f$\16$\u0137\13$\3$\3$\3%\7%\u013c\n%\f%\16%\u013f\13%\3%\6%\u0142\n"+
		"%\r%\16%\u0143\3&\7&\u0147\n&\f&\16&\u014a\13&\3&\6&\u014d\n&\r&\16&\u014e"+
		"\3&\3&\6&\u0153\n&\r&\16&\u0154\3\'\3\'\6\'\u0159\n\'\r\'\16\'\u015a\3"+
		"\'\3\'\3(\6(\u0160\n(\r(\16(\u0161\3(\3(\3(\7(\u0167\n(\f(\16(\u016a\13"+
		"(\3)\6)\u016d\n)\r)\16)\u016e\3)\3)\2\2*\3\2\5\2\7\3\t\4\13\5\r\6\17\7"+
		"\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-"+
		"\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!E\"G#I$K%M&O\'Q(\3"+
		"\2\5\6\2\60\60C\\aac|\5\2\f\f\17\17))\4\2\13\13\"\"\2\u0189\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5U\3\2\2\2\7]\3\2\2\2\tc\3\2\2\2\13"+
		"k\3\2\2\2\rq\3\2\2\2\17\177\3\2\2\2\21\u0091\3\2\2\2\23\u00ab\3\2\2\2"+
		"\25\u00bd\3\2\2\2\27\u00c3\3\2\2\2\31\u00d3\3\2\2\2\33\u00dd\3\2\2\2\35"+
		"\u00e9\3\2\2\2\37\u00fd\3\2\2\2!\u0107\3\2\2\2#\u0109\3\2\2\2%\u010b\3"+
		"\2\2\2\'\u010e\3\2\2\2)\u0110\3\2\2\2+\u0113\3\2\2\2-\u0115\3\2\2\2/\u0118"+
		"\3\2\2\2\61\u011b\3\2\2\2\63\u011d\3\2\2\2\65\u011f\3\2\2\2\67\u0121\3"+
		"\2\2\29\u0123\3\2\2\2;\u0125\3\2\2\2=\u0127\3\2\2\2?\u0129\3\2\2\2A\u012b"+
		"\3\2\2\2C\u012d\3\2\2\2E\u012f\3\2\2\2G\u0131\3\2\2\2I\u013d\3\2\2\2K"+
		"\u0148\3\2\2\2M\u0156\3\2\2\2O\u015f\3\2\2\2Q\u016c\3\2\2\2ST\4\62;\2"+
		"T\4\3\2\2\2UV\t\2\2\2V\6\3\2\2\2WX\7C\2\2XY\7P\2\2Y^\7F\2\2Z[\7c\2\2["+
		"\\\7p\2\2\\^\7f\2\2]W\3\2\2\2]Z\3\2\2\2^\b\3\2\2\2_`\7Q\2\2`d\7T\2\2a"+
		"b\7q\2\2bd\7t\2\2c_\3\2\2\2ca\3\2\2\2d\n\3\2\2\2ef\7P\2\2fg\7Q\2\2gl\7"+
		"V\2\2hi\7p\2\2ij\7q\2\2jl\7v\2\2ke\3\2\2\2kh\3\2\2\2l\f\3\2\2\2mn\7K\2"+
		"\2nr\7U\2\2op\7k\2\2pr\7u\2\2qm\3\2\2\2qo\3\2\2\2r\16\3\2\2\2st\7K\2\2"+
		"tu\7U\2\2uv\7\"\2\2vw\7P\2\2wx\7Q\2\2x\u0080\7V\2\2yz\7k\2\2z{\7u\2\2"+
		"{|\7\"\2\2|}\7p\2\2}~\7q\2\2~\u0080\7v\2\2\177s\3\2\2\2\177y\3\2\2\2\u0080"+
		"\20\3\2\2\2\u0081\u0082\7K\2\2\u0082\u0083\7U\2\2\u0083\u0084\7\"\2\2"+
		"\u0084\u0085\7G\2\2\u0085\u0086\7O\2\2\u0086\u0087\7R\2\2\u0087\u0088"+
		"\7V\2\2\u0088\u0092\7[\2\2\u0089\u008a\7k\2\2\u008a\u008b\7u\2\2\u008b"+
		"\u008c\7\"\2\2\u008c\u008d\7g\2\2\u008d\u008e\7o\2\2\u008e\u008f\7r\2"+
		"\2\u008f\u0090\7v\2\2\u0090\u0092\7{\2\2\u0091\u0081\3\2\2\2\u0091\u0089"+
		"\3\2\2\2\u0092\22\3\2\2\2\u0093\u0094\7K\2\2\u0094\u0095\7U\2\2\u0095"+
		"\u0096\7\"\2\2\u0096\u0097\7P\2\2\u0097\u0098\7Q\2\2\u0098\u0099\7V\2"+
		"\2\u0099\u009a\7\"\2\2\u009a\u009b\7G\2\2\u009b\u009c\7O\2\2\u009c\u009d"+
		"\7R\2\2\u009d\u009e\7V\2\2\u009e\u00ac\7[\2\2\u009f\u00a0\7k\2\2\u00a0"+
		"\u00a1\7u\2\2\u00a1\u00a2\7\"\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7q\2"+
		"\2\u00a4\u00a5\7v\2\2\u00a5\u00a6\7\"\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8"+
		"\7o\2\2\u00a8\u00a9\7r\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ac\7{\2\2\u00ab"+
		"\u0093\3\2\2\2\u00ab\u009f\3\2\2\2\u00ac\24\3\2\2\2\u00ad\u00ae\7E\2\2"+
		"\u00ae\u00af\7Q\2\2\u00af\u00b0\7P\2\2\u00b0\u00b1\7V\2\2\u00b1\u00b2"+
		"\7C\2\2\u00b2\u00b3\7K\2\2\u00b3\u00b4\7P\2\2\u00b4\u00be\7U\2\2\u00b5"+
		"\u00b6\7e\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7p\2\2\u00b8\u00b9\7v\2\2"+
		"\u00b9\u00ba\7c\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7p\2\2\u00bc\u00be"+
		"\7u\2\2\u00bd\u00ad\3\2\2\2\u00bd\u00b5\3\2\2\2\u00be\26\3\2\2\2\u00bf"+
		"\u00c0\7K\2\2\u00c0\u00c4\7P\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c4\7p\2\2"+
		"\u00c3\u00bf\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\30\3\2\2\2\u00c5\u00c6"+
		"\7O\2\2\u00c6\u00c7\7C\2\2\u00c7\u00c8\7V\2\2\u00c8\u00c9\7E\2\2\u00c9"+
		"\u00ca\7J\2\2\u00ca\u00cb\7G\2\2\u00cb\u00d4\7U\2\2\u00cc\u00cd\7o\2\2"+
		"\u00cd\u00ce\7c\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7e\2\2\u00d0\u00d1"+
		"\7j\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d4\7u\2\2\u00d3\u00c5\3\2\2\2\u00d3"+
		"\u00cc\3\2\2\2\u00d4\32\3\2\2\2\u00d5\u00d6\7V\2\2\u00d6\u00d7\7T\2\2"+
		"\u00d7\u00d8\7W\2\2\u00d8\u00de\7G\2\2\u00d9\u00da\7v\2\2\u00da\u00db"+
		"\7t\2\2\u00db\u00dc\7w\2\2\u00dc\u00de\7g\2\2\u00dd\u00d5\3\2\2\2\u00dd"+
		"\u00d9\3\2\2\2\u00de\34\3\2\2\2\u00df\u00e0\7H\2\2\u00e0\u00e1\7C\2\2"+
		"\u00e1\u00e2\7N\2\2\u00e2\u00e3\7U\2\2\u00e3\u00ea\7G\2\2\u00e4\u00e5"+
		"\7h\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7\7n\2\2\u00e7\u00e8\7u\2\2\u00e8"+
		"\u00ea\7g\2\2\u00e9\u00df\3\2\2\2\u00e9\u00e4\3\2\2\2\u00ea\36\3\2\2\2"+
		"\u00eb\u00ec\7W\2\2\u00ec\u00ed\7P\2\2\u00ed\u00ee\7F\2\2\u00ee\u00ef"+
		"\7G\2\2\u00ef\u00f0\7H\2\2\u00f0\u00f1\7K\2\2\u00f1\u00f2\7P\2\2\u00f2"+
		"\u00f3\7G\2\2\u00f3\u00fe\7F\2\2\u00f4\u00f5\7w\2\2\u00f5\u00f6\7p\2\2"+
		"\u00f6\u00f7\7f\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7h\2\2\u00f9\u00fa"+
		"\7k\2\2\u00fa\u00fb\7p\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fe\7f\2\2\u00fd"+
		"\u00eb\3\2\2\2\u00fd\u00f4\3\2\2\2\u00fe \3\2\2\2\u00ff\u0100\7P\2\2\u0100"+
		"\u0101\7W\2\2\u0101\u0102\7N\2\2\u0102\u0108\7N\2\2\u0103\u0104\7p\2\2"+
		"\u0104\u0105\7w\2\2\u0105\u0106\7n\2\2\u0106\u0108\7n\2\2\u0107\u00ff"+
		"\3\2\2\2\u0107\u0103\3\2\2\2\u0108\"\3\2\2\2\u0109\u010a\7@\2\2\u010a"+
		"$\3\2\2\2\u010b\u010c\7@\2\2\u010c\u010d\7?\2\2\u010d&\3\2\2\2\u010e\u010f"+
		"\7>\2\2\u010f(\3\2\2\2\u0110\u0111\7>\2\2\u0111\u0112\7?\2\2\u0112*\3"+
		"\2\2\2\u0113\u0114\7?\2\2\u0114,\3\2\2\2\u0115\u0116\7#\2\2\u0116\u0117"+
		"\7?\2\2\u0117.\3\2\2\2\u0118\u0119\7?\2\2\u0119\u011a\7?\2\2\u011a\60"+
		"\3\2\2\2\u011b\u011c\7-\2\2\u011c\62\3\2\2\2\u011d\u011e\7/\2\2\u011e"+
		"\64\3\2\2\2\u011f\u0120\7,\2\2\u0120\66\3\2\2\2\u0121\u0122\7\61\2\2\u0122"+
		"8\3\2\2\2\u0123\u0124\7\'\2\2\u0124:\3\2\2\2\u0125\u0126\7`\2\2\u0126"+
		"<\3\2\2\2\u0127\u0128\7*\2\2\u0128>\3\2\2\2\u0129\u012a\7+\2\2\u012a@"+
		"\3\2\2\2\u012b\u012c\7]\2\2\u012cB\3\2\2\2\u012d\u012e\7_\2\2\u012eD\3"+
		"\2\2\2\u012f\u0130\7.\2\2\u0130F\3\2\2\2\u0131\u0135\7)\2\2\u0132\u0134"+
		"\n\3\2\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139\7)"+
		"\2\2\u0139H\3\2\2\2\u013a\u013c\7/\2\2\u013b\u013a\3\2\2\2\u013c\u013f"+
		"\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0141\3\2\2\2\u013f"+
		"\u013d\3\2\2\2\u0140\u0142\5\3\2\2\u0141\u0140\3\2\2\2\u0142\u0143\3\2"+
		"\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144J\3\2\2\2\u0145\u0147"+
		"\7/\2\2\u0146\u0145\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014d\5\3"+
		"\2\2\u014c\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014c\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152\7\60\2\2\u0151\u0153\5"+
		"\3\2\2\u0152\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0152\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155L\3\2\2\2\u0156\u0158\7]\2\2\u0157\u0159\5\3\2\2\u0158"+
		"\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2"+
		"\2\2\u015b\u015c\3\2\2\2\u015c\u015d\7_\2\2\u015dN\3\2\2\2\u015e\u0160"+
		"\5\5\3\2\u015f\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u015f\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162\u0168\3\2\2\2\u0163\u0167\5\5\3\2\u0164\u0167\5\3"+
		"\2\2\u0165\u0167\5M\'\2\u0166\u0163\3\2\2\2\u0166\u0164\3\2\2\2\u0166"+
		"\u0165\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2"+
		"\2\2\u0169P\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016d\t\4\2\2\u016c\u016b"+
		"\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"\u0170\3\2\2\2\u0170\u0171\b)\2\2\u0171R\3\2\2\2\34\2]ckq\177\u0091\u00ab"+
		"\u00bd\u00c3\u00d3\u00dd\u00e9\u00fd\u0107\u0135\u013d\u0143\u0148\u014e"+
		"\u0154\u015a\u0161\u0166\u0168\u016e\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}