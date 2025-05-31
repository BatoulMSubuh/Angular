package AST;
import AST.Statments;
import java.util.ArrayList;

public class FunctionStatment extends Statments{
    String function;
    String function_name;
    ArrayList<FunctionAttributes> functionAttributes =new ArrayList<>();
    KeyWord function_type;
    FunctionBody functionBody;

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getFunction_name() {
        return function_name;
    }

    public void setFunction_name(String function_name) {
        this.function_name = function_name;
    }

    public ArrayList<FunctionAttributes> getFunctionAttributes() {
        return functionAttributes;
    }

    public void setFunctionAttributes(ArrayList<FunctionAttributes> functionAttributes) {
        this.functionAttributes = functionAttributes;
    }



    public KeyWord getFunction_type() {
        return function_type;
    }

    public void setFunction_type(KeyWord function_type) {
        this.function_type = function_type;
    }

    public FunctionBody getFunctionBody() {
        return functionBody;
    }

    public void setFunctionBody(FunctionBody functionBody) {
        this.functionBody = functionBody;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (FunctionAttributes child : functionAttributes)
        {
            stringBuilder.append(child.toString());
            if (child == functionAttributes.get(functionAttributes.size()-1))
            {}
            else
                stringBuilder.append(",");
        }
        if(function != null) {
            if(functionAttributes.size()>0){
                if(function_type != null){
                    return "FunctionStatment{ "+ '\n' +
                                "function" + function_name + '(' + stringBuilder + ')' + ':' + function_type + '{' + functionBody.toString() + '}' +
                            '}' + '\n';
                }
                return "FunctionStatment{ "+ '\n' +
                        "function" + function_name + '(' + stringBuilder + ')' + '{' + functionBody.toString() + '}' +
                        '}' + '\n';
        }
            if(function_type != null){
                return "FunctionStatment{ "+ '\n' +
                        "function" + function_name + '(' + ')' + ':' + function_type + '{' + functionBody.toString() + '}' +
                        '}' + '\n';
            }
            return "FunctionStatment{ " + '\n'+
                    "function" + function_name + '(' + ')' + '{' + functionBody.toString() + '}' +
                    '}' + '\n';
        }
        if(functionAttributes.size()>0){
            if(function_type != null){
                return "FunctionStatment{ " + '\n'+
                         function_name + '(' + stringBuilder + ')' + ':' + function_type + '{' + functionBody.toString() + '}' +
                        '}' + '\n';
            }
            return "FunctionStatment{ "+ '\n' +
                     function_name + '(' + stringBuilder + ')' + '{' + functionBody.toString() + '}' +
                    '}' + '\n';
        }
        if(function_type != null){
            return "FunctionStatment{ " + '\n'+
                     function_name + '(' + ')' + ':' + function_type + '{' + functionBody.toString() + '}' +
                    '}' + '\n';
        }
        return "FunctionStatment{ " + '\n'+
                 function_name + '(' + ')' + '{' + functionBody.toString() + '}' +
                '}' + '\n';
    }
}
//functionStatment:
//    Function? ID OpenParen((functionAttributes Comma?)*)?  CloseParen (Colon keyWord)? OpenBrace functionBody CloseBrace;