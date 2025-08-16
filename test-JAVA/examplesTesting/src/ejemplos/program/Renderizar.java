package ejemplos.program;

import java.util.Scanner;

public class Renderizar {

    public void render(){
        System.out.println("Cantidad de minutos a grabar: ");
        Scanner teclado = new Scanner(System.in);

        double precioPorMinuto = 0.05f;
        int cantMinutos =  teclado.nextInt();
        double precioFinal = precioPorMinuto * cantMinutos;
        System.out.println("Precio Final: $"+ precioFinal);
    }
}
