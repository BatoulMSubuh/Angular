package AST;

public class HtmlTextWithOperationRule extends HtmlContent {
    Htmltext htmltext;
    Operation operation;

    public Htmltext getHtmltext() {
        return htmltext;
    }

    public void setHtmltext(Htmltext htmltext) {
        this.htmltext = htmltext;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "HtmlTextWithOperationRule{" +
                "htmltext=" + htmltext +
                ", operation=" + operation +
                '}';
    }
}
