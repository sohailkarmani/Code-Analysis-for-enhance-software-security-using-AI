// Secure Database Connection
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class _14{
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/securedb";
        String user = "secureUser";
        String password = "securePass";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "INSERT INTO users (username, email) VALUES (?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, "john_doe");
                statement.setString(2, "john.doe@example.com");
                int rowsInserted = statement.executeUpdate();
                System.out.println(rowsInserted + " rows inserted.");
            }
        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
        }
    }
}
