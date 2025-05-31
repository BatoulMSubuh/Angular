
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class semantic_check {
    SymbolTable symbolTable;
    ArrayList<String> errors = new ArrayList<>();
    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public void checkIfVariableIsDefined(SymbolTable symbolTable){


        // a :  ;

        for (int i = symbolTable.symboltable.size() - 1 ; i >=0 ; i--){

            if (symbolTable.symboltable.get(i).getType().equals("var_type")) {

                String varName = (String) symbolTable.symboltable.get(i-1).getValue();

                for (int j = symbolTable.symboltable.size() - 1 ; j >=0 ; j--){

                    if (symbolTable.symboltable.get(j).getType().equals("varname"))

                        if (symbolTable.symboltable.get(j).getValue().equals(varName))
                            break;

                    if ( j == i )

                        errors.add("Error in line " + symbolTable.symboltable.get(i).getValue2() + " : Variable \"" + varName + "\" is not defined");

                }
            }
        }

    }

    public void checkForDuplicateVariableDeclaration(SymbolTable symbolTable) {

        LinkedHashSet<String> definedVars = new LinkedHashSet<>();

        for (int i = 0; i < symbolTable.symboltable.size(); i++) {
            if (symbolTable.symboltable.get(i).getType().equals("varname")) {
                String varName = (String) symbolTable.symboltable.get(i).getValue();

                if (definedVars.contains(varName)) {
                    errors.add("Error in line " + symbolTable.symboltable.get(i).getValue2() +
                            " : Variable \"" + varName + "\" is already defined");
                } else {
                    definedVars.add(varName);
                }
            }
        }
    }







    public boolean check(){

        checkIfVariableIsDefined(this.symbolTable);
        checkForDuplicateVariableDeclaration(this.symbolTable);

        System.out.println(11);

        for (String error : errors) System.out.println(error);

        return errors.isEmpty();
    }
}
