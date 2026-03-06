import java.util.Stack;

public class StackStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String str) {

        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray()) {
            stack.push(c);
        }

        for(char c : str.toCharArray()) {
            if(c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}