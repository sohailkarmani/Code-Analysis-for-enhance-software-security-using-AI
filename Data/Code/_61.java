// HashingExample.java

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class _61{
    public static void main(String[] args) {
        String input = "SecurePassword123";
        String hash = hashInput(input);
        System.out.println("Hashed Value: " + hash);
    }

    private static String hashInput(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] encodedHash = digest.digest(input.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : encodedHash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error generating hash", e);
        }
    }
}
