
package tema10.ProgressBar.copiadoSelectivo;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class Gui extends JFrame implements ActionListener{
    private JProgressBar jpBarra;
    private JPanel jpColumna;
    private JLabel jlOrigen,jlOrigenRuta,jlDestino,jlDestinoRuta,jlTamanio;
    private JTextArea jtTamanioCantidad;
    private JFileChooser jfOrigen,jfDestino;
    private JButton jbGo,jbOrigen,jbDestino;   
    static private final String newline = "\n";
    private File fileLectura,fileEscritura;
    private RandomAccessFile rafOrigen,rafEscritura;
    private long numeroConElQueDividir;
//si lo quiero en balnco Texarea
    public Gui() {
        
        jpBarra = new JProgressBar(0,100);
        jpBarra.setStringPainted(true);//NECESARIO PARA QUE MEUSTRA EL % EN EL JPRrogressBar
        jpColumna=new JPanel(new GridLayout(3,3));
        jfOrigen=new JFileChooser();
        jfDestino=new JFileChooser();
        fileEscritura=new File("");
        fileLectura=new File("");
        //Para poder elegir solo el directorio
        //        jfDestino.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//http://www.vayagif.com/221522/paaaaso-que-voy-ardiendo
//http://www.vayagif.com/137438/pantallazo-azul-despues-de-toda-la-noche-haciendo-un-trabajo
            

        jlOrigen=new JLabel("Origen");
        
        jlOrigenRuta=new JLabel("");
        jlOrigenRuta.setBackground(Color.WHITE);
        
        jlDestino=new JLabel("Destino");
        
        jlDestinoRuta=new JLabel("");
        jlDestinoRuta.setBackground(Color.WHITE);
        
        jlTamanio=new JLabel("Tamañio");
        jtTamanioCantidad=new JTextArea();
        
        jbOrigen = new JButton("Selecionar");
        jbOrigen.addActionListener(this);
        jbOrigen.setAlignmentX(CENTER_ALIGNMENT);
        
        jbDestino = new JButton("Guardar donde");
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
        jpColumna.add(jlTamanio);
        jpColumna.add(jtTamanioCantidad);
        
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
                try {
                    
                    rafOrigen=new RandomAccessFile(fileLectura,"r");
                    rafEscritura=new RandomAccessFile(fileEscritura,"rw");
                    long aux=rafOrigen.getFilePointer()+numeroConElQueDividir;                     
                    byte datos[] = new byte[(int) numeroConElQueDividir];
                    System.out.println("Estoy aqui-->"+aux);
                    System.out.println("El tamaño "+fileLectura.length());
                    //Significa que te has pasado...
                    if(aux <fileLectura.length()){
                        rafOrigen.seek(fileEscritura.length());
                        rafOrigen.read(datos);
                        rafEscritura.seek(fileEscritura.length());
                        rafEscritura.write(datos);
                    }else{
                        long a=fileLectura.length()-aux;
                        System.out.println("No puedo enviar tanto byte por que te quedan  -->"+ a);    
                    
                    }
                   
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
                }

            }             
        }
    }
    
    public static void main(String[] args) {
        Gui a = new Gui();
    }

    
  
}
