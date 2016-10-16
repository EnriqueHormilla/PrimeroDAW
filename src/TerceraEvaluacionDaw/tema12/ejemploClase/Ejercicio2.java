/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema12.ejemploClase;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author VESPERTINO
 */
public class Ejercicio2 extends JFrame{
    private JButton boton[] = new JButton[9];
    public Ejercicio2(){
        this.getContentPane().setLayout(new BorderLayout());
        for (int i=0;i<9;i++)
        boton[i] = new JButton(Integer.toString(i));
        
        add(boton[0], BorderLayout.CENTER);
        add(boton[1], BorderLayout.NORTH);
        add(boton[2], BorderLayout.SOUTH);
        add(boton[3], BorderLayout.WEST);
        add(boton[4], BorderLayout.EAST);
        pack();
        setVisible(true);
        setTitle("Maria petarda");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
