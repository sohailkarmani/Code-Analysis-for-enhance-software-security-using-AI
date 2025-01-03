//Unrestricted File Upload
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class UnrestrictedFileUpload {
    public static void main(String[] args) {
        try {
            String fileName = "uploaded_file.exe"; // Dangerous file type
            byte[] fileData = "This is a test file".getBytes();
            saveFile(fileName, fileData);

            System.out.println("File uploaded successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void saveFile(String fileName, byte[] data) throws IOException {
        File file = new File(fileName);

        if (fileName.endsWith(".exe") || fileName.endsWith(".bat")) {
            System.out.println("Insecure file type detected: " + fileName);
        }

        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(data);
            System.out.println("File saved: " + fileName);
        }
    }
}
