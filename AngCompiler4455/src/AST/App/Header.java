package AST.App;

import AST.Header_body;

import java.util.ArrayList;

public class Header extends CodeLine{
    String atvalue;
    ArrayList<Header_body> header_body =new ArrayList<>();

    public String getAtvalue() {
        return atvalue;
    }

    public void setAtvalue(String atvalue) {
        this.atvalue = atvalue;
    }

    public ArrayList<Header_body> getHeader_body() {
        return header_body;
    }

    public void setHeader_body(ArrayList<Header_body> header_body) {
        this.header_body = header_body;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Header_body child : header_body)
        {
            stringBuilder.append(child.toString());
        }
        return "Header{"+ '\n' +
                 atvalue + '(' + '{' + stringBuilder + '}' + ')' +
                '}';
    }
}
//header :
//    At ID OpenParen OpenBrace
//    header_body*
//    CloseBrace CloseParen ;