package AST;
import java.util.ArrayList;
public class HtmlElementSelfClosingRUule extends HtmlElement{
String Id_name;
ArrayList<HtmlAttribute> htmlAttribute = new ArrayList<>();
String Divide_name;

    public String getId_name() {
        return Id_name;
    }

    public void setId_name(String id_name) {
        Id_name = id_name;
    }

    public ArrayList<HtmlAttribute> getHtmlAttribute() {
        return htmlAttribute;
    }

    public void setHtmlAttribute(ArrayList<HtmlAttribute> htmlAttribute) {
        this.htmlAttribute = htmlAttribute;
    }

    public String getDivide_name() {
        return Divide_name;
    }

    public void setDivide_name(String divide_name) {
        Divide_name = divide_name;
    }

    @Override
    public String toString() {
        return "HtmlElementSelfClosingRUule{" +
                "Id_name='" + Id_name + '\'' +
                ", htmlAttribute=" + htmlAttribute +
                ", Divide_name='" + Divide_name + '\'' +
                '}';
    }
}
