package Strings;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        String original= "Nun";
        String reverse = "";

        int length = original.length();
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);

            if (original.equalsIgnoreCase(reverse))
                System.out.println("It is a Palindrome");

            else
                System.out.println("It is not a Palindrome");
    }
}
