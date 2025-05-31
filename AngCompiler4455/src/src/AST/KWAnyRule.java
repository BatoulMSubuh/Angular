package AST;

public class KWAnyRule extends KeyWord{
    String KWAnyRule_Any;

    public String getKWAnyRule_Any() {
        return KWAnyRule_Any;
    }

    public void setKWAnyRule_Any(String KWAnyRule_Any) {
        this.KWAnyRule_Any = KWAnyRule_Any;
    }

    @Override
    public String toString() {
        return "KWAnyRule{" +
                "KWAnyRule_Any='" + KWAnyRule_Any + '\'' +
                '}';
    }
}
