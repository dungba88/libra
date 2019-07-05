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
		ANY=16, NONE=17, ALL=18, FILTER=19, OF=20, SATISFIES=21, GREATER_THAN=22, 
		GREATER_THAN_EQUALS=23, LESS_THAN=24, LESS_THAN_EQUALS=25, EQUALS=26, 
		NOT_EQUALS=27, DBL_EQUALS=28, PLUS=29, MINUS=30, TIMES=31, DIVIDE=32, 
		MOD=33, POW=34, QUESTION=35, COLON=36, LPAREN=37, RPAREN=38, LBRACE=39, 
		RBRACE=40, COMMA=41, STRING=42, INTEGER=43, DOUBLE=44, INDEX=45, VARIABLE=46, 
		TEMP_VAR=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "Digit", "Alpha", "AND", "OR", "NOT", "IS_EQUALS", "IS_EQUALS_NOT", 
		"IS_EMPTY", "IS_NOT_EMPTY", "CONTAINS", "IN", "MATCHES", "TRUE", "FALSE", 
		"UNDEFINED", "NULL", "ANY", "NONE", "ALL", "FILTER", "OF", "SATISFIES", 
		"GREATER_THAN", "GREATER_THAN_EQUALS", "LESS_THAN", "LESS_THAN_EQUALS", 
		"EQUALS", "NOT_EQUALS", "DBL_EQUALS", "PLUS", "MINUS", "TIMES", "DIVIDE", 
		"MOD", "POW", "QUESTION", "COLON", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
		"COMMA", "STRING", "INTEGER", "DOUBLE", "INDEX", "VARIABLE", "TEMP_VAR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "'>'", "'>='", 
		"'<'", "'<='", "'='", "'!='", "'=='", "'+'", "'-'", "'*'", "'/'", "'%'", 
		"'^'", "'?'", "':'", "'('", "')'", "'{'", "'}'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "AND", "OR", "NOT", "IS_EQUALS", "IS_EQUALS_NOT", "IS_EMPTY", 
		"IS_NOT_EMPTY", "CONTAINS", "IN", "MATCHES", "TRUE", "FALSE", "UNDEFINED", 
		"NULL", "ANY", "NONE", "ALL", "FILTER", "OF", "SATISFIES", "GREATER_THAN", 
		"GREATER_THAN_EQUALS", "LESS_THAN", "LESS_THAN_EQUALS", "EQUALS", "NOT_EQUALS", 
		"DBL_EQUALS", "PLUS", "MINUS", "TIMES", "DIVIDE", "MOD", "POW", "QUESTION", 
		"COLON", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "COMMA", "STRING", "INTEGER", 
		"DOUBLE", "INDEX", "VARIABLE", "TEMP_VAR"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u01d4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\6\2g\n\2\r"+
		"\2\16\2h\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5w\n\5\3\6"+
		"\3\6\3\6\3\6\5\6}\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0085\n\7\3\b\3\b\3"+
		"\b\3\b\5\b\u008b\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u0099\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u00ab\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00c5\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u00d7\n\f\3\r\3\r\3\r\3\r\5\r\u00dd\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ed\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00f7\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0103\n\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u0117\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0121\n"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0129\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u0133\n\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u013b\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0145\n\26\3"+
		"\27\3\27\3\27\3\27\5\27\u014b\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u015f\n\30"+
		"\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3"+
		"\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\7-\u018f\n-\f-\16-\u0192\13-\3"+
		"-\3-\3.\7.\u0197\n.\f.\16.\u019a\13.\3.\6.\u019d\n.\r.\16.\u019e\3/\7"+
		"/\u01a2\n/\f/\16/\u01a5\13/\3/\6/\u01a8\n/\r/\16/\u01a9\3/\3/\6/\u01ae"+
		"\n/\r/\16/\u01af\3\60\3\60\6\60\u01b4\n\60\r\60\16\60\u01b5\3\60\3\60"+
		"\3\61\6\61\u01bb\n\61\r\61\16\61\u01bc\3\61\3\61\3\61\7\61\u01c2\n\61"+
		"\f\61\16\61\u01c5\13\61\3\62\3\62\6\62\u01c9\n\62\r\62\16\62\u01ca\3\62"+
		"\3\62\3\62\7\62\u01d0\n\62\f\62\16\62\u01d3\13\62\2\2\63\3\3\5\2\7\2\t"+
		"\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22"+
		"\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!E\"G"+
		"#I$K%M&O\'Q(S)U*W+Y,[-]._/a\60c\61\3\2\5\4\2\13\13\"\"\6\2\60\60C\\aa"+
		"c|\5\2\f\f\17\17))\2\u01f5\2\3\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3"+
		"\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2"+
		"\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3"+
		"\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2"+
		"\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2"+
		";\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3"+
		"\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2"+
		"\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2"+
		"a\3\2\2\2\2c\3\2\2\2\3f\3\2\2\2\5l\3\2\2\2\7n\3\2\2\2\tv\3\2\2\2\13|\3"+
		"\2\2\2\r\u0084\3\2\2\2\17\u008a\3\2\2\2\21\u0098\3\2\2\2\23\u00aa\3\2"+
		"\2\2\25\u00c4\3\2\2\2\27\u00d6\3\2\2\2\31\u00dc\3\2\2\2\33\u00ec\3\2\2"+
		"\2\35\u00f6\3\2\2\2\37\u0102\3\2\2\2!\u0116\3\2\2\2#\u0120\3\2\2\2%\u0128"+
		"\3\2\2\2\'\u0132\3\2\2\2)\u013a\3\2\2\2+\u0144\3\2\2\2-\u014a\3\2\2\2"+
		"/\u015e\3\2\2\2\61\u0160\3\2\2\2\63\u0162\3\2\2\2\65\u0165\3\2\2\2\67"+
		"\u0167\3\2\2\29\u016a\3\2\2\2;\u016c\3\2\2\2=\u016f\3\2\2\2?\u0172\3\2"+
		"\2\2A\u0174\3\2\2\2C\u0176\3\2\2\2E\u0178\3\2\2\2G\u017a\3\2\2\2I\u017c"+
		"\3\2\2\2K\u017e\3\2\2\2M\u0180\3\2\2\2O\u0182\3\2\2\2Q\u0184\3\2\2\2S"+
		"\u0186\3\2\2\2U\u0188\3\2\2\2W\u018a\3\2\2\2Y\u018c\3\2\2\2[\u0198\3\2"+
		"\2\2]\u01a3\3\2\2\2_\u01b1\3\2\2\2a\u01ba\3\2\2\2c\u01c6\3\2\2\2eg\t\2"+
		"\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\b\2\2\2k\4\3"+
		"\2\2\2lm\4\62;\2m\6\3\2\2\2no\t\3\2\2o\b\3\2\2\2pq\7C\2\2qr\7P\2\2rw\7"+
		"F\2\2st\7c\2\2tu\7p\2\2uw\7f\2\2vp\3\2\2\2vs\3\2\2\2w\n\3\2\2\2xy\7Q\2"+
		"\2y}\7T\2\2z{\7q\2\2{}\7t\2\2|x\3\2\2\2|z\3\2\2\2}\f\3\2\2\2~\177\7P\2"+
		"\2\177\u0080\7Q\2\2\u0080\u0085\7V\2\2\u0081\u0082\7p\2\2\u0082\u0083"+
		"\7q\2\2\u0083\u0085\7v\2\2\u0084~\3\2\2\2\u0084\u0081\3\2\2\2\u0085\16"+
		"\3\2\2\2\u0086\u0087\7K\2\2\u0087\u008b\7U\2\2\u0088\u0089\7k\2\2\u0089"+
		"\u008b\7u\2\2\u008a\u0086\3\2\2\2\u008a\u0088\3\2\2\2\u008b\20\3\2\2\2"+
		"\u008c\u008d\7K\2\2\u008d\u008e\7U\2\2\u008e\u008f\7\"\2\2\u008f\u0090"+
		"\7P\2\2\u0090\u0091\7Q\2\2\u0091\u0099\7V\2\2\u0092\u0093\7k\2\2\u0093"+
		"\u0094\7u\2\2\u0094\u0095\7\"\2\2\u0095\u0096\7p\2\2\u0096\u0097\7q\2"+
		"\2\u0097\u0099\7v\2\2\u0098\u008c\3\2\2\2\u0098\u0092\3\2\2\2\u0099\22"+
		"\3\2\2\2\u009a\u009b\7K\2\2\u009b\u009c\7U\2\2\u009c\u009d\7\"\2\2\u009d"+
		"\u009e\7G\2\2\u009e\u009f\7O\2\2\u009f\u00a0\7R\2\2\u00a0\u00a1\7V\2\2"+
		"\u00a1\u00ab\7[\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7u\2\2\u00a4\u00a5"+
		"\7\"\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7o\2\2\u00a7\u00a8\7r\2\2\u00a8"+
		"\u00a9\7v\2\2\u00a9\u00ab\7{\2\2\u00aa\u009a\3\2\2\2\u00aa\u00a2\3\2\2"+
		"\2\u00ab\24\3\2\2\2\u00ac\u00ad\7K\2\2\u00ad\u00ae\7U\2\2\u00ae\u00af"+
		"\7\"\2\2\u00af\u00b0\7P\2\2\u00b0\u00b1\7Q\2\2\u00b1\u00b2\7V\2\2\u00b2"+
		"\u00b3\7\"\2\2\u00b3\u00b4\7G\2\2\u00b4\u00b5\7O\2\2\u00b5\u00b6\7R\2"+
		"\2\u00b6\u00b7\7V\2\2\u00b7\u00c5\7[\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba"+
		"\7u\2\2\u00ba\u00bb\7\"\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd\7q\2\2\u00bd"+
		"\u00be\7v\2\2\u00be\u00bf\7\"\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7o\2"+
		"\2\u00c1\u00c2\7r\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c5\7{\2\2\u00c4\u00ac"+
		"\3\2\2\2\u00c4\u00b8\3\2\2\2\u00c5\26\3\2\2\2\u00c6\u00c7\7E\2\2\u00c7"+
		"\u00c8\7Q\2\2\u00c8\u00c9\7P\2\2\u00c9\u00ca\7V\2\2\u00ca\u00cb\7C\2\2"+
		"\u00cb\u00cc\7K\2\2\u00cc\u00cd\7P\2\2\u00cd\u00d7\7U\2\2\u00ce\u00cf"+
		"\7e\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7v\2\2\u00d2"+
		"\u00d3\7c\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7p\2\2\u00d5\u00d7\7u\2\2"+
		"\u00d6\u00c6\3\2\2\2\u00d6\u00ce\3\2\2\2\u00d7\30\3\2\2\2\u00d8\u00d9"+
		"\7K\2\2\u00d9\u00dd\7P\2\2\u00da\u00db\7k\2\2\u00db\u00dd\7p\2\2\u00dc"+
		"\u00d8\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\32\3\2\2\2\u00de\u00df\7O\2\2"+
		"\u00df\u00e0\7C\2\2\u00e0\u00e1\7V\2\2\u00e1\u00e2\7E\2\2\u00e2\u00e3"+
		"\7J\2\2\u00e3\u00e4\7G\2\2\u00e4\u00ed\7U\2\2\u00e5\u00e6\7o\2\2\u00e6"+
		"\u00e7\7c\2\2\u00e7\u00e8\7v\2\2\u00e8\u00e9\7e\2\2\u00e9\u00ea\7j\2\2"+
		"\u00ea\u00eb\7g\2\2\u00eb\u00ed\7u\2\2\u00ec\u00de\3\2\2\2\u00ec\u00e5"+
		"\3\2\2\2\u00ed\34\3\2\2\2\u00ee\u00ef\7V\2\2\u00ef\u00f0\7T\2\2\u00f0"+
		"\u00f1\7W\2\2\u00f1\u00f7\7G\2\2\u00f2\u00f3\7v\2\2\u00f3\u00f4\7t\2\2"+
		"\u00f4\u00f5\7w\2\2\u00f5\u00f7\7g\2\2\u00f6\u00ee\3\2\2\2\u00f6\u00f2"+
		"\3\2\2\2\u00f7\36\3\2\2\2\u00f8\u00f9\7H\2\2\u00f9\u00fa\7C\2\2\u00fa"+
		"\u00fb\7N\2\2\u00fb\u00fc\7U\2\2\u00fc\u0103\7G\2\2\u00fd\u00fe\7h\2\2"+
		"\u00fe\u00ff\7c\2\2\u00ff\u0100\7n\2\2\u0100\u0101\7u\2\2\u0101\u0103"+
		"\7g\2\2\u0102\u00f8\3\2\2\2\u0102\u00fd\3\2\2\2\u0103 \3\2\2\2\u0104\u0105"+
		"\7W\2\2\u0105\u0106\7P\2\2\u0106\u0107\7F\2\2\u0107\u0108\7G\2\2\u0108"+
		"\u0109\7H\2\2\u0109\u010a\7K\2\2\u010a\u010b\7P\2\2\u010b\u010c\7G\2\2"+
		"\u010c\u0117\7F\2\2\u010d\u010e\7w\2\2\u010e\u010f\7p\2\2\u010f\u0110"+
		"\7f\2\2\u0110\u0111\7g\2\2\u0111\u0112\7h\2\2\u0112\u0113\7k\2\2\u0113"+
		"\u0114\7p\2\2\u0114\u0115\7g\2\2\u0115\u0117\7f\2\2\u0116\u0104\3\2\2"+
		"\2\u0116\u010d\3\2\2\2\u0117\"\3\2\2\2\u0118\u0119\7P\2\2\u0119\u011a"+
		"\7W\2\2\u011a\u011b\7N\2\2\u011b\u0121\7N\2\2\u011c\u011d\7p\2\2\u011d"+
		"\u011e\7w\2\2\u011e\u011f\7n\2\2\u011f\u0121\7n\2\2\u0120\u0118\3\2\2"+
		"\2\u0120\u011c\3\2\2\2\u0121$\3\2\2\2\u0122\u0123\7C\2\2\u0123\u0124\7"+
		"P\2\2\u0124\u0129\7[\2\2\u0125\u0126\7c\2\2\u0126\u0127\7p\2\2\u0127\u0129"+
		"\7{\2\2\u0128\u0122\3\2\2\2\u0128\u0125\3\2\2\2\u0129&\3\2\2\2\u012a\u012b"+
		"\7P\2\2\u012b\u012c\7Q\2\2\u012c\u012d\7P\2\2\u012d\u0133\7G\2\2\u012e"+
		"\u012f\7p\2\2\u012f\u0130\7q\2\2\u0130\u0131\7p\2\2\u0131\u0133\7g\2\2"+
		"\u0132\u012a\3\2\2\2\u0132\u012e\3\2\2\2\u0133(\3\2\2\2\u0134\u0135\7"+
		"C\2\2\u0135\u0136\7N\2\2\u0136\u013b\7N\2\2\u0137\u0138\7c\2\2\u0138\u0139"+
		"\7n\2\2\u0139\u013b\7n\2\2\u013a\u0134\3\2\2\2\u013a\u0137\3\2\2\2\u013b"+
		"*\3\2\2\2\u013c\u013d\7Y\2\2\u013d\u013e\7K\2\2\u013e\u013f\7V\2\2\u013f"+
		"\u0145\7J\2\2\u0140\u0141\7y\2\2\u0141\u0142\7k\2\2\u0142\u0143\7v\2\2"+
		"\u0143\u0145\7j\2\2\u0144\u013c\3\2\2\2\u0144\u0140\3\2\2\2\u0145,\3\2"+
		"\2\2\u0146\u0147\7Q\2\2\u0147\u014b\7H\2\2\u0148\u0149\7q\2\2\u0149\u014b"+
		"\7h\2\2\u014a\u0146\3\2\2\2\u014a\u0148\3\2\2\2\u014b.\3\2\2\2\u014c\u014d"+
		"\7U\2\2\u014d\u014e\7C\2\2\u014e\u014f\7V\2\2\u014f\u0150\7K\2\2\u0150"+
		"\u0151\7U\2\2\u0151\u0152\7H\2\2\u0152\u0153\7K\2\2\u0153\u0154\7G\2\2"+
		"\u0154\u015f\7U\2\2\u0155\u0156\7u\2\2\u0156\u0157\7c\2\2\u0157\u0158"+
		"\7v\2\2\u0158\u0159\7k\2\2\u0159\u015a\7u\2\2\u015a\u015b\7h\2\2\u015b"+
		"\u015c\7k\2\2\u015c\u015d\7g\2\2\u015d\u015f\7u\2\2\u015e\u014c\3\2\2"+
		"\2\u015e\u0155\3\2\2\2\u015f\60\3\2\2\2\u0160\u0161\7@\2\2\u0161\62\3"+
		"\2\2\2\u0162\u0163\7@\2\2\u0163\u0164\7?\2\2\u0164\64\3\2\2\2\u0165\u0166"+
		"\7>\2\2\u0166\66\3\2\2\2\u0167\u0168\7>\2\2\u0168\u0169\7?\2\2\u01698"+
		"\3\2\2\2\u016a\u016b\7?\2\2\u016b:\3\2\2\2\u016c\u016d\7#\2\2\u016d\u016e"+
		"\7?\2\2\u016e<\3\2\2\2\u016f\u0170\7?\2\2\u0170\u0171\7?\2\2\u0171>\3"+
		"\2\2\2\u0172\u0173\7-\2\2\u0173@\3\2\2\2\u0174\u0175\7/\2\2\u0175B\3\2"+
		"\2\2\u0176\u0177\7,\2\2\u0177D\3\2\2\2\u0178\u0179\7\61\2\2\u0179F\3\2"+
		"\2\2\u017a\u017b\7\'\2\2\u017bH\3\2\2\2\u017c\u017d\7`\2\2\u017dJ\3\2"+
		"\2\2\u017e\u017f\7A\2\2\u017fL\3\2\2\2\u0180\u0181\7<\2\2\u0181N\3\2\2"+
		"\2\u0182\u0183\7*\2\2\u0183P\3\2\2\2\u0184\u0185\7+\2\2\u0185R\3\2\2\2"+
		"\u0186\u0187\7}\2\2\u0187T\3\2\2\2\u0188\u0189\7\177\2\2\u0189V\3\2\2"+
		"\2\u018a\u018b\7.\2\2\u018bX\3\2\2\2\u018c\u0190\7)\2\2\u018d\u018f\n"+
		"\4\2\2\u018e\u018d\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0190"+
		"\u0191\3\2\2\2\u0191\u0193\3\2\2\2\u0192\u0190\3\2\2\2\u0193\u0194\7)"+
		"\2\2\u0194Z\3\2\2\2\u0195\u0197\7/\2\2\u0196\u0195\3\2\2\2\u0197\u019a"+
		"\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019c\3\2\2\2\u019a"+
		"\u0198\3\2\2\2\u019b\u019d\5\5\3\2\u019c\u019b\3\2\2\2\u019d\u019e\3\2"+
		"\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\\\3\2\2\2\u01a0\u01a2"+
		"\7/\2\2\u01a1\u01a0\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3"+
		"\u01a4\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01a8\5\5"+
		"\3\2\u01a7\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9"+
		"\u01aa\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ad\7\60\2\2\u01ac\u01ae\5"+
		"\5\3\2\u01ad\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01ad\3\2\2\2\u01af"+
		"\u01b0\3\2\2\2\u01b0^\3\2\2\2\u01b1\u01b3\7]\2\2\u01b2\u01b4\5\5\3\2\u01b3"+
		"\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2"+
		"\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8\7_\2\2\u01b8`\3\2\2\2\u01b9\u01bb"+
		"\5\7\4\2\u01ba\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc"+
		"\u01bd\3\2\2\2\u01bd\u01c3\3\2\2\2\u01be\u01c2\5\7\4\2\u01bf\u01c2\5\5"+
		"\3\2\u01c0\u01c2\5_\60\2\u01c1\u01be\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1"+
		"\u01c0\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2"+
		"\2\2\u01c4b\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01c8\7&\2\2\u01c7\u01c9"+
		"\5\7\4\2\u01c8\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca"+
		"\u01cb\3\2\2\2\u01cb\u01d1\3\2\2\2\u01cc\u01d0\5\7\4\2\u01cd\u01d0\5\5"+
		"\3\2\u01ce\u01d0\5_\60\2\u01cf\u01cc\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf"+
		"\u01ce\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2"+
		"\2\2\u01d2d\3\2\2\2\u01d3\u01d1\3\2\2\2%\2hv|\u0084\u008a\u0098\u00aa"+
		"\u00c4\u00d6\u00dc\u00ec\u00f6\u0102\u0116\u0120\u0128\u0132\u013a\u0144"+
		"\u014a\u015e\u0190\u0198\u019e\u01a3\u01a9\u01af\u01b5\u01bc\u01c1\u01c3"+
		"\u01ca\u01cf\u01d1\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}