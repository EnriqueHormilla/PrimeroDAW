/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Enrique Hormilla
 */
public class EjemploGridLayout extends JFrame{
    private JButton[] botones;
    
    public EjemploGridLayout() {
        botones=new JButton[16];
        this.getContentPane().setLayout(new GridLayout(2,8));
        for (int i = 0; i < 16; i++) {
            botones[i]=new JButton("ClearChallen");
            this.getContentPane().add(botones[i]);            
        }
        setVisible(true);
        pack();
    }
    public static void main(String[] args) {
        EjemploGridLayout aaa=new EjemploGridLayout();
    }
    
}
