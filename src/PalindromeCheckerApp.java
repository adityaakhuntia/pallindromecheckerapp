public class PalindromeCheckerApp {

    public static boolean simplePalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static boolean recursivePalindrome(String str, int start, int end) {
        if(start >= end) return true;

        if(str.charAt(start) != str.charAt(end))
            return false;

        return recursivePalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String input = "madam";

        // Method 1: StringBuilder
        long start1 = System.nanoTime();
        boolean result1 = simplePalindrome(input);
        long end1 = System.nanoTime();

        // Method 2: Recursion
        long start2 = System.nanoTime();
        boolean result2 = recursivePalindrome(input, 0, input.length() - 1);
        long end2 = System.nanoTime();

        System.out.println("Input: " + input);

        System.out.println("StringBuilder Result: " + result1);
        System.out.println("Time: " + (end1 - start1) + " ns");

        System.out.println("Recursive Result: " + result2);
        System.out.println("Time: " + (end2 - start2) + " ns");
    }
}