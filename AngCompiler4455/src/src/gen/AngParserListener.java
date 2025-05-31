// Generated from C:/Users/ASUS/Desktop/AngCompiler4455/src/AngParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngParser}.
 */
public interface AngParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AngParser#app}.
	 * @param ctx the parse tree
	 */
	void enterApp(AngParser.AppContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#app}.
	 * @param ctx the parse tree
	 */
	void exitApp(AngParser.AppContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Import}
	 * labeled alternative in {@link AngParser#codeLine}.
	 * @param ctx the parse tree
	 */
	void enterImport(AngParser.ImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Import}
	 * labeled alternative in {@link AngParser#codeLine}.
	 * @param ctx the parse tree
	 */
	void exitImport(AngParser.ImportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Headers}
	 * labeled alternative in {@link AngParser#codeLine}.
	 * @param ctx the parse tree
	 */
	void enterHeaders(AngParser.HeadersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Headers}
	 * labeled alternative in {@link AngParser#codeLine}.
	 * @param ctx the parse tree
	 */
	void exitHeaders(AngParser.HeadersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassCode}
	 * labeled alternative in {@link AngParser#codeLine}.
	 * @param ctx the parse tree
	 */
	void enterClassCode(AngParser.ClassCodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassCode}
	 * labeled alternative in {@link AngParser#codeLine}.
	 * @param ctx the parse tree
	 */
	void exitClassCode(AngParser.ClassCodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Html}
	 * labeled alternative in {@link AngParser#codeLine}.
	 * @param ctx the parse tree
	 */
	void enterHtml(AngParser.HtmlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Html}
	 * labeled alternative in {@link AngParser#codeLine}.
	 * @param ctx the parse tree
	 */
	void exitHtml(AngParser.HtmlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionStatementRules}
	 * labeled alternative in {@link AngParser#statments}.
	 * @param ctx the parse tree
	 */
	void enterFunctionStatementRules(AngParser.FunctionStatementRulesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionStatementRules}
	 * labeled alternative in {@link AngParser#statments}.
	 * @param ctx the parse tree
	 */
	void exitFunctionStatementRules(AngParser.FunctionStatementRulesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DatatypeRule}
	 * labeled alternative in {@link AngParser#statments}.
	 * @param ctx the parse tree
	 */
	void enterDatatypeRule(AngParser.DatatypeRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DatatypeRule}
	 * labeled alternative in {@link AngParser#statments}.
	 * @param ctx the parse tree
	 */
	void exitDatatypeRule(AngParser.DatatypeRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EnumCreationRules}
	 * labeled alternative in {@link AngParser#statments}.
	 * @param ctx the parse tree
	 */
	void enterEnumCreationRules(AngParser.EnumCreationRulesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EnumCreationRules}
	 * labeled alternative in {@link AngParser#statments}.
	 * @param ctx the parse tree
	 */
	void exitEnumCreationRules(AngParser.EnumCreationRulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#class}.
	 * @param ctx the parse tree
	 */
	void enterClass(AngParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#class}.
	 * @param ctx the parse tree
	 */
	void exitClass(AngParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteralRule}
	 * labeled alternative in {@link AngParser#header_body_value}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteralRule(AngParser.StringLiteralRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteralRule}
	 * labeled alternative in {@link AngParser#header_body_value}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteralRule(AngParser.StringLiteralRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BackTickRule}
	 * labeled alternative in {@link AngParser#header_body_value}.
	 * @param ctx the parse tree
	 */
	void enterBackTickRule(AngParser.BackTickRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BackTickRule}
	 * labeled alternative in {@link AngParser#header_body_value}.
	 * @param ctx the parse tree
	 */
	void exitBackTickRule(AngParser.BackTickRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#header_body}.
	 * @param ctx the parse tree
	 */
	void enterHeader_body(AngParser.Header_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#header_body}.
	 * @param ctx the parse tree
	 */
	void exitHeader_body(AngParser.Header_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(AngParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(AngParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#import_statment}.
	 * @param ctx the parse tree
	 */
	void enterImport_statment(AngParser.Import_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#import_statment}.
	 * @param ctx the parse tree
	 */
	void exitImport_statment(AngParser.Import_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#html_template}.
	 * @param ctx the parse tree
	 */
	void enterHtml_template(AngParser.Html_templateContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#html_template}.
	 * @param ctx the parse tree
	 */
	void exitHtml_template(AngParser.Html_templateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlElementWithContent}
	 * labeled alternative in {@link AngParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElementWithContent(AngParser.HtmlElementWithContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlElementWithContent}
	 * labeled alternative in {@link AngParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElementWithContent(AngParser.HtmlElementWithContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlElementSelfClosing}
	 * labeled alternative in {@link AngParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElementSelfClosing(AngParser.HtmlElementSelfClosingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlElementSelfClosing}
	 * labeled alternative in {@link AngParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElementSelfClosing(AngParser.HtmlElementSelfClosingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HmlSubcontentList}
	 * labeled alternative in {@link AngParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHmlSubcontentList(AngParser.HmlSubcontentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HmlSubcontentList}
	 * labeled alternative in {@link AngParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHmlSubcontentList(AngParser.HmlSubcontentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlContentExpression}
	 * labeled alternative in {@link AngParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContentExpression(AngParser.HtmlContentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlContentExpression}
	 * labeled alternative in {@link AngParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContentExpression(AngParser.HtmlContentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlTextWithOperation}
	 * labeled alternative in {@link AngParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTextWithOperation(AngParser.HtmlTextWithOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlTextWithOperation}
	 * labeled alternative in {@link AngParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTextWithOperation(AngParser.HtmlTextWithOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComplexBinding}
	 * labeled alternative in {@link AngParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterComplexBinding(AngParser.ComplexBindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComplexBinding}
	 * labeled alternative in {@link AngParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitComplexBinding(AngParser.ComplexBindingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlTextSimple}
	 * labeled alternative in {@link AngParser#htmltext}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTextSimple(AngParser.HtmlTextSimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlTextSimple}
	 * labeled alternative in {@link AngParser#htmltext}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTextSimple(AngParser.HtmlTextSimpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlTextWithArithmetic}
	 * labeled alternative in {@link AngParser#htmltext}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTextWithArithmetic(AngParser.HtmlTextWithArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlTextWithArithmetic}
	 * labeled alternative in {@link AngParser#htmltext}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTextWithArithmetic(AngParser.HtmlTextWithArithmeticContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpMinus}
	 * labeled alternative in {@link AngParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOpMinus(AngParser.OpMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpMinus}
	 * labeled alternative in {@link AngParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOpMinus(AngParser.OpMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpPlus}
	 * labeled alternative in {@link AngParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOpPlus(AngParser.OpPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpPlus}
	 * labeled alternative in {@link AngParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOpPlus(AngParser.OpPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpDivide}
	 * labeled alternative in {@link AngParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOpDivide(AngParser.OpDivideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpDivide}
	 * labeled alternative in {@link AngParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOpDivide(AngParser.OpDivideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpMultiply}
	 * labeled alternative in {@link AngParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOpMultiply(AngParser.OpMultiplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpMultiply}
	 * labeled alternative in {@link AngParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOpMultiply(AngParser.OpMultiplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlSubID}
	 * labeled alternative in {@link AngParser#htmlsubcontent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlSubID(AngParser.HtmlSubIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlSubID}
	 * labeled alternative in {@link AngParser#htmlsubcontent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlSubID(AngParser.HtmlSubIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlSubElement}
	 * labeled alternative in {@link AngParser#htmlsubcontent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlSubElement(AngParser.HtmlSubElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlSubElement}
	 * labeled alternative in {@link AngParser#htmlsubcontent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlSubElement(AngParser.HtmlSubElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlAttrStar}
	 * labeled alternative in {@link AngParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttrStar(AngParser.HtmlAttrStarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlAttrStar}
	 * labeled alternative in {@link AngParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttrStar(AngParser.HtmlAttrStarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlAttrNormal}
	 * labeled alternative in {@link AngParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttrNormal(AngParser.HtmlAttrNormalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlAttrNormal}
	 * labeled alternative in {@link AngParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttrNormal(AngParser.HtmlAttrNormalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlAttrEventBinding}
	 * labeled alternative in {@link AngParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttrEventBinding(AngParser.HtmlAttrEventBindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlAttrEventBinding}
	 * labeled alternative in {@link AngParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttrEventBinding(AngParser.HtmlAttrEventBindingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlAttrPropertyBinding}
	 * labeled alternative in {@link AngParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttrPropertyBinding(AngParser.HtmlAttrPropertyBindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlAttrPropertyBinding}
	 * labeled alternative in {@link AngParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttrPropertyBinding(AngParser.HtmlAttrPropertyBindingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlAttrString}
	 * labeled alternative in {@link AngParser#htmlAttributeValue}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttrString(AngParser.HtmlAttrStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlAttrString}
	 * labeled alternative in {@link AngParser#htmlAttributeValue}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttrString(AngParser.HtmlAttrStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlAttrBinding}
	 * labeled alternative in {@link AngParser#htmlAttributeValue}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttrBinding(AngParser.HtmlAttrBindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlAttrBinding}
	 * labeled alternative in {@link AngParser#htmlAttributeValue}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttrBinding(AngParser.HtmlAttrBindingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DatatypeVariable}
	 * labeled alternative in {@link AngParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatypeVariable(AngParser.DatatypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DatatypeVariable}
	 * labeled alternative in {@link AngParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatypeVariable(AngParser.DatatypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DatatypeEnumStatement}
	 * labeled alternative in {@link AngParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatypeEnumStatement(AngParser.DatatypeEnumStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DatatypeEnumStatement}
	 * labeled alternative in {@link AngParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatypeEnumStatement(AngParser.DatatypeEnumStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DatatypeList}
	 * labeled alternative in {@link AngParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatypeList(AngParser.DatatypeListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DatatypeList}
	 * labeled alternative in {@link AngParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatypeList(AngParser.DatatypeListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code KWAny}
	 * labeled alternative in {@link AngParser#keyWord}.
	 * @param ctx the parse tree
	 */
	void enterKWAny(AngParser.KWAnyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KWAny}
	 * labeled alternative in {@link AngParser#keyWord}.
	 * @param ctx the parse tree
	 */
	void exitKWAny(AngParser.KWAnyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code KWNumber}
	 * labeled alternative in {@link AngParser#keyWord}.
	 * @param ctx the parse tree
	 */
	void enterKWNumber(AngParser.KWNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KWNumber}
	 * labeled alternative in {@link AngParser#keyWord}.
	 * @param ctx the parse tree
	 */
	void exitKWNumber(AngParser.KWNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code KWBoolean}
	 * labeled alternative in {@link AngParser#keyWord}.
	 * @param ctx the parse tree
	 */
	void enterKWBoolean(AngParser.KWBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KWBoolean}
	 * labeled alternative in {@link AngParser#keyWord}.
	 * @param ctx the parse tree
	 */
	void exitKWBoolean(AngParser.KWBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code KWString}
	 * labeled alternative in {@link AngParser#keyWord}.
	 * @param ctx the parse tree
	 */
	void enterKWString(AngParser.KWStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KWString}
	 * labeled alternative in {@link AngParser#keyWord}.
	 * @param ctx the parse tree
	 */
	void exitKWString(AngParser.KWStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code KWEnumID}
	 * labeled alternative in {@link AngParser#keyWord}.
	 * @param ctx the parse tree
	 */
	void enterKWEnumID(AngParser.KWEnumIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KWEnumID}
	 * labeled alternative in {@link AngParser#keyWord}.
	 * @param ctx the parse tree
	 */
	void exitKWEnumID(AngParser.KWEnumIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code KWVoid}
	 * labeled alternative in {@link AngParser#keyWord}.
	 * @param ctx the parse tree
	 */
	void enterKWVoid(AngParser.KWVoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KWVoid}
	 * labeled alternative in {@link AngParser#keyWord}.
	 * @param ctx the parse tree
	 */
	void exitKWVoid(AngParser.KWVoidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code KWValueNumber}
	 * labeled alternative in {@link AngParser#keyWordValues}.
	 * @param ctx the parse tree
	 */
	void enterKWValueNumber(AngParser.KWValueNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KWValueNumber}
	 * labeled alternative in {@link AngParser#keyWordValues}.
	 * @param ctx the parse tree
	 */
	void exitKWValueNumber(AngParser.KWValueNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code KWValueString}
	 * labeled alternative in {@link AngParser#keyWordValues}.
	 * @param ctx the parse tree
	 */
	void enterKWValueString(AngParser.KWValueStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KWValueString}
	 * labeled alternative in {@link AngParser#keyWordValues}.
	 * @param ctx the parse tree
	 */
	void exitKWValueString(AngParser.KWValueStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code KWValueBoolean}
	 * labeled alternative in {@link AngParser#keyWordValues}.
	 * @param ctx the parse tree
	 */
	void enterKWValueBoolean(AngParser.KWValueBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KWValueBoolean}
	 * labeled alternative in {@link AngParser#keyWordValues}.
	 * @param ctx the parse tree
	 */
	void exitKWValueBoolean(AngParser.KWValueBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code KWValueEnumItem}
	 * labeled alternative in {@link AngParser#keyWordValues}.
	 * @param ctx the parse tree
	 */
	void enterKWValueEnumItem(AngParser.KWValueEnumItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KWValueEnumItem}
	 * labeled alternative in {@link AngParser#keyWordValues}.
	 * @param ctx the parse tree
	 */
	void exitKWValueEnumItem(AngParser.KWValueEnumItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code KWValueNull}
	 * labeled alternative in {@link AngParser#keyWordValues}.
	 * @param ctx the parse tree
	 */
	void enterKWValueNull(AngParser.KWValueNullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KWValueNull}
	 * labeled alternative in {@link AngParser#keyWordValues}.
	 * @param ctx the parse tree
	 */
	void exitKWValueNull(AngParser.KWValueNullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code KWValueID}
	 * labeled alternative in {@link AngParser#keyWordValues}.
	 * @param ctx the parse tree
	 */
	void enterKWValueID(AngParser.KWValueIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KWValueID}
	 * labeled alternative in {@link AngParser#keyWordValues}.
	 * @param ctx the parse tree
	 */
	void exitKWValueID(AngParser.KWValueIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableStatementRule}
	 * labeled alternative in {@link AngParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableStatementRule(AngParser.VariableStatementRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableStatementRule}
	 * labeled alternative in {@link AngParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableStatementRule(AngParser.VariableStatementRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#enumCreation}.
	 * @param ctx the parse tree
	 */
	void enterEnumCreation(AngParser.EnumCreationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#enumCreation}.
	 * @param ctx the parse tree
	 */
	void exitEnumCreation(AngParser.EnumCreationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVarType(AngParser.VarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVarType(AngParser.VarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#enumStatment}.
	 * @param ctx the parse tree
	 */
	void enterEnumStatment(AngParser.EnumStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#enumStatment}.
	 * @param ctx the parse tree
	 */
	void exitEnumStatment(AngParser.EnumStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#enumItem}.
	 * @param ctx the parse tree
	 */
	void enterEnumItem(AngParser.EnumItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#enumItem}.
	 * @param ctx the parse tree
	 */
	void exitEnumItem(AngParser.EnumItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncPrint}
	 * labeled alternative in {@link AngParser#functionBodyStatments}.
	 * @param ctx the parse tree
	 */
	void enterFuncPrint(AngParser.FuncPrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncPrint}
	 * labeled alternative in {@link AngParser#functionBodyStatments}.
	 * @param ctx the parse tree
	 */
	void exitFuncPrint(AngParser.FuncPrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncDatatype}
	 * labeled alternative in {@link AngParser#functionBodyStatments}.
	 * @param ctx the parse tree
	 */
	void enterFuncDatatype(AngParser.FuncDatatypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncDatatype}
	 * labeled alternative in {@link AngParser#functionBodyStatments}.
	 * @param ctx the parse tree
	 */
	void exitFuncDatatype(AngParser.FuncDatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#functionAttributes}.
	 * @param ctx the parse tree
	 */
	void enterFunctionAttributes(AngParser.FunctionAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#functionAttributes}.
	 * @param ctx the parse tree
	 */
	void exitFunctionAttributes(AngParser.FunctionAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(AngParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(AngParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#functionStatment}.
	 * @param ctx the parse tree
	 */
	void enterFunctionStatment(AngParser.FunctionStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#functionStatment}.
	 * @param ctx the parse tree
	 */
	void exitFunctionStatment(AngParser.FunctionStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#printStatment}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatment(AngParser.PrintStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#printStatment}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatment(AngParser.PrintStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#definelist}.
	 * @param ctx the parse tree
	 */
	void enterDefinelist(AngParser.DefinelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#definelist}.
	 * @param ctx the parse tree
	 */
	void exitDefinelist(AngParser.DefinelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(AngParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(AngParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#rowvalue}.
	 * @param ctx the parse tree
	 */
	void enterRowvalue(AngParser.RowvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#rowvalue}.
	 * @param ctx the parse tree
	 */
	void exitRowvalue(AngParser.RowvalueContext ctx);
}