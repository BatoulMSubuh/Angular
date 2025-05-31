package AST;

public class OpDivideRule extends Operation{
    String OpDivideRule_divid;

    public String getOpDivideRule_divid() {
        return OpDivideRule_divid;
    }

    public void setOpDivideRule_divid(String opDivideRule_divid) {
        OpDivideRule_divid = opDivideRule_divid;
    }

    @Override
    public String toString() {
        return "OpDivideRule{" +
                "OpDivideRule_divid='" + OpDivideRule_divid + '\'' +
                '}';
    }
}
