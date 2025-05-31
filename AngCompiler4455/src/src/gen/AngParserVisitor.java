// Generated from C:/Users/ASUS/Desktop/AngCompiler4455/src/AngParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AngParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AngParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AngParser#app}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApp(AngParser.AppContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Import}
	 * labeled alternative in {@link AngParser#codeLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport(AngParser.ImportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Headers}
	 * labeled alternative in {@link AngParser#codeLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeaders(AngParser.HeadersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassCode}
	 * labeled alternative in {@link AngParser#codeLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCode(AngParser.ClassCodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Html}
	 * labeled alternative in {@link AngParser#codeLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml(AngParser.HtmlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionStatementRules}
	 * labeled alternative in {@link AngParser#statments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionStatementRules(AngParser.FunctionStatementRulesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DatatypeRule}
	 * labeled alternative in {@link AngParser#statments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatypeRule(AngParser.DatatypeRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EnumCreationRules}
	 * labeled alternative in {@link AngParser#statments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumCreationRules(AngParser.EnumCreationRulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(AngParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteralRule}
	 * labeled alternative in {@link AngParser#header_body_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteralRule(AngParser.StringLiteralRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BackTickRule}
	 * labeled alternative in {@link AngParser#header_body_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackTickRule(AngParser.BackTickRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#header_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader_body(AngParser.Header_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(AngParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#import_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_statment(AngParser.Import_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#html_template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml_template(AngParser.Html_templateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlElementWithContent}
	 * labeled alternative in {@link AngParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElementWithContent(AngParser.HtmlElementWithContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlElementSelfClosing}
	 * labeled alternative in {@link AngParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElementSelfClosing(AngParser.HtmlElementSelfClosingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HmlSubcontentList}
	 * labeled alternative in {@link AngParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHmlSubcontentList(AngParser.HmlSubcontentListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlContentExpression}
	 * labeled alternative in {@link AngParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContentExpression(AngParser.HtmlContentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlTextWithOperation}
	 * labeled alternative in {@link AngParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTextWithOperation(AngParser.HtmlTextWithOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComplexBinding}
	 * labeled alternative in {@link AngParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexBinding(AngParser.ComplexBindingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlTextSimple}
	 * labeled alternative in {@link AngParser#htmltext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTextSimple(AngParser.HtmlTextSimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlTextWithArithmetic}
	 * labeled alternative in {@link AngParser#htmltext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTextWithArithmetic(AngParser.HtmlTextWithArithmeticContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpMinus}
	 * labeled alternative in {@link AngParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpMinus(AngParser.OpMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpPlus}
	 * labeled alternative in {@link AngParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpPlus(AngParser.OpPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpDivide}
	 * labeled alternative in {@link AngParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpDivide(AngParser.OpDivideContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpMultiply}
	 * labeled alternative in {@link AngParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpMultiply(AngParser.OpMultiplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlSubID}
	 * labeled alternative in {@link AngParser#htmlsubcontent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlSubID(AngParser.HtmlSubIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlSubElement}
	 * labeled alternative in {@link AngParser#htmlsubcontent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlSubElement(AngParser.HtmlSubElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlAttrStar}
	 * labeled alternative in {@link AngParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttrStar(AngParser.HtmlAttrStarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlAttrNormal}
	 * labeled alternative in {@link AngParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttrNormal(AngParser.HtmlAttrNormalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlAttrEventBinding}
	 * labeled alternative in {@link AngParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttrEventBinding(AngParser.HtmlAttrEventBindingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlAttrPropertyBinding}
	 * labeled alternative in {@link AngParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttrPropertyBinding(AngParser.HtmlAttrPropertyBindingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlAttrString}
	 * labeled alternative in {@link AngParser#htmlAttributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttrString(AngParser.HtmlAttrStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlAttrBinding}
	 * labeled alternative in {@link AngParser#htmlAttributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttrBinding(AngParser.HtmlAttrBindingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DatatypeVariable}
	 * labeled alternative in {@link AngParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatypeVariable(AngParser.DatatypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DatatypeEnumStatement}
	 * labeled alternative in {@link AngParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatypeEnumStatement(AngParser.DatatypeEnumStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DatatypeList}
	 * labeled alternative in {@link AngParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatypeList(AngParser.DatatypeListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code KWAny}
	 * labeled alternative in {@link AngParser#keyWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKWAny(AngParser.KWAnyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code KWNumber}
	 * labeled alternative in {@link AngParser#keyWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKWNumber(AngParser.KWNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code KWBoolean}
	 * labeled alternative in {@link AngParser#keyWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKWBoolean(AngParser.KWBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code KWString}
	 * labeled alternative in {@link AngParser#keyWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKWString(AngParser.KWStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code KWEnumID}
	 * labeled alternative in {@link AngParser#keyWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKWEnumID(AngParser.KWEnumIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code KWVoid}
	 * labeled alternative in {@link AngParser#keyWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKWVoid(AngParser.KWVoidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code KWValueNumber}
	 * labeled alternative in {@link AngParser#keyWordValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKWValueNumber(AngParser.KWValueNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code KWValueString}
	 * labeled alternative in {@link AngParser#keyWordValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKWValueString(AngParser.KWValueStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code KWValueBoolean}
	 * labeled alternative in {@link AngParser#keyWordValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKWValueBoolean(AngParser.KWValueBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code KWValueEnumItem}
	 * labeled alternative in {@link AngParser#keyWordValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKWValueEnumItem(AngParser.KWValueEnumItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code KWValueNull}
	 * labeled alternative in {@link AngParser#keyWordValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKWValueNull(AngParser.KWValueNullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code KWValueID}
	 * labeled alternative in {@link AngParser#keyWordValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKWValueID(AngParser.KWValueIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableStatementRule}
	 * labeled alternative in {@link AngParser#variableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableStatementRule(AngParser.VariableStatementRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#enumCreation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumCreation(AngParser.EnumCreationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#varType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarType(AngParser.VarTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#enumStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumStatment(AngParser.EnumStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#enumItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumItem(AngParser.EnumItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncPrint}
	 * labeled alternative in {@link AngParser#functionBodyStatments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncPrint(AngParser.FuncPrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncDatatype}
	 * labeled alternative in {@link AngParser#functionBodyStatments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDatatype(AngParser.FuncDatatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#functionAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionAttributes(AngParser.FunctionAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(AngParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#functionStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionStatment(AngParser.FunctionStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#printStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatment(AngParser.PrintStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#definelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinelist(AngParser.DefinelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(AngParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#rowvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowvalue(AngParser.RowvalueContext ctx);
}