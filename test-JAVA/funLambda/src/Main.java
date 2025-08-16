import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer[] numeroArray = {1, 2, 3, 4, 5, 6};
        String[] letrasArray = {"uno", "dos", "tres"};
        // Usamos una expresión lambda para imprimir cada número y palabras
        List<Integer> numeros = Arrays.asList(numeroArray);
        List<String> letras = Arrays.asList(letrasArray);
        letras.forEach(l -> System.out.println(l));
        numeros.forEach(n -> System.out.println(n));

    }
}
