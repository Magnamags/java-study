package Methods;
import java.util.Scanner;
public class palindrome {
        public static boolean isPalindrome(String num) {

            int i = 0, j = num.length() - 1;

            while (i < j) {
                if (num.charAt(i) != num.charAt(j)) return false;
                i++;
                j--;
            }

            return true; // Is a palindrome
        }

        public static void main(String[] args) {
            String Value = "ifii";

            if (isPalindrome(Value)) {
                System.out.println(Value + " is a palindrome string");
            } else {
                System.out.println(Value + " is not a palindrome string");
            }
        }
    }




       // int length = str.length();
//
//        // Compare characters from the start and end until the middle is reached
//        for (int i = 0; i < length / 2; i++) {
//        if (str.charAt(i) != str.charAt(length - 1 - i)) {
//        return false; // Not a palindrome
//        }
//        }


//public static boolean isPalindrome(String str) {
//    // Create a StringBuilder with the original string
//    StringBuilder sb = new StringBuilder(str);
//
//    // Reverse the string
//    String reversedStr = sb.reverse().toString();
//
//    // Compare the original and reversed strings
//    return str.equals(reversedStr);
//}