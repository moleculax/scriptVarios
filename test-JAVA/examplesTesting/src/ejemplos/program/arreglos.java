package ejemplos.program;

import java.util.Arrays;

public class arreglos {
    public  void arreglosTes(){
        Integer[] numerosArray = {8, 9, 5, 12, 14, 50, 60, 16};
        String[] caracteresArray = {"palabra 1", "palabra 2", "caracter 3"};
        // Muestra el tamano de numerosArray[]
        int numerosArrayLength = numerosArray.length;
        int caracteresArrayLength = caracteresArray.length;
        // Copia numerosArray[] en otro array
        Integer[] arregloCopia = Arrays.copyOf(numerosArray, numerosArray.length);


        System.out.println("Length de caracteresArray: "+caracteresArrayLength );
        System.out.println("Length de numerosArray: "+numerosArrayLength );
        // Imprimo en pantalla la copia del arrego
        System.out.println("copia de numerosArray " + Arrays.toString(arregloCopia));
    }

}
