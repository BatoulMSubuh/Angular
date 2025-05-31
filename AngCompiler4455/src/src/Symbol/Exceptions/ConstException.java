package Symbol.Exceptions;

public class ConstException extends Exception {
    public ConstException(String varName) {
        super(varName + " const!!!");
    }
}
