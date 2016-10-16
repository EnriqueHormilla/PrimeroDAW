/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema12.eventos;

import java.awt.event.KeyEvent;
import static java.lang.Thread.*;


/**
 *
 * @author Enrique Hormilla 
 * 
 */
public class HiloPelota implements Runnable {
    private Pelota a;
    private KeyEvent e;

    public HiloPelota(Pelota a ,KeyEvent e) {
        this.a = a;
        this.e = e;
    }

    @Override
    public void run() {
        //Presiono flecha arriba
        try {
            switch (e.getKeyCode()) {
                 //Presiono flecha arriba
                case KeyEvent.VK_UP:
                    for (int i = 0; i < 10; i++) {
                        a.getJlPelota().setLocation(a.getJlPelota().getLocation().x,a.getJlPelota().getLocation().y-i);
                        a.repaint();
                        sleep(50);
                    }
                    //Presiono flecha abajo
                    break;
                case KeyEvent.VK_DOWN:
                    for (int i = 0; i < 10; i++) {
                        a.getJlPelota().setLocation(a.getJlPelota().getLocation().x,a.getJlPelota().getLocation().y+i);
                        a.repaint();
                        sleep(50);
                    }
                    //Presiono flecha izquierda
                    break; 
                case KeyEvent.VK_LEFT:
                    for (int i = 0; i < 10; i++) {
                        a.getJlPelota().setLocation(a.getJlPelota().getLocation().x - i,a.getJlPelota().getLocation().y);
                        a.repaint();
                        sleep(50);
                    }
                    //Presiono flecha derecha
                    break;
                case KeyEvent.VK_RIGHT:
                    for (int i = 0; i < 10; i++) {
                        a.getJlPelota().setLocation(a.getJlPelota().getLocation().x + i,a.getJlPelota().getLocation().y);
                        a.repaint();
                        sleep(50);
                    }                   
                    break;                 
            }   
        } catch (InterruptedException ex) {
             //Logger.getLogger(a.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
