package AST;

public  class HtmlAttributeValue {
    String string_value;
    String value;
    String value2;

    public String getString_value() {
        return string_value;
    }

    public void setString_value(String string_value) {
        this.string_value = string_value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    @Override
    public String toString() {
        if(string_value != null) return "HtmlAttributeValue{ " + '\n'+
                string_value +
                '}' ;
        if(value != null)
            if(value2 != null)
            {
                return "HtmlAttributeValue{ "+ '\n' +
                        '{' +value + '.' + value2 + '}' +
                        '}' ;
            }
        return "HtmlAttributeValue{ " + '\n'+
                '{' + value + '}' +
                '}' ;
    }
}
//htmlAttributeValue
//    : StringLiteral
//    | OpenBrace ID ID2? CloseBrace;