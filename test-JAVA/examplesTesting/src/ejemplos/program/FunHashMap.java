package ejemplos.program;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FunHashMap {

    public  void fhashMap(){


        Map<Integer,String> elhash = new HashMap<>();
        //pucheo el en elhash
        elhash.put(1, "Pepita Lepon");
        elhash.put(2, "Pepe Lepon");
        elhash.put(3, "Pepin Lepon");
        // imprimo todo elhash --
        //System.out.println(elhash);
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un ID: ");
         int id = teclado.nextInt();
        // elhash.forEach((clave,valor) -> System.out.println("Nombre: "+ valor));
         if(elhash.containsKey(id)){
             System.out.println("El Nombre es: "+ elhash.get(id));
         }else{
             System.out.println(" El hash: " + id + " no contiene ningun valor");
         }

    }
}
