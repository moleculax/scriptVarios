package ejemplos.program;

import java.util.Scanner;

public class calculadoraAhorros {

    public   void calAhorro503020(){
    // 50: NECESIDADES
    // 30: COSAS QUE QUEREMOS
    // 20: AHORROS
            Scanner teclado = new Scanner(System.in);
            System.out.println("Cual es tu salario?");
            float salario = teclado.nextFloat();

          //  float salario = 1500f;
            float necesidades = salario * 0.5f;
            float otrasCosas = salario * 0.3f;
            float ahorros = salario * 0.2f;
            System.out.println("########################");
            System.out.println("Deberias usar tu salario en las siguientes necesidades");
            System.out.println("Necesidades: $"+ necesidades);
            System.out.println("Otras Cosas $"+ otrasCosas);
            System.out.println("Aorros $"+ ahorros);
    }
}
