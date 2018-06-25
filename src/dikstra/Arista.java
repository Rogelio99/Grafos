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
public class Arista {
    private int peso;
    private Nodo nodo1;
    private Nodo nodo2;   

    public Arista(int peso, Nodo nodo1, Nodo nodo2) {
        this.peso = peso;
        this.nodo1 = nodo1;
        this.nodo2 = nodo2;
    }
    
    public void dibujar(Graphics g){
        g.drawLine(nodo1.getX(), nodo1.getY(), nodo2.getX(), nodo2.getY());
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Nodo getNodo1() {
        return nodo1;
    }

    public void setNodo1(Nodo nodo1) {
        this.nodo1 = nodo1;
    }

    public Nodo getNodo2() {
        return nodo2;
    }

    public void setNodo2(Nodo nodo2) {
        this.nodo2 = nodo2;
    }

   
}
