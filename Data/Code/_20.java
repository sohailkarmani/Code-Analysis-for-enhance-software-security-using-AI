// Secure File Deletion
import java.io.File;
public class _20{
    public static void main(String[] args) {
        String filePath = "test_file.txt";

        File file = new File(filePath);
        if (file.exists()) {
            boolean deleted = file.delete();
            if (deleted) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}
