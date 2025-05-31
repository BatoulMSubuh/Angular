package AST;

import java.util.ArrayList;

public class Header_body extends Node{
String key;
String open_bracket;
String close_bracket;
String comma;
    ArrayList<Header_body_value> header_body_value =new ArrayList<>();

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getOpen_bracket() {
        return open_bracket;
    }

    public void setOpen_bracket(String open_bracket) {
        this.open_bracket = open_bracket;
    }

    public String getClose_bracket() {
        return close_bracket;
    }

    public void setClose_bracket(String close_bracket) {
        this.close_bracket = close_bracket;
    }

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    public ArrayList<Header_body_value> getHeader_body_value() {
        return header_body_value;
    }

    public void setHeader_body_value(ArrayList<Header_body_value> header_body_value) {
        this.header_body_value = header_body_value;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Header_body_value child : header_body_value)
        {
            stringBuilder.append(child.toString());
        }
        if(open_bracket != null){
            if(close_bracket != null){
                if(comma != null){
                    return "Header_body{"+ '\n' +
                            key + ':' + '[' + stringBuilder + ']' + ',' +
                            '}' ;
                }
                return "Header_body{" + '\n'+
                        key + ':' + '[' + stringBuilder + ']' +
                        '}' ;
                }
            if(comma != null){
                return "Header_body{" + '\n'+
                        key + ':' + '[' + stringBuilder  + ',' +
                        '}' ;
            }
            return "Header_body{"+ '\n' +
                    key + ':' + '[' + stringBuilder  +
                    '}' ;
            }
        if(close_bracket != null){
            if(comma != null){
                return "Header_body{"+ '\n' +
                        key + ':'  + stringBuilder + ']' + ',' +
                        '}' ;
            }
            return "Header_body{" + '\n'+
                    key + ':'  + stringBuilder + ']' +
                    '}' ;
        }
        if(comma != null){
            return "Header_body{" + '\n'+
                    key + ':'  + stringBuilder  + ',' +
                    '}' ;
        }
        return "Header_body{" + '\n'+
                key + ':'  + stringBuilder  +
                '}' ;
        }
    }

//header_body:
//ID Colon OpenBracket? (header_body_value)* CloseBracket? Comma?;
