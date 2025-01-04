// Secure File Download
import java.io.*;
import java.net.URL;

public class _19{
    public static void main(String[] args) {
        String fileUrl = "https://example.com/sample.txt";
        String outputFile = "downloaded_file.txt";

        try (InputStream in = new URL(fileUrl).openStream();
             FileOutputStream out = new FileOutputStream(outputFile)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
            System.out.println("File downloaded successfully.");
        } catch (IOException e) {
            System.err.println("Error downloading file: " + e.getMessage());
        }
    }
}
