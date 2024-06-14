package Methods;

import java.util.Scanner;

public class palindrome {
        // Method to check if the given string is a palindrome
        public static boolean isPalindrome(String str) {
            // Get the length of the string
            int length = str.length();

            // Compare characters from the start and end until the middle is reached
            for (int i = 0; i < length / 2; i++) {
                if (str.charAt(i) != str.charAt(length - 1 - i)) {
                    return false; // Not a palindrome
                }
            }

            return true; // Is a palindrome
        }

        public static void main(String[] args) {
            // Create a Scanner object to read input from the user
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter a string
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            // Check if the string is a palindrome and print the result
            boolean result = isPalindrome(input);
            System.out.println("Is the string a palindrome? " + result);

            // Close the scanner
            scanner.close();
        }
    }


