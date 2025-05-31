package AST;

import AST.App.Class;
import AST.App.Header;
import AST.App.Html_template;
import AST.App.Import_statment;

import java.util.ArrayList;

public class Component {
    ArrayList<Import_statment> import_statment =new ArrayList<>();
    Header header;
    AST.App.Class classs;
    Html_template html_template;

    public ArrayList<Import_statment> getImport_statment() {
        return import_statment;
    }

    public void setImport_statment(ArrayList<Import_statment> import_statment) {
        this.import_statment = import_statment;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public AST.App.Class getClasss() {
        return classs;
    }

    public void setClasss(AST.App.Class classs) {
        this.classs = classs;
    }

    public Html_template getHtml_template() {
        return html_template;
    }

    public void setHtml_template(Html_template html_template) {
        this.html_template = html_template;
    }
    public Component(){}
    public Component(ArrayList<Import_statment> import_statment, Header header, Class classs, Html_template html_template) {
        this.import_statment = import_statment;
        this.header = header;
        this.classs = classs;
        this.html_template = html_template;
    }

//    @Override
//    public String toString() {
//        StringBuilder stringBuilder = new StringBuilder();
//        for (Import_statment child : import_statment)
//        {
//            stringBuilder.append(child.toString());
//            stringBuilder.append("\n");
//        }
//        if(html_template != null){
//            return "Component{" + '\n'+
//                    stringBuilder + header.toString() + classs.toString() + html_template.toString() +
//                    '}' ;
//        }
//        return "Component{"+ '\n' +
//                stringBuilder + header.toString() + classs.toString() +
//                '}' ;
//    }

    @Override
    public String toString() {
        return "Component{" +
                "import_statment=" + import_statment +
                ", header=" + header +
                ", classs=" + classs +
                ", html_template=" + html_template +
                '}';
    }
}
//component :
//    import_statment+ header class html_template?;