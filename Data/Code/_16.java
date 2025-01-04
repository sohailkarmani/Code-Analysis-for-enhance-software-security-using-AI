// Secure API Access
import java.net.HttpURLConnection;
import java.net.URL;

public class _16{
    public static void main(String[] args) {
        String apiUrl = "https://api.example.com/data";

        try {
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization", "Bearer secure_token");
            connection.connect();

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                System.out.println("API access successful.");
            } else {
                System.out.println("Failed to access API. Response code: " + responseCode);
            }
        } catch (Exception e) {
            System.err.println("Error accessing API: " + e.getMessage());
        }
    }
}
