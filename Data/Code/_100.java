//
import java.util.Random;
import java.util.Scanner;

public class _100 {
    private int targetNumber;

    public _100() {
        Random rand = new Random();
        targetNumber = rand.nextInt(100) + 1;
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        int guess;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        while (true) {
            System.out.print("Guess the number (1-100): ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < targetNumber) {
                System.out.println("Too low!");
            } else if (guess > targetNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! You guessed the number in " + attempts + " attempts.");
                break;
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        _100 game = new _100();
        game.startGame();
    }
}
