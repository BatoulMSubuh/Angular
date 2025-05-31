package AST;

public class OpMultiplyRule  extends Operation{
    String OpMultiplyRule_multipl;

    public String getOpMultiplyRule_multipl() {
        return OpMultiplyRule_multipl;
    }

    public void setOpMultiplyRule_multipl(String opMultiplyRule_multipl) {
        OpMultiplyRule_multipl = opMultiplyRule_multipl;
    }

    @Override
    public String toString() {
        return "OpMultiplyRule{" +
                "OpMultiplyRule_multipl='" + OpMultiplyRule_multipl + '\'' +
                '}';
    }
}
