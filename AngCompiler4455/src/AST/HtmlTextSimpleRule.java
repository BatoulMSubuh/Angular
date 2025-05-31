package AST;

public class HtmlTextSimpleRule extends Htmltext{
String HtmlTextSimpleRule_id;

    public String getHtmlTextSimpleRule_id() {
        return HtmlTextSimpleRule_id;
    }

    public void setHtmlTextSimpleRule_id(String htmlTextSimpleRule_id) {
        HtmlTextSimpleRule_id = htmlTextSimpleRule_id;
    }

    @Override
    public String toString() {
        return "HtmlTextSimpleRule{" +
                "HtmlTextSimpleRule_id='" + HtmlTextSimpleRule_id + '\'' +
                '}';
    }
}
