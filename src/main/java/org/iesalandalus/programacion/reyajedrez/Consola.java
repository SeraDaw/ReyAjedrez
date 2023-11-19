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

    public static void elegirOpcionMenu () {
        int opcion;

        do {
            System.out.println("Elige una opción:");
            opcion= Entrada.entero();
        } while (opcion<1 || opcion>4);
    }

    public static void elegirColor () {

        char colorElegido;

        do {
            System.out.println("Elige un color (B/N):");
            colorElegido=Entrada.caracter();

        }while (colorElegido!= 'B' || colorElegido!= 'b' || colorElegido!='A' || colorElegido!= 'a');

    }
}
