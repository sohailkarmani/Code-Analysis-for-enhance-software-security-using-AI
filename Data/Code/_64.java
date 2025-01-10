// SecureFileCreation.java
import java.io.File;
import java.io.IOException;

public class _64{
    public static void main(String[] args) {
        String fileName = "secureFile.txt";
        createFile(fileName);
    }

    private static void createFile(String fileName) {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.err.println("Error creating file: " + e.getMessage());
        }
    }
}
