package level1.exercise1and2;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DirectoryLister directoryLister = new DirectoryLister();
        int choice;

        try {
            do {
                System.out.println("""
                        Elige una opción (0 - 2):
                        1. Listar alfabéticamente un directorio;
                        2. Ver el árbol de un directorio (por niveles y contenido);
                        0. Salir.
                        """);
                choice = scan.nextByte();
                scan.nextLine();

                switch (choice) {
                    case 1:
                        directoryLister.alphabeticalSorting();
                        break;
                    case 2:
                        directoryLister.seeDirectoryTree();
                        break;
                    case 0:
                        System.out.println("Adiós = )");
                        break;
                    default:
                        System.out.println("Elija una opción correcta (0 a 2).\n");
                }

            } while (choice != 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}