/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5.vista;


import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author VESPERTINO
 */
public class ImplementacionVistaSwing extends JFrame implements InterfazVista{
    private JLabel jlCaracter,jlLinea,jlTotalCaracter,jlTotalPalabra,jlTotalCaracterCaja,jlTotalPalabraCaja;
    private JTextField jtCaracter,jtLinea;
    private JButton jbEjecutar;
    private JPanel jpUno,jpDos;

    public ImplementacionVistaSwing() {
        jpUno=new JPanel(new GridLayout(2, 2));
            //Definimos sus componentes
            jlCaracter=new JLabel("Caracter");
            jtCaracter=new JTextField();            
            jlLinea=new JLabel("Linea");
            jtLinea=new JTextField();
            //Los metemos en su panel
            jpUno.add(jlCaracter);
            jpUno.add(jtCaracter);
            jpUno.add(jlLinea);
            jpUno.add(jtLinea);
            
        jpDos=new JPanel();
        jpDos.setLayout(new BoxLayout(jpDos, BoxLayout.Y_AXIS));
            //Definimos sus componentes
            jlTotalCaracter=new JLabel("Total Caracter");
            jlTotalCaracterCaja=new JLabel("  ");
            jlTotalCaracterCaja.setBackground(Color.WHITE);
            jlTotalPalabra=new JLabel("Total Palabras:");
            jlTotalPalabraCaja=new JLabel("   ");
            jlTotalPalabraCaja.setBackground(Color.WHITE);
            jbEjecutar=new JButton("Ejecutar");
            //Añadimos a su panel
            jpDos.add(jlTotalCaracter);
            jpDos.add(jlTotalCaracterCaja);
            jpDos.add(jlTotalPalabra);
            jpDos.add(jlTotalPalabraCaja);
            jpDos.add(jbEjecutar);
        this.getContentPane().setLayout(new BoxLayout(  this.getContentPane(),BoxLayout.Y_AXIS));
        this.getContentPane().add(jpUno);
        this.getContentPane().add(jpDos);
        
       
        setTitle("Ejercico 5");
        setLocationRelativeTo(null);
        pack();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        

    }
     @Override
    public char caracter() {
        char aux=getJtCaracter().getText().charAt(0);
      return aux;
    }

    @Override
    public int numeroDeLinea() {
        String auxCadena=jtLinea.getText();
       
        int aux=Integer.parseInt(auxCadena);
        return aux;
    }

    @Override
    public void totalCaracterCaja(int caracterCaja) {
        jlTotalCaracterCaja.setText(""+caracterCaja);
      //  setJlTotalCaracterCaja(jlTotalCaracterCaja);
    }

    @Override
    public void totalPalabraCaja(int palabraCaja) {
       jlTotalPalabraCaja.setText(""+palabraCaja);
    }

    @Override
    public void setControlador(ejercicio5.controlador.Controlador c) {
       jbEjecutar.addActionListener(c);
        jbEjecutar.setActionCommand("Ejecutar");
    }
    public JLabel getJlCaracter() {
        return jlCaracter;
    }

    public void setJlCaracter(JLabel jlCaracter) {
        this.jlCaracter = jlCaracter;
    }

    public JLabel getJlLinea() {
        return jlLinea;
    }

    public void setJlLinea(JLabel jlLinea) {
        this.jlLinea = jlLinea;
    }

    public JLabel getJlTotalCaracter() {
        return jlTotalCaracter;
    }

    public void setJlTotalCaracter(JLabel jlTotalCaracter) {
        this.jlTotalCaracter = jlTotalCaracter;
    }

    public JLabel getJlTotalPalabra() {
        return jlTotalPalabra;
    }

    public void setJlTotalPalabra(JLabel jlTotalPalabra) {
        this.jlTotalPalabra = jlTotalPalabra;
    }

    public JLabel getJlTotalCaracterCaja() {
        return jlTotalCaracterCaja;
    }

    public void setJlTotalCaracterCaja(JLabel jlTotalCaracterCaja) {
        this.jlTotalCaracterCaja = jlTotalCaracterCaja;
    }

    public JLabel getJlTotalPalabraCaja() {
        return jlTotalPalabraCaja;
    }

    public void setJlTotalPalabraCaja(JLabel jlTotalPalabraCaja) {
        this.jlTotalPalabraCaja = jlTotalPalabraCaja;
    }

    public JTextField getJtCaracter() {
        return jtCaracter;
    }

    public void setJtCaracter(JTextField jtCaracter) {
        this.jtCaracter = jtCaracter;
    }

    public JTextField getJtLinea() {
        return jtLinea;
    }

    public void setJtLinea(JTextField jtLinea) {
        this.jtLinea = jtLinea;
    }

    public JButton getJbEjecutar() {
        return jbEjecutar;
    }

    public void setJbEjecutar(JButton jbEjecutar) {
        this.jbEjecutar = jbEjecutar;
    }

    public JPanel getJpUno() {
        return jpUno;
    }

    public void setJpUno(JPanel jpUno) {
        this.jpUno = jpUno;
    }

    public JPanel getJpDos() {
        return jpDos;
    }

    public void setJpDos(JPanel jpDos) {
        this.jpDos = jpDos;
    }

    @Override
    public void iniciarVista() {
         setVisible(true);
    }



   
   
    
}
