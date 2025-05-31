package AST;

public  class KeyWord {
    String type_any;
    String type_number;
    String type_boolean;
    String type_string;
    String type_enum;
    String type_void;

    public String getType_any() {
        return type_any;
    }

    public void setType_any(String type_any) {
        this.type_any = type_any;
    }

    public String getType_number() {
        return type_number;
    }

    public void setType_number(String type_number) {
        this.type_number = type_number;
    }

    public String getType_boolean() {
        return type_boolean;
    }

    public void setType_boolean(String type_boolean) {
        this.type_boolean = type_boolean;
    }

    public String getType_string() {
        return type_string;
    }

    public void setType_string(String type_string) {
        this.type_string = type_string;
    }

    public String getType_enum() {
        return type_enum;
    }

    public void setType_enum(String type_enum) {
        this.type_enum = type_enum;
    }

    public String getType_void() {
        return type_void;
    }

    public void setType_void(String type_void) {
        this.type_void = type_void;
    }

    @Override
    public String toString() {
        if(type_any !=null)
        return "KeyWord{" + '\n'+
                " any " +
                '}' ;
        if(type_number !=null)
            return "KeyWord{"+ '\n' +
                    " number " +
                    '}' ;
        if(type_string !=null)
            return "KeyWord{" + '\n'+
                    " String " +
                    '}' ;
        if(type_boolean !=null)
            return "KeyWord{" + '\n'+
                    " boolean " +
                    '}';
        if(type_void !=null)
            return "KeyWord{" + '\n'+
                    " void " +
                    '}';
        return "KeyWord{ "+ '\n' +
                type_enum +
                " }" ;
    }
}
//keyWord:
//    Any
//    |Number1
//    |Boolean1
//    |String
//    |EnumID
//    |void;