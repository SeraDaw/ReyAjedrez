package org.iesalandalus.programacion.reyajedrez;

public enum Color { BLANCO("Blanco"), NEGRO( "Negro");

    private String mostrarColor;

    private Color (String mostrarColor) {
        this.mostrarColor=mostrarColor;
    }

    @Override
    public String toString() {
        return mostrarColor;
    }
}

