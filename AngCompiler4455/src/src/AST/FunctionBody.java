package AST;

import java.util.ArrayList;

public class FunctionBody {
    ArrayList<FunctionBodyStatments> functionBodyStatments =new ArrayList<>();

    public ArrayList<FunctionBodyStatments> getFunctionBodyStatments() {
        return functionBodyStatments;
    }

    public void setFunctionBodyStatments(ArrayList<FunctionBodyStatments> functionBodyStatments) {
        this.functionBodyStatments = functionBodyStatments;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (FunctionBodyStatments child : functionBodyStatments)
        {
            stringBuilder.append(child.toString());
        }
        return "functionBodyStatments{ " + '\n' + stringBuilder + "}";
    }
}
//functionBody:
//    functionBodyStatments*;