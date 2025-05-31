import AST.App.*;
import AST.*;
import AST.App.Class;
import AST.Variables.VarType;
import gen.AngParser;
import gen.AngParserBaseVisitor;

import java.util.ArrayList;
import java.util.List;

public class BaseVisitor extends AngParserBaseVisitor {

    SymbolTable symbolTable = new SymbolTable();


    @Override
    public App visitApp(AngParser.AppContext ctx) {
        List<CodeLine> lines = new ArrayList<>();
        for (var line : ctx.codeLine()) {
            lines.add(visitCodeLine(line));
        }

        var app = new App(lines);

        app.setChildren(new ArrayList<>(lines));




        return app;
    }

    CodeLine visitCodeLine(AngParser.CodeLineContext ctx) {
        if (AngParser.ImportContext.class == ctx.getClass()) {
            return visitImport((AngParser.ImportContext) ctx);
        }
        if (AngParser.ClassCodeContext.class == ctx.getClass()) {
            return visitClassCode((AngParser.ClassCodeContext) ctx);
        }
        if (AngParser.HeadersContext.class == ctx.getClass()) {
            return visitHeaders((AngParser.HeadersContext) ctx);
        }
        if (AngParser.HtmlContext.class == ctx.getClass()) {
            return visitHtml((AngParser.HtmlContext) ctx);
        }
        return null;
    }


    @Override
    public Import_statment visitImport_statment(AngParser.Import_statmentContext ctx) {

        Import_statment import_statment = new Import_statment();

        if (ctx.ID() != null) {
            import_statment.setImport_name(ctx.ID().getText());
        }

        if (ctx.StringLiteral() != null) {
            import_statment.setFrom_name(ctx.StringLiteral().getText());

        }

        return import_statment;
    }

    @Override
    public Import_statment visitImport(AngParser.ImportContext ctx) {
        return visitImport_statment(ctx.import_statment());
    }

    @Override
    public Header visitHeaders(AngParser.HeadersContext ctx) {
        return visitHeader(ctx.header());
    }

    @Override
    public Class visitClassCode(AngParser.ClassCodeContext ctx) {
        return visitClass(ctx.class_());
    }

    @Override
    public Html_template visitHtml(AngParser.HtmlContext ctx) {
        return visitHtml_template(ctx.html_template());
    }

    //
//    @Override
//    public Component visitComponent(AngParser.ComponentContext ctx) {
//        Component component = new Component();
//
//
//        for (int i = 0; i < ctx.import_statment().size(); i++) {
//            if (ctx.import_statment(i) != null) {
//                component.getImport_statment().add((Import_statment) visitImport_statment(ctx.import_statment(i)));
//
//
//                RowTable rowTable = new RowTable();
//                rowTable.setType("Import_statment");
//                rowTable.setValue(component.getImport_statment());
//                symbolTable.getSymboltable().add(rowTable);
//            }
//        }
//
//
//        if (ctx.header() != null) {
//            component.setHeader((Header) visitHeader(ctx.header()));
////
//////
//////
//            RowTable rowTable = new RowTable();
//            rowTable.setType("Header");
//            rowTable.setValue(component.getHeader());
//            symbolTable.getSymboltable().add(rowTable);
//        }
//        if (ctx.class_() != null) {
//            component.setClasss((Class) visitClass(ctx.class_()));
//            RowTable rowTable = new RowTable();
//            rowTable.setType("Class");
//            rowTable.setValue(component.getClasss());
//            symbolTable.getSymboltable().add(rowTable);
//        }
//        if (ctx.html_template() != null) {
//            component.setHtml_template((Html_template) visitHtml_template(ctx.html_template()));
//            RowTable rowTable = new RowTable();
//            rowTable.setType("Html_template");
//            rowTable.setValue(component.getHtml_template());
//            symbolTable.getSymboltable().add(rowTable);
//        }
//
//        return component;
//
//    }


    public Statments visitStatments(AngParser.StatmentsContext ctx) {

        Statments statments = new Statments() {
        };


        return statments;
    }


    FunctionBodyStatments visitFunctionBodyStatement(AngParser.FunctionBodyStatmentsContext ctx) {
        // TODO
        FunctionBodyStatments statments = new FunctionBodyStatments();
        if(ctx instanceof AngParser.FuncPrintContext){
            statments.setPrintStatment(visitFuncPrint((AngParser.FuncPrintContext) ctx));
            return statments;
        }
        if(ctx instanceof AngParser.FuncDatatypeContext){
            statments.setDatatype(visitFuncDatatype((AngParser.FuncDatatypeContext) ctx));
            return statments;
        }
        return null;
    }


    @Override
    public FunctionBody visitFunctionBody(AngParser.FunctionBodyContext ctx) {
        // TODO
        return null;
    }

    @Override
    public FunctionStatment visitFunctionStatementRules(AngParser.FunctionStatementRulesContext ctx) {
        return visitFunctionStatment(ctx.functionStatment());
    }

    @Override
    public FunctionStatment visitFunctionStatment(AngParser.FunctionStatmentContext ctx) {
        // TODO
        return null;
    }

    @Override
    public Object visitDatatypeRule(AngParser.DatatypeRuleContext ctx) {
        return super.visitDatatypeRule(ctx);
    }

    @Override
    public Object visitEnumCreationRules(AngParser.EnumCreationRulesContext ctx) {
        return super.visitEnumCreationRules(ctx);
    }

    @Override
    public Class visitClass(AngParser.ClassContext ctx) {
        Class aClass = new Class();

        aClass.setCalssname(ctx.ID().getText());

        for (int i = 0; i < ctx.statments().size(); i++) {
            if (ctx.statments(i) != null) {
                aClass.getStatments().add((Statments) visitStatments(ctx.statments(i)));
                RowTable rowTable = new RowTable();
                rowTable.setType("class");
                rowTable.setValue(aClass.getCalssname());
                rowTable.setValue2("" + ctx.ID().getSymbol().getLine());
                symbolTable.getSymboltable().add(rowTable);


            }
        }


        return aClass;
    }

//    @Override
//    public Object visitHeader_body_value(AngParser.Header_body_valueContext ctx) {
//        return super.visitHeader_body_value(ctx);
//
//    }

    @Override
    public Header_body visitHeader_body(AngParser.Header_bodyContext ctx) {
        Header_body header_body = new Header_body();

        if (ctx.ID() != null) {
            header_body.setKey(ctx.ID().getText());
        }
        for (int i = 0; i < ctx.header_body_value().size(); i++) {

            if (ctx.OpenBracket() != null) {
                header_body.setOpen_bracket(ctx.OpenBracket().getText());
                RowTable rowTable = new RowTable();
                rowTable.setType("OpenBracket");
                rowTable.setValue(header_body.getOpen_bracket());
                rowTable.setValue2("" + ctx.ID().getSymbol().getLine());
                symbolTable.getSymboltable().add(rowTable);

            }
            if (ctx.CloseBracket() != null) {
                header_body.setClose_bracket(ctx.CloseBracket().getText());
                RowTable rowTable = new RowTable();
                rowTable.setType("CloseBracket");
                rowTable.setValue(header_body.getClose_bracket());
                rowTable.setValue2("" + ctx.ID().getSymbol().getLine());
                symbolTable.getSymboltable().add(rowTable);

            }
            if (ctx.Comma() != null) {
                header_body.setComma(ctx.Comma().getText());
            }
        }
        return header_body;
    }

    @Override
    public Header visitHeader(AngParser.HeaderContext ctx) {
        Header header = new Header();

        if (ctx.At() != null) {
            header.setAtvalue(ctx.At().getText());

        }


        for (int i = 0; i < ctx.header_body().size(); i++) {
            if (ctx.header_body(i) != null) {
                header.getHeader_body().add((Header_body) visitHeader_body(ctx.header_body(i)));
                RowTable rowTable = new RowTable();
                rowTable.setType("Header_body");
                rowTable.setValue(header.getHeader_body());
                rowTable.setValue2("" + ctx.ID().getSymbol().getLine());
                symbolTable.getSymboltable().add(rowTable);
            }
        }
        header.setChildren(new ArrayList<>(header.getHeader_body()));
        return header;
    }


    @Override
    public Html_template visitHtml_template(AngParser.Html_templateContext ctx) {
        return null;
    }


    @Override
    public Object visitHtmlElementWithContent(AngParser.HtmlElementWithContentContext ctx) {
        return super.visitHtmlElementWithContent(ctx);

    }

    @Override
    public Object visitHtmlElementSelfClosing(AngParser.HtmlElementSelfClosingContext ctx) {
        return super.visitHtmlElementSelfClosing(ctx);
    }

//    @Override
//    public Object visitHtmlSubcontentList(AngParser.HtmlSubcontentListContext ctx) {
//        Htmlsubcontent htmlsubcontentContent = new Htmlsubcontent();
//
//        for (int i = 0; i < ctx.htmlsubcontent().size(); i++) {
//            if (ctx.htmlsubcontent(i) != null) {
//
//                RowTable rowTable = new RowTable();
//                rowTable.setType("Htmlsubcontent");
//                rowTable.setValue(htmlsubcontentContent.getHtmlElement());
//                rowTable.setValue2("" + ctx.ID().getSymbol().getLine());
//                symbolTable.getSymboltable().add(rowTable);
//            }
//        }
//        return super.visitHtmlSubcontentList(ctx);
//    }

    @Override
    public Object visitHtmlContentExpression(AngParser.HtmlContentExpressionContext ctx) {
        return super.visitHtmlContentExpression(ctx);
    }

    @Override
    public Object visitHtmlTextWithOperation(AngParser.HtmlTextWithOperationContext ctx) {
        return super.visitHtmlTextWithOperation(ctx);
    }

    @Override
    public Object visitComplexBinding(AngParser.ComplexBindingContext ctx) {
        return super.visitComplexBinding(ctx);
    }

    @Override
    public Object visitHtmlTextSimple(AngParser.HtmlTextSimpleContext ctx) {
        return super.visitHtmlTextSimple(ctx);
    }

    @Override
    public Object visitHtmlTextWithArithmetic(AngParser.HtmlTextWithArithmeticContext ctx) {
        return super.visitHtmlTextWithArithmetic(ctx);
    }

    @Override
    public Object visitOpMinus(AngParser.OpMinusContext ctx) {
        return super.visitOpMinus(ctx);
    }

    @Override
    public Object visitOpPlus(AngParser.OpPlusContext ctx) {
        return super.visitOpPlus(ctx);
    }

    @Override
    public Object visitOpDivide(AngParser.OpDivideContext ctx) {
        return super.visitOpDivide(ctx);
    }

    @Override
    public Object visitOpMultiply(AngParser.OpMultiplyContext ctx) {
        return super.visitOpMultiply(ctx);
    }

    @Override
    public Object visitHtmlSubID(AngParser.HtmlSubIDContext ctx) {
        return super.visitHtmlSubID(ctx);
    }

    @Override
    public Object visitHtmlSubElement(AngParser.HtmlSubElementContext ctx) {
        return super.visitHtmlSubElement(ctx);
    }

    @Override
    public Object visitHtmlAttrStar(AngParser.HtmlAttrStarContext ctx) {
        return super.visitHtmlAttrStar(ctx);
    }

    @Override
    public Object visitHtmlAttrNormal(AngParser.HtmlAttrNormalContext ctx) {
        return super.visitHtmlAttrNormal(ctx);
    }

    @Override
    public Object visitHtmlAttrEventBinding(AngParser.HtmlAttrEventBindingContext ctx) {
        return super.visitHtmlAttrEventBinding(ctx);
    }

    @Override
    public Object visitHtmlAttrPropertyBinding(AngParser.HtmlAttrPropertyBindingContext ctx) {
        return super.visitHtmlAttrPropertyBinding(ctx);
    }

    @Override
    public Object visitHtmlAttrString(AngParser.HtmlAttrStringContext ctx) {
        return super.visitHtmlAttrString(ctx);
    }

    @Override
    public Object visitHtmlAttrBinding(AngParser.HtmlAttrBindingContext ctx) {
        return super.visitHtmlAttrBinding(ctx);
    }

    @Override
    public VariableStatement visitDatatypeVariable(AngParser.DatatypeVariableContext ctx) {
        ctx.getText();
        //TODO
        return null;
    }

    @Override
    public Object visitDatatypeEnumStatement(AngParser.DatatypeEnumStatementContext ctx) {
        return super.visitDatatypeEnumStatement(ctx);
    }

    @Override
    public Object visitDatatypeList(AngParser.DatatypeListContext ctx) {
        return super.visitDatatypeList(ctx);
    }

    @Override
    public Object visitKWAny(AngParser.KWAnyContext ctx) {
        return super.visitKWAny(ctx);
    }

    @Override
    public Object visitKWNumber(AngParser.KWNumberContext ctx) {
        return super.visitKWNumber(ctx);
    }

    @Override
    public Object visitKWBoolean(AngParser.KWBooleanContext ctx) {
        return super.visitKWBoolean(ctx);
    }

    @Override
    public Object visitKWString(AngParser.KWStringContext ctx) {
        return super.visitKWString(ctx);
    }

    @Override
    public Object visitKWEnumID(AngParser.KWEnumIDContext ctx) {
        return super.visitKWEnumID(ctx);
    }

    @Override
    public Object visitKWVoid(AngParser.KWVoidContext ctx) {
        return super.visitKWVoid(ctx);
    }

    @Override
    public Object visitKWValueNumber(AngParser.KWValueNumberContext ctx) {
        return super.visitKWValueNumber(ctx);
    }

    @Override
    public Object visitKWValueString(AngParser.KWValueStringContext ctx) {
        return super.visitKWValueString(ctx);
    }

    @Override
    public Object visitKWValueBoolean(AngParser.KWValueBooleanContext ctx) {
        return super.visitKWValueBoolean(ctx);
    }

    @Override
    public Object visitKWValueEnumItem(AngParser.KWValueEnumItemContext ctx) {
        return super.visitKWValueEnumItem(ctx);
    }

    @Override
    public Object visitKWValueNull(AngParser.KWValueNullContext ctx) {
        return super.visitKWValueNull(ctx);
    }

    @Override
    public Object visitKWValueID(AngParser.KWValueIDContext ctx) {
        return super.visitKWValueID(ctx);
    }

    @Override
    public Object visitVariableStatementRule(AngParser.VariableStatementRuleContext ctx) {
        // TODO
        return null;
    }

    @Override
    public VarType visitVarType(AngParser.VarTypeContext ctx) {
        if (ctx.Var() != null)
            return VarType.Var;
        if (ctx.Let() != null)
            return VarType.Let;

        return VarType.Const;
    }

    @Override
    public FunctionAttributes visitFunctionAttributes(AngParser.FunctionAttributesContext ctx) {
        // TODO
        return null;
    }


    KeyWord visitKeyWord(AngParser.KeyWordContext ctx) {
        // TODO
        return null;
    }

    @Override
    public PrintStatment visitFuncPrint(AngParser.FuncPrintContext ctx) {
        return new PrintStatment(ctx.printStatment().StringLiteral().getText());
    }


    @Override
    public Datatype visitFuncDatatype(AngParser.FuncDatatypeContext ctx) {
        // TODO
        Datatype datatype = new Datatype();

        if(ctx.datatype() instanceof AngParser.DatatypeVariableContext){
            datatype.setVariableStatement(visitDatatypeVariable((AngParser.DatatypeVariableContext)ctx.datatype()));

        }

        return datatype;
    }


    public Definelist visitDefinelist(AngParser.DefinelistContext ctx) {

        Definelist definelist = new Definelist();
        if (ctx.ID() != null) {
            definelist.setNamelist(ctx.ID().getText());
            RowTable rowTable = new RowTable();
            rowTable.setType("name list");
            rowTable.setValue(definelist.getNamelist());
            rowTable.setValue2("" + ctx.ID().getSymbol().getLine());
            symbolTable.getSymboltable().add(rowTable);
        }

        for (int i = 0; i < ctx.row().size(); i++) {
            if (ctx.row(i) != null) {
                RowTable rowTable = new RowTable();
                rowTable.setType("Arrayrow");
                rowTable.setValue(definelist.getArrayrow());
                rowTable.setValue2("" + ctx.ID().getSymbol().getLine());
                symbolTable.getSymboltable().add(rowTable);

            }
        }
        return definelist;
    }


}


