/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema12.ejemploClase;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author thinktic
 */
public class Ejercicio4Prima extends JFrame {
    private JPanel panelArriba, panelIzquierda, panelDerecha, panelInferior, panelCentro,centro;
    public Ejercicio4Prima() {
        
        panelArriba = new JPanel();
        panelIzquierda = new JPanel();
        panelDerecha = new JPanel();
        panelInferior = new JPanel();
        panelCentro = new JPanel();

        panelArriba.setBackground(Color.red);
        panelIzquierda.setBackground(Color.BLUE);
        panelDerecha.setBackground(Color.yellow);
        panelInferior.setBackground(Color.green);
        panelCentro.setBackground(Color.black);
        
        
        BorderLayout bl1=new BorderLayout();
        JPanel jp1=new JPanel(bl1);
        getContentPane().setLayout(bl1);
        getContentPane().add(panelArriba, BorderLayout.NORTH);
        getContentPane().add(panelIzquierda, BorderLayout.WEST);
        getContentPane().add(panelCentro, BorderLayout.EAST);
        getContentPane().add(panelIzquierda, BorderLayout.SOUTH);
        getContentPane().add(panelCentro, BorderLayout.CENTER);
        
       // panelCentro = new JPanel(new BorderLayout(5, 5));
       
        
        BorderLayout bl = new BorderLayout();      
        getContentPane().setLayout(bl);
        getContentPane().add(panelArriba, BorderLayout.NORTH);
        getContentPane().add(panelIzquierda, BorderLayout.WEST);
        getContentPane().add(panelDerecha, BorderLayout.EAST);
        getContentPane().add(panelInferior, BorderLayout.SOUTH);
        getContentPane().add(panelCentro, BorderLayout.CENTER);
        
       

        
        pack();
        //Se hace visible la ventana
        this.setVisible(true);
        //Se centre en la pantalla
        this.setLocationRelativeTo(null);
        //Un titulo  
        this.setTitle("Mi ventana");
        //Si das a la x se sale
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
}
    public static void main(String[] args) {
      Ejercicio4Prima b = new Ejercicio4Prima();
    }
}
