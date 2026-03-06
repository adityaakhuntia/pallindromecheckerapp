class PalindromeChecker {

    public boolean checkPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {

        PalindromeChecker checker = new PalindromeChecker();

        String word = "madam";

        if (checker.checkPalindrome(word)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }
}