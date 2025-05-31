package AST;

import AST.App.Html_template;

public class Header_body_value {
    String string;
    Html_template html_template;
   /*  string header_body_value;
    public String get_header_body_value() {
        return header_body_value;
    }*/
    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Html_template getHtml_template() {
        return html_template;
    }

    public void setHtml_template(Html_template html_template) {
        this.html_template = html_template;
    }

    @Override
    public String toString() {
        if(string != null) {
            return "Header_body_value{" + '\n'+
                        string +
                    '}' ;
        }
        return "Header_body_value{" + '\n'+
                '`' + html_template + '`' +
                '}' ;
    }
}
//header_body_value:
//StringLiteral|BackTick html_template BackTick;