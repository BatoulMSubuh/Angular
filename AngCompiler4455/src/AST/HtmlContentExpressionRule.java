package AST;
import java.util.ArrayList;
public class HtmlContentExpressionRule extends HtmlContent{
    String HtmlContentExpressionRule_id;

    public String getHtmlContentExpressionRule_id() {
        return HtmlContentExpressionRule_id;
    }

    public void setHtmlContentExpressionRule_id(String htmlContentExpressionRule_id) {
        HtmlContentExpressionRule_id = htmlContentExpressionRule_id;
    }

    @Override
    public String toString() {
        return "HtmlContentExpressionRule{" +
                "HtmlContentExpressionRule_id='" + HtmlContentExpressionRule_id + '\'' +
                '}';
    }
}
