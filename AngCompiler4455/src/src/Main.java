import AST.App.App;
import Symbol.ClassTable;
import gen.AngLexer;
import gen.AngParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    public static void main(String[] args) {
        try {
            String source = "test1.txt";
            CharStream cs = fromFileName(source);
            AngLexer lexer = new AngLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            AngParser parser = new AngParser(token);
            ParseTree tree = parser.app();
            App doc = (App) new BaseVisitor().visit(tree);
            ClassTable classTable = new ClassTable();
            classTable.check(doc);
            System.out.println(doc);


        } catch (Exception e) {
            e.printStackTrace();
        }



    }



}
