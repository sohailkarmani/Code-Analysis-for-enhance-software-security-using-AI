// Insecure Random Number Generation
import java.util.Random;

public class _6{
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int otp = random.nextInt(10000); // Predictable OTP generation
            System.out.println("Generated OTP: " + otp);
        }
    }
}
