package chess.oracle;

public class Lista {

    Nodo head;

    //opcional un zise;
    public Lista(Nodo head) {
        this.head = head;

    }

    public Lista() {
    }

    public void setHead(Nodo uncomingnode) {
        if (this.head == null) {
            this.head = uncomingnode;
        } else {
            uncomingnode.setNext(head);
            this.head = uncomingnode;
        }
    }

    public Nodo getHead() {
        return this.head;
    }

    public void insert(int position, Nodo value) {
        if (position == 0) {
            value.setNext(head);

            head = value;
        } else {
            Nodo headtemp = head;
            int contador = 0;
            while (headtemp.getNext() != null) {

                contador++;
                if (contador == position) {
                    value.setNext(headtemp.getNext());
                    headtemp.setNext(value);
                    break;
                }
                headtemp = headtemp.getNext();
            }

        }
    }

    public Object at(int position) {
        Nodo temporal = this.head;
        boolean bandera = false;
        int contador = -1;
        Object returnvalue = -1;
        while (temporal != null) {
            contador++;
            if (contador == position) {
                returnvalue = temporal.getData();
                bandera = true;
                break;
            }
            temporal = temporal.getNext();
        }

        if (bandera == false) {
            returnvalue = -1;
        }

        return returnvalue;
    }

    public void delete(int indice) {
        if (indice == 0) {
            head = head.getNext();
        } else {
            Nodo temp = head;
            int contador = -1;
            while (temp != null) {
                contador++;
                if (contador == indice) {
                    Nodo temporal = temp.getNext();
                    temporal.setNext(temp.getNext());
                    temp.setNext(temporal.getNext());

                }
                temp = temp.getNext();

            }
        }

    }

    public void concat(Lista uncominglist) {
        Nodo temporal = this.getHead();
        if (temporal != null) {
            while (temporal.getNext() != null) {
                temporal = temporal.getNext();
            }
            temporal.setNext(uncominglist.getHead());
        } else {
            this.head = uncominglist.getHead();
        }

    }

}
