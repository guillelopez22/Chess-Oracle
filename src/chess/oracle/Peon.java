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
public class Peon {
    private int pos_ver;
    private int pos_hor;

    public Peon() {
    }
    
    public void movement(int type){
        if (type == 1) {
            pos_ver = pos_ver+2;
        }else if (type == 2) {
            pos_ver = pos_ver +1;
        }else if (type == 3) {
            pos_hor = pos_hor+1;
            pos_ver = pos_ver+1;
        }else if (type == 4) {
            pos_hor = pos_hor-1;
            pos_ver = pos_ver+1;
        }
    }
}
