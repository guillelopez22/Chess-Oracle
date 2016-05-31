/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess.oracle;

/**
 *
 * @author Memo
 */
public class Rey {
    private int pos_vert;
    private int pos_hor;
    private String nombre;
    private String estado;

    public Rey(int pos_vert, int pos_hor, String nombre) {
        this.pos_vert = pos_vert;
        this.pos_hor = pos_hor;
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    public Rey() {
    }
    
    public void movement(int type){
        if (type == 1) {
            pos_vert = pos_vert+1;
        }else if (type == 2) {
            pos_vert = pos_vert-1;
        }else if (type == 3) {
            pos_hor = pos_hor +1;
        }else if (type == 4) {
            pos_hor = pos_hor +1;
        }else if (type == 5) {
            pos_vert = pos_vert+1;
            pos_hor = pos_hor +1;
        }else if (type == 6) {
            pos_vert = pos_vert+1;
            pos_hor = pos_hor -1;
        }else if (type == 7) {
            pos_vert = pos_vert-1;
            pos_hor = pos_hor -1;
        }else if (type == 8) {
            pos_vert = pos_vert-1;
            pos_hor = pos_hor +1;
        }
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
