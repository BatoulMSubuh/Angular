package AST.App;

import AST.HtmlElement;

import java.util.ArrayList;

public  class Html_template extends CodeLine{
    ArrayList<HtmlElement> htmlElement;

    public ArrayList<HtmlElement> getHtmlElement() {
        return htmlElement;
    }

    public void setHtmlElement(ArrayList<HtmlElement> htmlElement) {
        this.htmlElement = htmlElement;
    }

    @Override
    public String toString() {
        return "Html_template{" +
                "htmlElement=" + htmlElement +
                '}';
    }
}
//html_template
//    : htmlElement+;