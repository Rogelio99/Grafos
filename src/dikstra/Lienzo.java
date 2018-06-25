/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dikstra;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Rogelio
 */
public class Lienzo extends JPanel implements MouseListener{
    private List<Nodo> vectorNodos;
    private List<Arista> vectorArista;
    private Point p1,p2;
    
    public Lienzo (){
        this.vectorNodos = new ArrayList<>();
        this.vectorArista = new ArrayList<>();
        this.addMouseListener(this);
    }
    
    
    
    @Override
    public void paint(Graphics g){
        for(Nodo nodos : vectorNodos){
            nodos.dibujar(g);
        }
        for(Arista aristas : vectorArista){
            aristas.dibujar(g);
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getButton() == MouseEvent.BUTTON1){
            String n=JOptionPane.showInputDialog(null,"Ingresa el nombre de el nodo");
            if(n.length()==0){
                JOptionPane.showMessageDialog(null, "No se puede agregar un nodo sin nombre");
                return;
            }else{
                this.vectorNodos.add(new Nodo(e.getX(), e.getY(), n));
            repaint();
            }
            
        }
        if(e.getButton() == MouseEvent.BUTTON3){
            for (Nodo nodo : vectorNodos) {
                if (new Rectangle(nodo.getX() - Nodo.d/2, nodo.getY() - Nodo.d/2, Nodo.d, Nodo.d).contains(e.getPoint())){
                    if(p1==null)
                        p1 = new Point(nodo.getX(), nodo.getY());
                    else{
                        p2 = new Point(nodo.getX(), nodo.getY());
                        int peso = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el peso de la arista"));
                        this.vectorArista.add(new Arista(p1.x, p1.y, p2.x, p2.y, peso));
                        repaint();
                        p1=null;
                        p2=null;
                    }
                        
                }
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
