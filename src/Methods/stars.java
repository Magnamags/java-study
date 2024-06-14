package Methods;
import java.util.Scanner;

public class stars {
    // Method to print a line of n stars
        public static void printStars(int n) {
            // Loop to print n stars
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            // Print a newline at the end
            System.out.println();
        }

        public static void main(String[] args) {
            // Create a Scanner object to read input from the user
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter the number of stars
            System.out.print("Enter the number of stars: ");
            int n = scanner.nextInt();

            // Call the printStars method with the input number
            printStars(n);

            // Close the scanner
            scanner.close();
        }
    }


