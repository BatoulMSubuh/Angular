package AST;

public class HtmlTextWithArithmeticRule extends Htmltext{
    String HtmlTextWithArithmeticRule_id;
Operation operation;
String HtmlTextWithArithmeticRule_Number;

    public String getHtmlTextWithArithmeticRule_id() {
        return HtmlTextWithArithmeticRule_id;
    }

    public void setHtmlTextWithArithmeticRule_id(String htmlTextWithArithmeticRule_id) {
        HtmlTextWithArithmeticRule_id = htmlTextWithArithmeticRule_id;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public String getHtmlTextWithArithmeticRule_Number() {
        return HtmlTextWithArithmeticRule_Number;
    }

    public void setHtmlTextWithArithmeticRule_Number(String htmlTextWithArithmeticRule_Number) {
        HtmlTextWithArithmeticRule_Number = htmlTextWithArithmeticRule_Number;
    }

    @Override
    public String toString() {
        return "HtmlTextWithArithmeticRule{" +
                "HtmlTextWithArithmeticRule_id='" + HtmlTextWithArithmeticRule_id + '\'' +
                ", operation=" + operation +
                ", HtmlTextWithArithmeticRule_Number='" + HtmlTextWithArithmeticRule_Number + '\'' +
                '}';
    }
}
