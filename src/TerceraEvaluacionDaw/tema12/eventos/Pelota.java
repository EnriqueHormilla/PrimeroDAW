/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema12.eventos;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static java.lang.Thread.sleep;
import java.net.URL;
import java.util.*;
import javax.swing.*;


/**
 *
 * @author VESPERTINO
 */
public class Pelota extends JFrame implements KeyListener {
    
    private JLabel jlPelota,jlFondo;
    private URL url, url1;
    private ImageIcon icon, icon2;
    public Pelota() {
        
        getContentPane().setLayout(null);
        
        url = getClass().getResource("/img/grass.jpg");
        icon = new ImageIcon(url);
        jlFondo = new JLabel(icon);
      
        getContentPane().add(jlFondo);
       
         
        url1 = getClass().getResource("/img/application_osx_terminal.png");
        icon2 = new ImageIcon(url1);
        jlPelota = new JLabel(icon2);
      
        getContentPane().add(jlPelota);
                
        jlFondo.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight());
        jlPelota.setBounds(250, 250, icon2.getIconWidth(), icon2.getIconHeight());
        
        this.setComponentZOrder(jlFondo, 1);
        this.setComponentZOrder(jlPelota, 0);
        addKeyListener(this);
        requestFocus();

        
        Image icon = new ImageIcon(
                getClass().getResource("/img/bug.png")).getImage();
        setIconImage(icon);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(720,540));
       // pack();
        setVisible(true);
    }

    public JLabel getJlPelota() {
        return jlPelota;
    }

    public void setJlPelota(JLabel jlPelota) {
        this.jlPelota = jlPelota;
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }
    @Override
    public void keyReleased(KeyEvent e) {
        HiloPelota hh = new HiloPelota(this,e);
        Thread t = new Thread(hh);
        t.start();

    }
    public static void main(String[] args) {
        Pelota pelota = new Pelota();
    }

    
   
}
