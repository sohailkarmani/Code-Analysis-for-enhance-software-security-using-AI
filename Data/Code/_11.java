//Secure File Handling

import java.io.*;

public class _11{
    public static void main(String[] args) {
        String fileName = "secure_file.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("This is a secure file writing example.");
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Read line: " + line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
