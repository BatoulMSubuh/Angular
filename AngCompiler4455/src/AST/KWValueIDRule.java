package AST;

public class KWValueIDRule extends  KeyWordValues{
    String KWValueIDRule_id;

    public String getKWValueIDRule_id() {
        return KWValueIDRule_id;
    }

    public void setKWValueIDRule_id(String KWValueIDRule_id) {
        this.KWValueIDRule_id = KWValueIDRule_id;
    }

    @Override
    public String toString() {
        return "KWValueIDRule{" +
                "KWValueIDRule_id='" + KWValueIDRule_id + '\'' +
                '}';
    }
}
