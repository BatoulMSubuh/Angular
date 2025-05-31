package AST;

public class OpMinusRule extends Operation {
    String OpMinusRule_minues;

    public String getOpMinusRule_minues() {
        return OpMinusRule_minues;
    }

    public void setOpMinusRule_minues(String opMinusRule_minues) {
        OpMinusRule_minues = opMinusRule_minues;
    }

    @Override
    public String toString() {
        return "OpMinusRule{" +
                "OpMinusRule_minues='" + OpMinusRule_minues + '\'' +
                '}';
    }
}
