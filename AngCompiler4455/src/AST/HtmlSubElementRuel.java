package AST;

public class HtmlSubElementRuel extends Htmlsubcontent{
    HtmlElement htmlElement;

    public HtmlElement getHtmlElement() {
        return htmlElement;
    }

    public void setHtmlElement(HtmlElement htmlElement) {
        this.htmlElement = htmlElement;
    }

    @Override
    public String toString() {
        return "HtmlSubElementRuel{" +
                "htmlElement=" + htmlElement +
                '}';
    }
}
