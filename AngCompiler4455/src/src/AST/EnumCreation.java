package AST;

import java.util.ArrayList;

public class EnumCreation extends Statments {
    String enum_name;
    ArrayList<String> enum_values =new ArrayList<>();

    public String getEnum_name() {
        return enum_name;
    }

    public void setEnum_name(String enum_name) {
        this.enum_name = enum_name;
    }

    public ArrayList<String> getEnum_values() {
        return enum_values;
    }

    public void setEnum_values(ArrayList<String> enum_values) {
        this.enum_values = enum_values;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String child : enum_values)
        {
            stringBuilder.append(child.toString());
            if (child == enum_values.get(enum_values.size()-1))
            {}
            else
                stringBuilder.append(",");
        }
        return "enumCreation { " + '\n'+"enum" +  enum_name + "{" + stringBuilder  + "} " + "}" ;
    }
}

//enumCreation:
//    Enum EnumID OpenBrace (EnumID Comma?)+ CloseBrace;