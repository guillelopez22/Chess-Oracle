/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess.oracle.Piezas;

/**
 *
 * @author Memo
 */
public class Caballo extends Pieza {

    private int pos_vert;
    private int pos_hor;
    private String nombre;
    private String estado;

    public Caballo(int pos_vert, int pos_hor, String nombre) {
        super(pos_vert, pos_hor, nombre);
    }

    

    public Caballo() {
    }

    
    public void movemet(int type, int jugador) {
        if (type == 1) {
            pos_vert = pos_vert + 2;//l
            pos_hor = pos_hor + 1;// --
        } else if (type == 2) {
            pos_vert = pos_vert + 2;//---
            pos_hor = pos_hor - 1;//     :
        } else if (type == 3) {
            pos_vert = pos_vert - 2;
            pos_hor = pos_hor + 1;
        } else if (type == 4) {
            pos_vert = pos_vert - 2;
            pos_hor = pos_hor - 1;
        } else if (type == 5) {
            pos_vert = pos_vert + 1;
            pos_hor = pos_hor + 2;
        } else if (type == 6) {
            pos_vert = pos_vert + 1;
            pos_hor = pos_hor - 2;
        } else if (type == 7) {
            pos_vert = pos_vert - 1;
            pos_hor = pos_hor + 2;
        } else if (type == 8) {
            pos_vert = pos_vert - 1;
            pos_hor = pos_hor - 2;
        }
        
    }

    @Override
    public String toString() {
        return nombre;
    }
}
