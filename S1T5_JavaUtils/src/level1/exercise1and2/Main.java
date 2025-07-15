package level1.exercise1and2;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DirectoryLister directoryLister = new DirectoryLister();
        int choice;

        do {
            System.out.println("""
                    \n=== MENÚ ===
                    Elige una opción (0 - 2):
                    1. Listar alfabéticamente un directorio;
                    2. Ver el árbol de un directorio (por niveles y contenido);
                    0. Salir.
                    """);

            try {
                choice = scan.nextByte();
                scan.nextLine();

                switch (choice) {
                    case 1 -> directoryLister.alphabeticalSorting();
                    case 2 -> directoryLister.seeDirectoryTree();
                    case 0 -> {
                        System.out.println("Adiós = )");
                        directoryLister.closeScanner();
                        return;
                    }
                    default -> System.out.println("Elija una opción correcta (0 a 2).\n");
                }
            } catch (InputMismatchException e) {
                System.err.println("Error: debe ingresar un valor numérico (0-2)");
                scan.nextLine();
            } catch (IllegalArgumentException e) {
                System.err.println("Error: " + e.getMessage());
            }
        } while (true);
    }
}