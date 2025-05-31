package AST;

public class HtmlAttrEventBindingRule  extends  HtmlAttribute{
String HtmlAttrEventBindingRule_id;
String HtmlAttrEventBindingRule_id2;
String HtmlAttrEventBindingRule_assign;
HtmlAttributeValue htmlAttributeValue;

    public String getHtmlAttrEventBindingRule_id() {
        return HtmlAttrEventBindingRule_id;
    }

    public void setHtmlAttrEventBindingRule_id(String htmlAttrEventBindingRule_id) {
        HtmlAttrEventBindingRule_id = htmlAttrEventBindingRule_id;
    }

    public String getHtmlAttrEventBindingRule_id2() {
        return HtmlAttrEventBindingRule_id2;
    }

    public void setHtmlAttrEventBindingRule_id2(String htmlAttrEventBindingRule_id2) {
        HtmlAttrEventBindingRule_id2 = htmlAttrEventBindingRule_id2;
    }

    public String getHtmlAttrEventBindingRule_assign() {
        return HtmlAttrEventBindingRule_assign;
    }

    public void setHtmlAttrEventBindingRule_assign(String htmlAttrEventBindingRule_assign) {
        HtmlAttrEventBindingRule_assign = htmlAttrEventBindingRule_assign;
    }

    public HtmlAttributeValue getHtmlAttributeValue() {
        return htmlAttributeValue;
    }

    public void setHtmlAttributeValue(HtmlAttributeValue htmlAttributeValue) {
        this.htmlAttributeValue = htmlAttributeValue;
    }

    @Override
    public String toString() {
        return "HtmlAttrEventBindingRule{" +
                "HtmlAttrEventBindingRule_id='" + HtmlAttrEventBindingRule_id + '\'' +
                ", HtmlAttrEventBindingRule_id2='" + HtmlAttrEventBindingRule_id2 + '\'' +
                ", HtmlAttrEventBindingRule_assign='" + HtmlAttrEventBindingRule_assign + '\'' +
                ", htmlAttributeValue=" + htmlAttributeValue +
                '}';
    }
}
