package ejemplos.program;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// Agenda de Contactos con HashMa
public class AgendaContactos {

    public static void main(String[] args) {
        Map<String, String> agenda = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n AGENDA DE CONTACTOS");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Mostrar todos los contactos");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del contacto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Teléfono: ");
                    String telefono = scanner.nextLine();
                    agenda.put(nombre, telefono);
                    System.out.println("✅ Contacto agregado.");
                    break;

                case 2:
                    System.out.print("Nombre a buscar: ");
                    String buscar = scanner.nextLine();
                    if (agenda.containsKey(buscar)) {
                        System.out.println("📱 Teléfono de " + buscar + ": " + agenda.get(buscar));
                    } else {
                        System.out.println(" Contacto no encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Nombre a eliminar: ");
                    String eliminar = scanner.nextLine();
                    if (agenda.remove(eliminar) != null) {
                        System.out.println("🗑️ Contacto eliminado.");
                    } else {
                        System.out.println(" No se encontró ese contacto.");
                    }
                    break;

                case 4:
                    System.out.println("\n Lista de contactos:");
                    for (Map.Entry<String, String> entrada : agenda.entrySet()) {
                        System.out.println("👤 " + entrada.getKey() + ": " + entrada.getValue());
                    }
                    break;

                case 5:
                    System.out.println(" ¡Hasta luego!");
                    break;

                default:
                    System.out.println("️ Opción inválida.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}