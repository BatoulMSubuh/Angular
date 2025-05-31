package AST.App;

public class Import_statment extends CodeLine{
    String import_name;
    String from_name;

    public String getImport_name() {
        return import_name;
    }

    public void setImport_name(String import_name) {
        this.import_name = import_name;
    }

    public String getFrom_name() {
        return from_name;
    }

    public void setFrom_name(String from_name) {
        this.from_name = from_name;
    }

    @Override
    public String toString() {
        return "Import_statment{" + '\n'+
                "import { " +'\n'+ import_name + " }" +'\n'+ from_name + ";" +
                "}" ;
    }
}
//import_statment :
//    Import OpenBrace ID CloseBrace From StringLiteral SemiColon;