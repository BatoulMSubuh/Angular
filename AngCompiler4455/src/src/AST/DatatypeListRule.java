package AST;

public class DatatypeListRule  extends  Datatype{
Definelist definelist;

    public Definelist getDefinelist() {
        return definelist;
    }

    public void setDefinelist(Definelist definelist) {
        this.definelist = definelist;
    }

    @Override
    public String toString() {
        return "DatatypeListRule{" +
                "definelist=" + definelist +
                '}';
    }
}
