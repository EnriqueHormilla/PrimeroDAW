/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10.interface1;

import java.awt.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * @author VESPERTINO
 */
public class Gui extends JInternalFrame implements ActionListener, InternalFrameListener {

    private JLabel jlMatricula, jlCamarotes,jlEslora, jlFecha;
    private JTextArea jtMatricula, jtCamarotes,jtEslora, jtFecha;
    private JPanel jpFlow, jpGrid;
    private Image img1, img2, img3, img4, img5, img6, img7;
    private JButton[] jbottons;
    private JButton jbBotonAnteriorPulsado;
    private Image imgs[];
    private Yates yates;
    private ImplementacionDAOObjectStream implementacion;
    private int dniTemporal = -1;

    public Gui() {
        //Me creo un objeto de cursorCliente
        implementacion = new ImplementacionDAOObjectStream();
        //inicializo los 2 arrays
        jbottons = new JButton[7];
        imgs = new Image[7];
        //Me creo el panel que se situara arriba
        jpFlow = new JPanel(new FlowLayout());
        try {
            for (int i = 0; i < imgs.length; i++) {
                //Me creo un string para poder tener la ruta bien
                String aux = i + ".png";
                //añado a cada Image la ruta necesatio
                imgs[i] = ImageIO.read(getClass().getResource(aux));
                //Inicializo los botones y les asigno un icono
                jbottons[i] = new JButton();
                jbottons[i].setIcon(new ImageIcon(imgs[i]));
                //Los meto en el JPanel
                jbottons[i].addActionListener(this);
                jpFlow.add(jbottons[i]);
            }
        } catch (Exception e) {
        }
        //Los 3  Jlabel
        jlMatricula = new JLabel("Matricula (Strings):");        
        jlCamarotes = new JLabel("Camarotes (int):");
        jlEslora = new JLabel("Eslora (float):");
        jlFecha = new JLabel("Año de fabricación (String):");
        //Los 3 JtextArea
        jtMatricula = new JTextArea();
        jtCamarotes = new JTextArea();
        jtEslora = new JTextArea();
        jtFecha = new JTextArea();
        //Añadimos los componentes al panel que tiene el layout grid
        jpGrid = new JPanel(new GridLayout(4, 2, 10, 10));
        jpGrid.add(jlMatricula);
        jpGrid.add(jtMatricula);
        jpGrid.add(jlCamarotes);
        jpGrid.add(jtCamarotes);
        jpGrid.add(jlEslora);
        jpGrid.add(jtEslora);
        jpGrid.add(jlFecha);
        jpGrid.add(jtFecha);
        //Suscribimos al panel This al Windowlistener
        addInternalFrameListener(this);
        //Añadimos los jpanel al Jframe
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(jpFlow, BorderLayout.NORTH);
        getContentPane().add(jpGrid, BorderLayout.CENTER);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setClosable(true);
        setMaximizable(true);
        setIconifiable(true);
        setVisible(true);
    }

    public void vaciarTextAreas(JButton a) {
        jtMatricula.setText("");
        jtCamarotes.setText("");
        jtEslora.setText("");
        jtFecha.setText("");
        jbBotonAnteriorPulsado = a;
    }

    public boolean rellenarInical() {
        Yates yatesAux = implementacion.posicionInicial();
        if (yatesAux != null) {
            jtMatricula.setText(yatesAux.getMatricula() + "");
            jtCamarotes.setText(yatesAux.getCamarotes() + "");
            jtEslora.setText(yatesAux.getEslora()+ "");
            jtFecha.setText(yatesAux.getAñoFabricacion() + "");
            return true;
        } else {
            jtMatricula.setText("objeto a null");
            jtCamarotes.setText("objeto a null");
            jtEslora.setText("objeto a null");
            jtFecha.setText("objeto a null");
            return false;
        }
    }

    public boolean rellenarTextAreas(Yates c) {
        if (c != null) {
            jtMatricula.setText(c.getMatricula() + "");
            jtCamarotes.setText(c.getCamarotes() + "");
            jtEslora.setText(c.getEslora()+ "");
            jtFecha.setText(c.getAñoFabricacion() + "");
            return true;
        } else {
            jtMatricula.setText("No hay objetos en la coleccion");
            jtCamarotes.setText("No hay objetos en la coleccion");
            jtEslora.setText("No hay objetos en la coleccion");
            jtFecha.setText("No hay objetos en la coleccion");
            return false;
        }
    }

    //Agrupar texareas en un objeto de tipo cliente
    public Yates AgruparTextAreas() {
        Yates yate;
        if ((jtMatricula.getText() != "") && (jtCamarotes.getText() != "") && (jtFecha.getText() != "")) {
            int dniNumero = Integer.parseInt(jtMatricula.getText());
            int camarotes = Integer.parseInt(jtCamarotes.getText());
            int eslora = Integer.parseInt(jtEslora.getText());
            int fecha = Integer.parseInt(jtEslora.getText());
            return yate = new Yates(camarotes,dniNumero, eslora, fecha);
        } else {
            mensajePantalla("No puedo guardar un yate sin TODOS datos");
            return null;
        }
    }

    public JButton getJbBotonAnteriorPulsado() {
        return jbBotonAnteriorPulsado;
    }

    public void setJbBotonAnteriorPulsado(JButton jbBotonAnteriorPulsado) {
        this.jbBotonAnteriorPulsado = jbBotonAnteriorPulsado;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == jbottons[0]) {
            //Boton es Alta
            vaciarTextAreas(jbottons[0]);
        } else if (ae.getSource() == jbottons[1]) {
            //Boton es baja
            setJbBotonAnteriorPulsado(jbottons[1]);
            interfazOK();
        } else if (ae.getSource() == jbottons[2]) {
            //Boton Modificacion,como voy a necesitar el dni anterior me guardo el objeto antes de vaciar el texarea
            setJbBotonAnteriorPulsado(jbottons[2]);
            dniTemporal = Integer.parseInt(jtMatricula.getText());
            //vaciarTextAreas(jbottons[2]);
        } else if (ae.getSource() == jbottons[3]) {
            vaciarTextAreas(jbottons[3]);
        } else if (ae.getSource() == jbottons[4]) {
            setJbBotonAnteriorPulsado(jbottons[4]);
            Yates auxCliente = implementacion.dameAnterior(AgruparTextAreas());
            if (auxCliente != null) {
                rellenarTextAreas(auxCliente);
            } else {
                mensajePantalla("No hay mas registros en esa direccion");
            }

        } else if (ae.getSource() == jbottons[5]) {
            System.out.println("Has pulsado flecha");
            setJbBotonAnteriorPulsado(jbottons[5]);
            Yates auxCliente = implementacion.dameSiguiente(AgruparTextAreas());
            if (auxCliente != null) {
                rellenarTextAreas(auxCliente);
            } else {
                mensajePantalla("No hay mas registros en esa direccion");
            }

        } else if (ae.getSource() == jbottons[6]) {
            interfazOK();
        }
    }

    public void interfazOK() {
        
        if (jbBotonAnteriorPulsado == jbottons[0]) {
            if(implementacion.alta(AgruparTextAreas())){
                mensajePantalla("Datos guardados corectamente");           
            }else{
                mensajePantalla("Ocurrio un error al guardar datos");                
            }
               
        } else if (jbBotonAnteriorPulsado == jbottons[1]) {
            if(implementacion.baja(AgruparTextAreas())){
               mensajePantalla("Borrado con exito");
               vaciarTextAreas(jbottons[1]);
               rellenarInical();
            }else{
               mensajePantalla("No Borrado con exito");
            }                        
        } else if (jbBotonAnteriorPulsado == jbottons[2]) {
            if (dniTemporal >= 0) {
                if (implementacion.modificar(AgruparTextAreas(),dniTemporal)) {
                    mensajePantalla("Exito");
                    rellenarInical();
                    dniTemporal = -1;
                }else{
                    mensajePantalla("No se a podido realizar la modificacion");
                }               
            } else {
                mensajePantalla("No se puede realizar por que el dni esta mal");
            }
        } else if (jbBotonAnteriorPulsado == jbottons[3]) {
           if(rellenarTextAreas(implementacion.consulta(AgruparTextAreas()))){
                mensajePantalla("No se a podido realizar la modificacion"); 
           }else{
                mensajePantalla("Consulta ha tenido un error"); 
           }
        }
        implementacion.verArrayList();
    }

    public void mensajePantalla(String s) {
        JOptionPane.showMessageDialog(this, s);
    }

    @Override
    public void internalFrameOpened(InternalFrameEvent e) {
        rellenarInical();
      
    }

    @Override
    public void internalFrameClosing(InternalFrameEvent e) {
         dispose();
//        try {
//           
//            setClosed(true);
//        } catch (PropertyVetoException ex) {
//            Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
//        }
    //this.setVisible(false);
      
       if(implementacion.salvarDatos())
             System.out.println("datos guardados");


    }

    @Override
    public void internalFrameClosed(InternalFrameEvent e) {
        
    }

    @Override
    public void internalFrameIconified(InternalFrameEvent e) {
        
    }

    @Override
    public void internalFrameDeiconified(InternalFrameEvent e) {
        
    }

    @Override
    public void internalFrameActivated(InternalFrameEvent e) {
    }

    @Override
    public void internalFrameDeactivated(InternalFrameEvent e) {
        
    }
}
