package org.iesalandalus.programacion.reyajedrez;

import javax.naming.OperationNotSupportedException;

public class Rey {

    private Color color;
    private Posicion posicion;
    private int totalMovimientos;

     public Rey(){
        setColor(Color.BLANCO);
        setPosicion(new Posicion (1,'e'));
     }

     public Rey (Color color){
        if (color.equals(color.BLANCO)){
                setPosicion(new Posicion (1,'e'));
        }else {
            setPosicion(new Posicion (8,'e'));
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

    public void mover (Direccion direccion) throws OperationNotSupportedException{

         int nuevaFila=posicion.getFila();
         char nuevaColumna=posicion.getColumna();
         totalMovimientos=0;

        if (direccion==null) {
            throw new NullPointerException("El movimiento se sale del tablero.");
        } else {

            switch (direccion) {

                case NORTE:
                    nuevaFila++;
                    break;

                case NORESTE:
                    nuevaFila++;
                    nuevaColumna++;
                    break;
                case ESTE:
                    nuevaColumna++;
                    break;
                case SURESTE:
                    nuevaFila--;
                    nuevaColumna++;
                    break;
                case SUROESTE:
                    nuevaFila--;
                    nuevaColumna--;
                    break;
                case SUR:
                    nuevaFila--;
                    break;
                case OESTE:
                    nuevaColumna--;
                    break;
                case NOROESTE:
                    nuevaFila++;
                    nuevaColumna--;
                    break;
                case ENROQUE_CORTO:
                    if (totalMovimientos>0) {
                        throw new NullPointerException("El movimiento no es válido");
                    } else {

                        nuevaColumna++;
                        nuevaColumna++;
                    }
                    break;
                case ENROQUE_LARGO:
                    if (totalMovimientos>0) {
                        throw new NullPointerException("El movimiento no es válido");
                    } else {
                        nuevaColumna--;
                        nuevaColumna--;
                    }
            }


            Default: setPosicion(new Posicion(nuevaFila, nuevaColumna));
                     totalMovimientos++;

        }
    }

    @Override
    public String toString() {
        return "Rey{" +
                "color=" + color +
                ", posicion=" + posicion +
                '}';
    }
}
