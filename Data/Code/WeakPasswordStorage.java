//Weak Password Storage
import java.util.HashMap;

public class WeakPasswordStorage {
    private static HashMap<String, String> userPasswords = new HashMap<>();

    public static void main(String[] args) {
        userPasswords.put("user1", "password123"); // Storing plaintext password
        userPasswords.put("user2", "123456");     // Storing weak password
        userPasswords.put("user3", "admin");     // Another weak password

        System.out.println("Stored user credentials:");
        userPasswords.forEach((user, pass) -> System.out.println(user + ": " + pass));

        authenticate("user1", "password123");
        authenticate("user2", "wrongPassword");
    }

    public static void authenticate(String username, String password) {
        if (userPasswords.containsKey(username) && userPasswords.get(username).equals(password)) {
            System.out.println("Authentication successful for user: " + username);
        } else {
            System.out.println("Authentication failed for user: " + username);
        }
    }
}
