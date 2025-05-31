package AST;

public class DatatypeVariableRule  extends Datatype{
VariableStatement variableStatement;

    public VariableStatement getVariableStatement() {
        return variableStatement;
    }

    public void setVariableStatement(VariableStatement variableStatement) {
        this.variableStatement = variableStatement;
    }

    @Override
    public String toString() {
        return "DatatypeVariableRule{" +
                "variableStatement=" + variableStatement +
                '}';
    }
}
