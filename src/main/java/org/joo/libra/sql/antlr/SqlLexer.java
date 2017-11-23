// Generated from /home/griever/Documents/javawork/libra/src/main/java/org/joo/libra/sql/antlr/SqlLexer.g4 by ANTLR 4.7

package org.joo.libra.sql.antlr;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class SqlLexer extends Lexer {
    static {
        RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
    public static final int AND = 1, OR = 2, NOT = 3, IS_EQUALS = 4, IS_EQUALS_NOT = 5, IS_EMPTY = 6, IS_NOT_EMPTY = 7,
            CONTAINS = 8, MATCHES = 9, TRUE = 10, FALSE = 11, UNDEFINED = 12, NULL = 13, GREATER_THAN = 14,
            GREATER_THAN_EQUALS = 15, LESS_THAN = 16, LESS_THAN_EQUALS = 17, EQUALS = 18, NOT_EQUALS = 19,
            DBL_EQUALS = 20, PLUS = 21, MINUS = 22, TIMES = 23, DIVIDE = 24, LPAREN = 25, RPAREN = 26, STRING = 27,
            INTEGER = 28, DOUBLE = 29, VARIABLE = 30, WS = 31;
    public static String[] channelNames = { "DEFAULT_TOKEN_CHANNEL", "HIDDEN" };

    public static String[] modeNames = { "DEFAULT_MODE" };

    public static final String[] ruleNames = { "Digit", "Alpha", "AND", "OR", "NOT", "IS_EQUALS", "IS_EQUALS_NOT",
            "IS_EMPTY", "IS_NOT_EMPTY", "CONTAINS", "MATCHES", "TRUE", "FALSE", "UNDEFINED", "NULL", "GREATER_THAN",
            "GREATER_THAN_EQUALS", "LESS_THAN", "LESS_THAN_EQUALS", "EQUALS", "NOT_EQUALS", "DBL_EQUALS", "PLUS",
            "MINUS", "TIMES", "DIVIDE", "LPAREN", "RPAREN", "STRING", "INTEGER", "DOUBLE", "VARIABLE", "WS" };

    private static final String[] _LITERAL_NAMES = {};
    private static final String[] _SYMBOLIC_NAMES = { null, "AND", "OR", "NOT", "IS_EQUALS", "IS_EQUALS_NOT",
            "IS_EMPTY", "IS_NOT_EMPTY", "CONTAINS", "MATCHES", "TRUE", "FALSE", "UNDEFINED", "NULL", "GREATER_THAN",
            "GREATER_THAN_EQUALS", "LESS_THAN", "LESS_THAN_EQUALS", "EQUALS", "NOT_EQUALS", "DBL_EQUALS", "PLUS",
            "MINUS", "TIMES", "DIVIDE", "LPAREN", "RPAREN", "STRING", "INTEGER", "DOUBLE", "VARIABLE", "WS" };
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

    /**
     * @deprecated Use {@link #getVocabulary()} instead
     */
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
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    public String getGrammarFileName() {
        return "SqlLexer.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public static final String _serializedATN = "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u013f\b\1\4\2\t"
            + "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"
            + "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"
            + "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"
            + "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"
            + "\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4P\n\4\3\5\3\5\3"
            + "\5\3\5\5\5V\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6^\n\6\3\7\3\7\3\7\3\7\5\7d"
            + "\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\br\n\b\3\t\3\t"
            + "\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0084\n\t"
            + "\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"
            + "\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u009e\n\n\3\13\3\13\3\13\3\13\3\13\3\13"
            + "\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b0\n\13\3\f"
            + "\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c0\n\f\3\r"
            + "\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ca\n\r\3\16\3\16\3\16\3\16\3\16\3"
            + "\16\3\16\3\16\3\16\3\16\5\16\u00d6\n\16\3\17\3\17\3\17\3\17\3\17\3\17"
            + "\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ea"
            + "\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00f4\n\20\3\21\3\21"
            + "\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27"
            + "\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"
            + "\3\36\3\36\7\36\u0116\n\36\f\36\16\36\u0119\13\36\3\36\3\36\3\37\6\37"
            + "\u011e\n\37\r\37\16\37\u011f\3 \6 \u0123\n \r \16 \u0124\3 \3 \6 \u0129"
            + "\n \r \16 \u012a\3!\6!\u012e\n!\r!\16!\u012f\3!\3!\7!\u0134\n!\f!\16!"
            + "\u0137\13!\3\"\6\"\u013a\n\"\r\"\16\"\u013b\3\"\3\"\2\2#\3\2\5\2\7\3\t"
            + "\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22"
            + "\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!\3\2"
            + "\5\7\2\60\60C]__aac|\5\2\f\f\17\17))\4\2\13\13\"\"\2\u0151\2\7\3\2\2\2"
            + "\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"
            + "\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"
            + "\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"
            + "\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"
            + "\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"
            + "\2\2C\3\2\2\2\3E\3\2\2\2\5G\3\2\2\2\7O\3\2\2\2\tU\3\2\2\2\13]\3\2\2\2"
            + "\rc\3\2\2\2\17q\3\2\2\2\21\u0083\3\2\2\2\23\u009d\3\2\2\2\25\u00af\3\2"
            + "\2\2\27\u00bf\3\2\2\2\31\u00c9\3\2\2\2\33\u00d5\3\2\2\2\35\u00e9\3\2\2"
            + "\2\37\u00f3\3\2\2\2!\u00f5\3\2\2\2#\u00f7\3\2\2\2%\u00fa\3\2\2\2\'\u00fc"
            + "\3\2\2\2)\u00ff\3\2\2\2+\u0101\3\2\2\2-\u0104\3\2\2\2/\u0107\3\2\2\2\61"
            + "\u0109\3\2\2\2\63\u010b\3\2\2\2\65\u010d\3\2\2\2\67\u010f\3\2\2\29\u0111"
            + "\3\2\2\2;\u0113\3\2\2\2=\u011d\3\2\2\2?\u0122\3\2\2\2A\u012d\3\2\2\2C"
            + "\u0139\3\2\2\2EF\4\62;\2F\4\3\2\2\2GH\t\2\2\2H\6\3\2\2\2IJ\7C\2\2JK\7"
            + "P\2\2KP\7F\2\2LM\7c\2\2MN\7p\2\2NP\7f\2\2OI\3\2\2\2OL\3\2\2\2P\b\3\2\2"
            + "\2QR\7Q\2\2RV\7T\2\2ST\7q\2\2TV\7t\2\2UQ\3\2\2\2US\3\2\2\2V\n\3\2\2\2"
            + "WX\7P\2\2XY\7Q\2\2Y^\7V\2\2Z[\7p\2\2[\\\7q\2\2\\^\7v\2\2]W\3\2\2\2]Z\3"
            + "\2\2\2^\f\3\2\2\2_`\7K\2\2`d\7U\2\2ab\7k\2\2bd\7u\2\2c_\3\2\2\2ca\3\2"
            + "\2\2d\16\3\2\2\2ef\7K\2\2fg\7U\2\2gh\7\"\2\2hi\7P\2\2ij\7Q\2\2jr\7V\2"
            + "\2kl\7k\2\2lm\7u\2\2mn\7\"\2\2no\7p\2\2op\7q\2\2pr\7v\2\2qe\3\2\2\2qk"
            + "\3\2\2\2r\20\3\2\2\2st\7K\2\2tu\7U\2\2uv\7\"\2\2vw\7G\2\2wx\7O\2\2xy\7"
            + "R\2\2yz\7V\2\2z\u0084\7[\2\2{|\7k\2\2|}\7u\2\2}~\7\"\2\2~\177\7g\2\2\177"
            + "\u0080\7o\2\2\u0080\u0081\7r\2\2\u0081\u0082\7v\2\2\u0082\u0084\7{\2\2"
            + "\u0083s\3\2\2\2\u0083{\3\2\2\2\u0084\22\3\2\2\2\u0085\u0086\7K\2\2\u0086"
            + "\u0087\7U\2\2\u0087\u0088\7\"\2\2\u0088\u0089\7P\2\2\u0089\u008a\7Q\2"
            + "\2\u008a\u008b\7V\2\2\u008b\u008c\7\"\2\2\u008c\u008d\7G\2\2\u008d\u008e"
            + "\7O\2\2\u008e\u008f\7R\2\2\u008f\u0090\7V\2\2\u0090\u009e\7[\2\2\u0091"
            + "\u0092\7k\2\2\u0092\u0093\7u\2\2\u0093\u0094\7\"\2\2\u0094\u0095\7p\2"
            + "\2\u0095\u0096\7q\2\2\u0096\u0097\7v\2\2\u0097\u0098\7\"\2\2\u0098\u0099"
            + "\7g\2\2\u0099\u009a\7o\2\2\u009a\u009b\7r\2\2\u009b\u009c\7v\2\2\u009c"
            + "\u009e\7{\2\2\u009d\u0085\3\2\2\2\u009d\u0091\3\2\2\2\u009e\24\3\2\2\2"
            + "\u009f\u00a0\7E\2\2\u00a0\u00a1\7Q\2\2\u00a1\u00a2\7P\2\2\u00a2\u00a3"
            + "\7V\2\2\u00a3\u00a4\7C\2\2\u00a4\u00a5\7K\2\2\u00a5\u00a6\7P\2\2\u00a6"
            + "\u00b0\7U\2\2\u00a7\u00a8\7e\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7p\2\2"
            + "\u00aa\u00ab\7v\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae"
            + "\7p\2\2\u00ae\u00b0\7u\2\2\u00af\u009f\3\2\2\2\u00af\u00a7\3\2\2\2\u00b0"
            + "\26\3\2\2\2\u00b1\u00b2\7O\2\2\u00b2\u00b3\7C\2\2\u00b3\u00b4\7V\2\2\u00b4"
            + "\u00b5\7E\2\2\u00b5\u00b6\7J\2\2\u00b6\u00b7\7G\2\2\u00b7\u00c0\7U\2\2"
            + "\u00b8\u00b9\7o\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc"
            + "\7e\2\2\u00bc\u00bd\7j\2\2\u00bd\u00be\7g\2\2\u00be\u00c0\7u\2\2\u00bf"
            + "\u00b1\3\2\2\2\u00bf\u00b8\3\2\2\2\u00c0\30\3\2\2\2\u00c1\u00c2\7V\2\2"
            + "\u00c2\u00c3\7T\2\2\u00c3\u00c4\7W\2\2\u00c4\u00ca\7G\2\2\u00c5\u00c6"
            + "\7v\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8\7w\2\2\u00c8\u00ca\7g\2\2\u00c9"
            + "\u00c1\3\2\2\2\u00c9\u00c5\3\2\2\2\u00ca\32\3\2\2\2\u00cb\u00cc\7H\2\2"
            + "\u00cc\u00cd\7C\2\2\u00cd\u00ce\7N\2\2\u00ce\u00cf\7U\2\2\u00cf\u00d6"
            + "\7G\2\2\u00d0\u00d1\7h\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7n\2\2\u00d3"
            + "\u00d4\7u\2\2\u00d4\u00d6\7g\2\2\u00d5\u00cb\3\2\2\2\u00d5\u00d0\3\2\2"
            + "\2\u00d6\34\3\2\2\2\u00d7\u00d8\7W\2\2\u00d8\u00d9\7P\2\2\u00d9\u00da"
            + "\7F\2\2\u00da\u00db\7G\2\2\u00db\u00dc\7H\2\2\u00dc\u00dd\7K\2\2\u00dd"
            + "\u00de\7P\2\2\u00de\u00df\7G\2\2\u00df\u00ea\7F\2\2\u00e0\u00e1\7w\2\2"
            + "\u00e1\u00e2\7p\2\2\u00e2\u00e3\7f\2\2\u00e3\u00e4\7g\2\2\u00e4\u00e5"
            + "\7h\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8\7g\2\2\u00e8"
            + "\u00ea\7f\2\2\u00e9\u00d7\3\2\2\2\u00e9\u00e0\3\2\2\2\u00ea\36\3\2\2\2"
            + "\u00eb\u00ec\7P\2\2\u00ec\u00ed\7W\2\2\u00ed\u00ee\7N\2\2\u00ee\u00f4"
            + "\7N\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1\7w\2\2\u00f1\u00f2\7n\2\2\u00f2"
            + "\u00f4\7n\2\2\u00f3\u00eb\3\2\2\2\u00f3\u00ef\3\2\2\2\u00f4 \3\2\2\2\u00f5"
            + "\u00f6\7@\2\2\u00f6\"\3\2\2\2\u00f7\u00f8\7@\2\2\u00f8\u00f9\7?\2\2\u00f9"
            + "$\3\2\2\2\u00fa\u00fb\7>\2\2\u00fb&\3\2\2\2\u00fc\u00fd\7>\2\2\u00fd\u00fe"
            + "\7?\2\2\u00fe(\3\2\2\2\u00ff\u0100\7?\2\2\u0100*\3\2\2\2\u0101\u0102\7"
            + "#\2\2\u0102\u0103\7?\2\2\u0103,\3\2\2\2\u0104\u0105\7?\2\2\u0105\u0106"
            + "\7?\2\2\u0106.\3\2\2\2\u0107\u0108\7-\2\2\u0108\60\3\2\2\2\u0109\u010a"
            + "\7/\2\2\u010a\62\3\2\2\2\u010b\u010c\7,\2\2\u010c\64\3\2\2\2\u010d\u010e"
            + "\7\61\2\2\u010e\66\3\2\2\2\u010f\u0110\7*\2\2\u01108\3\2\2\2\u0111\u0112"
            + "\7+\2\2\u0112:\3\2\2\2\u0113\u0117\7)\2\2\u0114\u0116\n\3\2\2\u0115\u0114"
            + "\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118"
            + "\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011b\7)\2\2\u011b<\3\2\2\2\u011c"
            + "\u011e\5\3\2\2\u011d\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d\3\2"
            + "\2\2\u011f\u0120\3\2\2\2\u0120>\3\2\2\2\u0121\u0123\5\3\2\2\u0122\u0121"
            + "\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125"
            + "\u0126\3\2\2\2\u0126\u0128\7\60\2\2\u0127\u0129\5\3\2\2\u0128\u0127\3"
            + "\2\2\2\u0129\u012a\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b"
            + "@\3\2\2\2\u012c\u012e\5\5\3\2\u012d\u012c\3\2\2\2\u012e\u012f\3\2\2\2"
            + "\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0135\3\2\2\2\u0131\u0134"
            + "\5\5\3\2\u0132\u0134\5\3\2\2\u0133\u0131\3\2\2\2\u0133\u0132\3\2\2\2\u0134"
            + "\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136B\3\2\2\2"
            + "\u0137\u0135\3\2\2\2\u0138\u013a\t\4\2\2\u0139\u0138\3\2\2\2\u013a\u013b"
            + "\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d"
            + "\u013e\b\"\2\2\u013eD\3\2\2\2\30\2OU]cq\u0083\u009d\u00af\u00bf\u00c9"
            + "\u00d5\u00e9\u00f3\u0117\u011f\u0124\u012a\u012f\u0133\u0135\u013b\3\2" + "\3\2";
    public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}