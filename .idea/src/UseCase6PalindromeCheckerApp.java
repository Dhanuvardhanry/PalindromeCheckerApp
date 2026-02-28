import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class UseCase6PalindromeCheckerApp {
    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("   Welcome to Palindrome Checker App     ");
        System.out.println("==========================================");
        System.out.println("Application Name: PalindromeCheckerApp");
        System.out.println("Version: 1.0");
        System.out.println("==========================================");

        System.out.println("------------------------------------------");
        String uc6Word = "civic";
        Stack<Character> uc6Stack = new Stack<>();
        Queue<Character> uc6Queue = new LinkedList<>();

        for (int i = 0; i < uc6Word.length(); i++) {
            uc6Stack.push(uc6Word.charAt(i));
            uc6Queue.add(uc6Word.charAt(i));
        }

        boolean uc6IsPalindrome = true;
        while (!uc6Stack.isEmpty() && !uc6Queue.isEmpty()) {
            if (uc6Stack.pop() != uc6Queue.poll()) {
                uc6IsPalindrome = false;
                break;
            }
        }

        if (uc6IsPalindrome) {
            System.out.println(uc6Word + " is a Palindrome");
        } else {
            System.out.println(uc6Word + " is not a Palindrome");
        }
    }
}