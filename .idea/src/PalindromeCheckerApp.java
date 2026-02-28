public class PalindromeCheckerApp {

    // Recursive method to check palindrome
    static boolean isPalindrome(String str, int start, int end) {
        // Base condition
        if (start >= end) {
            return true;
        }
        // Compare first and last characters
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("   Welcome to Palindrome Checker App     ");
        System.out.println("==========================================");
        System.out.println("Application Name: PalindromeCheckerApp");
        System.out.println("Version: 1.0");
        System.out.println("==========================================");

        // UC9: Recursive Palindrome Checker
        System.out.println("------------------------------------------");
        String uc9Word = "kayak";

        boolean result = isPalindrome(uc9Word, 0, uc9Word.length() - 1);

        if (result) {
            System.out.println(uc9Word + " is a Palindrome");
        } else {
            System.out.println(uc9Word + " is not a Palindrome");
        }
    }
}