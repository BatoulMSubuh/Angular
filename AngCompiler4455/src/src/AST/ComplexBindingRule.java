package AST;

public class ComplexBindingRule extends HtmlContent{
    String ComplexBinding_id;
HtmlElement htmlElement;
String getComplexBinding_id2;
String Dolar;

    public String getComplexBinding_id() {
        return ComplexBinding_id;
    }

    public void setComplexBinding_id(String complexBinding_id) {
        ComplexBinding_id = complexBinding_id;
    }

    public HtmlElement getHtmlElement() {
        return htmlElement;
    }

    public void setHtmlElement(HtmlElement htmlElement) {
        this.htmlElement = htmlElement;
    }

    public String getGetComplexBinding_id2() {
        return getComplexBinding_id2;
    }

    public void setGetComplexBinding_id2(String getComplexBinding_id2) {
        this.getComplexBinding_id2 = getComplexBinding_id2;
    }

    public String getDolar() {
        return Dolar;
    }

    public void setDolar(String dolar) {
        Dolar = dolar;
    }

    @Override
    public String toString() {
        return "ComplexBindingRule{" +
                "ComplexBinding_id='" + ComplexBinding_id + '\'' +
                ", htmlElement=" + htmlElement +
                ", getComplexBinding_id2='" + getComplexBinding_id2 + '\'' +
                ", Dolar='" + Dolar + '\'' +
                '}';
    }
}
