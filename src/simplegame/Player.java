/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simplegame;

import javafx.scene.shape.Circle;

/**
 *
 * @author Luca
 */
public class Player {
    Circle player;
    int lifes;
    int x;
    int y;
    
    Player(int lifes)
    {
        this.lifes=lifes;
    }

    public int getX()
    {
        return this.getX();
    }
    
    public int getY()
    {
        return this.getY();
    }
    
    public int getLifes()
    {
        return this.lifes;
    }
    
    public void move (String direction)
    {
        //Animations
    }
    
    public void looseLife()
    {
        this.lifes--;
    }
    
    public void getLife()
    {
        this.lifes++;
    }
}
