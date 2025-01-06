// Command Injection

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _22{
    public static void main(String[] args) {
        try {
            String userCommand = args[0]; // Unsanitized user input
            String[] command = {"sh", "-c", userCommand};
            Process process = Runtime.getRuntime().exec(command);

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
