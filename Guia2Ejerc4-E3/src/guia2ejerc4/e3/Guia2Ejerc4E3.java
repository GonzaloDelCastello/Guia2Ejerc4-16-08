
package guia2ejerc4.e3;

import java.util.Set;
import java.util.TreeSet;


public class Guia2Ejerc4E3 {

    public static void main(String[] args) {

       Set<Comestibles> rubro = new TreeSet<>();
       
       // comestible
       rubro.add(new Comestibles(1, "Carne", 400, 3));
       rubro.add(new Comestibles(2, "Leche", 20, 8));
       rubro.add(new Comestibles(3, "Tomate", 30, 10));
       
       Set<Perfumeria> rubro2 = new TreeSet<>();
       //perfumeria
       rubro2.add(new Perfumeria(4, "Colonia", 100, 5));
       rubro2.add(new Perfumeria(5, "Desodorante",65, 10));
       rubro2.add(new Perfumeria(6,"Perfumes", 40, 3));
       Set<Limpieza> rubro3 = new TreeSet<>();
       //limpieza
       rubro3.add(new Limpieza(7, "Lavandina", 50, 7));
       rubro3.add(new Limpieza(8, "Detergente", 15, 6));
       rubro3.add(new Limpieza(9, "Paños", 20, 10));
       
        System.out.println(" Comestibles");
        for (Comestibles prod : rubro ) {
            System.out.println(prod);
        }
      
        System.out.println(" Perfumeria");
        
        for (Perfumeria prod : rubro2) {
            System.out.println(prod);
        }
        System.out.println(" Limpieza");
        for (Limpieza prod : rubro3) {
            System.out.println(prod);
        }
    }
    
}
