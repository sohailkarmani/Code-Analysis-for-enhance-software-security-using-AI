
// Path Traversal

import java.nio.file.*;

public class _29{
    public static void main(String[] args) {
        String filePath = args[0]; // Unsanitized input
        try {
            Path file = Paths.get("uploads", filePath).normalize();
            System.out.println(new String(Files.readAllBytes(file)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
