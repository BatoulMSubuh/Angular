package AST;

public class HtmlAttrBindingRule extends HtmlAttributeValue{
    String HtmlAttrBindingRule_id;
    String HtmlAttrBindingRule_id2;

    public String getHtmlAttrBindingRule_id() {
        return HtmlAttrBindingRule_id;
    }

    public void setHtmlAttrBindingRule_id(String htmlAttrBindingRule_id) {
        HtmlAttrBindingRule_id = htmlAttrBindingRule_id;
    }

    public String getHtmlAttrBindingRule_id2() {
        return HtmlAttrBindingRule_id2;
    }

    public void setHtmlAttrBindingRule_id2(String htmlAttrBindingRule_id2) {
        HtmlAttrBindingRule_id2 = htmlAttrBindingRule_id2;
    }

    @Override
    public String toString() {
        return "HtmlAttrBindingRule{" +
                "HtmlAttrBindingRule_id='" + HtmlAttrBindingRule_id + '\'' +
                ", HtmlAttrBindingRule_id2='" + HtmlAttrBindingRule_id2 + '\'' +
                '}';
    }
}
