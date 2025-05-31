package AST;

import java.util.ArrayList;

public class HtmlElementWithContentRule extends HtmlElement{
    String Name;
    ArrayList<HtmlElementWithContentRule> htmlElementWithContentRule =new ArrayList<>();
    HtmlContent htmlContent;
    String divide;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public HtmlContent getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(HtmlContent htmlContent) {
        this.htmlContent = htmlContent;
    }

    public String getDivide() {
        return divide;
    }

    public void setDivide(String divide) {
        this.divide = divide;
    }

    public ArrayList<HtmlElementWithContentRule> getHtmlElementWithContentRule() {
        return htmlElementWithContentRule;
    }

    public void setHtmlElementWithContentRule(ArrayList<HtmlElementWithContentRule> htmlElementWithContentRule) {
        this.htmlElementWithContentRule = htmlElementWithContentRule;
    }

    @Override
    public String toString() {
        return "HtmlElementWithContentRule{" +
                "Name='" + Name + '\'' +
                ", htmlElementWithContentRule=" + htmlElementWithContentRule +
                ", htmlContent=" + htmlContent +
                ", divide='" + divide + '\'' +
                '}';
    }
}

