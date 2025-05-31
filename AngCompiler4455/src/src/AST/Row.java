package AST;

import java.util.ArrayList;

public class Row {
    ArrayList<Rowvalue> rowvalue =new ArrayList<>();

    public ArrayList<Rowvalue> getRowvalue() {
        return rowvalue;
    }

    public void setRowvalue(ArrayList<Rowvalue> rowvalue) {
        this.rowvalue = rowvalue;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Rowvalue child : rowvalue)
        {
            stringBuilder.append(child.toString());
            if (child == rowvalue.get(rowvalue.size()-1))
            {}
            else
                stringBuilder.append(", \n");

        }
        return "Row {"+ '\n'+stringBuilder+"}";
    }

}
//row:
//    OpenBrace  rowvalue(Comma rowvalue)* CloseBrace;