package AST;
import java.util.ArrayList;
public class HtmlSubcontentListRule extends HtmlContent{
    ArrayList<Htmlsubcontent> htmlsubcontent = new ArrayList<>();

    public ArrayList<Htmlsubcontent> getHtmlsubcontent() {
        return htmlsubcontent;
    }

    public void setHtmlsubcontent(ArrayList<Htmlsubcontent> htmlsubcontent) {
        this.htmlsubcontent = htmlsubcontent;
    }

    @Override
    public String toString() {
        return "HtmlSubcontentListRule{" +
                "htmlsubcontent=" + htmlsubcontent +
                '}';
    }
}
