package tema12.eventos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Enrique
 */
public class Calculadora extends JFrame implements ActionListener{
    private JLabel jlbPantalla;
    private JPanel jpMedio,jpAlto,jpBajo;
    private JButton[] botones;  
    private JButton jbtnBoton;
    private int digito1,aux;
    private String operador;   
    
    public Calculadora() {
    //Primer panel
        jpAlto=new JPanel();
        jpAlto.setLayout(new BoxLayout(jpAlto,BoxLayout.Y_AXIS));
        jlbPantalla=new JLabel("");        
        //jpAlto.setBackground(Color.WHITE);
        jpAlto.add(jlbPantalla);
        
    //Segundo panel
        //Necesito tener un JPanel en el cual le asignare un Layout GridLayout.
        jpMedio=new JPanel(new GridLayout(4,3,5,5));
        botones = new JButton[12];       
        for (int i = 0; i < 12;i++ ) {          
            if(i==10){
                botones[i] = new JButton("+"); 
            }else if(i==11){
                botones[i] = new JButton("-");
            }else{
                botones[i] = new JButton("" +i);               
            }
            //Suscribo el boton al evento Action (evento mas común)
             botones[i].addActionListener (this);
        }        
    //Tercer panel
        jpBajo=new JPanel(new GridLayout(1,1));
        jbtnBoton=new JButton("=");
        jbtnBoton.addActionListener(this);
        jpBajo.add(jbtnBoton);
       //Meter en el contenedor de tipo GridLayout los botones.
        for (int i = 0; i < 12; i++) {
            jpMedio.add(botones[i]);
        }
    //Asignarle al contenedor padre el BoxLayout que tendra 3 componentes de tipo JPanel con distintos Layout
       getContentPane().setLayout(
            new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS)
        ); 
        //Añadir los 3 JPanel al Jpanel padre
        this.getContentPane().add(jpAlto);
        this.getContentPane().add(jpMedio);
        this.getContentPane().add(jpBajo);
       
        
    //Empaquetar el programa con su configuración    
        Image icon= new ImageIcon(
                       getClass().getResource("/img/bug.png")).getImage();
        setIconImage(icon);        
        pack();
        //Mostramos la ventana
        this.setLocationRelativeTo(null);
        this.setTitle("Calculadora");
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //Otra manera de hacerlo
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //Personalizacion del evento para botones
        @Override
        public void actionPerformed(ActionEvent ae) {
            mostrarNumeroEnPantalla((JButton) ae.getSource());
        }
        private void mostrarNumeroEnPantalla(JButton s1) {  
            //Comprueba que sea el boton = + - y sino es un numero,en cada uno una accion.
            try {
                if(s1.getText()=="="){
                    //aqui se añade que se hara al selecionar los operadores los operadores
                   switch( operador ){
                        case "+": 
                            aux=digito1+Integer.parseInt(jlbPantalla.getText());
                            jlbPantalla.setText(""+aux);
                            break;
                        case "-":
                            aux=digito1-Integer.parseInt(jlbPantalla.getText());
                            jlbPantalla.setText(""+aux);
                   }
                }else if(s1.getText()=="+"){
                    //Me lo guardo en una variable y dejo limpio jlbPantalla
                    digito1=Integer.parseInt(jlbPantalla.getText());
                    jlbPantalla.setText("");
                    operador="+";
                }else if(s1.getText()=="-"){
                    digito1=Integer.parseInt(jlbPantalla.getText());
                    jlbPantalla.setText("");
                    operador="-";
                }else{
                    //Concateno el jlbPantalla
                    for (int i = 0; i < botones.length; i++) {
                        if(s1==botones[i]){                    
                            jlbPantalla.setText(jlbPantalla.getText()+botones[i].getText());                    
                        }                     
                    }                
                } 
            }catch (Exception e) {
                //System.out.println(e.getMessage());
                System.out.println("Uppss algo a fallado");
            }                       
        }
    public static void main(String[] args) {
        Calculadora g = new Calculadora();
    }
}