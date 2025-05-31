package AST;

public class HtmlAttrNormalRule extends HtmlAttribute{
String HtmlAttrNormalRule_id;
String HtmlAttrNormalRule_id2;
String HtmlAttrNormalRule_Assign;
HtmlAttributeValue htmlAttributeValue;

    public String getHtmlAttrNormalRule_id() {
        return HtmlAttrNormalRule_id;
    }

    public void setHtmlAttrNormalRule_id(String htmlAttrNormalRule_id) {
        HtmlAttrNormalRule_id = htmlAttrNormalRule_id;
    }

    public String getHtmlAttrNormalRule_id2() {
        return HtmlAttrNormalRule_id2;
    }

    public void setHtmlAttrNormalRule_id2(String htmlAttrNormalRule_id2) {
        HtmlAttrNormalRule_id2 = htmlAttrNormalRule_id2;
    }

    public String getHtmlAttrNormalRule_Assign() {
        return HtmlAttrNormalRule_Assign;
    }

    public void setHtmlAttrNormalRule_Assign(String htmlAttrNormalRule_Assign) {
        HtmlAttrNormalRule_Assign = htmlAttrNormalRule_Assign;
    }

    public HtmlAttributeValue getHtmlAttributeValue() {
        return htmlAttributeValue;
    }

    public void setHtmlAttributeValue(HtmlAttributeValue htmlAttributeValue) {
        this.htmlAttributeValue = htmlAttributeValue;
    }

    @Override
    public String toString() {
        return "HtmlAttrNormalRule{" +
                "HtmlAttrNormalRule_id='" + HtmlAttrNormalRule_id + '\'' +
                ", HtmlAttrNormalRule_id2='" + HtmlAttrNormalRule_id2 + '\'' +
                ", HtmlAttrNormalRule_Assign='" + HtmlAttrNormalRule_Assign + '\'' +
                ", htmlAttributeValue=" + htmlAttributeValue +
                '}';
    }
}
