/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema12.eventos;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

/**
 *
 * @author VESPERTINO
 */
public class Diana extends JFrame implements MouseListener {

    private JLabel jlDiana;
    private URL url;
    private ImageIcon aux;

    public Diana() {
        try {
            url = getClass().getResource("/img/diana.jpg");
            aux = new ImageIcon(url);
            jlDiana = new JLabel(aux);

            getContentPane().setLayout(null);
            getContentPane().add(jlDiana);
            //Para indicar el orden z_order
            this.setComponentZOrder(jlDiana, 1);
            jlDiana.setBounds(10, 10, aux.getIconWidth(), aux.getIconHeight());
            jlDiana.addMouseListener(this);

//           Image icon = new ImageIcon("/img/bug.png");
//            setIconImage(new ImageIcon(aux1.getImage()));
            
            Image icon = new ImageIcon("/img/bug.png").getImage();
            setIconImage(icon);
            //Mostramos la ventana
            this.setLocationRelativeTo(null);
            this.setTitle("Calculadora");
            this.setVisible(true);
            this.setSize(626, 666);
            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        } catch (Exception e) {
            //System.out.println(e.getMessage());
            System.out.println("Uppss algo a fallado");
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        try {
        URL url1 = getClass().getResource("/img/dardo.png");
        ImageIcon aux1 = new ImageIcon(url1);

        JLabel dardo = new JLabel(aux1);

        dardo.setBounds(e.getX(), e.getY(), 48, 48);
        getContentPane().add(dardo);
        
        this.setComponentZOrder(dardo, 0);
        repaint();
        }catch (Exception a) {
            System.out.println("Uppss algo a fallado");
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public static void main(String[] args) {
        Diana diana = new Diana();

    }

}
