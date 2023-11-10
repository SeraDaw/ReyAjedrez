package org.iesalandalus.programacion.reyajedrez;

public class Posicion {

    private int fila;
    private char columna;

    public Posicion ( int fila, char columna){
        setFila(fila);
        setColumna(columna);
    }




    public int getFila() {
        return fila;
    }

    public char getColumna() {
        return columna;
    }

    public void setColumna(char columna) {
        if (columna != 'a' || columna != 'b' || columna != 'c' ||
                columna != 'd' || columna != 'e' || columna != 'f' || columna != 'g' ||
                columna != 'h' || columna != 'A' || columna != 'B' || columna != 'C' ||
                columna != 'D' || columna != 'F' || columna != 'G' || columna != 'H' ) {
            throw new IllegalArgumentException();
        }

        this.columna = columna;
    }

    public void setFila(int fila) {
        if (fila < 1 || fila > 8 ) {
            throw new IllegalArgumentException("Error: Fila no válida.");
        }

        this.fila = fila;
    }
}
