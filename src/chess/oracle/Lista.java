package chess.oracle;

public class Lista {

    Nodo head;
    int size = 0;

    public Lista() {
        head = new Nodo();
    }

    public void insert(TreeNode treenode, int pos) {
        Nodo newNodo = new Nodo(treenode);
        Nodo newHead = head;
        int cont = 0;
        if (pos == 0) {
            newNodo.setNext(head);
            this.setHead(newNodo);
        }
        while (newHead.getNext() != null) {
            newHead = newHead.getNext();
            cont++;
            if (cont == pos) {
                break;
            }
        }
        Nodo n = newHead.getNext();
        newHead.setNext(newNodo);
        newNodo.setNext(n);
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public int find(int num) {
        return 0;
    }

    public TreeNode get(int pos) {
        Nodo temp = head;
        TreeNode valor = temp.getValue();
        for (int i = 0; i < pos; i++) {
            temp = temp.getNext();
            valor = temp.getValue();
        }
        return valor;
    }

    public void delete(int pos) {
        Nodo temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.getNext();
        }
        Nodo temp2 = temp.getNext();
        temp.setNext(temp2.getNext());
    }

    public Object first() {
        return head.getValue();
    }

    public void Print_Lista() {
        Nodo temp = head;
        int cont = 0;
        while (temp != null) {
            if (cont == 0) {
                System.out.print("[H]");
            }
            if (temp.getNext() != null) {
                System.out.print("[" + temp.getValue() + "] - ");
                cont++;
            } else {
                System.out.print("[" + temp.getValue() + "]");
                cont++;
            }
            temp = temp.next;
        }
        System.out.println("");
    }

    public void setSize(int cont) {
         size = cont;
    }
    public int size(){
        return size; 
    }

}
