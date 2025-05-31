package AST;

public class DatatypeEnumStatementRule extends Datatype {
EnumStatment enumStatment;

    public EnumStatment getEnumStatment() {
        return enumStatment;
    }

    public void setEnumStatment(EnumStatment enumStatment) {
        this.enumStatment = enumStatment;
    }

    @Override
    public String toString() {
        return "DatatypeEnumStatementRule{" +
                "enumStatment=" + enumStatment +
                '}';
    }
}
