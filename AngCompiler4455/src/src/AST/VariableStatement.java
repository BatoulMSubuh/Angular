package AST;

import AST.Variables.VarType;

import java.util.List;

public class VariableStatement extends Datatype {
    String let;
    String thisvarname;
    String varname;
    KeyWord vartype;
    KeyWordValues varvalue;
    VarType varType; // TODO add to toString


    public VarType getVarType() {
        return varType;
    }



    public void setVarType(VarType varType) {
        this.varType = varType;
    }

    public String getLet() {
        return let;
    }

    public void setLet(String let) {
        this.let = let;
    }

    public String getThisvarname() {
        return thisvarname;
    }

    public void setThisvarname(String thisvarname) {
        this.thisvarname = thisvarname;
    }

    public String getVarname() {
        return varname;
    }

    public void setVarname(String varname) {
        this.varname = varname;
    }

    public KeyWord getVartype() {
        return vartype;
    }

    public void setVartype(KeyWord vartype) {
        this.vartype = vartype;
    }

    public KeyWordValues getVarvalue() {
        return varvalue;
    }

    public void setVarvalue(KeyWordValues varvalue) {
        this.varvalue = varvalue;
    }

    @Override
    public String toString() {
        if(let != null) {
            if (vartype != null) {
                if (varvalue != null){
                    if(varname != null){
                        return "VariableStatement{"+ '\n' +
                                "let" + varname + ":" + vartype.toString() + "=" + varvalue.toString() + ";" + "}";
                    }
                    return "VariableStatement{"+ '\n' +
                            "let this" + thisvarname + ":" + vartype.toString() + "=" + varvalue.toString() + ";" + "}";
                }
                if(varname != null){
                    return "VariableStatement{"+ '\n' +
                            "let" + varname + ":" + vartype.toString() +  ";" + "}";
                }
                return "VariableStatement{"+ '\n' +
                        "let this" + thisvarname + ":" + vartype.toString() +  ";" + "}";
            }
            if (varvalue != null){
                if(varname != null){
                    return "VariableStatement{"+ '\n' +
                            "let" + varname +  "=" + varvalue.toString() + ";" + "}";
                }
                return "VariableStatement{"+ '\n' +
                        "let this" + thisvarname +  "=" + varvalue.toString() + ";" + "}";
            }
            if(varname != null){
                return "VariableStatement{" + '\n'+
                        "let" + varname +   ";" + "}";
            }
            return "VariableStatement{"+ '\n'+
                    "let this" + thisvarname +   ";" + "}";
        }
        if (vartype != null) {
            if (varvalue != null){
                if(varname != null){
                    return "VariableStatement{"+ '\n' +
                             varname + ":" + vartype.toString() + "=" + varvalue.toString() + ";" + "}";
                }
                return "VariableStatement{"+ '\n' +
                        "this" + thisvarname + ":" + vartype.toString() + "=" + varvalue.toString() + ";" + "}";
            }
            if(varname != null){
                return "VariableStatement{"+ '\n' +
                         varname + ":" + vartype.toString() +  ";" + "}";
            }
            return "VariableStatement{" + '\n'+
                    "this" + thisvarname + ":" + vartype.toString() +  ";" + "}";
        }
        if (varvalue != null){
            if(varname != null){
                return "VariableStatement{"+ '\n' +
                          varname +  "=" + varvalue.toString() + ";" + "}";
            }
            return "VariableStatement{" + '\n'+
                    "this" + thisvarname +  "=" + varvalue.toString() + ";" + "}";
        }
        if(varname != null){
            return "VariableStatement{" + '\n'+
                     varname +   ";" + "}";
        }
        return "VariableStatement{" + '\n'+
                "this" + thisvarname +   ";" + "}";
    }
}
//variableStatement:
//    Let? (This ID2|ID) (Colon keyWord)?  (Assign (keyWordValues))? SemiColon;
