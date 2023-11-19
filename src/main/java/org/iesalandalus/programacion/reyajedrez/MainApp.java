package org.iesalandalus.programacion.reyajedrez;

public class MainApp {
    public static void main(String[] args) {



    }

    private static Rey rey;

    private static void ejecutarOpcion (int opcion) {

        switch (opcion) {

            case 1:
                crearReyDefecto();
                break;

            case 2:
                crearReyColor();
                break;

            case 3:
                mover();
                break;

            case 4:
                despedirse();

        }
    }

    private static void crearReyDefecto() {

        rey = new Rey();
    }


}
