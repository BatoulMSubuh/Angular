package AST;

public  class HtmlAttribute {
    String multiply;
    String openParen;
    String openBracket;
    String attribute_name;
    String attribute_name_2;
    HtmlAttributeValue htmlAttributeValue;

    public String getMultiply() {
        return multiply;
    }

    public void setMultiply(String multiply) {
        this.multiply = multiply;
    }

    public String getOpenParen() {
        return openParen;
    }

    public void setOpenParen(String openParen) {
        this.openParen = openParen;
    }

    public String getOpenBracket() {
        return openBracket;
    }

    public void setOpenBracket(String openBracket) {
        this.openBracket = openBracket;
    }

    public String getAttribute_name() {
        return attribute_name;
    }

    public void setAttribute_name(String attribute_name) {
        this.attribute_name = attribute_name;
    }

    public String getAttribute_name_2() {
        return attribute_name_2;
    }

    public void setAttribute_name_2(String attribute_name_2) {
        this.attribute_name_2 = attribute_name_2;
    }

    public HtmlAttributeValue getHtmlAttributeValue() {
        return htmlAttributeValue;
    }

    public void setHtmlAttributeValue(HtmlAttributeValue htmlAttributeValue) {
        this.htmlAttributeValue = htmlAttributeValue;
    }

    @Override
    public String toString() {
        if(multiply != null){if(attribute_name_2 != null)
        {return "HtmlAttribute{ " + '\n'+
        '*' + attribute_name + '.' + attribute_name_2 + '=' + htmlAttributeValue.toString() +
                '}' ;
        }
        return "HtmlAttribute{ " + '\n'+
                '*' + attribute_name + '=' + htmlAttributeValue.toString() +
                '}' ;
        }

        if(openParen != null){if(attribute_name_2 != null)
        {return "HtmlAttribute{ "+ '\n' +
                '(' + attribute_name + '.' + attribute_name_2 + ')' + '=' + htmlAttributeValue.toString() +
                '}' ;
        }
            return "HtmlAttribute{ "+ '\n'+
                    '(' + attribute_name + ')' + '=' + htmlAttributeValue.toString() +
                    '}' ;
        }

        if(openBracket != null) {
            if (attribute_name_2 != null) {
                return "HtmlAttribute{ " + '\n'+
                        '[' + attribute_name + '.' + attribute_name_2 + ']' + '=' + htmlAttributeValue.toString() +
                        '}' ;
            }
            return "HtmlAttribute{ "+ '\n' +
                    '[' + attribute_name + ']' + '=' + htmlAttributeValue.toString() +
                    '}' ;
        }
        if(attribute_name_2 != null){
            return "HtmlAttribute{ "+ '\n' +
                     attribute_name + '.' + attribute_name_2 + '=' + htmlAttributeValue.toString() +
                    '}' ;
        }
        return "HtmlAttribute{ "+ '\n' +
                attribute_name + '=' + htmlAttributeValue.toString() +
                '}' ;
    }
}
//htmlAttribute:
//     Multiply ID ID2? Assign htmlAttributeValue
//    |ID ID2? Assign htmlAttributeValue
//    |OpenParen  ID ID2? CloseParen Assign htmlAttributeValue
//    |OpenBracket ID ID2? CloseBracket Assign htmlAttributeValue;