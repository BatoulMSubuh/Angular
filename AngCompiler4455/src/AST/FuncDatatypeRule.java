package AST;

public class FuncDatatypeRule extends FunctionBodyStatments{
Datatype datatype;

    public Datatype getDatatype() {
        return datatype;
    }

    public void setDatatype(Datatype datatype) {
        this.datatype = datatype;
    }

    @Override
    public String toString() {
        return "FuncDatatypeRule{" +
                "datatype=" + datatype +
                '}';
    }
}
