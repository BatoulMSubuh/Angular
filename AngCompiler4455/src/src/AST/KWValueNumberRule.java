package AST;

public class KWValueNumberRule extends  KeyWordValues{
    String KWValueNumberRule_Number;

    public String getKWValueNumberRule_Number() {
        return KWValueNumberRule_Number;
    }

    public void setKWValueNumberRule_Number(String KWValueNumberRule_Number) {
        this.KWValueNumberRule_Number = KWValueNumberRule_Number;
    }

    @Override
    public String toString() {
        return "KWValueNumberRule{" +
                "KWValueNumberRule_Number='" + KWValueNumberRule_Number + '\'' +
                '}';
    }
}
