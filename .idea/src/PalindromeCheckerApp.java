import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {

    // Strategy Interface
    interface PalindromeStrategy {
        boolean check(String word);
    }

    // Stack Strategy Implementation
    static class StackStrategy implements PalindromeStrategy {
        public boolean check(String word) {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < word.length(); i++) {
                stack.push(word.charAt(i));
            }
            String reversed = "";
            while (!stack.isEmpty()) {
                reversed = reversed + stack.pop();
            }
            return word.equals(reversed);
        }
    }

    // Deque Strategy Implementation
    static class DequeStrategy implements PalindromeStrategy {
        public boolean check(String word) {
            Deque<Character> deque = new ArrayDeque<>();
            for (int i = 0; i < word.length(); i++) {
                deque.addLast(word.charAt(i));
            }
            while (deque.size() > 1) {
                if (deque.removeFirst() != deque.removeLast()) {
                    return false;
                }
            }
            return true;
        }
    }

    // Context class that uses strategy
    static class PalindromeChecker {
        private PalindromeStrategy strategy;

        // Inject strategy at runtime
        public PalindromeChecker(PalindromeStrategy strategy) {
            this.strategy = strategy;
        }

        public boolean check(String word) {
            return strategy.check(word);
        }
    }

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("   Welcome to Palindrome Checker App     ");
        System.out.println("==========================================");
        System.out.println("Application Name: PalindromeCheckerApp");
        System.out.println("Version: 1.0");
        System.out.println("==========================================");

        // UC12: Strategy Pattern for Palindrome Algorithms
        System.out.println("------------------------------------------");
        String word = "racecar";

        // Using Stack Strategy
        PalindromeChecker stackChecker = new PalindromeChecker(new StackStrategy());
        System.out.println("Stack Strategy:");
        if (stackChecker.check(word)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }

        // Using Deque Strategy
        System.out.println("------------------------------------------");
        PalindromeChecker dequeChecker = new PalindromeChecker(new DequeStrategy());
        System.out.println("Deque Strategy:");
        if (dequeChecker.check(word)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }
}
