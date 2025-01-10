// FileEncryptionExample.java

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;

public class _62{
    public static void main(String[] args) throws Exception {
        String plainText = "This is a secure message.";
        SecretKey secretKey = generateKey();
        String encryptedText = encryptText(plainText, secretKey);
        System.out.println("Encrypted Text: " + encryptedText);
    }

    private static SecretKey generateKey() throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128); // AES key size
        return keyGen.generateKey();
    }

    private static String encryptText(String plainText, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }
}
