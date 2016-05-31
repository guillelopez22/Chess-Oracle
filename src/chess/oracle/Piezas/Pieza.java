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
public class Pieza {
    private int pos_vert;
    private int pos_hor;
    private String nombre;
    private String estado;
    private int jugador;

    public Pieza() {
    }
    public Pieza(Pieza pieza){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pieza(int pos_vert, int pos_hor, String nombre) {
        this.pos_vert = pos_vert;
        this.pos_hor = pos_hor;
        this.nombre = nombre;
    }

    public int getJugador() {
        return jugador;
    }

    public void setJugador(int jugador) {
        this.jugador = jugador;
    }
    

    public int getPos_vert() {
        return pos_vert;
    }

    public void setPos_vert(int pos_vert) {
        this.pos_vert = pos_vert;
    }

    public int getPos_hor() {
        return pos_hor;
    }

    public void setPos_hor(int pos_hor) {
        this.pos_hor = pos_hor;
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void movement(int type, int jugador){
        
    }
    @Override
    public String toString() {
        return nombre;
    }
    
    
}
