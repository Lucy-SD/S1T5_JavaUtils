package level1.exercise1and2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class DirectoryLister {

    private final Scanner scan = new Scanner(System.in);
    private String path;
    private File directory;
    private File[] files;

    private String pathNormalizer(String pathToNormalize) {
        if (pathToNormalize == null) {
            return null;
        }
        return pathToNormalize.trim().replace("/", File.separator).replace("\\", File.separator);
    }

    private void pathValidator(String pathToValidate) {
        if (pathToValidate == null || pathToValidate.isBlank()) {
            throw new IllegalArgumentException("La ruta está vacía.");
        }

        directory = new File(pathToValidate);

        if (!directory.isDirectory() || !directory.exists()) {
            throw new IllegalArgumentException("Directorio inexistente.");
        }
    }

    public void alphabeticalSorting() {
        System.out.println("Ingrese la ruta del directorio:");
        path = scan.nextLine();

        path = pathNormalizer(path);
        pathValidator(path);

        directory = new File(path);
        files = directory.listFiles();

        if (files == null) {
            System.out.println("El directorio está vacío.");
            return;
        }
        System.out.println("Directorio listado alfabéticamente:\n");
        Arrays.sort(files);
        for (File file : files) {
            System.out.println(file.getName());
        }
    }

    private void listAndTagDirectory(File directoryToList, int level) {
        files = directoryToList.listFiles();

        if (files == null) {
            System.out.println("No hay nada para mostrar.");
            return;
        }
        Arrays.sort(files);
        for (File file : files) {
            String indent = "    ".repeat(level);
            String type = file.isDirectory() ? "D" : "F";
            String lastModification = new SimpleDateFormat("dd-MM-yyyy / HH:mm").format(file.lastModified());

            System.out.println(indent + "[" + type + "]--> " + file.getName() + "  (LM: " + lastModification + ")");

            if (file.isDirectory()) {
                listAndTagDirectory(file, level + 1);
            }
        }
    }

    public void seeDirectoryTree() {
        System.out.println("Ingrese la ruta del directorio:");
        path = scan.nextLine();

        path = pathNormalizer(path);
        pathValidator(path);

        directory = new File(path);
        System.out.println("Árbol del directorio: \n(\"D\" = directorio - \"F\" = archivo - \"LM\" =" +
                " última modificación)\n\n" + directory.getAbsolutePath() + ":\n");
        listAndTagDirectory(directory, 0);

    }

    public void closeScanner() {
        scan.close();
    }
}
