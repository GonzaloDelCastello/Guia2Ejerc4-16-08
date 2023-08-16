package guia2ejerc4.e3;

public class Perfumeria extends Producto implements Comparable<Perfumeria> {

    public Perfumeria(int codigo, String descripcion, int precio, int stock) {
        super(codigo, descripcion, precio, stock);
    }

    @Override
    public int compareTo(Perfumeria otraDes) {
        return this.getDescripcion().compareTo(otraDes.getDescripcion());
    }

}
