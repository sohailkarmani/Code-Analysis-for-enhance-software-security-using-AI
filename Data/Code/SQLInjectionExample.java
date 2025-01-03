// SQL Injection
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SQLInjectionExample {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter username:");
            String username = scanner.nextLine();

            System.out.println("Enter password:");
            String password = scanner.nextLine();

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password");
            Statement stmt = conn.createStatement();

            // Vulnerable query
            String query = "SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password + "'";
            System.out.println("Executing query: " + query);

            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                System.out.println("Welcome, " + rs.getString("username"));
            } else {
                System.out.println("Invalid credentials.");
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
