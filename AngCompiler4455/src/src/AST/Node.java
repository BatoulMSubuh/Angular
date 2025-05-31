package AST;


import java.util.List;

// TODO , all classes must extends this class
abstract public class Node {

    Node parent;

    List<Node> children;

    public List<Node> getChildren() {
        return children;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
        for (var ch : children){
            ch.parent = this;
        }
    }
}
