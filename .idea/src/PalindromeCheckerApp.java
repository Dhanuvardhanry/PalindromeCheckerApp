import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {

    // Approach 1: String Reverse
    static boolean stringReverseCheck(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        return word.equals(reversed);
    }

    // Approach 2: Character Array Two Pointer
    static boolean charArrayCheck(String word) {
        char[] chars = word.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            if (chars[start] != chars[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Approach 3: Stack Based
    static boolean stackCheck(String word) {
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

    // Approach 4: Deque Based
    static boolean dequeCheck(String word) {
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

    // Approach 5: Recursive
    static boolean recursiveCheck(String word, int start, int end) {
        if (start >= end) return true;
        if (word.charAt(start) != word.charAt(end)) return false;
        return recursiveCheck(word, start + 1, end - 1);
    }

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("   Welcome to Palindrome Checker App     ");
        System.out.println("==========================================");
        System.out.println("Application Name: PalindromeCheckerApp");
        System.out.println("Version: 1.0");
        System.out.println("==========================================");

        // UC13: Performance Comparison
        System.out.println("------------------------------------------");
        System.out.println("UC13: Performance Comparison");
        System.out.println("------------------------------------------");

        String word = "racecar";

        // Approach 1: String Reverse
        long start1 = System.nanoTime();
        boolean result1 = stringReverseCheck(word);
        long end1 = System.nanoTime();
        System.out.println("String Reverse   : " + result1 + " | Time: " + (end1 - start1) + " ns");

        // Approach 2: Char Array
        long start2 = System.nanoTime();
        boolean result2 = charArrayCheck(word);
        long end2 = System.nanoTime();
        System.out.println("Char Array       : " + result2 + " | Time: " + (end2 - start2) + " ns");

        // Approach 3: Stack
        long start3 = System.nanoTime();
        boolean result3 = stackCheck(word);
        long end3 = System.nanoTime();
        System.out.println("Stack            : " + result3 + " | Time: " + (end3 - start3) + " ns");

        // Approach 4: Deque
        long start4 = System.nanoTime();
        boolean result4 = dequeCheck(word);
        long end4 = System.nanoTime();
        System.out.println("Deque            : " + result4 + " | Time: " + (end4 - start4) + " ns");

        // Approach 5: Recursive
        long start5 = System.nanoTime();
        boolean result5 = recursiveCheck(word, 0, word.length() - 1);
        long end5 = System.nanoTime();
        System.out.println("Recursive        : " + result5 + " | Time: " + (end5 - start5) + " ns");
    }
}
