package AST;

import AST.Variables.VarType;

import java.util.List;

public class VariableStatement extends Datatype {
    String let;
    String thisvarname;
    String varname;
    KeyWord vartypeword;
    KeyWordValues varvalue;
    VarType varType; // TODO add to toString


    public VarType getVarType() {
        return varType;
    }

    public String getLet() {
        return let;
    }

    public void setLet(String let) {
        this.let = let;
    }

    public String getVarname() {
        return varname;
    }

    public void setVarname(String varname) {
        this.varname = varname;
    }

    public String getThisvarname() {
        return thisvarname;
    }

    public void setThisvarname(String thisvarname) {
        this.thisvarname = thisvarname;
    }

    public KeyWord getVartypeword() {
        return vartypeword;
    }

    public void setVartypeword(KeyWord vartypeword) {
        this.vartypeword = vartypeword;
    }

    public KeyWordValues getVarvalue() {
        return varvalue;
    }

    public void setVarvalue(KeyWordValues varvalue) {
        this.varvalue = varvalue;
    }

    public void setVarType(VarType varType) {
        this.varType = varType;
    }

    @Override
    public String toString() {
        return "VariableStatement{" +
                "let='" + let + '\'' +
                ", thisvarname='" + thisvarname + '\'' +
                ", varname='" + varname + '\'' +
                ", vartypeword=" + vartypeword +
                ", varvalue=" + varvalue +
                ", varType=" + varType +
                '}';
    }
}
