package org.iesalandalus.programacion.reyajedrez;

public class Rey {

    private Color color;
    private Posicion posicion;
    private int totalMovimientos;

     public Rey(){
        setColor(Color.BLANCO);
        setPosicion(new posicion (1,'e'));
     }

     public Rey (Color color){
        if (color.equals(color.BLANCO)){
                setPosicion(new posicion (1,'e'));
        }else {
            setPosicion(new posicion (8,'e'));
        }
     }




    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        if (color==null){
            throw new NullPointerException("El color no es correcto");
        }
        this.color = color;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        if (posicion == null){
            throw new NullPointerException("La posicion no es valida");
        }


        this.posicion = posicion;
    }

    public int getTotalMovimientos() {
        return totalMovimientos;
    }

    public void setTotalMovimientos(int totalMovimientos) {
        this.totalMovimientos = totalMovimientos;
    }
}
