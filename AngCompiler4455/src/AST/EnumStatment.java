package AST;

public class EnumStatment extends Datatype {
    String enum_name;
    String enum_type;
    EnumItem enum_value;

    public String getEnum_type() {
        return enum_type;
    }

    public void setEnum_type(String enum_type) {
        this.enum_type = enum_type;
    }

    public String getEnum_name() {
        return enum_name;
    }

    public void setEnum_name(String enum_name) {
        this.enum_name = enum_name;
    }

    public EnumItem getEnum_value() {
        return enum_value;
    }

    public void setEnum_value(EnumItem enum_value) {
        this.enum_value = enum_value;
    }

    @Override
    public String toString() {
        if(enum_value != null) {return "EnumStatment{"+ '\n' +
                "let" + enum_name + ":" + enum_type + "=" + enum_value + ";" +
                '}' ;}

        return "EnumStatment{"+ '\n' +
                "let" + enum_name + ":" + enum_type + ";" +
                '}'  ;
    }
}
//enumStatment:
//    Let ID Colon ID (Assign enumItem)? SemiColon;