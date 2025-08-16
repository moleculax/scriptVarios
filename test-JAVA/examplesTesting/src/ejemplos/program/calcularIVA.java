package ejemplos.program;

import java.util.Scanner;

public class calcularIVA {

    public void valorIva(){
        Scanner teclado = new Scanner(System.in);
        final float IVA_PORCENTAJE = 21.0f;
        float precio = 0.0f;
        boolean valido = false;
        while(!valido){
            System.out.println(" Introduzca el  Precio: ");

            try{
                String input = teclado.next().replace(",",".");
                precio = Float.parseFloat(input);
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero valido");
            }
        }

      //

        float totalDescontar = IVA_PORCENTAJE * precio / 100;
        float precioFinal = precio - totalDescontar;
        System.out.println("Valor IVA: $"+ IVA_PORCENTAJE);
        System.out.println("Precio: $"+ precio);
        System.out.println("Precio final: $" + precioFinal);
        teclado.close();
    }
}
