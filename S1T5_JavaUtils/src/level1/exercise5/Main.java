package level1.exercise5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SerializationManager manager = new SerializationManager();
        int choice;

        do {
            System.out.println("""
                    \n=== MENÚ ===
                    Elija una opción (0 - 3)"
                    1. Serializar un usuario y guardarlo en un fichero;
                    2. Deserializar usuarios desde un fichero;
                    3. Listar archivos .ser en un directorio;
                    0. Salir.
                    """);

            try {
                choice = scan.nextByte();
                scan.nextLine();

                switch (choice) {
                    case 1 -> manager.objectSerializer();
                    case 2 -> manager.objectDeserializer();
                    case 3 -> manager.serializeFilesLister();
                    case 0 -> {
                        System.out.println("Gracias por su visita = )");
                        manager.closeScan();
                        return;
                    }
                    default -> System.out.println("Elija una opción válida (entre 0 y 3)");
                }
            } catch (InputMismatchException e) {
                System.err.println("Error: debe ingresar un valor numérico (0-3)");
                choice = -1;
                scan.nextLine();
            }
        } while (true);
    }
}
