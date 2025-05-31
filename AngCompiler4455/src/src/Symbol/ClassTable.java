package Symbol;

import AST.App.Class;
import AST.Node;
import AST.VariableStatement;
import AST.Variables.VarType;
import Symbol.Exceptions.ClassNameException;
import Symbol.Exceptions.ConstException;

import java.util.HashMap;
import java.util.HashSet;

public class ClassTable {

    HashSet<String> set = new HashSet<>();

    public void check(Node node) throws  ClassNameException {
        // TODO
        if (node instanceof Class) {
            Class c = (Class) node;
            throw new ClassNameException(c.getCalssname());//TODO
        }

    }
}
