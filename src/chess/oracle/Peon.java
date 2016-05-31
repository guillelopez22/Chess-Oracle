package chess.oracle;

public class Peon {

    private int pos_ver;
    private int pos_hor;
    private String nombre;
    private String estado;

    public Peon(int pos_ver, int pos_hor, String nombre) {
        this.pos_ver = pos_ver;
        this.pos_hor = pos_hor;
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    

    public Peon() {
    }

    public void movement(int type) {
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
    }

    @Override
    public String toString() {
        return nombre;
    }

}
