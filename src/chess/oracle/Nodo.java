package chess.oracle;

public class Nodo {
    TreeNode treenode = null;
    Nodo next;

    public Nodo(TreeNode treenode){
        this.treenode=treenode;
    }
    
    public Nodo(){
        
    }
            

    public TreeNode getValue() {
        return treenode;
    }

    public void setValue(TreeNode treenode) {
        this.treenode = treenode;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
}
