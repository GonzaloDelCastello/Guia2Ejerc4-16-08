
package guia2ejerc4.e3;

import java.util.Set;
import java.util.TreeSet;


public class Guia2Ejerc4E3 {

    public static void main(String[] args) {

       Set<Producto> rubro = new TreeSet<>();
       
       // comestible
       rubro.add(new Comestibles(1, "Carne", 400, 3));
       rubro.add(new Comestibles(2, "Leche", 20, 8));
       rubro.add(new Comestibles(3, "Tomate", 30, 10));
       
       //perfumeria
       rubro.add(new Perfumeria(4, "Colonia", 100, 5));
       rubro.add(new Perfumeria(5, "Desodorante",65, 10));
       rubro.add(new Perfumeria(6,"Perfumes", 40, 3));
       
       //limpieza
       rubro.add(new Limpieza(7, "Lavandina", 50, 7));
       rubro.add(new Limpieza(8, "Detergente", 15, 6));
       rubro.add(new Limpieza(9, "Paños", 20, 10));
       
        for (Producto producto : rubro) {
            System.out.println(producto);
            
        }
       
       
    }
    
}
