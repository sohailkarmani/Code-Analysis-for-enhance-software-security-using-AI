// Improper Exception Handling
public class _4{
    public static void main(String[] args) {
        try {
            riskyOperation();
        } catch (Exception e) {
            System.out.println("An error occurred."); // Generic error message
        }
    }

    public static void riskyOperation() {
        int result = 10 / 0; // Division by zero
    }
}
