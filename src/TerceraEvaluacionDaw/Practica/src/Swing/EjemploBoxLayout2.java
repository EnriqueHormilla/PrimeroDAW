/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing;

import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author Enrique Hormilla
 */
public class EjemploBoxLayout2 extends JFrame {

    private JPanel panel1, panel2;
    private JButton[] botones1, botones2;

    public EjemploBoxLayout2() {
        botones1 = new JButton[10];
        botones2 = new JButton[10];
        panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
        panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
        for (int i = 0; i < 10; i++) {
            botones1[i] = new JButton("Unoss");
            panel1.add(botones1[i]);
            botones2[i] = new JButton("Doss");
            panel2.add(botones2[i]);
        }
        
        
        this.getContentPane().setLayout(new FlowLayout(1, 20, 20));
        this.getContentPane().add(panel1);
        this.getContentPane().add(panel2);
        
        setVisible(true);
        pack();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
 

    }
    public static void main(String[] args) {
        EjemploBoxLayout2 a=new EjemploBoxLayout2();
    }

}
