package AST;

public class KWStringRule extends  KeyWord{
    String  KWStringRule_string;

    public String getKWStringRule_string() {
        return KWStringRule_string;
    }

    public void setKWStringRule_string(String KWStringRule_string) {
        this.KWStringRule_string = KWStringRule_string;
    }

    @Override
    public String toString() {
        return "KWStringRule{" +
                "KWStringRule_string='" + KWStringRule_string + '\'' +
                '}';
    }
}
