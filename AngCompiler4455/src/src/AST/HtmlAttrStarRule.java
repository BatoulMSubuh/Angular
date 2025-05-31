package AST;

public class HtmlAttrStarRule extends  HtmlAttribute{
String HtmlAttrStarRule_multipl;
String HtmlAttrStarRule_id;
String HtmlAttrStarRule_id2;
String HtmlAttrStarRule_Assign;
HtmlAttributeValue htmlAttributeValue;

    public String getHtmlAttrStarRule_multipl() {
        return HtmlAttrStarRule_multipl;
    }

    public void setHtmlAttrStarRule_multipl(String htmlAttrStarRule_multipl) {
        HtmlAttrStarRule_multipl = htmlAttrStarRule_multipl;
    }

    public String getHtmlAttrStarRule_id2() {
        return HtmlAttrStarRule_id2;
    }

    public void setHtmlAttrStarRule_id2(String htmlAttrStarRule_id2) {
        HtmlAttrStarRule_id2 = htmlAttrStarRule_id2;
    }

    public String getHtmlAttrStarRule_id() {
        return HtmlAttrStarRule_id;
    }

    public void setHtmlAttrStarRule_id(String htmlAttrStarRule_id) {
        HtmlAttrStarRule_id = htmlAttrStarRule_id;
    }

    public String getHtmlAttrStarRule_Assign() {
        return HtmlAttrStarRule_Assign;
    }

    public void setHtmlAttrStarRule_Assign(String htmlAttrStarRule_Assign) {
        HtmlAttrStarRule_Assign = htmlAttrStarRule_Assign;
    }

    public HtmlAttributeValue getHtmlAttributeValue() {
        return htmlAttributeValue;
    }

    public void setHtmlAttributeValue(HtmlAttributeValue htmlAttributeValue) {
        this.htmlAttributeValue = htmlAttributeValue;
    }

    @Override
    public String toString() {
        return "HtmlAttrStarRule{" +
                "HtmlAttrStarRule_multipl='" + HtmlAttrStarRule_multipl + '\'' +
                ", HtmlAttrStarRule_id='" + HtmlAttrStarRule_id + '\'' +
                ", HtmlAttrStarRule_id2='" + HtmlAttrStarRule_id2 + '\'' +
                ", HtmlAttrStarRule_Assign='" + HtmlAttrStarRule_Assign + '\'' +
                ", htmlAttributeValue=" + htmlAttributeValue +
                '}';
    }
}
