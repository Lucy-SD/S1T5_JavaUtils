package level1.exercise3and4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class DirectoryManager {

    private final Scanner scan = new Scanner(System.in);
    private String directoryPath;
    private String outputPath;
    private File directory;
    private File[] files;
    private FileWriter writer;

    private String pathNormalizer(String pathToNormalize) {
        if (pathToNormalize == null) {
            return null;
        }
        return pathToNormalize.trim().replace("/", File.separator).replace("\\", File.separator);
    }

    private void pathValidator(String pathToValidate) {
        if (pathToValidate == null || pathToValidate.isBlank()) {
            throw new IllegalArgumentException("La ruta no es correcta.");
        }
    }

    private void directoryValidator(String directoryToValidate) {
        directory = new File(directoryToValidate);

        if (!directory.isDirectory() || !directory.exists()) {
            throw new IllegalArgumentException("La ruta no existe.");
        }
    }

    private void alphabeticalSorter() {
        directoryPath = pathNormalizer(directoryPath);
        pathValidator(directoryPath);
        directoryValidator(directoryPath);

        directory = new File(directoryPath);
        files = directory.listFiles();

        if (files == null) {
            System.out.println("El directorio está vacío.");
            return;
        }
        Arrays.sort(files);
    }

    public void saveAlphabeticalSort() throws IOException {
        System.out.println("Ingrese la ruta del directorio:");
        directoryPath = scan.nextLine();
        alphabeticalSorter();
        System.out.println("Ingrese la ruta y nombre de guardado:");
        outputPath = scan.nextLine();

        outputPath = pathNormalizer(outputPath);
        pathValidator(outputPath);

        writer = new FileWriter(outputPath);

        try {
            for (File file : files) {
                writer.write(file + System.lineSeparator());
            }
            System.out.println("Archivo generado correctamente.");
        } catch (IOException e) {
            throw new IOException("No se ha podido generar el archivo.");
        }
    }

    private void directorySorter(File directoryToList) {
        files = directoryToList.listFiles();

        if (files == null) {
            System.out.println("No hay nada para mostrar.");
            return;
        }
        Arrays.sort(files);
    }

    private void directoryTreeSaver(int level) throws IOException {

        try {
            for (File file : files) {
                String indent = "    ".repeat(level);
                String type = file.isDirectory() ? "D" : "F";
                String lastModification = new SimpleDateFormat("dd-MM-yyyy / HH:mm").format(file.lastModified());

                writer.write(indent + "[" + type + "]--> " + file.getName() + "  (LM: " + lastModification + ")"
                        + System.lineSeparator());

                if (file.isDirectory()) {
                    directoryTreeSaver(level + 1);
                }
            }
        } catch (IOException e) {
            throw new IOException("No se ha podido generar el archivo.");
        }
    }

    public void directoryTreeGenerator() throws IOException {
        System.out.println("Ingrese la ruta del directorio:");
        directoryPath = scan.nextLine();
        alphabeticalSorter();

        directory = new File(directoryPath);
        directorySorter(directory);

        System.out.println("Ingrese la ruta y nombre de guardado:");
        outputPath = scan.nextLine();
        outputPath = pathNormalizer(outputPath);
        pathValidator(outputPath);

        writer = new FileWriter(outputPath);

        directoryTreeSaver(0);

        System.out.println("Archivo generado correctamente.");
    }

    public void readAndPrintFile() {
        System.out.println("Ingrese la ruta del archivo (.txt) que desea leer:");
        String filePath = scan.nextLine();
        filePath = pathNormalizer(filePath);
        pathValidator(filePath);
        File file = new File(filePath);

        try (Stream<String> lines = Files.lines(file.toPath(), StandardCharsets.UTF_8)) {
            lines.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("No se pudo leer el archivo.");
        }
    }
}


