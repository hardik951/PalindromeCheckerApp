import java.util.Stack;

class PalindromeCheckerApp {

    public boolean checkPalindrome(String text) {

        String clean = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < clean.length(); i++) {
            stack.push(clean.charAt(i));
        }

        for (int i = 0; i < clean.length(); i++) {
            if (clean.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}