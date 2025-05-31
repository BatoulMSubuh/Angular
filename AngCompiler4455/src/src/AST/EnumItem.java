package AST;

public class EnumItem {
    String parent_enum;
    String enum_item;

    public String getParent_enum() {
        return parent_enum;
    }

    public void setParent_enum(String parent_enum) {
        this.parent_enum = parent_enum;
    }

    public String getEnum_item() {
        return enum_item;
    }

    public void setEnum_item(String enum_item) {
        this.enum_item = enum_item;
    }

    @Override
    public String toString() {
        return "EnumItem{" + '\n'+
                parent_enum + "." + enum_item +
                '}' ;
    }
}
//enumItem:
//    EnumID Dot EnumID;
