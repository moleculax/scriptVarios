package colecciones;

import java.util.HashSet;

public class sampleHashSet {

    public void hashS(){
        HashSet<String> miSet = new HashSet<String>();
        miSet.add("Hola");
        miSet.add("Chau");
        // HashSet no toma en cuenta los que estan duplicados
        miSet.add("Hola"); // no lo cuenta porque esta duplicado
        int salida = miSet.size();
        System.out.println("Usando HashSet.");
        System.out.println("Cantidad de Elementos: "+ salida);
        System.out.println("datos del HashSet");
        System.out.println(miSet);
        for(String datos : miSet){
            System.out.println("Desde for: "+ datos);
        }

    }


}
