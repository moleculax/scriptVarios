package ejemplos.program;

import java.util.Scanner;

public class selectInstancia {
    public  void queIntancio(){



        Scanner entrada = new Scanner(System.in);
        System.out.println("########################");
        System.out.println("Ejemplo lambda: intro (1)");
        System.out.println("Ejemplo Texto: intro (2)");
        System.out.println("Calculadora de Ahoro: intro (3)");
        System.out.println("Calculadora de IVA: intro (4)");
        System.out.println("Calculo Renderizar intro (5)");
        System.out.println("Array intro (6)");
        System.out.println("Array Crea (7)");
        System.out.println("Objectos test (8)");
        System.out.println("HashMap: (9)");
        System.out.println("SALIT (0)");
        System.out.println("########################");

        System.out.println("intro seleccion: ");
        int laInstancia = entrada.nextInt();
        //do{
                switch (laInstancia) {
                    case 1:
                        funLambda lafuncion = new funLambda();
                        lafuncion.lambdaFun();
                        break;
                    case 2:

                        cuento textCuento = new cuento();
                        textCuento.tales();
                        break;
                    case 3:
                        calculadoraAhorros calculos = new calculadoraAhorros();
                        calculos.calAhorro503020();
                        break;
                    case 4:
                        calcularIVA desIva = new calcularIVA();
                        desIva.valorIva();
                        break;
                    case 5:
                        Renderizar rend = new Renderizar();
                        rend.render();
                        break;
                    case 6:
                        arreglos arr = new arreglos();
                        arr.arreglosTes();
                        break;
                    case 7:
                        EscrituraDatosArray entArray = new EscrituraDatosArray();
                        entArray.datosEnArray();
                        break;
                    case 8:
                        Objetos obj = new Objetos();
                        obj.execObj();
                        break;
                    case 9:
                        FunHashMap has = new FunHashMap();
                        has.fhashMap();
                        break;
                     }

      //  }while (laInstancia != 0);
            entrada.close();
    }
}
