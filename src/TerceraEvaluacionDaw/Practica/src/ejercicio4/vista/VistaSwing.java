/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.vista;


import ejercicio4.controlador.Controlador;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Window;
import javafx.stage.FileChooser;
import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author Enrique Hormilla
 */
public class VistaSwing extends JFrame implements Vista{

    private JPanel jPanelSuperior;
    private JPanel jPanelInferior;
    private JPanel jPanelInferiorIzquierda;
    private JPanel jPanelInferiorDerecha;
    private String nombreFichero1,rutaFichero1;
    private JLabel jlFichero1, jlFichero2;
    private JTextField jtFichero1, jtFichero2;
    private JButton jbEscoger, jbComenzar;
    private JRadioButton jrCheck1, jrCheck2, jrCheck3;
    private JFileChooser jfileChooser;

    public VistaSwing() {

        jPanelSuperior = new JPanel(new GridLayout(2, 3));
            //Inicializrlos
            jlFichero1 = new JLabel("Fichero 1:");
            jtFichero1 = new JTextField();
            jbEscoger=new JButton("Seleccionar");
            jlFichero2 = new JLabel("Ficheor 2");
            jtFichero2 = new JTextField();
            //Los añadimos
            jPanelSuperior.add(jlFichero1);
            jPanelSuperior.add(jtFichero1);
            jPanelSuperior.add(jbEscoger);
            jPanelSuperior.add(jlFichero2);
            jPanelSuperior.add(jtFichero2);
      
        jPanelInferior = new JPanel(new FlowLayout());
            //Inicializamos lo de dentro
            jPanelInferiorIzquierda = new JPanel(new FlowLayout(FlowLayout.CENTER));
                jbComenzar=new JButton("    Go!    ");
                jPanelInferiorIzquierda.add(jbComenzar);
            jPanelInferiorDerecha = new JPanel();
                BoxLayout boxLayout = new BoxLayout(jPanelInferiorDerecha, BoxLayout.Y_AXIS);
                //Inicialixamos
                jrCheck1=new JRadioButton("Primera tarea");
                jrCheck2=new JRadioButton("Segunda tarea");
                jrCheck3=new JRadioButton("Tercera tarea");
                //Añadimos
                jPanelInferiorDerecha.setLayout(boxLayout);
                jPanelInferiorDerecha.add(jrCheck1);
                jPanelInferiorDerecha.add(jrCheck2);
                jPanelInferiorDerecha.add(jrCheck3);
            
            //Añadimos
            jPanelInferior.add(jPanelInferiorIzquierda);
            jPanelInferior.add(jPanelInferiorDerecha);

        //this.getContentPane().setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(jPanelSuperior,BorderLayout.NORTH);
        this.getContentPane().add(jPanelInferior,BorderLayout.SOUTH);
        
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setTitle("Ejercicio examen");

    }
    
    @Override
    public void preguntarRuta() {
        jfileChooser=new JFileChooser();
        if(jfileChooser.showOpenDialog(this)==JFileChooser.APPROVE_OPTION){
           jtFichero1.setText(jfileChooser.getSelectedFile().getAbsolutePath());
           nombreFichero1=jfileChooser.getSelectedFile().getAbsolutePath();
           rutaFichero1=jfileChooser.getSelectedFile().getParent();
                   
        }
    }
    @Override
    public String getNombreFichero1() {
        return nombreFichero1;
    }
        
    @Override
    public String getRutaFichero1() {
        return rutaFichero1;
       //return getJtFichero1().getText();
    }

    @Override
    public String getNombreFichero2() {
        return getJtFichero2().getText();
    }

    @Override
    public void setControlador(Controlador c) {
       jbComenzar.addActionListener(c);
       jbComenzar.setActionCommand("go");
       jbEscoger.addActionListener(c);
       jbEscoger.setActionCommand("escoger");
    }
    
    @Override
    public void activarCheck1() {
       getJrCheck1().setSelected(true);
    }

    @Override
    public void activarCheck2() {
        getJrCheck2().setSelected(true);
    }

    @Override
    public void activarCheck3() {
       getJrCheck3().setSelected(true);
    }
    

    
    public JPanel getjPanelSuperior() {
        return jPanelSuperior;
    }

    public void setjPanelSuperior(JPanel jPanelSuperior) {
        this.jPanelSuperior = jPanelSuperior;
    }

    public JPanel getjPanelInferior() {
        return jPanelInferior;
    }

    public void setjPanelInferior(JPanel jPanelInferior) {
        this.jPanelInferior = jPanelInferior;
    }

    public JPanel getjPanelInferiorDerecha() {
        return jPanelInferiorDerecha;
    }

    public void setjPanelInferiorDerecha(JPanel jPanelInferiorDerecha) {
        this.jPanelInferiorDerecha = jPanelInferiorDerecha;
    }

    public JLabel getJlFichero1() {
        return jlFichero1;
    }

    public void setJlFichero1(JLabel jlFichero1) {
        this.jlFichero1 = jlFichero1;
    }

    public JLabel getJlFichero2() {
        return jlFichero2;
    }

    public void setJlFichero2(JLabel jlFichero2) {
        this.jlFichero2 = jlFichero2;
    }

    public JTextField getJtFichero1() {
        return jtFichero1;
    }

    public void setJtFichero1(JTextField jtFichero1) {
        this.jtFichero1 = jtFichero1;
    }

    public JTextField getJtFichero2() {
        return jtFichero2;
    }

    public void setJtFichero2(JTextField jtFichero2) {
        this.jtFichero2 = jtFichero2;
    }

    public JButton getJbEscoger() {
        return jbEscoger;
    }

    public void setJbEscoger(JButton jbEscoger) {
        this.jbEscoger = jbEscoger;
    }

    public JButton getJbComenzar() {
        return jbComenzar;
    }

    public void setJbComenzar(JButton jbComenzar) {
        this.jbComenzar = jbComenzar;
    }

    public JRadioButton getJrCheck1() {
        return jrCheck1;
    }

    public void setJrCheck1(JRadioButton jrCheck1) {
        this.jrCheck1 = jrCheck1;
    }

    public JRadioButton getJrCheck2() {
        return jrCheck2;
    }

    public void setJrCheck2(JRadioButton jrCheck2) {
        this.jrCheck2 = jrCheck2;
    }

    public JRadioButton getJrCheck3() {
        return jrCheck3;
    }

    public void setJrCheck3(JRadioButton jrCheck3) {
        this.jrCheck3 = jrCheck3;
    }

    public JFileChooser getFileChooser() {
        return jfileChooser;
    }

    public void setFileChooser(JFileChooser jfileChooser) {
        this.jfileChooser = jfileChooser;
    }


    public JPanel getjPanelInferiorIzquierda() {
        return jPanelInferiorIzquierda;
    }

    public void setjPanelInferiorIzquierda(JPanel jPanelInferiorIzquierda) {
        this.jPanelInferiorIzquierda = jPanelInferiorIzquierda;
    }

    public JFileChooser getJfileChooser() {
        return jfileChooser;
    }

    public void setJfileChooser(JFileChooser jfileChooser) {
        this.jfileChooser = jfileChooser;
    }

}
