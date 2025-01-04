// Secure Random Number Generation
import java.security.SecureRandom;

public class _17{
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        int randomInt = secureRandom.nextInt(100); // Random number between 0 and 99
        System.out.println("Secure random number: " + randomInt);
    }
}
