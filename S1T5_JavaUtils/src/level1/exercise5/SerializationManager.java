package level1.exercise5;

import java.io.*;
import java.util.Scanner;

public class SerializationManager {

    private final Scanner scan = new Scanner(System.in);

    private String pathNormalizer(String pathToNormalize) {
        return pathToNormalize.trim().replace("/", File.separator).replace("\\", File.separator);
    }

    private void filePathValidator(String pathToValidate) {
        if (pathToValidate == null || pathToValidate.isBlank()) {
            throw new IllegalArgumentException("La ruta está vacía.");
        }
    }

    private void directoryValidator(File directory) {
        if (!directory.isDirectory()) {
            throw new IllegalArgumentException("La ruta: <" + directory.getPath() + "> no corresponde a un directorio.");
        }
        if (!directory.exists()) {
            throw new IllegalArgumentException("La ruta: <" + directory.getPath() + "> no existe.");
        }
    }

    private String ensureSerExtension(String filePath) {
        if (filePath.toLowerCase().endsWith(".ser")) {
            return filePath;
        }
        return filePath + ".ser";
    }

    private String promptUserName() {
        System.out.println("Indique el nombre el usuario:");
        return scan.nextLine();
    }

    private int promptUserAge() {
        System.out.println("Indique la edad del usuario:");
        while (!scan.hasNextInt()) {
            System.err.println("Error. Por favor ingrese un valor numérico. Indique la edad:");
            scan.nextLine();
        }
        int age = scan.nextInt();
        scan.nextLine();
        return age;
    }

    private String promptFilePath() {
        System.out.println("Indique la ruta y el nombre del archivo(.ser):");
        return pathNormalizer(scan.nextLine());
    }

    private String promptDirectoryPath() {
        System.out.println("Indique el directorio donde buscar archivos .ser:");
        return pathNormalizer(scan.nextLine());
    }

    private User createUser() {
        String name = promptUserName();
        int age = promptUserAge();
        return new User(name, age);
    }

    private void userSerializer(User user, String filePath) throws IOException {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(user);
        }
    }

    private User userDeserilizer(String filePath) throws IOException, ClassNotFoundException {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            return (User) ois.readObject();
        }
    }

    private File[] serFilesLister(File directory) {
        return directory.listFiles((dir, name) -> name.toLowerCase().endsWith(".ser"));
    }

    public void objectSerializer() {
        try {
            User user = createUser();
            String filePath = ensureSerExtension(promptFilePath());
            filePathValidator(filePath);
            userSerializer(user, filePath);
            System.out.println("Usuario serializado correctamente en: " + filePath);
        } catch (IllegalArgumentException | IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public void objectDeserializer() {
        try {
            String filePath = ensureSerExtension(promptFilePath());
            filePathValidator(filePath);
            User user = userDeserilizer(filePath);
            System.out.println("Usuario deserializado:\n" + user);
        } catch (IllegalArgumentException | IOException | ClassNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public void filesLister() {
        try {
            String dirPath = promptDirectoryPath();
            if (dirPath == null) {
                throw new IllegalArgumentException("La ruta está vacía.");
            }

            File directory = new File(dirPath);
            directoryValidator(directory);

            File[] serFiles = serFilesLister(directory);
            if (serFiles == null || serFiles.length == 0) {
                System.err.println("No se encontraron archivos `.ser` en el directorio.");
                return;
            }
            System.out.println("Archivos `.ser` encontrados:");
            for (File file : serFiles) {
                System.out.println("- " + file.getName());
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public void closeScan() {
        scan.close();
    }
}
