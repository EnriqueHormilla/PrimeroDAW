/*
Igual que el 3 pero en el medio hacer 3 (JPanel) paneles con carLayout ,y en cada panel 2 Label y 2 JTField
implementar un programa haciendo uso de Swing ,que muestre una ventana con un borderLayout donde el 
Top sea amarillo,el derecho verde,inferior naranja y el izquierdo azul
en el panel central mediante BoderLayout crearemos otro con cambiando los colores en el sentido del reloj.
 */
package tema12.ejemploClase;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;



/**
 *
 * @author VESPERTINO
 */
public class Ejercicio4 extends JFrame{
    private JPanel panelArriba, panelIzquierda, panelDerecha, panelInferior,panelCentro;
    private BorderLayout bl;
    private final Color amarillo=Color.YELLOW,azul=Color.BLUE,verde=Color.GREEN,naranja=Color.ORANGE;
    private int numeroDeVentanas;

    public Ejercicio4(int numeroDeVentanas) {
        
        panelArriba = new JPanel();
        panelIzquierda = new JPanel();
        panelDerecha = new JPanel();
        panelInferior = new JPanel();
        panelCentro = new JPanel();       
       
        panelArriba.setBackground(amarillo);
        panelIzquierda.setBackground(azul);
        panelDerecha.setBackground(verde);
        panelInferior.setBackground(naranja);
        
       
        getContentPane().setLayout(bl);
        getContentPane().add(panelArriba, BorderLayout.NORTH);
        getContentPane().add(panelIzquierda, BorderLayout.WEST);
        getContentPane().add(panelDerecha, BorderLayout.EAST);
        getContentPane().add(panelInferior, BorderLayout.SOUTH);
        getContentPane().add(panelCentro, BorderLayout.CENTER);
        int j=1;
        if(numeroDeVentanas>0){          
            for (int i = 0; i < numeroDeVentanas; i++) {  
            switch (j) {
                case 1:  
                    panelArriba.setBackground(azul);
                    panelIzquierda.setBackground(naranja);
                    panelDerecha.setBackground(amarillo);
                    panelInferior.setBackground(verde);
                    j=2;
                    break;
                case 2:
                    panelArriba.setBackground(naranja);
                    panelIzquierda.setBackground(verde);
                    panelDerecha.setBackground(azul);
                    panelInferior.setBackground(amarillo);
                    j=3;
                    break;
                case 3:
                    panelArriba.setBackground(verde);
                    panelIzquierda.setBackground(amarillo);
                    panelDerecha.setBackground(naranja);
                    panelInferior.setBackground(azul);
                    j=4;
                    break; 
                case 4:
                    panelArriba.setBackground(amarillo);
                    panelIzquierda.setBackground(azul);
                    panelDerecha.setBackground(verde);
                    panelInferior.setBackground(naranja);
                    j=1;
                    break;     
            }
           
            }  
        }else{
            panelCentro.setBackground(Color.black);
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
      Ejercicio4 b = new Ejercicio4(2);
    }
    
    
    
}
