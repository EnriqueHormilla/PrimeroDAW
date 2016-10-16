/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Enrique Hormilla
 */
public class EjemploBorderLayout extends JFrame {

    private JButton norte, sur, este, oeste, centro;

    public EjemploBorderLayout() {
        norte = new JButton("Norte");
        sur = new JButton("sur");
        este = new JButton("este");
        centro = new JButton("centro");
        oeste = new JButton("oeste");

        this.getContentPane().setLayout(new BorderLayout(10, 10));
        this.getContentPane().add(norte, BorderLayout.NORTH);
        this.getContentPane().add(sur, BorderLayout.SOUTH);
        this.getContentPane().add(centro, BorderLayout.CENTER);
        this.getContentPane().add(este, BorderLayout.EAST);
        this.getContentPane().add(oeste, BorderLayout.WEST);
        pack();
        setVisible(true);
    }
    public static void main(String[] args) {
        EjemploBorderLayout aa=new EjemploBorderLayout();
    }

}
