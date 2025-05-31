package Symbol;

import AST.Datatype;
import AST.Node;
import AST.VariableStatement;
import AST.Variables.VarType;
import Symbol.Exceptions.ConstException;

import java.util.HashMap;

public class ConstTable {


    HashMap<String, VarType> map = new HashMap<>();

    void check(Node node) throws ConstException {
        // TODO
        if (node instanceof VariableStatement) {
            VariableStatement variable = (VariableStatement) node;
            if (map.containsKey(variable.getVarname())) {
                if (map.get(variable.getVarname()) == VarType.Const)
                    throw new ConstException(variable.getVarname());
            } else {
                map.put(variable.getVarname(), variable.getVarType());
            }
        }
    }


}
