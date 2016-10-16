
package tema08.treeSet;

import tema08.alumno.enrique.*;

public class Run {
    public static void main(String[] args) {
        Menu menu=new Menu();
        do {            
            menu.mostrartMenu();
            menu.ejecutarOpcion();
        } while ((menu.getOpcion()>0)&&(menu.getOpcion()<7));
    }
}
