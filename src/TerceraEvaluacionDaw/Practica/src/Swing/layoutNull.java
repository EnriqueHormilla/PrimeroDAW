/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing;

import java.awt.Dimension;
import javax.swing.*;

/**
 *
 * @author Enrique Hormilla
 */
public class layoutNull extends JFrame {

    private JButton j;

    public layoutNull() {
        this.setLayout(null);
        j = new JButton("hola");
        this.add(j);
        j.setBounds(5, 5, 100, 100);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        layoutNull a = new layoutNull();
    }
}
