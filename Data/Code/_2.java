//Hardcoded API Key
public class _2{
    private static final String API_KEY = "1234567890abcdef"; // Hardcoded API key

    public static void main(String[] args) {
        System.out.println("Using API key: " + API_KEY);

        makeApiRequest("https://example.com/data");
    }

    public static void makeApiRequest(String endpoint) {
        System.out.println("Sending request to endpoint: " + endpoint);
        System.out.println("Authenticating with API key: " + API_KEY);
    }
}
