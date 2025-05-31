package AST;

public class HtmlAttrStringRule extends  HtmlAttributeValue{
    String HtmlAttrStringRule_StringLiteral;

    public String getHtmlAttrStringRule_StringLiteral() {
        return HtmlAttrStringRule_StringLiteral;
    }

    public void setHtmlAttrStringRule_StringLiteral(String htmlAttrStringRule_StringLiteral) {
        HtmlAttrStringRule_StringLiteral = htmlAttrStringRule_StringLiteral;
    }

    @Override
    public String toString() {
        return "HtmlAttrStringRule{" +
                "HtmlAttrStringRule_StringLiteral='" + HtmlAttrStringRule_StringLiteral + '\'' +
                '}';
    }
}
