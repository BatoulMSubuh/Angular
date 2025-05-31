package AST;

public class KWEnumIDRule extends KeyWord{
    String KWEnumIDRule_enumid;

    public String getKWEnumIDRule_enumid() {
        return KWEnumIDRule_enumid;
    }

    public void setKWEnumIDRule_enumid(String KWEnumIDRule_enumid) {
        this.KWEnumIDRule_enumid = KWEnumIDRule_enumid;
    }

    @Override
    public String toString() {
        return "KWEnumIDRule{" +
                "KWEnumIDRule_enumid='" + KWEnumIDRule_enumid + '\'' +
                '}';
    }
}
