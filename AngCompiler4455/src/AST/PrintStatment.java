package AST;

public class PrintStatment {
    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "PrintStatment{ "+ '\n' +
                "console.log(" +message + ");" +
                "} ";
    }

    public PrintStatment(String message) {
        this.message = message;
    }
}
//printStatment:
//    Console ID2 OpenParen StringLiteral CloseParen SemiColon;