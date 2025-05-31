package AST;

public class KWValueEnumItemRule extends  KeyWordValues{
    EnumItem enumItem;

    public EnumItem getEnumItem() {
        return enumItem;
    }

    public void setEnumItem(EnumItem enumItem) {
        this.enumItem = enumItem;
    }

    @Override
    public String toString() {
        return "KWValueEnumItemRule{" +
                "enumItem=" + enumItem +
                '}';
    }
}
