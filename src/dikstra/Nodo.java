/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dikstra;

import java.awt.Graphics;

/**
 *
 * @author Rogelio
 */
public class Nodo {
    private int x,y;
    private String nombre;
    public static final int d=60;
    

    public Nodo(int x, int y, String nombre) {
        this.x = x;
        this.y = y;
        this.nombre=nombre;
    }
    
    public void dibujar(Graphics g){
        g.drawOval(this.x - d/2, this.y - d/2, d, d);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
}
