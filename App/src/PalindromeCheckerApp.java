public class PalindromeCheckerApp {
        /*
         * UC2 -- Application entry point

         * This is the first method runed by JVM
         * when the program starts

         *@author Developer
         * @Version 2.0

         */
        public static void main(String[] args) {
            System.out.println("Welcome to Palindrome Checker Management System");
            System.out.println("Version : 1.0");
            System.out.println("System Initialized " + "Successfully");

            /** Use case 2 : Hardcoded Palindrome checker*/
            String input ="madam";
            boolean palindrome=true;
            input =input.toLowerCase();
            for (int i = 0; i < input.length() / 2; i++) {
                if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                    palindrome = false;
                    break;
                }
            }
            if(palindrome){
                System.out.println("It is a Palindrome");
            }
            else{
                System.out.println("It is not a Palindrome");
            }

            /** Use case 3: String reverse*/
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


