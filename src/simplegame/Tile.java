/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simplegame;

import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Luca
 */
public class Tile {
    
    Rectangle tile;
    int i;
    int j;

    /**
     * Initializes a new tile
     * @param dim dimension of the square tile
     * @param i i index of the [j][i] matrix
     * @param j j index of the [j][i] matrix
     */
    Tile(double dim, int i, int j) {
        this.i = i;
        this.j = j;
        tile = new Rectangle(dim, dim);
    }

    /**
     * @return the i index of the [j][i] matrix
     */
    public int getI() {
        return i;
    }

    /**
     * @return the i index of the [j][i] matrix
     */
    public int getJ() {
        return j;
    }

    /**
     * 
     * @return the rectangle inside the Tile class
     */
    public Rectangle get() {
        return tile;
    }

    /**
     * 
     * @return the tile fill
     */
    public Paint getFill() {
        return tile.getFill();
    }
}
