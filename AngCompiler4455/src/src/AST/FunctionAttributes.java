package AST;

public class FunctionAttributes {
    String attribute_name;
    KeyWord attribute_type;

    public String getAttribute_name() {
        return attribute_name;
    }

    public void setAttribute_name(String attribute_name) {
        this.attribute_name = attribute_name;
    }

    public KeyWord getAttribute_type() {
        return attribute_type;
    }

    public void setAttribute_type(KeyWord attribute_type) {
        this.attribute_type = attribute_type;
    }

    @Override
    public String toString() {
        return "FunctionAttributes{ "+ '\n' +
                  attribute_name + ':' + attribute_type +
                '}' ;
    }
}
//functionAttributes:
//ID Colon keyWord;