import java.util.Scanner;

public class PalindromeCheckerApp {

    // UC11 method reused
    public static boolean isPalindrome(String input) {

        String normalized = input
                .toLowerCase()
                .replaceAll("[^a-z0-9]", "");

        if (normalized.isEmpty()) {
            return false;
        }

        String reversed = "";

        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed = reversed + normalized.charAt(i);
        }

        return normalized.equals(reversed);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n--- Palindrome Checker Menu ---");
            System.out.println("1. Check Palindrome");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {

                    case 1:
                        System.out.print("Enter value: ");
                        String input = scanner.nextLine();

                        if (input.trim().isEmpty()) {
                            System.out.println("Input cannot be empty");
                        } else if (isPalindrome(input)) {
                            System.out.println("Palindrome");
                        } else {
                            System.out.println("Not a Palindrome");
                        }
                        break;

                    case 2:
                        System.out.println("Program exited");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid choice. Enter 1 or 2.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }
}
