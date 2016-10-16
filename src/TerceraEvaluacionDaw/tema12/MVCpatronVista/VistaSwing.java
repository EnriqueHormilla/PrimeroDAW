/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema12.MVCpatronVista;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javafx.scene.control.ComboBox;
import javax.accessibility.AccessibleContext;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JTextArea;
import tema12.MVCpatronControlador.CalculadoraControlador;

/**
 *
 * @author VESPERTINO
 */
public class VistaSwing extends JFrame implements InterfazVistas {

    private JLabel jlabel[];
    private JTextArea jtextArea[];
    private JComboBox comboBox;
    private JButton jboton[];
    private JPanel jpanelIzq, jpanelDere;

    public VistaSwing() {
        jlabel = new JLabel[5];

        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    jlabel[0] = new JLabel("Operador 1");
                case 1:
                    jlabel[1] = new JLabel("Operando");
                case 2:
                    jlabel[2] = new JLabel("Operador 2");
                case 3:
                    jlabel[3] = new JLabel("Resultado");
                case 4:
                    jlabel[4] = new JLabel("");
            }
        }
        jtextArea = new JTextArea[2];
        jtextArea[0] = new JTextArea();
        jtextArea[1] = new JTextArea();

        String[] array = new String[3];
        array[0] = "+";
        array[1] = "-";
        array[2] = "*";
        comboBox = new JComboBox(array);

        jboton = new JButton[2];
        jboton[0] = new JButton("Calcular");
        jboton[1] = new JButton("Salir");

        jpanelIzq = new JPanel(new GridLayout(4, 2));
        jpanelIzq.add(jlabel[0]);
        jpanelIzq.add(jtextArea[0]);
        jpanelIzq.add(jlabel[1]);
        jpanelIzq.add(comboBox);
        jpanelIzq.add(jlabel[2]);
        jpanelIzq.add(jtextArea[1]);
        jpanelIzq.add(jlabel[3]);
        jpanelIzq.add(jlabel[4]);

        jpanelDere = new JPanel();
        jpanelDere.setLayout(new BoxLayout(jpanelDere, BoxLayout.Y_AXIS));

//        jpanelDere=new JPanel(new BoxLayout(jpanelDere, BoxLayout.Y_AXIS));
        jpanelDere.add(jboton[0]);
        jpanelDere.add(jboton[1]);

        this.getContentPane().setLayout(new FlowLayout());
        this.getContentPane().add(jpanelIzq);
        this.getContentPane().add(jpanelDere);

        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void salir(){
        System.exit(1);
    }
    
    @Override
    public String getOperando1() {
        return jtextArea[0].getText();
    }

    @Override
    public String getOperando2() {
        return jtextArea[1].getText();
    }

    @Override
    public String getOperador() {
        return (String) comboBox.getSelectedItem();
    }

    @Override
    public void setResultado(String dato) {
      jlabel[4].setText(dato);
    }





    @Override
    public void setControlador(CalculadoraControlador controlador) {
        jboton[0].addActionListener(controlador);
        jboton[1].addActionListener(controlador);

        jboton[0].setActionCommand("Calculo");
        jboton[1].setActionCommand("exit");
    }

   

}
