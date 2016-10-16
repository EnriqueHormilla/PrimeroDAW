/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10.ProgressBar.copiado;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PROF_VESPERTINO
 */
public class HiloBarraprogreso implements Runnable {
    private Gui gui;

    public HiloBarraprogreso(Gui gui) {
        this.gui = gui;
    }
    
    @Override
    public void run() {
        FileInputStream fi=null;
        FileOutputStream fo=null;
        byte datos[]=new byte[1024];

        try {
            //calse que nso permite leer
            fi= new FileInputStream(gui.getFileLectura().getAbsolutePath());
            //clase que nso permite escribir
            fo=new FileOutputStream(gui.getFileEscritura().getAbsolutePath());
            //leo y guardo en un array de 1024 bytes.
            long tamanioArchivo=gui.getFileLectura().length();
            long vueltasBucle=tamanioArchivo/1024;
            long restoBytesNoBucle=tamanioArchivo%1024;
            //Esto sirve para saber cuanto tengo que sumar al progres bar cada vuelta
            double a=100,b=vueltasBucle;
            double incrementoPorcentualVueltaBucle=a/b;
            int progresoDeBarra=0;
                                    
            for (int i = 0; i <vueltasBucle; i++) {
                fi.read(datos);
                fo.write(datos);

                gui.getBarra().setValue(progresoDeBarra);
                System.out.println(progresoDeBarra);
                sleep(1);
                gui.getJfOrigen();
                
                progresoDeBarra=(int) (progresoDeBarra+incrementoPorcentualVueltaBucle);
            }
            fi.read(datos);
            fo.write(datos, 0, (int) restoBytesNoBucle);            
            

            gui.getBarra().setValue(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloBarraprogreso.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HiloBarraprogreso.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HiloBarraprogreso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
