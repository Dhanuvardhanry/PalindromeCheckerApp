import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("   Welcome to Palindrome Checker App     ");
        System.out.println("==========================================");
        System.out.println("Application Name: PalindromeCheckerApp");
        System.out.println("Version: 1.0");
        System.out.println("==========================================");

        // UC7: Deque-Based Optimized Palindrome Checker
        System.out.println("------------------------------------------");
        String uc7Word = "rotator";
        Deque<Character> deque = new ArrayDeque<>();

        // Insert all characters into deque
        for (int i = 0; i < uc7Word.length(); i++) {
            deque.addLast(uc7Word.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear
        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();
            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(uc7Word + " is a Palindrome");
        } else {
            System.out.println(uc7Word + " is not a Palindrome");
        }
    }
}
