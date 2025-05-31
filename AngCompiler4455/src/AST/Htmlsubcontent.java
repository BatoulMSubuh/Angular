package AST;

public   class Htmlsubcontent {
    String id;
    HtmlElement htmlElement;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HtmlElement getHtmlElement() {
        return htmlElement;
    }

    public void setHtmlElement(HtmlElement htmlElement) {
        this.htmlElement = htmlElement;
    }

    @Override
    public String toString() {
        if (id != null)return "Htmlsubcontent{"+ '\n' +
                id +
                '}' + '\n';
        return "Htmlsubcontent{" + '\n'+
                htmlElement +
                '}';
    }
}
//htmlsubcontent
//    :ID|htmlElement;