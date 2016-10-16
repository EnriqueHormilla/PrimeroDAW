/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */
package tema12.ejemploClase;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;

/**
 *
 * @author VESPERTINO
 */
public class Ejercicio3 extends JFrame {

    private JPanel panelArriba, panelIzquierda, panelDerecha, panelInferior, panelCentro;
    private JButton boton[] = new JButton[10];
    private JLabel label[] =new JLabel[5];
    private JCheckBox checkBox[] =new JCheckBox[5];
    private JRadioButton radio[] =new JRadioButton[5];
    public Ejercicio3() {
        
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
        //tipo de layaout
        BorderLayout bl = new BorderLayout();
        getContentPane().setLayout(bl);
        getContentPane().add(panelArriba, BorderLayout.NORTH);
        getContentPane().add(panelIzquierda, BorderLayout.WEST);
        getContentPane().add(panelDerecha, BorderLayout.EAST);
        getContentPane().add(panelInferior, BorderLayout.SOUTH);
        getContentPane().add(panelCentro, BorderLayout.CENTER);

        panelArriba.setLayout(new FlowLayout());
        for (int i = 0; i < 10; i++) {
            boton[i] = new JButton(Integer.toString(i));
            panelArriba.add(boton[i]);
        }
        // Configurande panel izquierda BoxLayout
        panelIzquierda.setLayout(new BoxLayout(panelIzquierda, BoxLayout.Y_AXIS));
        for (int i = 0; i <5; i++) {
            label[i] = new JLabel("Es la opcion"+i);
            panelIzquierda.add(label[i]);
        }
        //Configuracion panel derecha
        panelDerecha.setLayout(new BoxLayout(panelDerecha, BoxLayout.Y_AXIS));
        for (int i = 0; i <5; i++) {
            checkBox[i] = new JCheckBox("Es la opcion"+i);
            panelDerecha.add(checkBox[i]);
        }
        //Configuracion apnel inferior
        panelInferior.setLayout(null);
       panelInferior.setPreferredSize(new Dimension(800, 50));
       //panelInferior.getPreferredSize();
        for (int i = 0; i <5; i++) {
            radio[i] = new JRadioButton("Es la opcion"+i);
            radio[i].setBounds (i*100+25,0,80,20);
            panelInferior.add(radio[i]);            
        }
        //configuracion del panel centro
        panelCentro.setLayout(new CardLayout());
        for (int i = 0; i < 10; i++) {
            boton[i] = new JButton(Integer.toString(i));
            panelCentro.add(boton[i]);
        }
        
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
        Ejercicio3 b = new Ejercicio3();
    }

}
