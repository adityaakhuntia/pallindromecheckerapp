import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        // UC5: Case-insensitive handling
        String normalized = input.toLowerCase();

        String reversed = "";

        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed = reversed + normalized.charAt(i);
        }

        if (normalized.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        scanner.close();
    }
}