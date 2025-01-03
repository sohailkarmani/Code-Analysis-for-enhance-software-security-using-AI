// Weak Encryption
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class _9{
    public static void main(String[] args) throws Exception {
        String key = "12345678"; // Weak key (8 bytes)
        String data = "SensitiveData";

        byte[] encryptedData = encrypt(data, key);
        System.out.println("Encrypted data: " + new String(encryptedData));

        byte[] decryptedData = decrypt(encryptedData, key);
        System.out.println("Decrypted data: " + new String(decryptedData));
    }

    public static byte[] encrypt(String data, String key) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), "DES");
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        return cipher.doFinal(data.getBytes());
    }

    public static byte[] decrypt(byte[] data, String key) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), "DES");
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        return cipher.doFinal(data);
    }
}
