package AST;

public class KWValueBooleanRule  extends  KeyWordValues{
    String KWValueBooleanRule_Boolean;

    public String getKWValueBooleanRule_Boolean() {
        return KWValueBooleanRule_Boolean;
    }

    public void setKWValueBooleanRule_Boolean(String KWValueBooleanRule_Boolean) {
        this.KWValueBooleanRule_Boolean = KWValueBooleanRule_Boolean;
    }

    @Override
    public String toString() {
        return "KWValueBooleanRule{" +
                "KWValueBooleanRule_Boolean='" + KWValueBooleanRule_Boolean + '\'' +
                '}';
    }
}
