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
		"Digit", "Alpha", "AND", "OR", "NOT", "IS_EQUALS", "IS_EQUALS_NOT", "CONTAINS", 
		"MATCHES", "TRUE", "FALSE", "UNDEFINED", "NULL", "EMPTY", "GREATER_THAN", 
		"GREATER_THAN_EQUALS", "LESS_THAN", "LESS_THAN_EQUALS", "EQUALS", "NOT_EQUALS", 
		"DBL_EQUALS", "PLUS", "MINUS", "TIMES", "DIVIDE", "LPAREN", "RPAREN", 
		"STRING", "INTEGER", "DOUBLE", "VARIABLE", "WS"
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
		"\t!\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4N\n\4\3\5\3\5\3\5\3\5\5"+
		"\5T\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\\\n\6\3\7\3\7\3\7\3\7\5\7b\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bp\n\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0082\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0092\n\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u009c\n\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\5\f\u00a8\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00bc\n\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u00c6\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u00d2\n\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\7\35\u00f4\n\35\f\35"+
		"\16\35\u00f7\13\35\3\35\3\35\3\36\6\36\u00fc\n\36\r\36\16\36\u00fd\3\37"+
		"\6\37\u0101\n\37\r\37\16\37\u0102\3\37\3\37\6\37\u0107\n\37\r\37\16\37"+
		"\u0108\3 \6 \u010c\n \r \16 \u010d\3 \3 \7 \u0112\n \f \16 \u0115\13 "+
		"\3!\6!\u0118\n!\r!\16!\u0119\3!\3!\2\2\"\3\2\5\2\7\3\t\4\13\5\r\6\17\7"+
		"\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-"+
		"\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A \3\2\5\7\2\60\60C]__"+
		"aac|\5\2\f\f\17\17))\4\2\13\13\"\"\2\u012e\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2\2\5E"+
		"\3\2\2\2\7M\3\2\2\2\tS\3\2\2\2\13[\3\2\2\2\ra\3\2\2\2\17o\3\2\2\2\21\u0081"+
		"\3\2\2\2\23\u0091\3\2\2\2\25\u009b\3\2\2\2\27\u00a7\3\2\2\2\31\u00bb\3"+
		"\2\2\2\33\u00c5\3\2\2\2\35\u00d1\3\2\2\2\37\u00d3\3\2\2\2!\u00d5\3\2\2"+
		"\2#\u00d8\3\2\2\2%\u00da\3\2\2\2\'\u00dd\3\2\2\2)\u00df\3\2\2\2+\u00e2"+
		"\3\2\2\2-\u00e5\3\2\2\2/\u00e7\3\2\2\2\61\u00e9\3\2\2\2\63\u00eb\3\2\2"+
		"\2\65\u00ed\3\2\2\2\67\u00ef\3\2\2\29\u00f1\3\2\2\2;\u00fb\3\2\2\2=\u0100"+
		"\3\2\2\2?\u010b\3\2\2\2A\u0117\3\2\2\2CD\4\62;\2D\4\3\2\2\2EF\t\2\2\2"+
		"F\6\3\2\2\2GH\7C\2\2HI\7P\2\2IN\7F\2\2JK\7c\2\2KL\7p\2\2LN\7f\2\2MG\3"+
		"\2\2\2MJ\3\2\2\2N\b\3\2\2\2OP\7Q\2\2PT\7T\2\2QR\7q\2\2RT\7t\2\2SO\3\2"+
		"\2\2SQ\3\2\2\2T\n\3\2\2\2UV\7P\2\2VW\7Q\2\2W\\\7V\2\2XY\7p\2\2YZ\7q\2"+
		"\2Z\\\7v\2\2[U\3\2\2\2[X\3\2\2\2\\\f\3\2\2\2]^\7K\2\2^b\7U\2\2_`\7k\2"+
		"\2`b\7u\2\2a]\3\2\2\2a_\3\2\2\2b\16\3\2\2\2cd\7K\2\2de\7U\2\2ef\7\"\2"+
		"\2fg\7P\2\2gh\7Q\2\2hp\7V\2\2ij\7k\2\2jk\7u\2\2kl\7\"\2\2lm\7p\2\2mn\7"+
		"q\2\2np\7v\2\2oc\3\2\2\2oi\3\2\2\2p\20\3\2\2\2qr\7E\2\2rs\7Q\2\2st\7P"+
		"\2\2tu\7V\2\2uv\7C\2\2vw\7K\2\2wx\7P\2\2x\u0082\7U\2\2yz\7e\2\2z{\7q\2"+
		"\2{|\7p\2\2|}\7v\2\2}~\7c\2\2~\177\7k\2\2\177\u0080\7p\2\2\u0080\u0082"+
		"\7u\2\2\u0081q\3\2\2\2\u0081y\3\2\2\2\u0082\22\3\2\2\2\u0083\u0084\7O"+
		"\2\2\u0084\u0085\7C\2\2\u0085\u0086\7V\2\2\u0086\u0087\7E\2\2\u0087\u0088"+
		"\7J\2\2\u0088\u0089\7G\2\2\u0089\u0092\7U\2\2\u008a\u008b\7o\2\2\u008b"+
		"\u008c\7c\2\2\u008c\u008d\7v\2\2\u008d\u008e\7e\2\2\u008e\u008f\7j\2\2"+
		"\u008f\u0090\7g\2\2\u0090\u0092\7u\2\2\u0091\u0083\3\2\2\2\u0091\u008a"+
		"\3\2\2\2\u0092\24\3\2\2\2\u0093\u0094\7V\2\2\u0094\u0095\7T\2\2\u0095"+
		"\u0096\7W\2\2\u0096\u009c\7G\2\2\u0097\u0098\7v\2\2\u0098\u0099\7t\2\2"+
		"\u0099\u009a\7w\2\2\u009a\u009c\7g\2\2\u009b\u0093\3\2\2\2\u009b\u0097"+
		"\3\2\2\2\u009c\26\3\2\2\2\u009d\u009e\7H\2\2\u009e\u009f\7C\2\2\u009f"+
		"\u00a0\7N\2\2\u00a0\u00a1\7U\2\2\u00a1\u00a8\7G\2\2\u00a2\u00a3\7h\2\2"+
		"\u00a3\u00a4\7c\2\2\u00a4\u00a5\7n\2\2\u00a5\u00a6\7u\2\2\u00a6\u00a8"+
		"\7g\2\2\u00a7\u009d\3\2\2\2\u00a7\u00a2\3\2\2\2\u00a8\30\3\2\2\2\u00a9"+
		"\u00aa\7W\2\2\u00aa\u00ab\7P\2\2\u00ab\u00ac\7F\2\2\u00ac\u00ad\7G\2\2"+
		"\u00ad\u00ae\7H\2\2\u00ae\u00af\7K\2\2\u00af\u00b0\7P\2\2\u00b0\u00b1"+
		"\7G\2\2\u00b1\u00bc\7F\2\2\u00b2\u00b3\7w\2\2\u00b3\u00b4\7p\2\2\u00b4"+
		"\u00b5\7f\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7h\2\2\u00b7\u00b8\7k\2\2"+
		"\u00b8\u00b9\7p\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bc\7f\2\2\u00bb\u00a9"+
		"\3\2\2\2\u00bb\u00b2\3\2\2\2\u00bc\32\3\2\2\2\u00bd\u00be\7P\2\2\u00be"+
		"\u00bf\7W\2\2\u00bf\u00c0\7N\2\2\u00c0\u00c6\7N\2\2\u00c1\u00c2\7p\2\2"+
		"\u00c2\u00c3\7w\2\2\u00c3\u00c4\7n\2\2\u00c4\u00c6\7n\2\2\u00c5\u00bd"+
		"\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c6\34\3\2\2\2\u00c7\u00c8\7G\2\2\u00c8"+
		"\u00c9\7O\2\2\u00c9\u00ca\7R\2\2\u00ca\u00cb\7V\2\2\u00cb\u00d2\7[\2\2"+
		"\u00cc\u00cd\7g\2\2\u00cd\u00ce\7o\2\2\u00ce\u00cf\7r\2\2\u00cf\u00d0"+
		"\7v\2\2\u00d0\u00d2\7{\2\2\u00d1\u00c7\3\2\2\2\u00d1\u00cc\3\2\2\2\u00d2"+
		"\36\3\2\2\2\u00d3\u00d4\7@\2\2\u00d4 \3\2\2\2\u00d5\u00d6\7@\2\2\u00d6"+
		"\u00d7\7?\2\2\u00d7\"\3\2\2\2\u00d8\u00d9\7>\2\2\u00d9$\3\2\2\2\u00da"+
		"\u00db\7>\2\2\u00db\u00dc\7?\2\2\u00dc&\3\2\2\2\u00dd\u00de\7?\2\2\u00de"+
		"(\3\2\2\2\u00df\u00e0\7#\2\2\u00e0\u00e1\7?\2\2\u00e1*\3\2\2\2\u00e2\u00e3"+
		"\7?\2\2\u00e3\u00e4\7?\2\2\u00e4,\3\2\2\2\u00e5\u00e6\7-\2\2\u00e6.\3"+
		"\2\2\2\u00e7\u00e8\7/\2\2\u00e8\60\3\2\2\2\u00e9\u00ea\7,\2\2\u00ea\62"+
		"\3\2\2\2\u00eb\u00ec\7\61\2\2\u00ec\64\3\2\2\2\u00ed\u00ee\7*\2\2\u00ee"+
		"\66\3\2\2\2\u00ef\u00f0\7+\2\2\u00f08\3\2\2\2\u00f1\u00f5\7)\2\2\u00f2"+
		"\u00f4\n\3\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2"+
		"\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8"+
		"\u00f9\7)\2\2\u00f9:\3\2\2\2\u00fa\u00fc\5\3\2\2\u00fb\u00fa\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe<\3\2\2\2"+
		"\u00ff\u0101\5\3\2\2\u0100\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0100"+
		"\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\7\60\2\2"+
		"\u0105\u0107\5\3\2\2\u0106\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0106"+
		"\3\2\2\2\u0108\u0109\3\2\2\2\u0109>\3\2\2\2\u010a\u010c\5\5\3\2\u010b"+
		"\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2"+
		"\2\2\u010e\u0113\3\2\2\2\u010f\u0112\5\5\3\2\u0110\u0112\5\3\2\2\u0111"+
		"\u010f\3\2\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0113\u0114\3\2\2\2\u0114@\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0118"+
		"\t\4\2\2\u0117\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\b!\2\2\u011cB\3\2\2\2\27"+
		"\2MS[ao\u0081\u0091\u009b\u00a7\u00bb\u00c5\u00d1\u00f5\u00fd\u0102\u0108"+
		"\u010d\u0111\u0113\u0119\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}