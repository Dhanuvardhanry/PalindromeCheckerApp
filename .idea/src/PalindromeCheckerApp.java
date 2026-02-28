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
    }
}
