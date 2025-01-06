
// CRLF Injection
import java.net.http.HttpServer;

public class _24 {
    public static void main(String[] args) {
        String userInput = "Set-Cookie: sessionId=abcd1234; Path=/\r\nX-Injected-Header: Attacker";
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        server.createContext("/", exchange -> {
            exchange.getResponseHeaders().add("Set-Cookie", userInput); // Vulnerable
            String response = "Response Header Injected!";
            exchange.sendResponseHeaders(200, response.getBytes().length);
            exchange.getResponseBody().write(response.getBytes());
            exchange.close();
        });
        server.start();
    }
}
