package AST;

public class HtmlAttrPropertyBindingRule  extends  HtmlAttribute{
    String HtmlAttrPropertyBindingRule_id;
    String HtmlAttrPropertyBindingRule_id2;
    String HtmlAttrPropertyBindingRule_assign;
    HtmlAttributeValue htmlAttributeValue;

    public String getHtmlAttrPropertyBindingRule_id() {
        return HtmlAttrPropertyBindingRule_id;
    }

    public void setHtmlAttrPropertyBindingRule_id(String htmlAttrPropertyBindingRule_id) {
        HtmlAttrPropertyBindingRule_id = htmlAttrPropertyBindingRule_id;
    }

    public String getHtmlAttrPropertyBindingRule_id2() {
        return HtmlAttrPropertyBindingRule_id2;
    }

    public void setHtmlAttrPropertyBindingRule_id2(String htmlAttrPropertyBindingRule_id2) {
        HtmlAttrPropertyBindingRule_id2 = htmlAttrPropertyBindingRule_id2;
    }

    public String getHtmlAttrPropertyBindingRule_assign() {
        return HtmlAttrPropertyBindingRule_assign;
    }

    public void setHtmlAttrPropertyBindingRule_assign(String htmlAttrPropertyBindingRule_assign) {
        HtmlAttrPropertyBindingRule_assign = htmlAttrPropertyBindingRule_assign;
    }

    public HtmlAttributeValue getHtmlAttributeValue() {
        return htmlAttributeValue;
    }

    public void setHtmlAttributeValue(HtmlAttributeValue htmlAttributeValue) {
        this.htmlAttributeValue = htmlAttributeValue;
    }

    @Override
    public String toString() {
        return "HtmlAttrPropertyBindingRule{" +
                "HtmlAttrPropertyBindingRule_id='" + HtmlAttrPropertyBindingRule_id + '\'' +
                ", HtmlAttrPropertyBindingRule_id2='" + HtmlAttrPropertyBindingRule_id2 + '\'' +
                ", HtmlAttrPropertyBindingRule_assign='" + HtmlAttrPropertyBindingRule_assign + '\'' +
                ", htmlAttributeValue=" + htmlAttributeValue +
                '}';
    }
}
