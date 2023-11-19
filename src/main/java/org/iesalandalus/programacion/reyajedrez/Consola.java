package org.iesalandalus.programacion.reyajedrez;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {

    private Consola () {

    }

    public static void mostrarMenu () {
        System.out.println("Menu de opciones:");
        System.out.println("1. Crear Rey por defecto.");
        System.out.println("2. Crear rey (elige color).");
        System.out.println("3. Mover");
        System.out.println("4. Salir.");

    }

    public static int elegirOpcionMenu () {
        int opcion;

        do {
            System.out.println("Elige una opción:");
            opcion= Entrada.entero();
        } while (opcion<1 || opcion>4);

        return opcion;
    }



    public static Color elegirColor () {

        char colorElegido;
        Color opcion=null;

        do {
            System.out.println("Elige un color (B/N):");
            colorElegido=Entrada.caracter();

        }while (colorElegido!= 'B' || colorElegido!= 'b' || colorElegido!='A' || colorElegido!= 'a');

        if (colorElegido == 'B' || colorElegido== 'b'){
            opcion=Color.BLANCO;
        } else {
            opcion=Color.NEGRO;
        }

        return opcion;
    }

    public static void mostrarDirecciones () {

        System.out.println("Norte");
        System.out.println("Noreste");
        System.out.println("Este");
        System.out.println("Sureste");
        System.out.println("Sur");
        System.out.println("Suroeste");
        System.out.println("Oeste");
        System.out.println("Noroeste");
        System.out.println("Enroque corto");
        System.out.println("Enroque largo");
    }


}
