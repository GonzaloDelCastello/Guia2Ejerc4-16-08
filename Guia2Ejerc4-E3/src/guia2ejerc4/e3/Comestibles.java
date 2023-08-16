package guia2ejerc4.e3;

public class Comestibles extends Producto implements Comparable<Comestibles> {

    public Comestibles(int codigo, String descripcion, int precio, int stock) {
        super(codigo, descripcion, precio, stock);
    }

    @Override
    public int compareTo(Comestibles otraDes) {
        return this.getDescripcion().compareTo(otraDes.getDescripcion());
    }

}
