package AST;

import java.util.ArrayList;

public abstract class  HtmlContent {
//
//    ArrayList<Htmlsubcontent> htmlsubcontent = new ArrayList<>();
//
//    String txt;
//
//    Htmltext txt1;
//    Htmltext txt2;
//    Operation operation;
//
//    String key;
//    String colon;
//    HtmlElement htmlElement;
//    String txt11;
//    String dottxt;
//    String dolar;
//    String finaltxt;
//
//    public String getTxt11() {
//        return txt11;
//    }
//
//    public void setTxt11(String txt11) {
//        this.txt11 = txt11;
//    }
//
//    public ArrayList<Htmlsubcontent> getHtmlsubcontent() {
//        return htmlsubcontent;
//    }
//
//    public void setHtmlsubcontent(ArrayList<Htmlsubcontent> htmlsubcontent) {
//        this.htmlsubcontent = htmlsubcontent;
//    }
//
//    public String getTxt() {
//        return txt;
//    }
//
//    public void setTxt(String txt) {
//        this.txt = txt;
//    }
//
//    public String getDottxt() {
//        return dottxt;
//    }
//
//    public void setDottxt(String dottxt) {
//        this.dottxt = dottxt;
//    }
//
//    public String getDolar() {
//        return dolar;
//    }
//
//    public void setDolar(String dolar) {
//        this.dolar = dolar;
//    }
//
//    public String getFinaltxt() {
//        return finaltxt;
//    }
//
//    public void setFinaltxt(String finaltxt) {
//        this.finaltxt = finaltxt;
//    }
//
//    public Htmltext getTxt1() {
//        return txt1;
//    }
//
//    public void setTxt1(Htmltext txt1) {
//        this.txt1 = txt1;
//    }
//
//    public Htmltext getTxt2() {
//        return txt2;
//    }
//
//    public void setTxt2(Htmltext txt2) {
//        this.txt2 = txt2;
//    }
//
//    public Operation getOperation() {
//        return operation;
//    }
//
//    public void setOperation(Operation operation) {
//        this.operation = operation;
//    }
//
//    public String getKey() {
//        return key;
//    }
//
//    public void setKey(String key) {
//        this.key = key;
//    }
//
//    public String getColon() {
//        return colon;
//    }
//
//    public void setColon(String colon) {
//        this.colon = colon;
//    }
//
//    public HtmlElement getHtmlElement() {
//        return htmlElement;
//    }
//
//    public void setHtmlElement(HtmlElement htmlElement) {
//        this.htmlElement = htmlElement;
//    }
//
//    @Override
//    public String toString() {
//        if (htmlsubcontent.size() > 0) return "HtmlContent{"+ '\n' +
//                htmlsubcontent.toString() +
//                '}' ;
//        if (txt != null) return "HtmlContent{" + '\n'+
//                '{' + txt + '}' +
//                '}' ;
//        if (txt1 != null) {
//            if (txt2 != null) {
//                if (operation != null) {
//                    return "HtmlContent{"+ '\n' +
//                            txt1.toString() + operation.toString() + txt2.toString() +
//                            '}' ;
//                }
//                return "HtmlContent{" + '\n'+
//                        txt1.toString() + ':' + txt2.toString() +
//                        '}' ;
//            }
//            return "HtmlContent{" + '\n'+
//                    txt1.toString() +
//                    '}' ;
//        }
//        if (key != null) {
//            if (colon != null) {
//                if (htmlElement != null) {
//                    if (dolar != null) {
//                        return "HtmlContent{"+ '\n' +
//                                key + colon + htmlElement.toString() + "{{" + txt11 + dottxt + "}}" + '$' +
//                                '}'  ;
//                    }
//                    if (finaltxt != null) {
//                        return "HtmlContent{"+ '\n' +
//                                key + colon + htmlElement.toString() + "{{" + txt11 + dottxt + "}}" + finaltxt +
//                                '}'  ;
//                    }
//                    return "HtmlContent{"+ '\n' +
//                            key + colon + htmlElement.toString() + "{{" + txt11 + dottxt + "}}" +
//                            '}';
//                }
//                if (dolar != null) {
//                    return "HtmlContent{" + '\n'+
//                            key + colon + "{{" + txt11 + dottxt + "}}" + '$' +
//                            '}'  ;
//                }
//                if (finaltxt != null) {
//                    return "HtmlContent{" + '\n'+
//                            key + colon + "{{" + txt11 + dottxt + "}}" + finaltxt +
//                            '}' ;
//                }
//                return "HtmlContent{"+ '\n' +
//                        key + colon + "{{" + txt11 + dottxt + "}}" +
//                        '}' ;
//            }
//            if (htmlElement != null) {
//                if (dolar != null) {
//                    return "HtmlContent{" + '\n'+
//                            key  + htmlElement.toString() + "{{" + txt11 + dottxt + "}}" + '$' +
//                            '}' ;
//                }
//                if (finaltxt != null) {
//                    return "HtmlContent{"+ '\n' +
//                            key  + htmlElement.toString() + "{{" + txt11 + dottxt + "}}" + finaltxt +
//                            '}' ;
//                }
//                return "HtmlContent{" + '\n'+
//                        key  + htmlElement.toString() + "{{" + txt11 + dottxt + "}}" +
//                        '}' ;
//            }
//            if (dolar != null) {
//                return "HtmlContent{" + '\n'+
//                        key  + "{{" + txt11 + dottxt + "}}" + '$' +
//                        '}';
//            }
//            if (finaltxt != null) {
//                return "HtmlContent{"+ '\n' +
//                        key  + "{{" + txt11 + dottxt + "}}" + finaltxt +
//                        '}' ;
//            }
//            return "HtmlContent{"+ '\n' +
//                    key  + "{{" + txt11 + dottxt + "}}" +
//                    '}' ;
//        }
//        if (colon != null) {
//            if (htmlElement != null) {
//                if (dolar != null) {
//                    return "HtmlContent{" + '\n'+
//                            colon + htmlElement.toString() + "{{" + txt11 + dottxt + "}}" + '$' +
//                            '}' ;
//                }
//                if (finaltxt != null) {
//                    return "HtmlContent{" + '\n'+
//                            colon + htmlElement.toString() + "{{" + txt11 + dottxt + "}}" + finaltxt +
//                            '}';
//                }
//                return "HtmlContent{"+ '\n' +
//                         colon + htmlElement.toString() + "{{" + txt11 + dottxt + "}}" +
//                        '}';
//            }
//            if (dolar != null) {
//                return "HtmlContent{" + '\n'+
//                        key + colon + "{{" + txt11 + dottxt + "}}" + '$' +
//                        '}';
//            }
//            if (finaltxt != null) {
//                return "HtmlContent{" + '\n'+
//                         colon + "{{" + txt11 + dottxt + "}}" + finaltxt +
//                        '}';
//            }
//            return "HtmlContent{" + '\n'+
//                     colon + "{{" + txt11 + dottxt + "}}" +
//                    '}' ;
//        }
//        if (htmlElement != null) {
//            if (dolar != null) {
//                return "HtmlContent{" + '\n'+
//                         htmlElement.toString() + "{{" + txt11 + dottxt + "}}" + '$' +
//                        '}' ;
//            }
//            if (finaltxt != null) {
//                return "HtmlContent{" + '\n'+
//                         htmlElement.toString() + "{{" + txt11 + dottxt + "}}" + finaltxt +
//                        '}' ;
//            }
//            return "HtmlContent{" + '\n'+
//                     htmlElement.toString() + "{{" + txt11 + dottxt + "}}" +
//                    '}' ;
//        }
//        if (dolar != null) {
//            return "HtmlContent{" + '\n'+
//                    "{{" + txt11 + dottxt + "}}" + '$' +
//                    '}';
//        }
//        if (finaltxt != null) {
//            return "HtmlContent{"+ '\n' +
//                    "{{" + txt11 + dottxt + "}}" + finaltxt +
//                    '}' ;
//        }
//        return "HtmlContent{" + '\n'+
//                key  + "{{" + txt11 + dottxt + "}}" +
//                '}' ;
//
//    }

}
//htmlContent
//    : htmlsubcontent*
//    | OpenBrace ID  CloseBrace
//    | htmltext ((operation|Colon) htmltext )?
//    | ID? Colon? htmlElement? OpenBrace  OpenBrace ID ID2 CloseBrace CloseBrace (ID|Dolar)? ;