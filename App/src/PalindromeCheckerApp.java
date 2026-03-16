import java.util.*;

public class PalindromePerformance {

    // Stack Method
    public static boolean stackPalindrome(String text) {

        String clean = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char c : clean.toCharArray()) {
            stack.push(c);
        }

        for (char c : clean.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // Deque Method
    public static boolean dequePalindrome(String text) {

        String clean = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : clean.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {

            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }

    // String Reverse Method
    public static boolean reversePalindrome(String text) {

        String clean = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reversed = new StringBuilder(clean).reverse().toString();

        return clean.equals(reversed);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Stack Timing
        long start1 = System.nanoTime();
        boolean stackResult = stackPalindrome(input);
        long end1 = System.nanoTime();

        // Deque Timing
        long start2 = System.nanoTime();
        boolean dequeResult = dequePalindrome(input);
        long end2 = System.nanoTime();

        // Reverse Timing
        long start3 = System.nanoTime();
        boolean reverseResult = reversePalindrome(input);
        long end3 = System.nanoTime();

        System.out.println("\nResults:");
        System.out.println("Stack Method: " + stackResult +
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Deque Method: " + dequeResult +
                " | Time: " + (end2 - start2) + " ns");

        System.out.println("Reverse Method: " + reverseResult +
                " | Time: " + (end3 - start3) + " ns");

        sc.close();
    }
}