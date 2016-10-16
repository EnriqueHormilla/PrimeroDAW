/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing;

import javax.swing.*;

/**
 *
 * @author Enrique Hormilla
 */
public class EjemploBoxLayout extends JFrame{
   private JButton[] botones;
   private BoxLayout elEstilo;
    public EjemploBoxLayout() {
     botones=new JButton[10];
        for (int i = 0; i < 10; i++) {
            botones[i]=new JButton("otro mas");
            
        }
        JPanel elEstilo=new JPanel();
        elEstilo.setLayout(new BoxLayout(elEstilo, BoxLayout.X_AXIS));       
        this.getContentPane().add(elEstilo);
                        
        for (int i = 0; i < 10; i++) {
            elEstilo.add(botones[i]);
        }
        setVisible(true);
        pack();
        
        
    }
    public static void main(String[] args) {
        EjemploBoxLayout a=new EjemploBoxLayout();
    }
    
}
