package AST;

public class Rowvalue {
    String key;
    String number_value;
    String string_value;
    String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getNumber_value() {
        return number_value;
    }

    public void setNumber_value(String number_value) {
        this.number_value = number_value;
    }

    public String getString_value() {
        return string_value;
    }

    public void setString_value(String sting_value) {
        this.string_value = sting_value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if (number_value != null) {
            return "rowvalue { "+ '\n' + key + " : " + number_value  + "}";
        }
        if(string_value != null){
            return "rowvalue { "+ '\n' + key + " : " + string_value  + "}";
        }
        return "rowvalue { " + '\n'+ key + " : " + value  + "}";
    }
}
//rowvalue:
//    ID Colon (Number|StringLiteral|ID);