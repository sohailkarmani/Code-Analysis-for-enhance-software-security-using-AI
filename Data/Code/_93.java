// PalindromeChecker.java
public class _93 {

    public boolean isPalindrome(String str) {
        String cleanedStr = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        StringBuilder reverseStr = new StringBuilder(cleanedStr).reverse();
        return cleanedStr.equals(reverseStr.toString());
    }

    public static void main(String[] args) {
        _93 checker = new _93();
        String testStr = "A man, a plan, a canal, Panama!";
        if (checker.isPalindrome(testStr)) {
            System.out.println(testStr + " is a palindrome.");
        } else {
            System.out.println(testStr + " is not a palindrome.");
        }
    }
}
