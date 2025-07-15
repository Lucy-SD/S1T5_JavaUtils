package level1.exercise3and4;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class DirectoryManager {

    private final Scanner scan = new Scanner(System.in);

    private String pathNormalizer(String pathToNormalize) {
        return pathToNormalize.trim().replace("/", File.separator).replace("\\", File.separator);
    }

    private void pathValidator(String pathToValidate) {
        if (pathToValidate == null || pathToValidate.isBlank()) {
            throw new IllegalArgumentException("La ruta está vacía.");
        }
    }

    private void directoryValidator(String directoryPath) {
        File dir = new File(directoryPath);
        if (!dir.exists()) {
            throw new IllegalArgumentException("La ruta no existe.");
        }
        if(!dir.isDirectory()) {
            throw new IllegalArgumentException("La ruta no es la de un directorio.");
        }
    }

    private String promptDirectoryPath() {
        System.out.println("Ingrese la ruta del directorio:");
        return scan.nextLine();
    }

    private String promptOutputFilePath() {
        System.out.println("Ingrese la ruta y nombre de guardado:");
        return scan.nextLine();
    }

    private String promptInputFilePath() {
        System.out.println("Ingrese la ruta del archivo (.txt) que desea leer:");
        return scan.nextLine();
    }

    private File[] getSortedFiles(String directoryPath) {
        File dir = new File(directoryPath);
        File[] files = dir.listFiles();

        if (files == null || files.length == 0) {
            System.err.println("El directorio está vacío.");
            return new File[0];
        }
        Arrays.sort(files);
        return files;
    }

    private void writeSortedFiles(File[] files, String outputPath) throws IOException {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            for (File file : files) {
                writer.write(file.getName());
                writer.newLine();
            }
            System.out.println("Archivo generado correctamente en: <" + outputPath + ">.");
        }
    }

    public void saveAlphabeticalSort() throws IOException {

        String dirPath = pathNormalizer(promptDirectoryPath());
        pathValidator(dirPath);
        directoryValidator(dirPath);

        File[] files = getSortedFiles(dirPath);
        if (files.length == 0) return;

        String outputPath = pathNormalizer(promptOutputFilePath());
        pathValidator(outputPath);
        writeSortedFiles(files, outputPath);
    }

    private void writeDirectoryTree(File currentDir, int level, BufferedWriter writer) throws IOException {
        File[] files = currentDir.listFiles();
        if (files == null || files.length == 0) return;

        Arrays.sort(files);

        for (File file : files) {
            String indent = "    ".repeat(level);
            String type = file.isDirectory() ? "D" : "F";
            String lastMod = new SimpleDateFormat("dd-MM-yyyy / HH:mm").format(file.lastModified());

            writer.write(indent + "[" + type + "]--> " + file.getName() + "  (LM: " + lastMod + ")");
            writer.newLine();

            if (file.isDirectory()) {
                writeDirectoryTree(file, level + 1, writer);
            }
        }
    }

    public void directoryTreeGenerator () throws IOException {
        String dirPath = pathNormalizer(promptDirectoryPath());
        dirPath = pathNormalizer(dirPath);
        pathValidator(dirPath);
        directoryValidator(dirPath);

        String outputPath = pathNormalizer(promptOutputFilePath());
        pathValidator(outputPath);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            writeDirectoryTree(new File(dirPath), 0, writer);
            System.out.println("Árbol de directorio guardado en: <" + outputPath + ">.");
        }
    }

    private void printFileContents(String filePath) throws IOException {
        try (Stream<String> lines = Files.lines(new File(filePath).toPath(), StandardCharsets.UTF_8)) {
            lines.forEach(System.out::println);
        }
    }

    public void readAndPrintFile () {
        String filePath = pathNormalizer(promptInputFilePath());
        pathValidator(filePath);

        File file = new File(filePath);
        if (!file.exists() || !file.isFile()) {
            System.err.println("El archivo no existe.");
            return;
        }

        try {
            printFileContents(filePath);
        } catch (IOException e) {
            System.err.println("No se pudo leer el archivo.");
        }
    }
    public void closeScan () {
        scan.close();
    }
}
