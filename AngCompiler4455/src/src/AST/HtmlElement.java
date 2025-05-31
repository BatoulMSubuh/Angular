package AST;

import java.util.ArrayList;

public abstract class HtmlElement {
//
//    String open_tag_name;
//    String close_tag_name;
//    HtmlContent htmlContent;
//    ArrayList<HtmlAttribute> htmlAttribute =new ArrayList<>();
//
//    public String getOpen_tag_name() {
//        return open_tag_name;
//    }
//
//    public void setOpen_tag_name(String open_tag_name) {
//        this.open_tag_name = open_tag_name;
//    }
//
//    public String getClose_tag_name() {
//        return close_tag_name;
//    }
//
//    public void setClose_tag_name(String close_tag_name) {
//        this.close_tag_name = close_tag_name;
//    }
//
//    public HtmlContent getHtmlContent() {
//        return htmlContent;
//    }
//
//    public void setHtmlContent(HtmlContent htmlContent) {
//        this.htmlContent = htmlContent;
//    }
//
//    public ArrayList<HtmlAttribute> getHtmlAttribute() {
//        return htmlAttribute;
//    }
//
//    public void setHtmlAttribute(ArrayList<HtmlAttribute> htmlAttribute) {
//        this.htmlAttribute = htmlAttribute;
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder stringBuilder = new StringBuilder();
//        for (HtmlAttribute child : htmlAttribute)
//        {
//            stringBuilder.append(child.toString());
//        }
//        if(htmlContent != null)
//        {
//            return "HtmlElement{ "+ '\n' +
//                '<' + open_tag_name + stringBuilder + '>' + htmlContent.toString() + '<' + '/' + close_tag_name + '>' +
//                '}';
//        }
//        return "HtmlElement{ "+ '\n' +
//                '<' + open_tag_name + stringBuilder + '/' + '>' +
//                '}' ;
//    }
}
//htmlElement
//    : LessThan ID htmlAttribute* MoreThan htmlContent LessThan Divide ID MoreThan
//    | LessThan ID htmlAttribute* Divide MoreThan;