/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10.interface1;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VESPERTINO
 */
public class ImplementacionDAOObjectStream implements InterfazDAO {

    private ArrayList<Yates> arrayYates;
    private ObjectInputStream leer;
    private File fichero;
    private ObjectOutputStream escribir;

    public ImplementacionDAOObjectStream() {
        arrayYates = new ArrayList();
        fichero = new File("barcos.txt");
        cargarDatos();
    }

    @Override
    public boolean alta(Yates y) {
        boolean aux = false;
        if (arrayYates.contains(y)) {
            return false;
        } else {
            arrayYates.add(y);
            return true;
        }
    }

    @Override
    public boolean baja(Yates y) {
        boolean aux = true;
        if (arrayYates.contains(y)) {
            arrayYates.remove(y);
        } else {
            aux = false;
        }
        return aux;
    }

    @Override
    public boolean modificar(Yates nuevo, int dniAnterior) {
        Yates auxYate = new Yates(0,dniAnterior,0,0);
        if (arrayYates.contains(auxYate)) {
            //DUDA ,aqui dejaria una posicion a null ¿para borrarlao correrla? -->arrayList.remove(null);
            //si pongo return al array list no funciona
            arrayYates.add(arrayYates.indexOf(auxYate), nuevo);
            return true;
        } else {
            return false;
        }

    }

    @Override
    public Yates consulta(Yates y) {
        if (arrayYates.contains(y)) {
            return arrayYates.get(arrayYates.indexOf(y));
        } else {
            return null;
        }
    }

    @Override
    public Yates dameSiguiente(Yates y) {
        if (arrayYates.contains(y)) {
            int posicionActual = arrayYates.indexOf(y);
            int posicionPosterior = posicionActual + 1;

            try {
                return arrayYates.get(posicionPosterior);
            } catch (IndexOutOfBoundsException e) {
                return null;
            }
        } else {
            return null;
        }
    }

    @Override
    public Yates dameAnterior(Yates y) {
        if (arrayYates.contains(y)) {
            int posicionActual = arrayYates.indexOf(y);
            int posicionPosterior = posicionActual - 1;

            try {
                return arrayYates.get(posicionPosterior);
            } catch (IndexOutOfBoundsException e) {
                return null;
            }
        } else {
            return null;
        }
    }
    @Override
    public void verArrayList() {
        for (Iterator<Yates> iterator = arrayYates.iterator(); iterator.hasNext();) {
            Yates next = iterator.next();
            System.out.println(next.toString());
        }
    }

    @Override
    public boolean cargarDatos() {
        if (fichero.exists()) {
            //si el fichero existe entra y lo lee , si no, al guardar los datos ya creara e archivo
            ObjectInputStream lector = null;
            try {

                try {
                    lector = new ObjectInputStream(new FileInputStream(fichero));
                } catch (IOException ex) {
                    Logger.getLogger(ImplementacionDAOObjectStream.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    arrayYates = (ArrayList) lector.readObject(); //introducir los datos al arraylist directamente
                } catch (IOException ex) {
                    Logger.getLogger(ImplementacionDAOObjectStream.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ImplementacionDAOObjectStream.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("leido");
                 verArrayList();
                return true;
            
            } finally {
             
                try {
                    lector.close();//cerrar el lector
                } catch (IOException ex) {
                    Logger.getLogger(ImplementacionDAOObjectStream.class.getName()).log(Level.SEVERE, null, ex);
                }
               
            }
           
        }
       
        return false;
    }

    @Override
    public boolean salvarDatos() {
       boolean aux=false;
               
        try {
            escribir = new ObjectOutputStream(new FileOutputStream(fichero));
        } catch (IOException ex) {
            Logger.getLogger(ImplementacionDAOObjectStream.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se a creado el archivo");
        }
        try {
            escribir.writeObject(arrayYates);
            aux=true;
        } catch (IOException ex) {
            System.out.println("No se a podido insertar el objeto al txt");
            Logger.getLogger(ImplementacionDAOObjectStream.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                escribir.close();
            } catch (IOException ex) {
                System.out.println("No se a podido cerrar el archivo");
                Logger.getLogger(ImplementacionDAOObjectStream.class.getName()).log(Level.SEVERE, null, ex);
            }
            return aux;
        }
    }

    @Override
    public Yates posicionInicial() {
        if (arrayYates.size() > 0) {
            return arrayYates.get(0);
        } else {
            return null;
        }
    }

   
}
