// SecureSocketConnection

import javax.net.ssl.*;
import java.io.OutputStream;
import java.net.Socket;

public class _66{
    public static void main(String[] args) {
        try {
            SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();
            try (Socket socket = factory.createSocket("google.com", 443)) {
                OutputStream output = socket.getOutputStream();
                output.write("Hello Secure World".getBytes());
                System.out.println("Data sent securely.");
            }
        } catch (Exception e) {
            System.err.println("Error establishing secure connection: " + e.getMessage());
        }
    }
}
