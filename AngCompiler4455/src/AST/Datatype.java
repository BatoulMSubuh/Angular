package AST;

import java.util.List;

public  class Datatype extends Node{

    VariableStatement variableStatement;
    EnumStatment enumStatment;
    Definelist definelist;



    public VariableStatement getVariableStatement() {
        return variableStatement;
    }

    public void setVariableStatement(VariableStatement variableStatement) {
        this.variableStatement = variableStatement;
    }

    public EnumStatment getEnumStatment() {
        return enumStatment;
    }

    public void setEnumStatment(EnumStatment enumStatment) {
        this.enumStatment = enumStatment;
    }

    public Definelist getDefinelist() {
        return definelist;
    }

    public void setDefinelist(Definelist definelist) {
        this.definelist = definelist;
    }

    @Override
    public String toString() {
       if(variableStatement != null) {return "Datatype{" + '\n'+
               variableStatement.toString() +
                '}' ;}
        if(enumStatment != null) {return "Datatype{"+ '\n' +
                enumStatment.toString() +
                '}';}
        return "Datatype{" +
                definelist.toString() +
                '}' ;
    }
}
//datatype:
//    variableStatement
//    |arrayStatment
//    |enumStatment
//    |definelist;