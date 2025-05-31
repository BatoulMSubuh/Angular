import java.util.ArrayList;

public class SymbolTable {
    ArrayList<RowTable> symboltable = new ArrayList<>();

    // getter
    public ArrayList<RowTable> getSymboltable() {
        return symboltable;
    }
    // setter

    public void setSymboltable(ArrayList<RowTable> symboltable) {
        this.symboltable = symboltable;
    }
    // print
    public void print(){
        for (int i = 0 ; i < symboltable.size(); i++)
        {
            if (symboltable.get(i) != null)
            {
                System.out.println(symboltable.get(i).getType() +"\t\t\t"+" ||"+ "\t\t\t"+ symboltable.get(i).getValue()+"\t\t\t"+" ||"+ "\t\t\t"+symboltable.get(i).getValue2()+"\n");
            }
        }
    }
}
