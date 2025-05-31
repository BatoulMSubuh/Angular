package AST;

public class KWValueStringRule  extends  KeyWordValues{
    String KWValueStringRule_StringLiteral;

    public String getKWValueStringRule_StringLiteral() {
        return KWValueStringRule_StringLiteral;
    }

    public void setKWValueStringRule_StringLiteral(String KWValueStringRule_StringLiteral) {
        this.KWValueStringRule_StringLiteral = KWValueStringRule_StringLiteral;
    }

    @Override
    public String toString() {
        return "KWValueStringRule{" +
                "KWValueStringRule_StringLiteral='" + KWValueStringRule_StringLiteral + '\'' +
                '}';
    }
}
