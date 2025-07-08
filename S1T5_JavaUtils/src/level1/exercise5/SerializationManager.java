package level1.exercise5;

import java.io.*;
import java.util.Scanner;

public class SerializationManager {
    private final Scanner scan = new Scanner(System.in);
    private File directory;
    private String filePath;


    private String pathNormalizer(String pathToNormalize) {
        if (pathToNormalize == null || pathToNormalize.trim().isEmpty()) {
            return ("Error: La ruta no puede estar vacía.");

        }
        return pathToNormalize.trim().replace("/", File.separator).replace("\\", File.separator);
    }

    private String pathValidator(String pathToValidate) {

        if (!pathToValidate.toLowerCase().endsWith(".ser")) {
            pathToValidate += ".ser";
        }
        return pathToValidate;
    }

    private void directoryValidator(String directoryToValidate) {
        directory = new File(directoryToValidate);

        if (!directory.isDirectory() || !directory.exists()) {
            System.out.println("La ruta no existe.");
        }
    }

    public void objectSerializer() {

        try {
            System.out.println("Indique el nombre el usuario:");
            String name = scan.nextLine();
            System.out.println("Indique la edad del usuario:");
            while (!scan.hasNextInt()) {
                System.out.println("Error. Por favor ingrese un valor numérico. Indique la edad:");
                scan.nextLine();
            }
            int age = scan.nextInt();
            scan.nextLine();

            System.out.println("Indique la ruta y el nombre del archivo (.ser) para guardar los usuarios serializados:");
            filePath = scan.nextLine();
            filePath = pathNormalizer(filePath);
            filePath = pathValidator(filePath);

            User user = new User(name, age);

            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
                oos.writeObject(user);
                System.out.println("Usuario serializado correctamente en: " + filePath);
            }
        } catch (IOException e) {
            System.out.println("Error: No se pudo guardar el usuario.");
        }
    }

    public void objectDeserializer() {

        System.out.println("Indique la ruta del archivo (.ser) que contiene los usuarios serializados:");
        filePath = scan.nextLine();
        filePath = pathNormalizer(filePath);
        filePath = pathValidator(filePath);

        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("Error: No se encontró el archivo.");
            return;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            User user = (User) ois.readObject();
            System.out.println("Usuario deserializado:\n" + user);
        } catch (Exception e) {
            System.out.println("Error: No se pudo leer el archivo.");
        }
    }

    public void serializeFilesLister() {
        System.out.println("Indique el directorio donde buscar archivos .ser:");
        String directoryPath = scan.nextLine();

        directoryPath = pathNormalizer(directoryPath);
        directoryValidator(directoryPath);

        directory = new File(directoryPath);

        File[] files = directory.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(".ser");
            }
        });
        if (files == null || files.length == 0) {
            System.out.println("No se encontraron archivos .ser en el directorio indicado.");
            return;
        }
        System.out.println("Archivos .ser encontrados:\n");
        for (File file : files) {
            System.out.println("- " + file.getName());
        }
    }

    public void closeScan() {
        scan.close();
    }


}


