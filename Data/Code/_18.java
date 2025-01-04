// Secure Logging
import java.util.logging.Level;
import java.util.logging.Logger;

public class _18{
    private static final Logger logger = Logger.getLogger(_18.class.getName());

    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            logger.log(Level.SEVERE, "An error occurred: " + e.getMessage());
        }
    }
}
