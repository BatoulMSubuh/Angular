package AST.App;

import AST.Statments;

import java.util.ArrayList;

public class Class extends CodeLine{
    String calssname;
    ArrayList<Statments> statments =new ArrayList<>();

    public String getCalssname() {
        return calssname;
    }

    public void setCalssname(String calssname) {
        this.calssname = calssname;
    }

    public ArrayList<Statments> getStatments() {
        return statments;
    }

    public void setStatments(ArrayList<Statments> statments) {
        this.statments = statments;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Statments child : statments)
        {
            stringBuilder.append(child.toString()).append("\n");
        }
        return "Class{"+ '\n' +
                "export class " + calssname + '{' + stringBuilder +  '}' +
                '}';
    }
}
//class :
//    Export Class ID OpenBrace statments* CloseBrace ;