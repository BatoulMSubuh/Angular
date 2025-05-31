package AST;

public class KWBooleanRule extends KeyWord{
    String KWBooleanRule_Boolean;

    public String getKWBooleanRule_Boolean() {
        return KWBooleanRule_Boolean;
    }

    public void setKWBooleanRule_Boolean(String KWBooleanRule_Boolean) {
        this.KWBooleanRule_Boolean = KWBooleanRule_Boolean;
    }

    @Override
    public String toString() {
        return "KWBooleanRule{" +
                "KWBooleanRule_Boolean='" + KWBooleanRule_Boolean + '\'' +
                '}';
    }
}
