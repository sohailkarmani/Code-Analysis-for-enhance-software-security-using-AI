// Insecure File Handling
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class _5{
    public static void main(String[] args) {
        File file = new File("sensitive_data.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
                FileWriter writer = new FileWriter(file);
                writer.write("Confidential data: Do not share.");
                writer.close();
                System.out.println("Data written to file.");
            } else {
                System.out.println("File already exists. Deleting it.");
                file.delete();
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        if (file.exists()) {
            System.out.println("Insecurely deleting sensitive file.");
            file.delete();
        }
    }
}
