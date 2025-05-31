package AST.App;

import AST.Component;
import AST.Node;

import java.util.ArrayList;
import java.util.List;

public class App extends Node {
    List<CodeLine> lines;

    public List<CodeLine> getLines() {
        return lines;
    }

    public void setLines(List<CodeLine> lines) {
        this.lines = lines;
    }

    public App(List<CodeLine> lines) {
        this.lines = lines;
    }

    @Override
    public String toString() {
        return "App{" +
                "lines=" + lines +
                '}';
    }
}
