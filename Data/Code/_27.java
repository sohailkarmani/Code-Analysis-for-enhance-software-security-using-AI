
// Deserialization Vulnerability
import java.io.*;

public class _27 {
    public static void main(String[] args) throws Exception {
        String serializedObject = args[0]; // Untrusted serialized data
        ByteArrayInputStream byteStream = new ByteArrayInputStream(serializedObject.getBytes());
        ObjectInputStream objectStream = new ObjectInputStream(byteStream);

        Object obj = objectStream.readObject(); // Vulnerable deserialization
        System.out.println("Deserialized Object: " + obj);
    }
}
