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
		CONTAINS=8, MATCHES=9, TRUE=10, FALSE=11, UNDEFINED=12, NULL=13, GREATER_THAN=14, 
		GREATER_THAN_EQUALS=15, LESS_THAN=16, LESS_THAN_EQUALS=17, EQUALS=18, 
		NOT_EQUALS=19, DBL_EQUALS=20, PLUS=21, MINUS=22, TIMES=23, DIVIDE=24, 
		MOD=25, POW=26, LPAREN=27, RPAREN=28, STRING=29, INTEGER=30, DOUBLE=31, 
		VARIABLE=32, WS=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Digit", "Alpha", "AND", "OR", "NOT", "IS_EQUALS", "IS_EQUALS_NOT", "IS_EMPTY", 
		"IS_NOT_EMPTY", "CONTAINS", "MATCHES", "TRUE", "FALSE", "UNDEFINED", "NULL", 
		"GREATER_THAN", "GREATER_THAN_EQUALS", "LESS_THAN", "LESS_THAN_EQUALS", 
		"EQUALS", "NOT_EQUALS", "DBL_EQUALS", "PLUS", "MINUS", "TIMES", "DIVIDE", 
		"MOD", "POW", "LPAREN", "RPAREN", "STRING", "INTEGER", "DOUBLE", "VARIABLE", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "'>'", "'>='", "'<'", "'<='", "'='", "'!='", "'=='", "'+'", 
		"'-'", "'*'", "'/'", "'%'", "'^'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AND", "OR", "NOT", "IS_EQUALS", "IS_EQUALS_NOT", "IS_EMPTY", "IS_NOT_EMPTY", 
		"CONTAINS", "MATCHES", "TRUE", "FALSE", "UNDEFINED", "NULL", "GREATER_THAN", 
		"GREATER_THAN_EQUALS", "LESS_THAN", "LESS_THAN_EQUALS", "EQUALS", "NOT_EQUALS", 
		"DBL_EQUALS", "PLUS", "MINUS", "TIMES", "DIVIDE", "MOD", "POW", "LPAREN", 
		"RPAREN", "STRING", "INTEGER", "DOUBLE", "VARIABLE", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u0153\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4T\n"+
		"\4\3\5\3\5\3\5\3\5\5\5Z\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6b\n\6\3\7\3\7\3"+
		"\7\3\7\5\7h\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bv\n"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u0088\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a2\n\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b4"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c4"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ce\n\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00da\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u00ee\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00f8\n\20\3"+
		"\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\3 \3 \7 \u011e\n \f \16 \u0121\13 \3 \3 "+
		"\3!\7!\u0126\n!\f!\16!\u0129\13!\3!\6!\u012c\n!\r!\16!\u012d\3\"\7\"\u0131"+
		"\n\"\f\"\16\"\u0134\13\"\3\"\6\"\u0137\n\"\r\"\16\"\u0138\3\"\3\"\6\""+
		"\u013d\n\"\r\"\16\"\u013e\3#\6#\u0142\n#\r#\16#\u0143\3#\3#\7#\u0148\n"+
		"#\f#\16#\u014b\13#\3$\6$\u014e\n$\r$\16$\u014f\3$\3$\2\2%\3\2\5\2\7\3"+
		"\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21"+
		"%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!"+
		"E\"G#\3\2\5\7\2\60\60C]__aac|\5\2\f\f\17\17))\4\2\13\13\"\"\2\u0167\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5K\3\2\2\2\7"+
		"S\3\2\2\2\tY\3\2\2\2\13a\3\2\2\2\rg\3\2\2\2\17u\3\2\2\2\21\u0087\3\2\2"+
		"\2\23\u00a1\3\2\2\2\25\u00b3\3\2\2\2\27\u00c3\3\2\2\2\31\u00cd\3\2\2\2"+
		"\33\u00d9\3\2\2\2\35\u00ed\3\2\2\2\37\u00f7\3\2\2\2!\u00f9\3\2\2\2#\u00fb"+
		"\3\2\2\2%\u00fe\3\2\2\2\'\u0100\3\2\2\2)\u0103\3\2\2\2+\u0105\3\2\2\2"+
		"-\u0108\3\2\2\2/\u010b\3\2\2\2\61\u010d\3\2\2\2\63\u010f\3\2\2\2\65\u0111"+
		"\3\2\2\2\67\u0113\3\2\2\29\u0115\3\2\2\2;\u0117\3\2\2\2=\u0119\3\2\2\2"+
		"?\u011b\3\2\2\2A\u0127\3\2\2\2C\u0132\3\2\2\2E\u0141\3\2\2\2G\u014d\3"+
		"\2\2\2IJ\4\62;\2J\4\3\2\2\2KL\t\2\2\2L\6\3\2\2\2MN\7C\2\2NO\7P\2\2OT\7"+
		"F\2\2PQ\7c\2\2QR\7p\2\2RT\7f\2\2SM\3\2\2\2SP\3\2\2\2T\b\3\2\2\2UV\7Q\2"+
		"\2VZ\7T\2\2WX\7q\2\2XZ\7t\2\2YU\3\2\2\2YW\3\2\2\2Z\n\3\2\2\2[\\\7P\2\2"+
		"\\]\7Q\2\2]b\7V\2\2^_\7p\2\2_`\7q\2\2`b\7v\2\2a[\3\2\2\2a^\3\2\2\2b\f"+
		"\3\2\2\2cd\7K\2\2dh\7U\2\2ef\7k\2\2fh\7u\2\2gc\3\2\2\2ge\3\2\2\2h\16\3"+
		"\2\2\2ij\7K\2\2jk\7U\2\2kl\7\"\2\2lm\7P\2\2mn\7Q\2\2nv\7V\2\2op\7k\2\2"+
		"pq\7u\2\2qr\7\"\2\2rs\7p\2\2st\7q\2\2tv\7v\2\2ui\3\2\2\2uo\3\2\2\2v\20"+
		"\3\2\2\2wx\7K\2\2xy\7U\2\2yz\7\"\2\2z{\7G\2\2{|\7O\2\2|}\7R\2\2}~\7V\2"+
		"\2~\u0088\7[\2\2\177\u0080\7k\2\2\u0080\u0081\7u\2\2\u0081\u0082\7\"\2"+
		"\2\u0082\u0083\7g\2\2\u0083\u0084\7o\2\2\u0084\u0085\7r\2\2\u0085\u0086"+
		"\7v\2\2\u0086\u0088\7{\2\2\u0087w\3\2\2\2\u0087\177\3\2\2\2\u0088\22\3"+
		"\2\2\2\u0089\u008a\7K\2\2\u008a\u008b\7U\2\2\u008b\u008c\7\"\2\2\u008c"+
		"\u008d\7P\2\2\u008d\u008e\7Q\2\2\u008e\u008f\7V\2\2\u008f\u0090\7\"\2"+
		"\2\u0090\u0091\7G\2\2\u0091\u0092\7O\2\2\u0092\u0093\7R\2\2\u0093\u0094"+
		"\7V\2\2\u0094\u00a2\7[\2\2\u0095\u0096\7k\2\2\u0096\u0097\7u\2\2\u0097"+
		"\u0098\7\"\2\2\u0098\u0099\7p\2\2\u0099\u009a\7q\2\2\u009a\u009b\7v\2"+
		"\2\u009b\u009c\7\"\2\2\u009c\u009d\7g\2\2\u009d\u009e\7o\2\2\u009e\u009f"+
		"\7r\2\2\u009f\u00a0\7v\2\2\u00a0\u00a2\7{\2\2\u00a1\u0089\3\2\2\2\u00a1"+
		"\u0095\3\2\2\2\u00a2\24\3\2\2\2\u00a3\u00a4\7E\2\2\u00a4\u00a5\7Q\2\2"+
		"\u00a5\u00a6\7P\2\2\u00a6\u00a7\7V\2\2\u00a7\u00a8\7C\2\2\u00a8\u00a9"+
		"\7K\2\2\u00a9\u00aa\7P\2\2\u00aa\u00b4\7U\2\2\u00ab\u00ac\7e\2\2\u00ac"+
		"\u00ad\7q\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7c\2\2"+
		"\u00b0\u00b1\7k\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b4\7u\2\2\u00b3\u00a3"+
		"\3\2\2\2\u00b3\u00ab\3\2\2\2\u00b4\26\3\2\2\2\u00b5\u00b6\7O\2\2\u00b6"+
		"\u00b7\7C\2\2\u00b7\u00b8\7V\2\2\u00b8\u00b9\7E\2\2\u00b9\u00ba\7J\2\2"+
		"\u00ba\u00bb\7G\2\2\u00bb\u00c4\7U\2\2\u00bc\u00bd\7o\2\2\u00bd\u00be"+
		"\7c\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7e\2\2\u00c0\u00c1\7j\2\2\u00c1"+
		"\u00c2\7g\2\2\u00c2\u00c4\7u\2\2\u00c3\u00b5\3\2\2\2\u00c3\u00bc\3\2\2"+
		"\2\u00c4\30\3\2\2\2\u00c5\u00c6\7V\2\2\u00c6\u00c7\7T\2\2\u00c7\u00c8"+
		"\7W\2\2\u00c8\u00ce\7G\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb\7t\2\2\u00cb"+
		"\u00cc\7w\2\2\u00cc\u00ce\7g\2\2\u00cd\u00c5\3\2\2\2\u00cd\u00c9\3\2\2"+
		"\2\u00ce\32\3\2\2\2\u00cf\u00d0\7H\2\2\u00d0\u00d1\7C\2\2\u00d1\u00d2"+
		"\7N\2\2\u00d2\u00d3\7U\2\2\u00d3\u00da\7G\2\2\u00d4\u00d5\7h\2\2\u00d5"+
		"\u00d6\7c\2\2\u00d6\u00d7\7n\2\2\u00d7\u00d8\7u\2\2\u00d8\u00da\7g\2\2"+
		"\u00d9\u00cf\3\2\2\2\u00d9\u00d4\3\2\2\2\u00da\34\3\2\2\2\u00db\u00dc"+
		"\7W\2\2\u00dc\u00dd\7P\2\2\u00dd\u00de\7F\2\2\u00de\u00df\7G\2\2\u00df"+
		"\u00e0\7H\2\2\u00e0\u00e1\7K\2\2\u00e1\u00e2\7P\2\2\u00e2\u00e3\7G\2\2"+
		"\u00e3\u00ee\7F\2\2\u00e4\u00e5\7w\2\2\u00e5\u00e6\7p\2\2\u00e6\u00e7"+
		"\7f\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7h\2\2\u00e9\u00ea\7k\2\2\u00ea"+
		"\u00eb\7p\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ee\7f\2\2\u00ed\u00db\3\2\2"+
		"\2\u00ed\u00e4\3\2\2\2\u00ee\36\3\2\2\2\u00ef\u00f0\7P\2\2\u00f0\u00f1"+
		"\7W\2\2\u00f1\u00f2\7N\2\2\u00f2\u00f8\7N\2\2\u00f3\u00f4\7p\2\2\u00f4"+
		"\u00f5\7w\2\2\u00f5\u00f6\7n\2\2\u00f6\u00f8\7n\2\2\u00f7\u00ef\3\2\2"+
		"\2\u00f7\u00f3\3\2\2\2\u00f8 \3\2\2\2\u00f9\u00fa\7@\2\2\u00fa\"\3\2\2"+
		"\2\u00fb\u00fc\7@\2\2\u00fc\u00fd\7?\2\2\u00fd$\3\2\2\2\u00fe\u00ff\7"+
		">\2\2\u00ff&\3\2\2\2\u0100\u0101\7>\2\2\u0101\u0102\7?\2\2\u0102(\3\2"+
		"\2\2\u0103\u0104\7?\2\2\u0104*\3\2\2\2\u0105\u0106\7#\2\2\u0106\u0107"+
		"\7?\2\2\u0107,\3\2\2\2\u0108\u0109\7?\2\2\u0109\u010a\7?\2\2\u010a.\3"+
		"\2\2\2\u010b\u010c\7-\2\2\u010c\60\3\2\2\2\u010d\u010e\7/\2\2\u010e\62"+
		"\3\2\2\2\u010f\u0110\7,\2\2\u0110\64\3\2\2\2\u0111\u0112\7\61\2\2\u0112"+
		"\66\3\2\2\2\u0113\u0114\7\'\2\2\u01148\3\2\2\2\u0115\u0116\7`\2\2\u0116"+
		":\3\2\2\2\u0117\u0118\7*\2\2\u0118<\3\2\2\2\u0119\u011a\7+\2\2\u011a>"+
		"\3\2\2\2\u011b\u011f\7)\2\2\u011c\u011e\n\3\2\2\u011d\u011c\3\2\2\2\u011e"+
		"\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2"+
		"\2\2\u0121\u011f\3\2\2\2\u0122\u0123\7)\2\2\u0123@\3\2\2\2\u0124\u0126"+
		"\7/\2\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012c\5\3"+
		"\2\2\u012b\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012b\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012eB\3\2\2\2\u012f\u0131\7/\2\2\u0130\u012f\3\2\2\2\u0131"+
		"\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0136\3\2"+
		"\2\2\u0134\u0132\3\2\2\2\u0135\u0137\5\3\2\2\u0136\u0135\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2"+
		"\2\2\u013a\u013c\7\60\2\2\u013b\u013d\5\3\2\2\u013c\u013b\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013fD\3\2\2\2"+
		"\u0140\u0142\5\5\3\2\u0141\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0141"+
		"\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0149\3\2\2\2\u0145\u0148\5\5\3\2\u0146"+
		"\u0148\5\3\2\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0148\u014b\3\2"+
		"\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014aF\3\2\2\2\u014b\u0149"+
		"\3\2\2\2\u014c\u014e\t\4\2\2\u014d\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\b$"+
		"\2\2\u0152H\3\2\2\2\32\2SYagu\u0087\u00a1\u00b3\u00c3\u00cd\u00d9\u00ed"+
		"\u00f7\u011f\u0127\u012d\u0132\u0138\u013e\u0143\u0147\u0149\u014f\3\2"+
		"\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}