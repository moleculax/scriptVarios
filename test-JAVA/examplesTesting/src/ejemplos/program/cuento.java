package ejemplos.program;
import java.util.Scanner;

public class cuento {

    public void tales(){
        Scanner entreteclado = new Scanner(System.in);

        System.out.println("Como se llama el presonaje? ");
        String nombre = entreteclado.nextLine();
        //String nombre = "Pepe Lepon";
        String titulo = " El Editor de Realidades";
        String texto = "En un rincón olvidado del ciberespacio, vivía un programador llamado  "+nombre+" , creador de un software llamado Simulador de Posibilidades. No era un juego, ni una red social, ni una herramienta de productividad. \n Era algo más profundo: una interfaz para reescribir la narrativa de la vida.\n" +
                "Cada usuario podía cargar su historia, sus decisiones pasadas, sus miedos y sus sueños. El software analizaba patrones, proponía bifurcaciones, y mostraba simulaciones de lo que podría haber sido… o lo que aún podía ser.\n" +
                "Un día,  "+nombre+"  recibió una solicitud extraña. Un usuario anónimo había subido un archivo titulado “Humanidad.json”. Dentro, no había una sola vida, sino millones. Era un intento de reprogramar el rumbo colectivo.\n" +
                " "+nombre+"  dudó. ¿Tenía derecho a intervenir? ¿Era ético rediseñar el destino de tantos? Pero la curiosidad lo venció. \n";
        System.out.println(titulo);
        System.out.println(texto);
    }

}
