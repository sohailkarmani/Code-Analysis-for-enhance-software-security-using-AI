//  Hardcoded Credentials
public class HardcodedCredentials {
    private static final String DB_USERNAME = "admin"; // Hardcoded credentials
    private static final String DB_PASSWORD = "12345"; // Hardcoded credentials

    public static void main(String[] args) {
        String user = "admin";
        String pass = "12345";

        if (authenticate(user, pass)) {
            System.out.println("Authentication successful.");
        } else {
            System.out.println("Authentication failed.");
        }

        simulateLogin("testUser", "testPassword");
        simulateLogin("admin", "wrongPassword");
    }

    public static boolean authenticate(String username, String password) {
        return username.equals(DB_USERNAME) && password.equals(DB_PASSWORD);
    }

    public static void simulateLogin(String user, String pass) {
        System.out.println("Attempting login for user: " + user);
        if (authenticate(user, pass)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed.");
        }
    }
}
