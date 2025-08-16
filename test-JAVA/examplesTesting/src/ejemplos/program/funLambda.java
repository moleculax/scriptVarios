package ejemplos.program;
import java.util.Arrays;
import java.util.List;

public class funLambda {

    public void  lambdaFun(){
        // Aqui usamos expresion lamdda para imprimir en pantalla numeros y palabras
        System.out.println("Usamos expresion lamdda para imprimir en pantalla numeros y palabras");
        Integer[] numerosArray = {1, 2, 3, 4, 5, 6, 7, 8};
        String[] palabrasArray = {"palabra1", "palabra2", "palabra3"};
        List<Integer> numeros = Arrays.asList(numerosArray);
        numeros.forEach(n -> System.out.println(n));
        System.out.println("************####*****************");
        List<String> palabras = Arrays.asList(palabrasArray);
        palabras.forEach(p -> System.out.println(p));

    }

}
