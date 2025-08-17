package colecciones;

import colecciones.classes.Persona;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class sampleTreeSet {

    public void treeSet(){
        // ===================================================
        HashSet<Persona> persona = new HashSet<Persona>();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cantidad de personas a incluir?");
        int nroPersonas = teclado.nextInt();
        teclado.nextLine();


        for (int i = 0; i < nroPersonas; i++){
            System.out.println("Digite Documento.");
            int documento = teclado.nextInt();
            teclado.nextLine(); // Limpia el buffer
            System.out.println("Digite Nombre completo.");
            String nombreP = teclado.nextLine();
            persona.add(new Persona(documento,nombreP));

        }

        for (Persona p : persona) {
            String nombre = p.getNombre();
            int document = p.getDocumento();
            System.out.println("Documento:  " + document + " Nombre: " + nombre);
        }



    }
}
