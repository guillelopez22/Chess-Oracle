package chess.oracle.Piezas;

public class Peon extends Pieza {

    private int pos_ver;
    private int pos_hor;
    private String nombre;
    private String estado;

    public Peon(int pos_ver, int pos_hor, String nombre) {
        this.pos_ver = pos_ver;
        this.pos_hor = pos_hor;
        this.nombre = nombre;
    }

    

    public Peon(Pieza pieza) {
        super(pieza);
    }


    

    public void movement(int type, int jugador) {
        if (jugador == 1) {
            if (type == 1) {
                pos_ver = pos_ver + 2;
            } else if (type == 2) {
                pos_ver = pos_ver + 1;
            } else if (type == 3) {
                pos_hor = pos_hor + 1;
                pos_ver = pos_ver + 1;
            } else if (type == 4) {
                pos_hor = pos_hor - 1;
                pos_ver = pos_ver + 1;
            }
        }else if (jugador == 2) {
            if (type == 1) {
                pos_ver = pos_ver - 2;
            } else if (type == 2) {
                pos_ver = pos_ver - 1;
            } else if (type == 3) {
                pos_hor = pos_hor + 1;
                pos_ver = pos_ver - 1;
            } else if (type == 4) {
                pos_hor = pos_hor - 1;
                pos_ver = pos_ver - 1;
            }
        }

    }

    @Override
    public String toString() {
        return nombre;
    }

}
