import paqueteA.Alumno;
import paqueteA.Facturable;
import paqueteA.Persona;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Example Clase Abstracta Interfaces!");
        Alumno a = new Alumno();
        a.setNombre("Pepe");
        procesa(a);
        factura(a);

    }

    public static void procesa(Persona persona){
        System.out.println(persona.getNombre());
    }

    public static void factura(Facturable f){
        f.factura();
        System.out.println(f.factura());
    }
}