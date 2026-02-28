public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("   Welcome to Palindrome Checker App     ");
        System.out.println("==========================================");
        System.out.println("Application Name: PalindromeCheckerApp");
        System.out.println("Version: 1.0");
        System.out.println("==========================================");

        // UC10: Case-Insensitive & Space-Ignored Palindrome
        System.out.println("------------------------------------------");
        String uc10Word = "A man a plan a canal Panama";

        // Step 1: Normalize - remove spaces and convert to lowercase
        String normalized = uc10Word.replaceAll("\\s+", "").toLowerCase();

        // Step 2: Reverse normalized string
        String reversed = "";
        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed = reversed + normalized.charAt(i);
        }

        // Step 3: Compare
        if (normalized.equals(reversed)) {
            System.out.println(uc10Word + " is a Palindrome");
        } else {
            System.out.println(uc10Word + " is not a Palindrome");
        }
    }
}
