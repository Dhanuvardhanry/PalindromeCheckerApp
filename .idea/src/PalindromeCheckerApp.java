import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        // UC1: Welcome Message
        System.out.println("==========================================");
        System.out.println("   Welcome to Palindrome Checker App     ");
        System.out.println("==========================================");
        System.out.println("Application Name: PalindromeCheckerApp");
        System.out.println("Version: 1.0");
        System.out.println("==========================================");

        // UC2: Hardcoded Palindrome Check
        String word = "madam";
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }

        // UC3: Palindrome Check Using String Reverse
        System.out.println("------------------------------------------");
        String input = "racecar";
        String reversedInput = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversedInput = reversedInput + input.charAt(i);
        }
        if (input.equals(reversedInput)) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is not a Palindrome");
        }

        // UC4: Character Array Based Palindrome Check
        System.out.println("------------------------------------------");
        String uc4Word = "level";
        char[] chars = uc4Word.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(uc4Word + " is a Palindrome");
        } else {
            System.out.println(uc4Word + " is not a Palindrome");
        }

        // UC5: Stack-Based Palindrome Checker
        System.out.println("------------------------------------------");
        String uc5Word = "noon";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < uc5Word.length(); i++) {
            stack.push(uc5Word.charAt(i));
        }
        String stackReversed = "";
        while (!stack.isEmpty()) {
            stackReversed = stackReversed + stack.pop();
        }
        if (uc5Word.equals(stackReversed)) {
            System.out.println(uc5Word + " is a Palindrome");
        } else {
            System.out.println(uc5Word + " is not a Palindrome");
        }

        // UC6: Queue + Stack Based Palindrome Check
        System.out.println("------------------------------------------");
        String uc6Word = "civic";
        Stack<Character> uc6Stack = new Stack<>();
        Queue<Character> uc6Queue = new LinkedList<>();

        // Push and Enqueue all characters
        for (int i = 0; i < uc6Word.length(); i++) {
            uc6Stack.push(uc6Word.charAt(i));
            uc6Queue.add(uc6Word.charAt(i));
        }

        // Compare dequeue (FIFO) vs pop (LIFO)
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


