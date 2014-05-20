/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simplegame;

import javafx.scene.layout.GridPane;

/**
 *
 * @author Luca
 */
public class Grid {
    
    GridPane grid;
    Tile[][] matrix;
    int lato;

   
    Grid(int lato) {
        grid = new GridPane();
        grid.setGridLinesVisible(true);
        grid.setHgap(1);
        grid.setVgap(1);
        this.lato = lato;
        matrix = new Tile[lato][lato];
        populate(lato*lato);
    }
    
    public GridPane get() {
        return grid;
    }

    /**
     * Cycles through the grid and adds the tiles
     * @param dim dimension of the tile
     */
    private void populate(double dim) {
        for (int i = 0; i < lato; i++) {
            for (int j = 0; j < lato; j++) {
                Tile temp = new Tile(dim, i, j);
                grid.add(temp.get(), j, i);
                matrix[j][i] = temp;
            }
        }
    }
}
