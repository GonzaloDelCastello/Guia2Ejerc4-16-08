package guia2ejerc4.e3;

public class Limpieza extends Producto implements Comparable<Limpieza> {

    public Limpieza(int codigo, String descripcion, int precio, int stock) {
        super(codigo, descripcion, precio, stock);
    }

    @Override
    public int compareTo(Limpieza otraDesc) {
        return this.getDescripcion().compareTo(otraDesc.getDescripcion());
    }
}
