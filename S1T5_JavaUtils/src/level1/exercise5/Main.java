package level1.exercise5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SerializationManager manager = new SerializationManager();
        int option =-1;

        do {
            System.out.println("""
                    \n=== MENÚ ===
                    Elija una opción (0 - 4)"
                    1. Serializar un usuario y guardarlo en un fichero;
                    2. Deserializar usuarios desde un fichero;
                    3. Listar archivos .ser en un directorio;
                    0. Salir.
                    """);
            if(!scan.hasNextInt()) {
                System.out.println("Error: debe ingresar un valor numérico (0-3).");
                scan.next();
                continue;            }

            try {
                option = scan.nextByte();
                scan.nextLine();

                switch (option) {
                    case 1:
                        manager.objectSerializer();
                        break;
                    case 2:
                        manager.objectDeserializer();
                        break;
                    case 3:
                        manager.serializeFilesLister();
                        break;
                    case 0:
                        System.out.println("Gracias por su visita = )");
                        break;
                    default:
                        System.out.println("Elija una opción válida (entre 0 y 3)");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                option = -1;
                scan.nextLine();
            }

        } while (option != 0);

    }
}
