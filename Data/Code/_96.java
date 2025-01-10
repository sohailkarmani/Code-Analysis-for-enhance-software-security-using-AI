// VowelChecker.java
import java.util.Scanner;

public class _96{

    public boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        _96 checker = new _96();

        System.out.print("Enter a character: ");
        char c = scanner.next().charAt(0);

        if (checker.isVowel(c)) {
            System.out.println(c + " is a vowel.");
        } else {
            System.out.println(c + " is not a vowel.");
        }

        scanner.close();
    }
}

