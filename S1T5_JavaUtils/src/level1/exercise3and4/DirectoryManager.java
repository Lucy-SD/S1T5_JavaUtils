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
        if (pathToNormalize == null) return "";
        return pathToNormalize.trim().replace("/", File.separator).replace("\\", File.separator);
    }

    private void validatePath(String path) {
        if (path == null || path.isBlank()) {
            throw new IllegalArgumentException("La ruta no puede estar vacía.");
        }
    }

    private void validateDirectory(String directoryPath) {
        File dir = new File(directoryPath);
        if (!dir.exists()) {
            throw new IllegalArgumentException("La ruta no existe.");
        }
        if(!dir.isDirectory()) {
            throw new IllegalArgumentException("La ruta no es la de un directorio.");
        }
    }

    private File[] getSortedFiles(String directoryPath) {
        File dir = new File(directoryPath);
        File[] files = dir.listFiles();

        if (files == null || files.length == 0) {
            System.out.println("El directorio está vacío.");
            return new File[0];
        }
        Arrays.sort(files);
        return files;
    }

    public void saveAlphabeticalSort() throws IOException {
        System.out.println("Ingrese la ruta del directorio:");
        String dirPath = scan.nextLine();
        dirPath = pathNormalizer(dirPath);
        validatePath(dirPath);
        validateDirectory(dirPath);

        File[] files = getSortedFiles(dirPath);
        if (files.length == 0) return;

        System.out.println("Ingrese la ruta y nombre de guardado:");
        String outputPath = scan.nextLine();
        outputPath = pathNormalizer(outputPath);
        validatePath(outputPath);


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            for (File file : files) {
                writer.write(file.getName());
                writer.newLine();
            }
            System.out.println("Archivo generado correctamente en: <" + outputPath + ">.");
        }
    }

    private void saveDirectoryTree(File currentDir, int level, BufferedWriter writer) throws IOException {
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
                saveDirectoryTree(file, level + 1, writer);
            }

        }
    }

       public void directoryTreeGenerator () throws IOException {
            System.out.println("Ingrese la ruta del directorio:");
            String dirPath = scan.nextLine();
            dirPath = pathNormalizer(dirPath);
            validatePath(dirPath);
            validateDirectory(dirPath);

            System.out.println("ingrese la ruta y nombre de guardado:");
            String outputPath = scan.nextLine();
            outputPath = pathNormalizer(outputPath);
            validatePath(outputPath);

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
                saveDirectoryTree(new File(dirPath), 0, writer);
                System.out.println("Árbol de directorio guardado en: <" + outputPath + ">.");
            }
        }

        public void readAndPrintFile () {
            System.out.println("Ingrese la ruta del archivo (.txt) que desea leer:");
            String filePath = scan.nextLine();
            filePath = pathNormalizer(filePath);
            validatePath(filePath);

            File file = new File(filePath);
            if (!file.exists() || !file.isFile()) {
                System.out.println("El archivo no existe.");
                return;
            }

            try (Stream<String> lines = Files.lines(file.toPath(), StandardCharsets.UTF_8)) {
                lines.forEach(System.out::println);
            } catch (IOException e) {
                System.out.println("No se pudo leer el archivo.");
            }
        }

        public void closeScan () {
            scan.close();
        }
    }


