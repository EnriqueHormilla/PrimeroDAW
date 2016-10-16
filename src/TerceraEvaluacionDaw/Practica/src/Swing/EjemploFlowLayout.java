/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;


/**
 *
 * @author Enrique Hormilla
 */
public class EjemploFlowLayout extends JFrame {

    private JButton[] botones;
    private JButton boton;
    private EjemploFlowLayout layout;

    public EjemploFlowLayout() {
        botones = new JButton[8];
        
        getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT,100, 50));
        for (int i = 0; i < 8; i++) {
            botones[i] = new JButton("Un boton mas");
            getContentPane().add(botones[i]);
        }

        this.pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        EjemploFlowLayout a = new EjemploFlowLayout();
    }

}
