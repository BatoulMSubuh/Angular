package AST;

public class HtmlSubIDRule extends Htmlsubcontent{
    String HtmlSubIDRule_id;

    public String getHtmlSubIDRule_id() {
        return HtmlSubIDRule_id;
    }

    public void setHtmlSubIDRule_id(String htmlSubIDRule_id) {
        HtmlSubIDRule_id = htmlSubIDRule_id;
    }

    @Override
    public String toString() {
        return "HtmlSubIDRule{" +
                "HtmlSubIDRule_id='" + HtmlSubIDRule_id + '\'' +
                '}';
    }
}
