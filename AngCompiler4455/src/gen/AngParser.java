// Generated from C:/Users/ASUS/Desktop/AngCompiler4455/src/AngParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AngParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		At=1, OpenBracket=2, CloseBracket=3, OpenParen=4, CloseParen=5, OpenBrace=6, 
		CloseBrace=7, SemiColon=8, Comma=9, Assign=10, Colon=11, Ellipsis=12, 
		Dot=13, PlusPlus=14, MinusMinus=15, Plus=16, Minus=17, BitNot=18, Not=19, 
		Multiply=20, Divide=21, Modulus=22, Power=23, NullCoalesce=24, QuestionMark=25, 
		Hashtag=26, RightShiftArithmetic=27, LeftShiftArithmetic=28, RightShiftLogical=29, 
		LessThan=30, MoreThan=31, LessThanEquals=32, GreaterThanEquals=33, Equals_=34, 
		NotEquals=35, Dolar=36, IdentityEquals=37, IdentityNotEquals=38, BitAnd=39, 
		BitXOr=40, BitOr=41, And=42, Or=43, MultiplyAssign=44, DivideAssign=45, 
		ModulusAssign=46, PlusAssign=47, MinusAssign=48, LeftShiftArithmeticAssign=49, 
		RightShiftArithmeticAssign=50, RightShiftLogicalAssign=51, BitAndAssign=52, 
		BitXorAssign=53, BitOrAssign=54, PowerAssign=55, ARROW=56, Null=57, Import=58, 
		Break=59, Map=60, Do=61, Instanceof=62, Typeof=63, Case=64, Else=65, New=66, 
		Var=67, Catch=68, Finally=69, Return=70, Void=71, Continue=72, Console=73, 
		For=74, Switch=75, While=76, Debugger=77, Function=78, This=79, With=80, 
		Default=81, If=82, Throw=83, Delete=84, In=85, Try=86, As=87, From=88, 
		UseState=89, UseRef=90, UseEffect=91, Class=92, Enum=93, Extends=94, Super=95, 
		Const=96, Export=97, Async=98, Await=99, Implements=100, Let=101, Private=102, 
		Public=103, Interface=104, Package=105, Protected=106, Static=107, Yield=108, 
		React=109, Number1=110, String=111, Boolean1=112, Log=113, Tuple=114, 
		Any=115, Array=116, CreateElement=117, Boolean=118, Number=119, ID=120, 
		ID2=121, EnumID=122, DecimalLiteral=123, StringLiteral=124, BackTick=125, 
		JsxComment=126, MultiLineComment=127, HtmlComment=128, SingleLineComment=129, 
		UnexpectedCharacter=130, CDATA=131, TemplateStringStartExpression=132, 
		TemplateStringAtom=133;
	public static final int
		RULE_app = 0, RULE_codeLine = 1, RULE_statments = 2, RULE_class = 3, RULE_header_body_value = 4, 
		RULE_header_body = 5, RULE_header = 6, RULE_import_statment = 7, RULE_html_template = 8, 
		RULE_htmlElement = 9, RULE_htmlContent = 10, RULE_htmltext = 11, RULE_operation = 12, 
		RULE_htmlsubcontent = 13, RULE_htmlAttribute = 14, RULE_htmlAttributeValue = 15, 
		RULE_datatype = 16, RULE_keyWord = 17, RULE_keyWordValues = 18, RULE_variableStatement = 19, 
		RULE_enumCreation = 20, RULE_varType = 21, RULE_enumStatment = 22, RULE_enumItem = 23, 
		RULE_functionBodyStatments = 24, RULE_functionAttributes = 25, RULE_functionBody = 26, 
		RULE_functionStatment = 27, RULE_printStatment = 28, RULE_definelist = 29, 
		RULE_row = 30, RULE_rowvalue = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"app", "codeLine", "statments", "class", "header_body_value", "header_body", 
			"header", "import_statment", "html_template", "htmlElement", "htmlContent", 
			"htmltext", "operation", "htmlsubcontent", "htmlAttribute", "htmlAttributeValue", 
			"datatype", "keyWord", "keyWordValues", "variableStatement", "enumCreation", 
			"varType", "enumStatment", "enumItem", "functionBodyStatments", "functionAttributes", 
			"functionBody", "functionStatment", "printStatment", "definelist", "row", 
			"rowvalue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@'", "'['", "']'", "'('", "')'", "'{'", "'}'", "';'", "','", 
			"'='", "':'", "'...'", "'.'", "'++'", "'--'", "'+'", "'-'", "'~'", "'!'", 
			"'*'", "'/'", "'%'", "'**'", "'??'", "'?'", "'#'", "'>>'", "'<<'", "'>>>'", 
			"'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'$'", "'==='", "'!=='", 
			"'&'", "'^'", "'|'", "'&&'", "'||'", "'*='", "'/='", "'%='", "'+='", 
			"'-='", "'<<='", "'>>='", "'>>>='", "'&='", "'^='", "'|='", "'**='", 
			"'=>'", "'null'", "'import'", "'break'", "'map'", "'do'", "'instanceof'", 
			"'typeof'", "'case'", "'else'", "'new'", "'var'", "'catch'", "'finally'", 
			"'return'", "'void'", "'continue'", "'console'", "'for'", "'switch'", 
			"'while'", "'debugger'", "'function'", "'this'", "'with'", "'default'", 
			"'if'", "'throw'", "'delete'", "'in'", "'try'", "'as'", "'from'", "'useState'", 
			"'useRef'", "'useEffect'", "'class'", "'enum'", "'extends'", "'super'", 
			"'const'", "'export'", "'async'", "'await'", "'implements'", "'let'", 
			"'private'", "'public'", "'interface'", "'package'", "'protected'", "'static'", 
			"'yield'", "'React'", "'number'", "'string'", "'boolean'", "'log'", "'tuple'", 
			"'any'", "'Array'", null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "'${'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "At", "OpenBracket", "CloseBracket", "OpenParen", "CloseParen", 
			"OpenBrace", "CloseBrace", "SemiColon", "Comma", "Assign", "Colon", "Ellipsis", 
			"Dot", "PlusPlus", "MinusMinus", "Plus", "Minus", "BitNot", "Not", "Multiply", 
			"Divide", "Modulus", "Power", "NullCoalesce", "QuestionMark", "Hashtag", 
			"RightShiftArithmetic", "LeftShiftArithmetic", "RightShiftLogical", "LessThan", 
			"MoreThan", "LessThanEquals", "GreaterThanEquals", "Equals_", "NotEquals", 
			"Dolar", "IdentityEquals", "IdentityNotEquals", "BitAnd", "BitXOr", "BitOr", 
			"And", "Or", "MultiplyAssign", "DivideAssign", "ModulusAssign", "PlusAssign", 
			"MinusAssign", "LeftShiftArithmeticAssign", "RightShiftArithmeticAssign", 
			"RightShiftLogicalAssign", "BitAndAssign", "BitXorAssign", "BitOrAssign", 
			"PowerAssign", "ARROW", "Null", "Import", "Break", "Map", "Do", "Instanceof", 
			"Typeof", "Case", "Else", "New", "Var", "Catch", "Finally", "Return", 
			"Void", "Continue", "Console", "For", "Switch", "While", "Debugger", 
			"Function", "This", "With", "Default", "If", "Throw", "Delete", "In", 
			"Try", "As", "From", "UseState", "UseRef", "UseEffect", "Class", "Enum", 
			"Extends", "Super", "Const", "Export", "Async", "Await", "Implements", 
			"Let", "Private", "Public", "Interface", "Package", "Protected", "Static", 
			"Yield", "React", "Number1", "String", "Boolean1", "Log", "Tuple", "Any", 
			"Array", "CreateElement", "Boolean", "Number", "ID", "ID2", "EnumID", 
			"DecimalLiteral", "StringLiteral", "BackTick", "JsxComment", "MultiLineComment", 
			"HtmlComment", "SingleLineComment", "UnexpectedCharacter", "CDATA", "TemplateStringStartExpression", 
			"TemplateStringAtom"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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

	@Override
	public String getGrammarFileName() { return "AngParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AppContext extends ParserRuleContext {
		public List<CodeLineContext> codeLine() {
			return getRuleContexts(CodeLineContext.class);
		}
		public CodeLineContext codeLine(int i) {
			return getRuleContext(CodeLineContext.class,i);
		}
		public AppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_app; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterApp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitApp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitApp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppContext app() throws RecognitionException {
		AppContext _localctx = new AppContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_app);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(64);
				codeLine();
				}
				}
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 288230377225453570L) != 0) || _la==Export );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CodeLineContext extends ParserRuleContext {
		public CodeLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeLine; }
	 
		public CodeLineContext() { }
		public void copyFrom(CodeLineContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportContext extends CodeLineContext {
		public Import_statmentContext import_statment() {
			return getRuleContext(Import_statmentContext.class,0);
		}
		public ImportContext(CodeLineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitImport(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassCodeContext extends CodeLineContext {
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
		}
		public ClassCodeContext(CodeLineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterClassCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitClassCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitClassCode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HeadersContext extends CodeLineContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public HeadersContext(CodeLineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterHeaders(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitHeaders(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitHeaders(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContext extends CodeLineContext {
		public Html_templateContext html_template() {
			return getRuleContext(Html_templateContext.class,0);
		}
		public HtmlContext(CodeLineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitHtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitHtml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeLineContext codeLine() throws RecognitionException {
		CodeLineContext _localctx = new CodeLineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_codeLine);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Import:
				_localctx = new ImportContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				import_statment();
				}
				break;
			case At:
				_localctx = new HeadersContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				header();
				}
				break;
			case Export:
				_localctx = new ClassCodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				class_();
				}
				break;
			case LessThan:
				_localctx = new HtmlContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				html_template();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatmentsContext extends ParserRuleContext {
		public StatmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statments; }
	 
		public StatmentsContext() { }
		public void copyFrom(StatmentsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EnumCreationRulesContext extends StatmentsContext {
		public EnumCreationContext enumCreation() {
			return getRuleContext(EnumCreationContext.class,0);
		}
		public EnumCreationRulesContext(StatmentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterEnumCreationRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitEnumCreationRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitEnumCreationRules(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionStatementRulesContext extends StatmentsContext {
		public FunctionStatmentContext functionStatment() {
			return getRuleContext(FunctionStatmentContext.class,0);
		}
		public FunctionStatementRulesContext(StatmentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterFunctionStatementRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitFunctionStatementRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitFunctionStatementRules(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DatatypeRuleContext extends StatmentsContext {
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public DatatypeRuleContext(StatmentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterDatatypeRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitDatatypeRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitDatatypeRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatmentsContext statments() throws RecognitionException {
		StatmentsContext _localctx = new StatmentsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statments);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new FunctionStatementRulesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				functionStatment();
				}
				break;
			case 2:
				_localctx = new DatatypeRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				datatype();
				}
				break;
			case 3:
				_localctx = new EnumCreationRulesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				enumCreation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassContext extends ParserRuleContext {
		public TerminalNode Export() { return getToken(AngParser.Export, 0); }
		public TerminalNode Class() { return getToken(AngParser.Class, 0); }
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public TerminalNode OpenBrace() { return getToken(AngParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(AngParser.CloseBrace, 0); }
		public List<StatmentsContext> statments() {
			return getRuleContexts(StatmentsContext.class);
		}
		public StatmentsContext statments(int i) {
			return getRuleContext(StatmentsContext.class,i);
		}
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(Export);
			setState(81);
			match(Class);
			setState(82);
			match(ID);
			setState(83);
			match(OpenBrace);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 9007217038596097L) != 0)) {
				{
				{
				setState(84);
				statments();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Header_body_valueContext extends ParserRuleContext {
		public Header_body_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header_body_value; }
	 
		public Header_body_valueContext() { }
		public void copyFrom(Header_body_valueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BackTickRuleContext extends Header_body_valueContext {
		public List<TerminalNode> BackTick() { return getTokens(AngParser.BackTick); }
		public TerminalNode BackTick(int i) {
			return getToken(AngParser.BackTick, i);
		}
		public Html_templateContext html_template() {
			return getRuleContext(Html_templateContext.class,0);
		}
		public BackTickRuleContext(Header_body_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterBackTickRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitBackTickRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitBackTickRule(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralRuleContext extends Header_body_valueContext {
		public TerminalNode StringLiteral() { return getToken(AngParser.StringLiteral, 0); }
		public StringLiteralRuleContext(Header_body_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterStringLiteralRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitStringLiteralRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitStringLiteralRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Header_body_valueContext header_body_value() throws RecognitionException {
		Header_body_valueContext _localctx = new Header_body_valueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_header_body_value);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
				_localctx = new StringLiteralRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(StringLiteral);
				}
				break;
			case BackTick:
				_localctx = new BackTickRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(BackTick);
				setState(94);
				html_template();
				setState(95);
				match(BackTick);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Header_bodyContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public TerminalNode Colon() { return getToken(AngParser.Colon, 0); }
		public TerminalNode OpenBracket() { return getToken(AngParser.OpenBracket, 0); }
		public List<Header_body_valueContext> header_body_value() {
			return getRuleContexts(Header_body_valueContext.class);
		}
		public Header_body_valueContext header_body_value(int i) {
			return getRuleContext(Header_body_valueContext.class,i);
		}
		public TerminalNode CloseBracket() { return getToken(AngParser.CloseBracket, 0); }
		public TerminalNode Comma() { return getToken(AngParser.Comma, 0); }
		public Header_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterHeader_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitHeader_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitHeader_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Header_bodyContext header_body() throws RecognitionException {
		Header_bodyContext _localctx = new Header_bodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_header_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(ID);
			setState(100);
			match(Colon);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenBracket) {
				{
				setState(101);
				match(OpenBracket);
				}
			}

			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==StringLiteral || _la==BackTick) {
				{
				{
				setState(104);
				header_body_value();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CloseBracket) {
				{
				setState(110);
				match(CloseBracket);
				}
			}

			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(113);
				match(Comma);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HeaderContext extends ParserRuleContext {
		public TerminalNode At() { return getToken(AngParser.At, 0); }
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public TerminalNode OpenParen() { return getToken(AngParser.OpenParen, 0); }
		public TerminalNode OpenBrace() { return getToken(AngParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(AngParser.CloseBrace, 0); }
		public TerminalNode CloseParen() { return getToken(AngParser.CloseParen, 0); }
		public List<Header_bodyContext> header_body() {
			return getRuleContexts(Header_bodyContext.class);
		}
		public Header_bodyContext header_body(int i) {
			return getRuleContext(Header_bodyContext.class,i);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(At);
			setState(117);
			match(ID);
			setState(118);
			match(OpenParen);
			setState(119);
			match(OpenBrace);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(120);
				header_body();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			match(CloseBrace);
			setState(127);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Import_statmentContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(AngParser.Import, 0); }
		public TerminalNode OpenBrace() { return getToken(AngParser.OpenBrace, 0); }
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public TerminalNode CloseBrace() { return getToken(AngParser.CloseBrace, 0); }
		public TerminalNode From() { return getToken(AngParser.From, 0); }
		public TerminalNode StringLiteral() { return getToken(AngParser.StringLiteral, 0); }
		public TerminalNode SemiColon() { return getToken(AngParser.SemiColon, 0); }
		public Import_statmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterImport_statment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitImport_statment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitImport_statment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_statmentContext import_statment() throws RecognitionException {
		Import_statmentContext _localctx = new Import_statmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_import_statment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(Import);
			setState(130);
			match(OpenBrace);
			setState(131);
			match(ID);
			setState(132);
			match(CloseBrace);
			setState(133);
			match(From);
			setState(134);
			match(StringLiteral);
			setState(135);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Html_templateContext extends ParserRuleContext {
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public Html_templateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterHtml_template(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitHtml_template(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitHtml_template(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Html_templateContext html_template() throws RecognitionException {
		Html_templateContext _localctx = new Html_templateContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_html_template);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(138); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(137);
					htmlElement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(140); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContext extends ParserRuleContext {
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
	 
		public HtmlElementContext() { }
		public void copyFrom(HtmlElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementSelfClosingContext extends HtmlElementContext {
		public TerminalNode LessThan() { return getToken(AngParser.LessThan, 0); }
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public TerminalNode Divide() { return getToken(AngParser.Divide, 0); }
		public TerminalNode MoreThan() { return getToken(AngParser.MoreThan, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public HtmlElementSelfClosingContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterHtmlElementSelfClosing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitHtmlElementSelfClosing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitHtmlElementSelfClosing(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementWithContentContext extends HtmlElementContext {
		public List<TerminalNode> LessThan() { return getTokens(AngParser.LessThan); }
		public TerminalNode LessThan(int i) {
			return getToken(AngParser.LessThan, i);
		}
		public List<TerminalNode> ID() { return getTokens(AngParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngParser.ID, i);
		}
		public List<TerminalNode> MoreThan() { return getTokens(AngParser.MoreThan); }
		public TerminalNode MoreThan(int i) {
			return getToken(AngParser.MoreThan, i);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public TerminalNode Divide() { return getToken(AngParser.Divide, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public HtmlElementWithContentContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterHtmlElementWithContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitHtmlElementWithContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitHtmlElementWithContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_htmlElement);
		int _la;
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new HtmlElementWithContentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(LessThan);
				setState(143);
				match(ID);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1048596L) != 0) || _la==ID) {
					{
					{
					setState(144);
					htmlAttribute();
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(150);
				match(MoreThan);
				setState(151);
				htmlContent();
				setState(152);
				match(LessThan);
				setState(153);
				match(Divide);
				setState(154);
				match(ID);
				setState(155);
				match(MoreThan);
				}
				break;
			case 2:
				_localctx = new HtmlElementSelfClosingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(LessThan);
				setState(158);
				match(ID);
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1048596L) != 0) || _la==ID) {
					{
					{
					setState(159);
					htmlAttribute();
					}
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(165);
				match(Divide);
				setState(166);
				match(MoreThan);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentContext extends ParserRuleContext {
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
	 
		public HtmlContentContext() { }
		public void copyFrom(HtmlContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTextWithOperationContext extends HtmlContentContext {
		public List<HtmltextContext> htmltext() {
			return getRuleContexts(HtmltextContext.class);
		}
		public HtmltextContext htmltext(int i) {
			return getRuleContext(HtmltextContext.class,i);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode Colon() { return getToken(AngParser.Colon, 0); }
		public HtmlTextWithOperationContext(HtmlContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterHtmlTextWithOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitHtmlTextWithOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitHtmlTextWithOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HmlSubcontentListContext extends HtmlContentContext {
		public List<HtmlsubcontentContext> htmlsubcontent() {
			return getRuleContexts(HtmlsubcontentContext.class);
		}
		public HtmlsubcontentContext htmlsubcontent(int i) {
			return getRuleContext(HtmlsubcontentContext.class,i);
		}
		public HmlSubcontentListContext(HtmlContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterHmlSubcontentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitHmlSubcontentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitHmlSubcontentList(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentExpressionContext extends HtmlContentContext {
		public TerminalNode OpenBrace() { return getToken(AngParser.OpenBrace, 0); }
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public TerminalNode CloseBrace() { return getToken(AngParser.CloseBrace, 0); }
		public HtmlContentExpressionContext(HtmlContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterHtmlContentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitHtmlContentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitHtmlContentExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComplexBindingContext extends HtmlContentContext {
		public List<TerminalNode> OpenBrace() { return getTokens(AngParser.OpenBrace); }
		public TerminalNode OpenBrace(int i) {
			return getToken(AngParser.OpenBrace, i);
		}
		public List<TerminalNode> ID() { return getTokens(AngParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngParser.ID, i);
		}
		public TerminalNode ID2() { return getToken(AngParser.ID2, 0); }
		public List<TerminalNode> CloseBrace() { return getTokens(AngParser.CloseBrace); }
		public TerminalNode CloseBrace(int i) {
			return getToken(AngParser.CloseBrace, i);
		}
		public TerminalNode Colon() { return getToken(AngParser.Colon, 0); }
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public TerminalNode Dolar() { return getToken(AngParser.Dolar, 0); }
		public ComplexBindingContext(HtmlContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterComplexBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitComplexBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitComplexBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_htmlContent);
		int _la;
		try {
			int _alt;
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new HmlSubcontentListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(169);
						htmlsubcontent();
						}
						} 
					}
					setState(174);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new HtmlContentExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(OpenBrace);
				setState(176);
				match(ID);
				setState(177);
				match(CloseBrace);
				}
				break;
			case 3:
				_localctx = new HtmlTextWithOperationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				htmltext();
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3344384L) != 0)) {
					{
					setState(181);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Plus:
					case Minus:
					case Multiply:
					case Divide:
						{
						setState(179);
						operation();
						}
						break;
					case Colon:
						{
						setState(180);
						match(Colon);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(183);
					htmltext();
					}
				}

				}
				break;
			case 4:
				_localctx = new ComplexBindingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(186);
					match(ID);
					}
				}

				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(189);
					match(Colon);
					}
				}

				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LessThan) {
					{
					setState(192);
					htmlElement();
					}
				}

				setState(195);
				match(OpenBrace);
				setState(196);
				match(OpenBrace);
				setState(197);
				match(ID);
				setState(198);
				match(ID2);
				setState(199);
				match(CloseBrace);
				setState(200);
				match(CloseBrace);
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Dolar || _la==ID) {
					{
					setState(201);
					_la = _input.LA(1);
					if ( !(_la==Dolar || _la==ID) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmltextContext extends ParserRuleContext {
		public HtmltextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmltext; }
	 
		public HtmltextContext() { }
		public void copyFrom(HtmltextContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTextWithArithmeticContext extends HtmltextContext {
		public List<TerminalNode> OpenBrace() { return getTokens(AngParser.OpenBrace); }
		public TerminalNode OpenBrace(int i) {
			return getToken(AngParser.OpenBrace, i);
		}
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode Number() { return getToken(AngParser.Number, 0); }
		public List<TerminalNode> CloseBrace() { return getTokens(AngParser.CloseBrace); }
		public TerminalNode CloseBrace(int i) {
			return getToken(AngParser.CloseBrace, i);
		}
		public HtmlTextWithArithmeticContext(HtmltextContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterHtmlTextWithArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitHtmlTextWithArithmetic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitHtmlTextWithArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTextSimpleContext extends HtmltextContext {
		public List<TerminalNode> OpenBrace() { return getTokens(AngParser.OpenBrace); }
		public TerminalNode OpenBrace(int i) {
			return getToken(AngParser.OpenBrace, i);
		}
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public List<TerminalNode> CloseBrace() { return getTokens(AngParser.CloseBrace); }
		public TerminalNode CloseBrace(int i) {
			return getToken(AngParser.CloseBrace, i);
		}
		public HtmlTextSimpleContext(HtmltextContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterHtmlTextSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitHtmlTextSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitHtmlTextSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmltextContext htmltext() throws RecognitionException {
		HtmltextContext _localctx = new HtmltextContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_htmltext);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new HtmlTextSimpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(OpenBrace);
				setState(207);
				match(OpenBrace);
				setState(208);
				match(ID);
				setState(209);
				match(CloseBrace);
				setState(210);
				match(CloseBrace);
				}
				break;
			case 2:
				_localctx = new HtmlTextWithArithmeticContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(OpenBrace);
				setState(212);
				match(OpenBrace);
				setState(213);
				match(ID);
				setState(214);
				operation();
				setState(215);
				match(Number);
				setState(216);
				match(CloseBrace);
				setState(217);
				match(CloseBrace);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperationContext extends ParserRuleContext {
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	 
		public OperationContext() { }
		public void copyFrom(OperationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpPlusContext extends OperationContext {
		public TerminalNode Plus() { return getToken(AngParser.Plus, 0); }
		public OpPlusContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterOpPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitOpPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitOpPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpDivideContext extends OperationContext {
		public TerminalNode Divide() { return getToken(AngParser.Divide, 0); }
		public OpDivideContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterOpDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitOpDivide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitOpDivide(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpMinusContext extends OperationContext {
		public TerminalNode Minus() { return getToken(AngParser.Minus, 0); }
		public OpMinusContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterOpMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitOpMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitOpMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpMultiplyContext extends OperationContext {
		public TerminalNode Multiply() { return getToken(AngParser.Multiply, 0); }
		public OpMultiplyContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterOpMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitOpMultiply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitOpMultiply(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operation);
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Minus:
				_localctx = new OpMinusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(Minus);
				}
				break;
			case Plus:
				_localctx = new OpPlusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(Plus);
				}
				break;
			case Divide:
				_localctx = new OpDivideContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				match(Divide);
				}
				break;
			case Multiply:
				_localctx = new OpMultiplyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
				match(Multiply);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlsubcontentContext extends ParserRuleContext {
		public HtmlsubcontentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlsubcontent; }
	 
		public HtmlsubcontentContext() { }
		public void copyFrom(HtmlsubcontentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlSubIDContext extends HtmlsubcontentContext {
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public HtmlSubIDContext(HtmlsubcontentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterHtmlSubID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitHtmlSubID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitHtmlSubID(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlSubElementContext extends HtmlsubcontentContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public HtmlSubElementContext(HtmlsubcontentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterHtmlSubElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitHtmlSubElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitHtmlSubElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlsubcontentContext htmlsubcontent() throws RecognitionException {
		HtmlsubcontentContext _localctx = new HtmlsubcontentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_htmlsubcontent);
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new HtmlSubIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(ID);
				}
				break;
			case LessThan:
				_localctx = new HtmlSubElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				htmlElement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributeContext extends ParserRuleContext {
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
	 
		public HtmlAttributeContext() { }
		public void copyFrom(HtmlAttributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttrNormalContext extends HtmlAttributeContext {
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public TerminalNode Assign() { return getToken(AngParser.Assign, 0); }
		public HtmlAttributeValueContext htmlAttributeValue() {
			return getRuleContext(HtmlAttributeValueContext.class,0);
		}
		public TerminalNode ID2() { return getToken(AngParser.ID2, 0); }
		public HtmlAttrNormalContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterHtmlAttrNormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitHtmlAttrNormal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitHtmlAttrNormal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttrStarContext extends HtmlAttributeContext {
		public TerminalNode Multiply() { return getToken(AngParser.Multiply, 0); }
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public TerminalNode Assign() { return getToken(AngParser.Assign, 0); }
		public HtmlAttributeValueContext htmlAttributeValue() {
			return getRuleContext(HtmlAttributeValueContext.class,0);
		}
		public TerminalNode ID2() { return getToken(AngParser.ID2, 0); }
		public HtmlAttrStarContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterHtmlAttrStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitHtmlAttrStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitHtmlAttrStar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttrPropertyBindingContext extends HtmlAttributeContext {
		public TerminalNode OpenBracket() { return getToken(AngParser.OpenBracket, 0); }
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public TerminalNode CloseBracket() { return getToken(AngParser.CloseBracket, 0); }
		public TerminalNode Assign() { return getToken(AngParser.Assign, 0); }
		public HtmlAttributeValueContext htmlAttributeValue() {
			return getRuleContext(HtmlAttributeValueContext.class,0);
		}
		public TerminalNode ID2() { return getToken(AngParser.ID2, 0); }
		public HtmlAttrPropertyBindingContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterHtmlAttrPropertyBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitHtmlAttrPropertyBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitHtmlAttrPropertyBinding(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttrEventBindingContext extends HtmlAttributeContext {
		public TerminalNode OpenParen() { return getToken(AngParser.OpenParen, 0); }
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public TerminalNode CloseParen() { return getToken(AngParser.CloseParen, 0); }
		public TerminalNode Assign() { return getToken(AngParser.Assign, 0); }
		public HtmlAttributeValueContext htmlAttributeValue() {
			return getRuleContext(HtmlAttributeValueContext.class,0);
		}
		public TerminalNode ID2() { return getToken(AngParser.ID2, 0); }
		public HtmlAttrEventBindingContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterHtmlAttrEventBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitHtmlAttrEventBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitHtmlAttrEventBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_htmlAttribute);
		int _la;
		try {
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Multiply:
				_localctx = new HtmlAttrStarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(Multiply);
				setState(232);
				match(ID);
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID2) {
					{
					setState(233);
					match(ID2);
					}
				}

				setState(236);
				match(Assign);
				setState(237);
				htmlAttributeValue();
				}
				break;
			case ID:
				_localctx = new HtmlAttrNormalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(ID);
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID2) {
					{
					setState(239);
					match(ID2);
					}
				}

				setState(242);
				match(Assign);
				setState(243);
				htmlAttributeValue();
				}
				break;
			case OpenParen:
				_localctx = new HtmlAttrEventBindingContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				match(OpenParen);
				setState(245);
				match(ID);
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID2) {
					{
					setState(246);
					match(ID2);
					}
				}

				setState(249);
				match(CloseParen);
				setState(250);
				match(Assign);
				setState(251);
				htmlAttributeValue();
				}
				break;
			case OpenBracket:
				_localctx = new HtmlAttrPropertyBindingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(252);
				match(OpenBracket);
				setState(253);
				match(ID);
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID2) {
					{
					setState(254);
					match(ID2);
					}
				}

				setState(257);
				match(CloseBracket);
				setState(258);
				match(Assign);
				setState(259);
				htmlAttributeValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributeValueContext extends ParserRuleContext {
		public HtmlAttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttributeValue; }
	 
		public HtmlAttributeValueContext() { }
		public void copyFrom(HtmlAttributeValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttrStringContext extends HtmlAttributeValueContext {
		public TerminalNode StringLiteral() { return getToken(AngParser.StringLiteral, 0); }
		public HtmlAttrStringContext(HtmlAttributeValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterHtmlAttrString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitHtmlAttrString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitHtmlAttrString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttrBindingContext extends HtmlAttributeValueContext {
		public TerminalNode OpenBrace() { return getToken(AngParser.OpenBrace, 0); }
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public TerminalNode CloseBrace() { return getToken(AngParser.CloseBrace, 0); }
		public TerminalNode ID2() { return getToken(AngParser.ID2, 0); }
		public HtmlAttrBindingContext(HtmlAttributeValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterHtmlAttrBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitHtmlAttrBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitHtmlAttrBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeValueContext htmlAttributeValue() throws RecognitionException {
		HtmlAttributeValueContext _localctx = new HtmlAttributeValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_htmlAttributeValue);
		int _la;
		try {
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
				_localctx = new HtmlAttrStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(StringLiteral);
				}
				break;
			case OpenBrace:
				_localctx = new HtmlAttrBindingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(OpenBrace);
				setState(264);
				match(ID);
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID2) {
					{
					setState(265);
					match(ID2);
					}
				}

				setState(268);
				match(CloseBrace);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DatatypeContext extends ParserRuleContext {
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public EnumStatmentContext enumStatment() {
			return getRuleContext(EnumStatmentContext.class,0);
		}
		public DefinelistContext definelist() {
			return getRuleContext(DefinelistContext.class,0);
		}
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterDatatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitDatatype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitDatatype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_datatype);
		try {
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				variableStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				enumStatment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				definelist();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeyWordContext extends ParserRuleContext {
		public TerminalNode Any() { return getToken(AngParser.Any, 0); }
		public TerminalNode Number1() { return getToken(AngParser.Number1, 0); }
		public TerminalNode Boolean1() { return getToken(AngParser.Boolean1, 0); }
		public TerminalNode String() { return getToken(AngParser.String, 0); }
		public TerminalNode EnumID() { return getToken(AngParser.EnumID, 0); }
		public TerminalNode Void() { return getToken(AngParser.Void, 0); }
		public KeyWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterKeyWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitKeyWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitKeyWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyWordContext keyWord() throws RecognitionException {
		KeyWordContext _localctx = new KeyWordContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_keyWord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_la = _input.LA(1);
			if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 2273240290426881L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeyWordValuesContext extends ParserRuleContext {
		public KeyWordValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyWordValues; }
	 
		public KeyWordValuesContext() { }
		public void copyFrom(KeyWordValuesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KWValueBooleanContext extends KeyWordValuesContext {
		public TerminalNode Boolean() { return getToken(AngParser.Boolean, 0); }
		public KWValueBooleanContext(KeyWordValuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterKWValueBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitKWValueBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitKWValueBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KWValueStringContext extends KeyWordValuesContext {
		public TerminalNode StringLiteral() { return getToken(AngParser.StringLiteral, 0); }
		public KWValueStringContext(KeyWordValuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterKWValueString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitKWValueString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitKWValueString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KWValueEnumItemContext extends KeyWordValuesContext {
		public EnumItemContext enumItem() {
			return getRuleContext(EnumItemContext.class,0);
		}
		public KWValueEnumItemContext(KeyWordValuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterKWValueEnumItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitKWValueEnumItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitKWValueEnumItem(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KWValueIDContext extends KeyWordValuesContext {
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public KWValueIDContext(KeyWordValuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterKWValueID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitKWValueID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitKWValueID(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KWValueNumberContext extends KeyWordValuesContext {
		public TerminalNode Number() { return getToken(AngParser.Number, 0); }
		public KWValueNumberContext(KeyWordValuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterKWValueNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitKWValueNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitKWValueNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KWValueNullContext extends KeyWordValuesContext {
		public TerminalNode Null() { return getToken(AngParser.Null, 0); }
		public KWValueNullContext(KeyWordValuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterKWValueNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitKWValueNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitKWValueNull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyWordValuesContext keyWordValues() throws RecognitionException {
		KeyWordValuesContext _localctx = new KeyWordValuesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_keyWordValues);
		try {
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Number:
				_localctx = new KWValueNumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(Number);
				}
				break;
			case StringLiteral:
				_localctx = new KWValueStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				match(StringLiteral);
				}
				break;
			case Boolean:
				_localctx = new KWValueBooleanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				match(Boolean);
				}
				break;
			case EnumID:
				_localctx = new KWValueEnumItemContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(281);
				enumItem();
				}
				break;
			case Null:
				_localctx = new KWValueNullContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(282);
				match(Null);
				}
				break;
			case ID:
				_localctx = new KWValueIDContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(283);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableStatementContext extends ParserRuleContext {
		public VariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStatement; }
	 
		public VariableStatementContext() { }
		public void copyFrom(VariableStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableStatementRuleContext extends VariableStatementContext {
		public TerminalNode SemiColon() { return getToken(AngParser.SemiColon, 0); }
		public TerminalNode This() { return getToken(AngParser.This, 0); }
		public TerminalNode ID2() { return getToken(AngParser.ID2, 0); }
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public TerminalNode Colon() { return getToken(AngParser.Colon, 0); }
		public KeyWordContext keyWord() {
			return getRuleContext(KeyWordContext.class,0);
		}
		public TerminalNode Assign() { return getToken(AngParser.Assign, 0); }
		public KeyWordValuesContext keyWordValues() {
			return getRuleContext(KeyWordValuesContext.class,0);
		}
		public VariableStatementRuleContext(VariableStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterVariableStatementRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitVariableStatementRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitVariableStatementRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableStatementContext variableStatement() throws RecognitionException {
		VariableStatementContext _localctx = new VariableStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_variableStatement);
		int _la;
		try {
			_localctx = new VariableStatementRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 17716740097L) != 0)) {
				{
				setState(286);
				varType();
				}
			}

			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case This:
				{
				setState(289);
				match(This);
				setState(290);
				match(ID2);
				}
				break;
			case ID:
				{
				setState(291);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(294);
				match(Colon);
				setState(295);
				keyWord();
				}
			}

			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(298);
				match(Assign);
				setState(299);
				keyWordValues();
				}
			}

			setState(302);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumCreationContext extends ParserRuleContext {
		public TerminalNode Enum() { return getToken(AngParser.Enum, 0); }
		public List<TerminalNode> EnumID() { return getTokens(AngParser.EnumID); }
		public TerminalNode EnumID(int i) {
			return getToken(AngParser.EnumID, i);
		}
		public TerminalNode OpenBrace() { return getToken(AngParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(AngParser.CloseBrace, 0); }
		public List<TerminalNode> Comma() { return getTokens(AngParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngParser.Comma, i);
		}
		public EnumCreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumCreation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterEnumCreation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitEnumCreation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitEnumCreation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumCreationContext enumCreation() throws RecognitionException {
		EnumCreationContext _localctx = new EnumCreationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_enumCreation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(Enum);
			setState(305);
			match(EnumID);
			setState(306);
			match(OpenBrace);
			setState(311); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(307);
				match(EnumID);
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(308);
					match(Comma);
					}
				}

				}
				}
				setState(313); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==EnumID );
			setState(315);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarTypeContext extends ParserRuleContext {
		public TerminalNode Let() { return getToken(AngParser.Let, 0); }
		public TerminalNode Const() { return getToken(AngParser.Const, 0); }
		public TerminalNode Var() { return getToken(AngParser.Var, 0); }
		public VarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterVarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitVarType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitVarType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarTypeContext varType() throws RecognitionException {
		VarTypeContext _localctx = new VarTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_varType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 17716740097L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumStatmentContext extends ParserRuleContext {
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(AngParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngParser.ID, i);
		}
		public TerminalNode Colon() { return getToken(AngParser.Colon, 0); }
		public TerminalNode SemiColon() { return getToken(AngParser.SemiColon, 0); }
		public TerminalNode Assign() { return getToken(AngParser.Assign, 0); }
		public EnumItemContext enumItem() {
			return getRuleContext(EnumItemContext.class,0);
		}
		public EnumStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterEnumStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitEnumStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitEnumStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumStatmentContext enumStatment() throws RecognitionException {
		EnumStatmentContext _localctx = new EnumStatmentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_enumStatment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			varType();
			setState(320);
			match(ID);
			setState(321);
			match(Colon);
			setState(322);
			match(ID);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(323);
				match(Assign);
				setState(324);
				enumItem();
				}
			}

			setState(327);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumItemContext extends ParserRuleContext {
		public List<TerminalNode> EnumID() { return getTokens(AngParser.EnumID); }
		public TerminalNode EnumID(int i) {
			return getToken(AngParser.EnumID, i);
		}
		public TerminalNode Dot() { return getToken(AngParser.Dot, 0); }
		public EnumItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterEnumItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitEnumItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitEnumItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumItemContext enumItem() throws RecognitionException {
		EnumItemContext _localctx = new EnumItemContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_enumItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(EnumID);
			setState(330);
			match(Dot);
			setState(331);
			match(EnumID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionBodyStatmentsContext extends ParserRuleContext {
		public FunctionBodyStatmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBodyStatments; }
	 
		public FunctionBodyStatmentsContext() { }
		public void copyFrom(FunctionBodyStatmentsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncPrintContext extends FunctionBodyStatmentsContext {
		public PrintStatmentContext printStatment() {
			return getRuleContext(PrintStatmentContext.class,0);
		}
		public FuncPrintContext(FunctionBodyStatmentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterFuncPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitFuncPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitFuncPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncDatatypeContext extends FunctionBodyStatmentsContext {
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public FuncDatatypeContext(FunctionBodyStatmentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterFuncDatatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitFuncDatatype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitFuncDatatype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyStatmentsContext functionBodyStatments() throws RecognitionException {
		FunctionBodyStatmentsContext _localctx = new FunctionBodyStatmentsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_functionBodyStatments);
		try {
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Console:
				_localctx = new FuncPrintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				printStatment();
				}
				break;
			case Var:
			case This:
			case Const:
			case Let:
			case ID:
				_localctx = new FuncDatatypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				datatype();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionAttributesContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public TerminalNode Colon() { return getToken(AngParser.Colon, 0); }
		public KeyWordContext keyWord() {
			return getRuleContext(KeyWordContext.class,0);
		}
		public FunctionAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterFunctionAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitFunctionAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitFunctionAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionAttributesContext functionAttributes() throws RecognitionException {
		FunctionAttributesContext _localctx = new FunctionAttributesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_functionAttributes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(ID);
			setState(338);
			match(Colon);
			setState(339);
			keyWord();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionBodyContext extends ParserRuleContext {
		public List<FunctionBodyStatmentsContext> functionBodyStatments() {
			return getRuleContexts(FunctionBodyStatmentsContext.class);
		}
		public FunctionBodyStatmentsContext functionBodyStatments(int i) {
			return getRuleContext(FunctionBodyStatmentsContext.class,i);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 9007216971485249L) != 0)) {
				{
				{
				setState(341);
				functionBodyStatments();
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionStatmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public TerminalNode OpenParen() { return getToken(AngParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(AngParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(AngParser.CloseBrace, 0); }
		public TerminalNode Function() { return getToken(AngParser.Function, 0); }
		public List<FunctionAttributesContext> functionAttributes() {
			return getRuleContexts(FunctionAttributesContext.class);
		}
		public FunctionAttributesContext functionAttributes(int i) {
			return getRuleContext(FunctionAttributesContext.class,i);
		}
		public TerminalNode Colon() { return getToken(AngParser.Colon, 0); }
		public KeyWordContext keyWord() {
			return getRuleContext(KeyWordContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(AngParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngParser.Comma, i);
		}
		public FunctionStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterFunctionStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitFunctionStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitFunctionStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionStatmentContext functionStatment() throws RecognitionException {
		FunctionStatmentContext _localctx = new FunctionStatmentContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_functionStatment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Function) {
				{
				setState(347);
				match(Function);
				}
			}

			setState(350);
			match(ID);
			setState(351);
			match(OpenParen);
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(352);
				functionAttributes();
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(353);
					match(Comma);
					}
				}

				}
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(361);
			match(CloseParen);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(362);
				match(Colon);
				setState(363);
				keyWord();
				}
			}

			setState(366);
			match(OpenBrace);
			setState(367);
			functionBody();
			setState(368);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatmentContext extends ParserRuleContext {
		public TerminalNode Console() { return getToken(AngParser.Console, 0); }
		public TerminalNode ID2() { return getToken(AngParser.ID2, 0); }
		public TerminalNode OpenParen() { return getToken(AngParser.OpenParen, 0); }
		public TerminalNode StringLiteral() { return getToken(AngParser.StringLiteral, 0); }
		public TerminalNode CloseParen() { return getToken(AngParser.CloseParen, 0); }
		public TerminalNode SemiColon() { return getToken(AngParser.SemiColon, 0); }
		public PrintStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterPrintStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitPrintStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitPrintStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatmentContext printStatment() throws RecognitionException {
		PrintStatmentContext _localctx = new PrintStatmentContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_printStatment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(Console);
			setState(371);
			match(ID2);
			setState(372);
			match(OpenParen);
			setState(373);
			match(StringLiteral);
			setState(374);
			match(CloseParen);
			setState(375);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefinelistContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public TerminalNode Assign() { return getToken(AngParser.Assign, 0); }
		public TerminalNode OpenBracket() { return getToken(AngParser.OpenBracket, 0); }
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public TerminalNode CloseBracket() { return getToken(AngParser.CloseBracket, 0); }
		public TerminalNode SemiColon() { return getToken(AngParser.SemiColon, 0); }
		public List<TerminalNode> Comma() { return getTokens(AngParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngParser.Comma, i);
		}
		public DefinelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterDefinelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitDefinelist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitDefinelist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinelistContext definelist() throws RecognitionException {
		DefinelistContext _localctx = new DefinelistContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_definelist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(ID);
			setState(378);
			match(Assign);
			setState(379);
			match(OpenBracket);
			setState(380);
			row();
			setState(385);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(381);
					match(Comma);
					setState(382);
					row();
					}
					} 
				}
				setState(387);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(388);
				match(Comma);
				}
			}

			setState(391);
			match(CloseBracket);
			setState(392);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RowContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(AngParser.OpenBrace, 0); }
		public List<RowvalueContext> rowvalue() {
			return getRuleContexts(RowvalueContext.class);
		}
		public RowvalueContext rowvalue(int i) {
			return getRuleContext(RowvalueContext.class,i);
		}
		public TerminalNode CloseBrace() { return getToken(AngParser.CloseBrace, 0); }
		public List<TerminalNode> Comma() { return getTokens(AngParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngParser.Comma, i);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(OpenBrace);
			setState(395);
			rowvalue();
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(396);
				match(Comma);
				setState(397);
				rowvalue();
				}
				}
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(403);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RowvalueContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(AngParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngParser.ID, i);
		}
		public TerminalNode Colon() { return getToken(AngParser.Colon, 0); }
		public TerminalNode Number() { return getToken(AngParser.Number, 0); }
		public TerminalNode StringLiteral() { return getToken(AngParser.StringLiteral, 0); }
		public RowvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterRowvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitRowvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitRowvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowvalueContext rowvalue() throws RecognitionException {
		RowvalueContext _localctx = new RowvalueContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_rowvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(ID);
			setState(406);
			match(Colon);
			setState(407);
			_la = _input.LA(1);
			if ( !(((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & 35L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0085\u019a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0001\u0000\u0004\u0000B\b\u0000\u000b"+
		"\u0000\f\u0000C\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001J\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002O\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"V\b\u0003\n\u0003\f\u0003Y\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004b\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005g\b\u0005\u0001\u0005"+
		"\u0005\u0005j\b\u0005\n\u0005\f\u0005m\t\u0005\u0001\u0005\u0003\u0005"+
		"p\b\u0005\u0001\u0005\u0003\u0005s\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006z\b\u0006\n\u0006\f\u0006}\t"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0004\b\u008b\b\b\u000b\b\f\b\u008c\u0001\t\u0001\t\u0001\t\u0005\t"+
		"\u0092\b\t\n\t\f\t\u0095\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00a1\b\t\n\t\f\t\u00a4\t\t"+
		"\u0001\t\u0001\t\u0003\t\u00a8\b\t\u0001\n\u0005\n\u00ab\b\n\n\n\f\n\u00ae"+
		"\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00b6\b\n"+
		"\u0001\n\u0003\n\u00b9\b\n\u0001\n\u0003\n\u00bc\b\n\u0001\n\u0003\n\u00bf"+
		"\b\n\u0001\n\u0003\n\u00c2\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0003\n\u00cb\b\n\u0003\n\u00cd\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u00dc\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00e2\b\f"+
		"\u0001\r\u0001\r\u0003\r\u00e6\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00eb\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00f1\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u00f8\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0100\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u0105\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u010b\b\u000f\u0001\u000f\u0003\u000f"+
		"\u010e\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0113\b"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u011d\b\u0012\u0001\u0013\u0003"+
		"\u0013\u0120\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0125"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0129\b\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u012d\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0136\b\u0014"+
		"\u0004\u0014\u0138\b\u0014\u000b\u0014\f\u0014\u0139\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0146\b\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u0150\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0005\u001a\u0157\b\u001a\n\u001a\f\u001a\u015a\t\u001a"+
		"\u0001\u001b\u0003\u001b\u015d\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u0163\b\u001b\u0005\u001b\u0165\b\u001b\n\u001b"+
		"\f\u001b\u0168\t\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u016d\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0005\u001d\u0180\b\u001d\n\u001d\f\u001d\u0183\t\u001d\u0001\u001d\u0003"+
		"\u001d\u0186\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u018f\b\u001e\n\u001e\f\u001e"+
		"\u0192\t\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0000\u0000 \u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>\u0000"+
		"\u0004\u0002\u0000$$xx\u0004\u0000GGnpsszz\u0003\u0000CC``ee\u0002\u0000"+
		"wx||\u01b9\u0000A\u0001\u0000\u0000\u0000\u0002I\u0001\u0000\u0000\u0000"+
		"\u0004N\u0001\u0000\u0000\u0000\u0006P\u0001\u0000\u0000\u0000\ba\u0001"+
		"\u0000\u0000\u0000\nc\u0001\u0000\u0000\u0000\ft\u0001\u0000\u0000\u0000"+
		"\u000e\u0081\u0001\u0000\u0000\u0000\u0010\u008a\u0001\u0000\u0000\u0000"+
		"\u0012\u00a7\u0001\u0000\u0000\u0000\u0014\u00cc\u0001\u0000\u0000\u0000"+
		"\u0016\u00db\u0001\u0000\u0000\u0000\u0018\u00e1\u0001\u0000\u0000\u0000"+
		"\u001a\u00e5\u0001\u0000\u0000\u0000\u001c\u0104\u0001\u0000\u0000\u0000"+
		"\u001e\u010d\u0001\u0000\u0000\u0000 \u0112\u0001\u0000\u0000\u0000\""+
		"\u0114\u0001\u0000\u0000\u0000$\u011c\u0001\u0000\u0000\u0000&\u011f\u0001"+
		"\u0000\u0000\u0000(\u0130\u0001\u0000\u0000\u0000*\u013d\u0001\u0000\u0000"+
		"\u0000,\u013f\u0001\u0000\u0000\u0000.\u0149\u0001\u0000\u0000\u00000"+
		"\u014f\u0001\u0000\u0000\u00002\u0151\u0001\u0000\u0000\u00004\u0158\u0001"+
		"\u0000\u0000\u00006\u015c\u0001\u0000\u0000\u00008\u0172\u0001\u0000\u0000"+
		"\u0000:\u0179\u0001\u0000\u0000\u0000<\u018a\u0001\u0000\u0000\u0000>"+
		"\u0195\u0001\u0000\u0000\u0000@B\u0003\u0002\u0001\u0000A@\u0001\u0000"+
		"\u0000\u0000BC\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001"+
		"\u0000\u0000\u0000D\u0001\u0001\u0000\u0000\u0000EJ\u0003\u000e\u0007"+
		"\u0000FJ\u0003\f\u0006\u0000GJ\u0003\u0006\u0003\u0000HJ\u0003\u0010\b"+
		"\u0000IE\u0001\u0000\u0000\u0000IF\u0001\u0000\u0000\u0000IG\u0001\u0000"+
		"\u0000\u0000IH\u0001\u0000\u0000\u0000J\u0003\u0001\u0000\u0000\u0000"+
		"KO\u00036\u001b\u0000LO\u0003 \u0010\u0000MO\u0003(\u0014\u0000NK\u0001"+
		"\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NM\u0001\u0000\u0000\u0000"+
		"O\u0005\u0001\u0000\u0000\u0000PQ\u0005a\u0000\u0000QR\u0005\\\u0000\u0000"+
		"RS\u0005x\u0000\u0000SW\u0005\u0006\u0000\u0000TV\u0003\u0004\u0002\u0000"+
		"UT\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000"+
		"\u0000WX\u0001\u0000\u0000\u0000XZ\u0001\u0000\u0000\u0000YW\u0001\u0000"+
		"\u0000\u0000Z[\u0005\u0007\u0000\u0000[\u0007\u0001\u0000\u0000\u0000"+
		"\\b\u0005|\u0000\u0000]^\u0005}\u0000\u0000^_\u0003\u0010\b\u0000_`\u0005"+
		"}\u0000\u0000`b\u0001\u0000\u0000\u0000a\\\u0001\u0000\u0000\u0000a]\u0001"+
		"\u0000\u0000\u0000b\t\u0001\u0000\u0000\u0000cd\u0005x\u0000\u0000df\u0005"+
		"\u000b\u0000\u0000eg\u0005\u0002\u0000\u0000fe\u0001\u0000\u0000\u0000"+
		"fg\u0001\u0000\u0000\u0000gk\u0001\u0000\u0000\u0000hj\u0003\b\u0004\u0000"+
		"ih\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000"+
		"\u0000kl\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000"+
		"\u0000\u0000np\u0005\u0003\u0000\u0000on\u0001\u0000\u0000\u0000op\u0001"+
		"\u0000\u0000\u0000pr\u0001\u0000\u0000\u0000qs\u0005\t\u0000\u0000rq\u0001"+
		"\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000s\u000b\u0001\u0000\u0000"+
		"\u0000tu\u0005\u0001\u0000\u0000uv\u0005x\u0000\u0000vw\u0005\u0004\u0000"+
		"\u0000w{\u0005\u0006\u0000\u0000xz\u0003\n\u0005\u0000yx\u0001\u0000\u0000"+
		"\u0000z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000"+
		"\u0000\u0000|~\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~\u007f"+
		"\u0005\u0007\u0000\u0000\u007f\u0080\u0005\u0005\u0000\u0000\u0080\r\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0005:\u0000\u0000\u0082\u0083\u0005\u0006"+
		"\u0000\u0000\u0083\u0084\u0005x\u0000\u0000\u0084\u0085\u0005\u0007\u0000"+
		"\u0000\u0085\u0086\u0005X\u0000\u0000\u0086\u0087\u0005|\u0000\u0000\u0087"+
		"\u0088\u0005\b\u0000\u0000\u0088\u000f\u0001\u0000\u0000\u0000\u0089\u008b"+
		"\u0003\u0012\t\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001"+
		"\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001"+
		"\u0000\u0000\u0000\u008d\u0011\u0001\u0000\u0000\u0000\u008e\u008f\u0005"+
		"\u001e\u0000\u0000\u008f\u0093\u0005x\u0000\u0000\u0090\u0092\u0003\u001c"+
		"\u000e\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000"+
		"\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000"+
		"\u0000\u0000\u0094\u0096\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0005\u001f\u0000\u0000\u0097\u0098\u0003\u0014"+
		"\n\u0000\u0098\u0099\u0005\u001e\u0000\u0000\u0099\u009a\u0005\u0015\u0000"+
		"\u0000\u009a\u009b\u0005x\u0000\u0000\u009b\u009c\u0005\u001f\u0000\u0000"+
		"\u009c\u00a8\u0001\u0000\u0000\u0000\u009d\u009e\u0005\u001e\u0000\u0000"+
		"\u009e\u00a2\u0005x\u0000\u0000\u009f\u00a1\u0003\u001c\u000e\u0000\u00a0"+
		"\u009f\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0005\u0015\u0000\u0000\u00a6\u00a8\u0005\u001f\u0000\u0000\u00a7"+
		"\u008e\u0001\u0000\u0000\u0000\u00a7\u009d\u0001\u0000\u0000\u0000\u00a8"+
		"\u0013\u0001\u0000\u0000\u0000\u00a9\u00ab\u0003\u001a\r\u0000\u00aa\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac\u00aa"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00cd"+
		"\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u00b0"+
		"\u0005\u0006\u0000\u0000\u00b0\u00b1\u0005x\u0000\u0000\u00b1\u00cd\u0005"+
		"\u0007\u0000\u0000\u00b2\u00b8\u0003\u0016\u000b\u0000\u00b3\u00b6\u0003"+
		"\u0018\f\u0000\u00b4\u00b6\u0005\u000b\u0000\u0000\u00b5\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b9\u0003\u0016\u000b\u0000\u00b8\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00cd\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bc\u0005x\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00be\u0001\u0000\u0000"+
		"\u0000\u00bd\u00bf\u0005\u000b\u0000\u0000\u00be\u00bd\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c2\u0003\u0012\t\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u0005\u0006\u0000\u0000\u00c4\u00c5\u0005\u0006\u0000\u0000"+
		"\u00c5\u00c6\u0005x\u0000\u0000\u00c6\u00c7\u0005y\u0000\u0000\u00c7\u00c8"+
		"\u0005\u0007\u0000\u0000\u00c8\u00ca\u0005\u0007\u0000\u0000\u00c9\u00cb"+
		"\u0007\u0000\u0000\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000\u00ca\u00cb"+
		"\u0001\u0000\u0000\u0000\u00cb\u00cd\u0001\u0000\u0000\u0000\u00cc\u00ac"+
		"\u0001\u0000\u0000\u0000\u00cc\u00af\u0001\u0000\u0000\u0000\u00cc\u00b2"+
		"\u0001\u0000\u0000\u0000\u00cc\u00bb\u0001\u0000\u0000\u0000\u00cd\u0015"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\u0006\u0000\u0000\u00cf\u00d0"+
		"\u0005\u0006\u0000\u0000\u00d0\u00d1\u0005x\u0000\u0000\u00d1\u00d2\u0005"+
		"\u0007\u0000\u0000\u00d2\u00dc\u0005\u0007\u0000\u0000\u00d3\u00d4\u0005"+
		"\u0006\u0000\u0000\u00d4\u00d5\u0005\u0006\u0000\u0000\u00d5\u00d6\u0005"+
		"x\u0000\u0000\u00d6\u00d7\u0003\u0018\f\u0000\u00d7\u00d8\u0005w\u0000"+
		"\u0000\u00d8\u00d9\u0005\u0007\u0000\u0000\u00d9\u00da\u0005\u0007\u0000"+
		"\u0000\u00da\u00dc\u0001\u0000\u0000\u0000\u00db\u00ce\u0001\u0000\u0000"+
		"\u0000\u00db\u00d3\u0001\u0000\u0000\u0000\u00dc\u0017\u0001\u0000\u0000"+
		"\u0000\u00dd\u00e2\u0005\u0011\u0000\u0000\u00de\u00e2\u0005\u0010\u0000"+
		"\u0000\u00df\u00e2\u0005\u0015\u0000\u0000\u00e0\u00e2\u0005\u0014\u0000"+
		"\u0000\u00e1\u00dd\u0001\u0000\u0000\u0000\u00e1\u00de\u0001\u0000\u0000"+
		"\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e2\u0019\u0001\u0000\u0000\u0000\u00e3\u00e6\u0005x\u0000\u0000"+
		"\u00e4\u00e6\u0003\u0012\t\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e6\u001b\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e8\u0005\u0014\u0000\u0000\u00e8\u00ea\u0005x\u0000\u0000\u00e9\u00eb"+
		"\u0005y\u0000\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005"+
		"\n\u0000\u0000\u00ed\u0105\u0003\u001e\u000f\u0000\u00ee\u00f0\u0005x"+
		"\u0000\u0000\u00ef\u00f1\u0005y\u0000\u0000\u00f0\u00ef\u0001\u0000\u0000"+
		"\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f3\u0005\n\u0000\u0000\u00f3\u0105\u0003\u001e\u000f\u0000"+
		"\u00f4\u00f5\u0005\u0004\u0000\u0000\u00f5\u00f7\u0005x\u0000\u0000\u00f6"+
		"\u00f8\u0005y\u0000\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f7\u00f8"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fa"+
		"\u0005\u0005\u0000\u0000\u00fa\u00fb\u0005\n\u0000\u0000\u00fb\u0105\u0003"+
		"\u001e\u000f\u0000\u00fc\u00fd\u0005\u0002\u0000\u0000\u00fd\u00ff\u0005"+
		"x\u0000\u0000\u00fe\u0100\u0005y\u0000\u0000\u00ff\u00fe\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000"+
		"\u0000\u0101\u0102\u0005\u0003\u0000\u0000\u0102\u0103\u0005\n\u0000\u0000"+
		"\u0103\u0105\u0003\u001e\u000f\u0000\u0104\u00e7\u0001\u0000\u0000\u0000"+
		"\u0104\u00ee\u0001\u0000\u0000\u0000\u0104\u00f4\u0001\u0000\u0000\u0000"+
		"\u0104\u00fc\u0001\u0000\u0000\u0000\u0105\u001d\u0001\u0000\u0000\u0000"+
		"\u0106\u010e\u0005|\u0000\u0000\u0107\u0108\u0005\u0006\u0000\u0000\u0108"+
		"\u010a\u0005x\u0000\u0000\u0109\u010b\u0005y\u0000\u0000\u010a\u0109\u0001"+
		"\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010c\u0001"+
		"\u0000\u0000\u0000\u010c\u010e\u0005\u0007\u0000\u0000\u010d\u0106\u0001"+
		"\u0000\u0000\u0000\u010d\u0107\u0001\u0000\u0000\u0000\u010e\u001f\u0001"+
		"\u0000\u0000\u0000\u010f\u0113\u0003&\u0013\u0000\u0110\u0113\u0003,\u0016"+
		"\u0000\u0111\u0113\u0003:\u001d\u0000\u0112\u010f\u0001\u0000\u0000\u0000"+
		"\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0111\u0001\u0000\u0000\u0000"+
		"\u0113!\u0001\u0000\u0000\u0000\u0114\u0115\u0007\u0001\u0000\u0000\u0115"+
		"#\u0001\u0000\u0000\u0000\u0116\u011d\u0005w\u0000\u0000\u0117\u011d\u0005"+
		"|\u0000\u0000\u0118\u011d\u0005v\u0000\u0000\u0119\u011d\u0003.\u0017"+
		"\u0000\u011a\u011d\u00059\u0000\u0000\u011b\u011d\u0005x\u0000\u0000\u011c"+
		"\u0116\u0001\u0000\u0000\u0000\u011c\u0117\u0001\u0000\u0000\u0000\u011c"+
		"\u0118\u0001\u0000\u0000\u0000\u011c\u0119\u0001\u0000\u0000\u0000\u011c"+
		"\u011a\u0001\u0000\u0000\u0000\u011c\u011b\u0001\u0000\u0000\u0000\u011d"+
		"%\u0001\u0000\u0000\u0000\u011e\u0120\u0003*\u0015\u0000\u011f\u011e\u0001"+
		"\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0124\u0001"+
		"\u0000\u0000\u0000\u0121\u0122\u0005O\u0000\u0000\u0122\u0125\u0005y\u0000"+
		"\u0000\u0123\u0125\u0005x\u0000\u0000\u0124\u0121\u0001\u0000\u0000\u0000"+
		"\u0124\u0123\u0001\u0000\u0000\u0000\u0125\u0128\u0001\u0000\u0000\u0000"+
		"\u0126\u0127\u0005\u000b\u0000\u0000\u0127\u0129\u0003\"\u0011\u0000\u0128"+
		"\u0126\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129"+
		"\u012c\u0001\u0000\u0000\u0000\u012a\u012b\u0005\n\u0000\u0000\u012b\u012d"+
		"\u0003$\u0012\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012c\u012d\u0001"+
		"\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u012f\u0005"+
		"\b\u0000\u0000\u012f\'\u0001\u0000\u0000\u0000\u0130\u0131\u0005]\u0000"+
		"\u0000\u0131\u0132\u0005z\u0000\u0000\u0132\u0137\u0005\u0006\u0000\u0000"+
		"\u0133\u0135\u0005z\u0000\u0000\u0134\u0136\u0005\t\u0000\u0000\u0135"+
		"\u0134\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136"+
		"\u0138\u0001\u0000\u0000\u0000\u0137\u0133\u0001\u0000\u0000\u0000\u0138"+
		"\u0139\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u0139"+
		"\u013a\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b"+
		"\u013c\u0005\u0007\u0000\u0000\u013c)\u0001\u0000\u0000\u0000\u013d\u013e"+
		"\u0007\u0002\u0000\u0000\u013e+\u0001\u0000\u0000\u0000\u013f\u0140\u0003"+
		"*\u0015\u0000\u0140\u0141\u0005x\u0000\u0000\u0141\u0142\u0005\u000b\u0000"+
		"\u0000\u0142\u0145\u0005x\u0000\u0000\u0143\u0144\u0005\n\u0000\u0000"+
		"\u0144\u0146\u0003.\u0017\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0145"+
		"\u0146\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147"+
		"\u0148\u0005\b\u0000\u0000\u0148-\u0001\u0000\u0000\u0000\u0149\u014a"+
		"\u0005z\u0000\u0000\u014a\u014b\u0005\r\u0000\u0000\u014b\u014c\u0005"+
		"z\u0000\u0000\u014c/\u0001\u0000\u0000\u0000\u014d\u0150\u00038\u001c"+
		"\u0000\u014e\u0150\u0003 \u0010\u0000\u014f\u014d\u0001\u0000\u0000\u0000"+
		"\u014f\u014e\u0001\u0000\u0000\u0000\u01501\u0001\u0000\u0000\u0000\u0151"+
		"\u0152\u0005x\u0000\u0000\u0152\u0153\u0005\u000b\u0000\u0000\u0153\u0154"+
		"\u0003\"\u0011\u0000\u01543\u0001\u0000\u0000\u0000\u0155\u0157\u0003"+
		"0\u0018\u0000\u0156\u0155\u0001\u0000\u0000\u0000\u0157\u015a\u0001\u0000"+
		"\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000"+
		"\u0000\u0000\u01595\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000"+
		"\u0000\u015b\u015d\u0005N\u0000\u0000\u015c\u015b\u0001\u0000\u0000\u0000"+
		"\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000"+
		"\u015e\u015f\u0005x\u0000\u0000\u015f\u0166\u0005\u0004\u0000\u0000\u0160"+
		"\u0162\u00032\u0019\u0000\u0161\u0163\u0005\t\u0000\u0000\u0162\u0161"+
		"\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0165"+
		"\u0001\u0000\u0000\u0000\u0164\u0160\u0001\u0000\u0000\u0000\u0165\u0168"+
		"\u0001\u0000\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0166\u0167"+
		"\u0001\u0000\u0000\u0000\u0167\u0169\u0001\u0000\u0000\u0000\u0168\u0166"+
		"\u0001\u0000\u0000\u0000\u0169\u016c\u0005\u0005\u0000\u0000\u016a\u016b"+
		"\u0005\u000b\u0000\u0000\u016b\u016d\u0003\"\u0011\u0000\u016c\u016a\u0001"+
		"\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d\u016e\u0001"+
		"\u0000\u0000\u0000\u016e\u016f\u0005\u0006\u0000\u0000\u016f\u0170\u0003"+
		"4\u001a\u0000\u0170\u0171\u0005\u0007\u0000\u0000\u01717\u0001\u0000\u0000"+
		"\u0000\u0172\u0173\u0005I\u0000\u0000\u0173\u0174\u0005y\u0000\u0000\u0174"+
		"\u0175\u0005\u0004\u0000\u0000\u0175\u0176\u0005|\u0000\u0000\u0176\u0177"+
		"\u0005\u0005\u0000\u0000\u0177\u0178\u0005\b\u0000\u0000\u01789\u0001"+
		"\u0000\u0000\u0000\u0179\u017a\u0005x\u0000\u0000\u017a\u017b\u0005\n"+
		"\u0000\u0000\u017b\u017c\u0005\u0002\u0000\u0000\u017c\u0181\u0003<\u001e"+
		"\u0000\u017d\u017e\u0005\t\u0000\u0000\u017e\u0180\u0003<\u001e\u0000"+
		"\u017f\u017d\u0001\u0000\u0000\u0000\u0180\u0183\u0001\u0000\u0000\u0000"+
		"\u0181\u017f\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000"+
		"\u0182\u0185\u0001\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000"+
		"\u0184\u0186\u0005\t\u0000\u0000\u0185\u0184\u0001\u0000\u0000\u0000\u0185"+
		"\u0186\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000\u0000\u0187"+
		"\u0188\u0005\u0003\u0000\u0000\u0188\u0189\u0005\b\u0000\u0000\u0189;"+
		"\u0001\u0000\u0000\u0000\u018a\u018b\u0005\u0006\u0000\u0000\u018b\u0190"+
		"\u0003>\u001f\u0000\u018c\u018d\u0005\t\u0000\u0000\u018d\u018f\u0003"+
		">\u001f\u0000\u018e\u018c\u0001\u0000\u0000\u0000\u018f\u0192\u0001\u0000"+
		"\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000"+
		"\u0000\u0000\u0191\u0193\u0001\u0000\u0000\u0000\u0192\u0190\u0001\u0000"+
		"\u0000\u0000\u0193\u0194\u0005\u0007\u0000\u0000\u0194=\u0001\u0000\u0000"+
		"\u0000\u0195\u0196\u0005x\u0000\u0000\u0196\u0197\u0005\u000b\u0000\u0000"+
		"\u0197\u0198\u0007\u0003\u0000\u0000\u0198?\u0001\u0000\u0000\u00002C"+
		"INWafkor{\u008c\u0093\u00a2\u00a7\u00ac\u00b5\u00b8\u00bb\u00be\u00c1"+
		"\u00ca\u00cc\u00db\u00e1\u00e5\u00ea\u00f0\u00f7\u00ff\u0104\u010a\u010d"+
		"\u0112\u011c\u011f\u0124\u0128\u012c\u0135\u0139\u0145\u014f\u0158\u015c"+
		"\u0162\u0166\u016c\u0181\u0185\u0190";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}