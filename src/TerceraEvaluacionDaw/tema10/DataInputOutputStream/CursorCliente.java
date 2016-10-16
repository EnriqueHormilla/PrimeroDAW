/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10.DataInputOutputStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Enriquea
 */
public class CursorCliente {

    private ArrayList arrayList;

    public CursorCliente() {
        arrayList = new ArrayList();

    }

    public boolean alta(Cliente clienteNuevo) {
        boolean aux = false;
        if (arrayList.contains(clienteNuevo)) {

        } else {
            aux = arrayList.add(clienteNuevo);
        }
        verArrayList();
        return aux;
    }

    public void verArrayList() {
        System.out.println("---Ver arrayList--");
        for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
            Object next = iterator.next();
            System.out.println(next);
        }
        
    }

    public boolean baja(Cliente c) {
        if (arrayList.contains(c)) {
            //DUDA ,aqui dejaria una posicion a null ¿para borrarlao correrla? -->arrayList.remove(null);
            return arrayList.remove(c);
        } else {
            return false;
        }
    }

    public boolean modificacion(int dni, Cliente clienteModificado) {
        Cliente clAux = new Cliente(dni, "", "");

        if (arrayList.contains(clAux)) {
            //DUDA ,aqui dejaria una posicion a null ¿para borrarlao correrla? -->arrayList.remove(null);
            //si pongo return al array list no funciona
            arrayList.add(arrayList.indexOf(clAux), clienteModificado);
            return true;
        } else {
            return false;
        }
    }

    public Cliente consulta(Cliente c) {
        if (arrayList.contains(c)) {
            return (Cliente) arrayList.get(arrayList.indexOf(c));
        } else {
            return null;
        }
    }

    public Cliente posicionAnterior(Cliente c) {
        if (arrayList.contains(c)) {
            int posicionActual=arrayList.indexOf(c);
            int posicionPosterior=posicionActual - 1; 
              System.out.println(posicionActual+"---------->"+posicionPosterior);
            try {
                return (Cliente) arrayList.get(posicionPosterior);
            } catch (IndexOutOfBoundsException e) {
                return null;
            }     
        } else {
            return null;
        }
    }

    public Cliente posicionPosterior(Cliente c) {        
        if (arrayList.contains(c)) {
            int posicionActual=arrayList.indexOf(c);
            int posicionPosterior=posicionActual + 1;  
            System.out.println(posicionActual+"---------->"+posicionPosterior);

            try {
                return (Cliente) arrayList.get(posicionPosterior);
            } catch (IndexOutOfBoundsException e) {
                return null;
            }     
        } else {
            return null;
        }
    }

    public Cliente posicionInicial() {
        if (arrayList.size() > 0) {
            return (Cliente) arrayList.get(0);
        } else {
            return null;
        }
    }

    public boolean leerRegistro() {
        Cliente cliente = null;
        DataInputStream leer = null;
        boolean aux = true;
        try {
          
            leer = new DataInputStream(new FileInputStream("E:\\Users\\VESPERTINO\\Documents\\NetBeansProjects\\EnriqueTerceraEvaluacionDaw\\clientes.bin"));
            do {
                int a = leer.readInt();
                String b = leer.readUTF();
                String c = leer.readUTF();
                cliente = new Cliente(a, b, c);
                arrayList.add(cliente);
            } while (true);

        } catch (EOFException e) {
            try {
                System.out.println("Todos los datos cargados en el arrayList");
                verArrayList();
                leer.close();
            } catch (IOException ex) {
                Logger.getLogger(CursorCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            aux = false;
        } catch (IOException e) {
            System.out.println("Archivo no encontrado");
            aux = false;
        }

        return aux;
    }

    public boolean escribirRegistro() {
        boolean aux = true;
        try (DataOutputStream escribir = new DataOutputStream(new FileOutputStream("E:\\Users\\VESPERTINO\\Documents\\NetBeansProjects\\EnriqueTerceraEvaluacionDaw\\clientes.bin"));) {
            for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
                Cliente next = (Cliente) iterator.next();
                escribir.writeInt(next.getDni());
                escribir.writeUTF(next.getNombre());
                escribir.writeUTF(next.getApellidos());
            }
        } catch (IOException e) {
            System.out.println("Fallo al guardar los datos");
            aux = false;
        }
        return aux;
    }

}
