package chess.oracle;

public class TreeNode {

    private Lista children = new Lista();
    private TreeNode padre = null;
    private Object data = null;
    private int cont_children = 0;

    public TreeNode(Object data) {
        this.data = data;
    }

    public TreeNode() {
    }

    public TreeNode(Object data, TreeNode padre) {
        this.data = data;
        this.padre = padre;
    }

    public Lista getChildren() {
        return children;
    }

    public void setParent(TreeNode parent) {
        parent.addChild(this);
        padre = parent;
    }

    public void addChild(Object data) {
        TreeNode child = new TreeNode(data);
        child.setParent(this);
        this.children.insert(child, cont_children);
        cont_children++;
    }

    public void addChild(TreeNode child) {
        child.setParent(this);
        this.children.insert(child, cont_children);
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public boolean isRoot() {
        return (this.padre == null);
    }

    public boolean isLeaf() {
        if (cont_children == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void removeParent() {
        this.padre = null;
    }
}
