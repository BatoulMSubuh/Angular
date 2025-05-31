package AST;

public class OpPlusRule extends Operation{
    String OpPlusRule_plus;

    public String getOpPlusRule_plus() {
        return OpPlusRule_plus;
    }

    public void setOpPlusRule_plus(String opPlusRule_plus) {
        OpPlusRule_plus = opPlusRule_plus;
    }

    @Override
    public String toString() {
        return "OpPlusRule{" +
                "OpPlusRule_plus='" + OpPlusRule_plus + '\'' +
                '}';
    }
}
