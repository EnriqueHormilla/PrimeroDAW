/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10.ProgressBar.copiado;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;


/**
 * https://docs.oracle.com/javase/tutorial/displayCode.html?code=https://docs.oracle.com/javase/tutorial/uiswing/examples/components/FileChooserDemoProject/src/components/FileChooserDemo.java
 * @author PROF_VESPERTINO
 */
public class Gui extends JFrame implements ActionListener{
    private JProgressBar jpBarra;
    private JPanel jpColumna;
    private JLabel jlOrigen,jlOrigenRuta,jlDestino,jlDestinoRuta;
    private JFileChooser jfOrigen,jfDestino;
    private JButton jbGo,jbOrigen,jbDestino;   
    static private final String newline = "\n";
    private File fileLectura,fileEscritura;
//si lo quiero en balnco Texarea
    public Gui() {
        
        jpBarra = new JProgressBar(0,100);
        jpColumna=new JPanel(new GridLayout(2,3));
        jfOrigen=new JFileChooser();
        jfDestino=new JFileChooser();
        fileEscritura=new File("");
        fileLectura=new File("");
        //Para poder elegir solo el directorio
         //jfDestino.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
              
        jlOrigen=new JLabel("Origen");
        
        jlOrigenRuta=new JLabel("");
        jlOrigenRuta.setBackground(Color.WHITE);
        
        jlDestino=new JLabel("Destino");
        
        jlDestinoRuta=new JLabel("");
        jlDestinoRuta.setBackground(Color.WHITE);
        
        jbOrigen = new JButton("empezar!!!");
        jbOrigen.addActionListener(this);
        jbOrigen.setAlignmentX(CENTER_ALIGNMENT);
        
        jbDestino = new JButton("empezar!!!");
        jbDestino.addActionListener(this);
        jbDestino.setAlignmentX(CENTER_ALIGNMENT);
        
        jbGo = new JButton("empezar!!!");
        jbGo.setAlignmentX(CENTER_ALIGNMENT);
        jbGo.addActionListener(this);
        
        
        jpColumna.add(jlOrigen);
        jpColumna.add(jlOrigenRuta);
        jpColumna.add(jbOrigen);
        jpColumna.add(jlDestino);
        jpColumna.add(jlDestinoRuta);
        jpColumna.add(jbDestino);
        
        
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        getContentPane().add(jpColumna);
      
        getContentPane().add(jbGo);
        getContentPane().add(jpBarra);
       
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }

    public JFileChooser getJfOrigen() {
        return jfOrigen;
    }

    public void setJfOrigen(JFileChooser jfOrigen) {
        this.jfOrigen = jfOrigen;
    }

    public JFileChooser getJfDestino() {
        return jfDestino;
    }

    public void setJfDestino(JFileChooser jfDestino) {
        this.jfDestino = jfDestino;
    }
    public JProgressBar getBarra() {
        return jpBarra;
    }
    public File getFileLectura(){
        return fileLectura;
    }
    public File getFileEscritura(){
        return fileEscritura;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {    
        int returnVal;
        if (e.getSource() == jbOrigen) {
            returnVal = jfOrigen.showOpenDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                fileLectura = jfOrigen.getSelectedFile();
                jlOrigenRuta.setText(fileLectura.getPath());             
            } else {
                jlOrigenRuta.setText("fallo al cargar el archivo");                 
            }
            //System.out.println(returnVal);
        }else if(e.getSource() == jbDestino){     
            returnVal = jfDestino.showSaveDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
               fileEscritura = jfDestino.getSelectedFile();
                jlDestinoRuta.setText(fileEscritura.getPath());             
            } else {
                jlDestinoRuta.setText("fallo al cargar el archivo");                 
            }
           // System.out.println(returnVal);
        }else{
            if((jlOrigenRuta.getText()!="")&& (jlDestinoRuta.getText()!="")){
                HiloBarraprogreso hp = new HiloBarraprogreso(this);
                Thread t = new Thread(hp);
                t.start();    
            }             
        }
    }
    
    public static void main(String[] args) {
        Gui a = new Gui();
    }

    
  
}
