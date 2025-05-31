package AST;

public class KWNumberRule  extends KeyWord{
    String KWNumberRule_Number1;

    public String getKWNumberRule_Number1() {
        return KWNumberRule_Number1;
    }

    public void setKWNumberRule_Number1(String KWNumberRule_Number1) {
        this.KWNumberRule_Number1 = KWNumberRule_Number1;
    }

    @Override
    public String toString() {
        return "KWNumberRule{" +
                "KWNumberRule_Number1='" + KWNumberRule_Number1 + '\'' +
                '}';
    }
}
