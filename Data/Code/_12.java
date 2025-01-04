// Secure User Input Validation
import java.util.Scanner;

public class _12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age (1-120):");

        int age = -1;
        while (age < 1 || age > 120) {
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                if (age < 1 || age > 120) {
                    System.out.println("Invalid input. Age must be between 1 and 120. Try again:");
                }
            } else {
                System.out.println("Invalid input. Enter a valid number:");
                scanner.next(); // Clear invalid input
            }
        }
        System.out.println("Your age is: " + age);
        scanner.close();
    }
}
