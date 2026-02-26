import java.util.Scanner;

/**
 * PalindromeCheckerApp
 * UC1–UC13 Final Version
 */
public class PalindromeCheckerApp {

    /**
     * Checks whether the given input is a palindrome.
     * Ignores case, spaces, and special characters.
     */
    public static boolean isPalindrome(String input) {

        String normalized = input
                .toLowerCase()
                .replaceAll("[^a-z0-9]", "");

        if (normalized.isEmpty()) {
            return false;
        }

        String reversed = "";

        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed += normalized.charAt(i);
        }

        return normalized.equals(reversed);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Welcome to Palindrome Checker App ===");

        while (true) {

            System.out.println("\nMenu:");
            System.out.println("1. Check Palindrome");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {

                    case 1:
                        System.out.print("Enter text: ");
                        String input = scanner.nextLine();

                        if (input.trim().isEmpty()) {
                            System.out.println("❌ Input cannot be empty");
                        } else if (isPalindrome(input)) {
                            System.out.println("✅ Result: Palindrome");
                        } else {
                            System.out.println("❌ Result: Not a Palindrome");
                        }
                        break;

                    case 2:
                        System.out.println("Thank you for using Palindrome Checker App.");
                        scanner.close();
                        return;

                    default:
                        System.out.println("❌ Invalid choice. Please enter 1 or 2.");
                }

            } catch (NumberFormatException e) {
                System.out.println("❌ Invalid input. Please enter a number.");
            }
        }
    }
}