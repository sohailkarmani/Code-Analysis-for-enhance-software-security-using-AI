// Command Injection 
import java.util.Scanner;

public class CommandInjectionUpdated {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a command to execute:");
            String command = scanner.nextLine();

            // Split the command into parts for ProcessBuilder
            String[] commandParts = command.split(" ");

            // Use ProcessBuilder to execute the command
            ProcessBuilder processBuilder = new ProcessBuilder(commandParts);

            System.out.println("Executing command: " + command);

            // Start the process
            Process process = processBuilder.start();

            // Read the command output
            Scanner outputScanner = new Scanner(process.getInputStream());
            while (outputScanner.hasNextLine()) {
                System.out.println(outputScanner.nextLine());
            }

            // Check for errors
            Scanner errorScanner = new Scanner(process.getErrorStream());
            while (errorScanner.hasNextLine()) {
                System.err.println("Error: " + errorScanner.nextLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
