public class PalindromeCheckerApp {

        public static void main(String[] args) {

            String input1 ="madam";
            String reverse = "";
            input1 =input1.toLowerCase();
            for (int i = input1.length() -1; i >=0; i--) {
                reverse= reverse+input1.charAt(i);
            }
            if(reverse.equals(input1)){
                System.out.println("It is a Palindrome");
            }
            else{
                System.out.println("It is not a Palindrome");
            }
        }
    }


