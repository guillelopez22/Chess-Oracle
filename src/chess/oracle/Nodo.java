package chess.oracle;

public class Nodo {

    Nodo next;
    Object data;

    public Nodo() {
    }

    public Nodo(Nodo next, Object data) {
        this.next = next;

        this.data = data;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
