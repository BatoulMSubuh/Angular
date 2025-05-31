package AST;

public  class FunctionBodyStatments {
    PrintStatment printStatment;
    Datatype datatype;
    public PrintStatment getPrintStatment() {
        return printStatment;
    }

    public void setPrintStatment(PrintStatment printStatment) {
        this.printStatment = printStatment;
    }

    public Datatype getDatatype() {
        return datatype;
    }

    public void setDatatype(Datatype datatype) {
        this.datatype = datatype;
    }

    @Override
    public String toString() {
        if(datatype != null) return "FunctionBodyStatments{"+ '\n' +
                datatype.toString() +
                '}' ;
        return "FunctionBodyStatments{" + '\n'+
                printStatment.toString() +
                '}' ;
    }
}
