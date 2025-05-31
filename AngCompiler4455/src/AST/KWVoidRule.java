package AST;

public class KWVoidRule extends KeyWord{
    String KWVoidRule_Void;

    public String getKWVoidRule_Void() {
        return KWVoidRule_Void;
    }

    public void setKWVoidRule_Void(String KWVoidRule_Void) {
        this.KWVoidRule_Void = KWVoidRule_Void;
    }

    @Override
    public String toString() {
        return "KWVoidRule{" +
                "KWVoidRule_Void='" + KWVoidRule_Void + '\'' +
                '}';
    }
}
