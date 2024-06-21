package Methods;
import java.util.Scanner;

public class stars {
        public static void printStars(int n) {

            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            // Print a newline at the end
            System.out.println();
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of stars: ");
            int n = sc.nextInt();
            printStars(n);
            sc.close();
        }
    }


