// Secure Configuration File Parsing
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class _15{
    public static void main(String[] args) {
        String configFilePath = "config.properties";

        try (FileInputStream inputStream = new FileInputStream(configFilePath)) {
            Properties properties = new Properties();
            properties.load(inputStream);

            String dbUrl = properties.getProperty("db.url");
            String dbUser = properties.getProperty("db.user");

            System.out.println("Database URL: " + dbUrl);
            System.out.println("Database User: " + dbUser);
        } catch (IOException e) {
            System.err.println("Error reading configuration file: " + e.getMessage());
        }
    }
}
