package level1.exercise3and4;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DirectoryManager directoryManager = new DirectoryManager();
        int choice;

        do {
            System.out.println("""
                    \n=== MENÚ ===
                    Elige una opción (0 - 3):
                    1. Guardar un listado alfabético del contendido del directorio en un archivo .txt;
                    2. Guardar el árbol del directorio (en niveles y contenido) en un archivo .txt;
                    3. Ver el contenido de un archivo .txt;
                    0. Salir.
                    """);

            try {
                choice = scan.nextByte();
                scan.nextLine();

                switch (choice) {
                    case 1 -> directoryManager.saveAlphabeticalSort();
                    case 2 -> directoryManager.directoryTreeGenerator();
                    case 3 -> directoryManager.readAndPrintFile();
                    case 0 -> {
                        System.out.println("Adiós = )");
                        directoryManager.closeScan();
                        return;
                    }
                    default -> System.out.println("Elija una opción correcta (0 a 3).\n");
                }
            } catch (InputMismatchException e) {
                System.err.println("Error: debe ingresar un valor numérico (0-3)");
                scan.nextLine();
            } catch (IOException | IllegalArgumentException e) {
                System.err.println("Error: " + e.getMessage());
            }

        }
        while (true);
    }
}
