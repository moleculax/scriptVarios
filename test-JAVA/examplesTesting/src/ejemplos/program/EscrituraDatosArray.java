package ejemplos.program;

import java.util.Arrays;

public class EscrituraDatosArray {
    public void datosEnArray(){
        // Array temperatura
        float[] temperatura;
        String[] ciudad;
        ciudad = new String[10];
        temperatura = new float[ 10 ];
        temperatura[0] = 23.45f;
        temperatura[4] = 18.33f;

        ciudad[0] = "Cumana";
        ciudad[1] = "Caracas";
        ciudad[8] = "Marida";
        ciudad[9] = "Valencia";
        // Muestro Array Creado en pantalla
        System.out.println("Array Temperatura" + Arrays.toString(temperatura));
        System.out.println("Array Ciudades"+ Arrays.toString(ciudad));

        // recorro Array en bucle
        for (float v : temperatura) {
            System.out.println("Temperaturas: " + v);
        }
        for (String c : ciudad){
            System.out.println("Ciudades: " + c);
        }


    }

}
