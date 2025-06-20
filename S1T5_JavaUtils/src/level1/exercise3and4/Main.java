package level1.exercise3and4;

import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DirectoryManager directoryManager = new DirectoryManager();
        int choice;

        try {
            do {
                System.out.println("""
                        \nElige una opción (0 - 3):
                        1. Guardar un listado alfabético del contendido del directorio en un archivo .txt;
                        2. Guardar el árbol del directorio (en niveles y contenido) en un archivo .txt;
                        3. Ver el contenido de un archivo .txt;
                        0. Salir.
                        """);

                choice = scan.nextByte();
                scan.nextLine();

                switch (choice) {
                    case 1:
                        directoryManager.saveAlphabeticalSort();
                        break;
                    case 2:
                        directoryManager.directoryTreeGenerator();
                        break;
                    case 3:
                        directoryManager.readAndPrintFile();
                        break;
                    case 0:
                        System.out.println("Adiós = )");
                        break;
                    default:
                        System.out.println("Elija una opción correcta (0 a 3).\n");
                }

            } while (choice != 0);

        } catch (IllegalArgumentException | IOException e) {
            System.out.println("Error: " + e.getMessage());

        }
    }
}
