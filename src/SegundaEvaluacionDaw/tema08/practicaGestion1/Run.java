
package tema08.practicaGestion1;

import menu.Menu;

public class Run {

    public static final void main(String[] args) {
        // Inicializamos menu
        Menu menu = Menu.init();
        OpcionesMenu op = new OpcionesMenu();
        op.crearArchivador();
        
        // Añadimos las opciones 
        
        menu.addOpcionMenu("Crear CARPETA", () ->op.crearCarpeta());
	menu.addOpcionMenu("Ver las CARPETA", () -> op.showCarpetas());
        menu.addOpcionMenu("Selecionar una CARPETA ,para trabajar con ella", () -> op.cambiarCarpetaPredeterminada());
        menu.addOpcionMenu("Cambiar la CARPETA predeterminada", () -> op.cambiarCarpetaPredeterminada());
        menu.addOpcionMenu("Crear un APUNTE", () -> op.CrearApunte());
        menu.addOpcionMenu("Mostrar un APUNTE,indicandole el asunto", () -> op.ShowApunteEspecifico());
        menu.addOpcionMenu("Borrar un APUNTE por su id", () -> op.borrarApunte());
        menu.addOpcionMenu("Orden natural de APUNTE", () -> op.ShowApuntes());
        menu.addOpcionMenu("Orden por horas de APUNTE", () -> op.showApuntesPorHoras());
        menu.addOpcionMenu("Orden por dias de APUNTE", () -> op.showApuntesPorDias());
        menu.addOpcionMenu("Salir del programa", () -> op.salir());
       
        
        // Mostrar menu
        menu.mostrarMenu();
        
    }
}
