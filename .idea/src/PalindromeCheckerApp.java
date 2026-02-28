public class PalindromeCheckerApp {

    // Encapsulated PalindromeChecker class
    static class PalindromeChecker {

        // Single Responsibility: only checks palindrome
        public boolean checkPalindrome(String word) {
            String normalized = word.replaceAll("\\s+", "").toLowerCase();
            String reversed = "";
            for (int i = normalized.length() - 1; i >= 0; i--) {
                reversed = reversed + normalized.charAt(i);
            }
            return normalized.equals(reversed);
        }
    }

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("   Welcome to Palindrome Checker App     ");
        System.out.println("==========================================");
        System.out.println("Application Name: PalindromeCheckerApp");
        System.out.println("Version: 1.0");
        System.out.println("==========================================");

        // UC11: Object-Oriented Palindrome Service
        System.out.println("------------------------------------------");

        // Create object of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker();

        String word1 = "madam";
        String word2 = "hello";

        if (checker.checkPalindrome(word1)) {
            System.out.println(word1 + " is a Palindrome");
        } else {
            System.out.println(word1 + " is not a Palindrome");
        }

        if (checker.checkPalindrome(word2)) {
            System.out.println(word2 + " is a Palindrome");
        } else {
            System.out.println(word2 + " is not a Palindrome");
        }
    }
}
