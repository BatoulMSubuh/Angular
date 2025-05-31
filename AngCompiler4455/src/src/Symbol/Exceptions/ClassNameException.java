package Symbol.Exceptions;

public class ClassNameException extends Exception {
    public ClassNameException(String name) {
        super("class " + name + " is repeated");
    }
}
