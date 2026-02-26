import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Enter value (or type exit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Program ended");
                break;
            }

            // UC5–UC9: ignore case, spaces, special characters, keep letters & digits
            String normalized = input
                    .toLowerCase()
                    .replaceAll("[^a-z0-9]", "");

            String reversed = "";

            for (int i = normalized.length() - 1; i >= 0; i--) {
                reversed = reversed + normalized.charAt(i);
            }

            if (normalized.equals(reversed)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not a Palindrome");
            }
        }

        scanner.close();
    }
}