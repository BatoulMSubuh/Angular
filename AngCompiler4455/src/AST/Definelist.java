package AST;

import java.util.ArrayList;

public class Definelist extends Datatype {
    ArrayList<Row> arrayrow = new ArrayList<>();
    String namelist;

    public ArrayList<Row> getArrayrow() {
        return arrayrow;
    }

    public String getNamelist() {
        return namelist;
    }

    public void setArrayrow(ArrayList<Row> arrayrow) {
        this.arrayrow = arrayrow;
    }

    public void setNamelist(String namelist) {
        this.namelist = namelist;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Row child : arrayrow)
        {
            stringBuilder.append(child.toString());
            stringBuilder.append("\n");
        }
        return "definelist { "+ '\n' + namelist + " = ["+'\n' +stringBuilder+"]" + "} ";
    }
}
//definelist:
//    ID Assign OpenBracket row (Comma row)* Comma? CloseBracket  SemiColon;