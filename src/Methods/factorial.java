package Methods;

public class factorial {

    // Method to calculate factorial using recursion
    public static long factorial(int n) {
        if (n <= 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        } else {
            return n * factorial(n - 1); // Recursive case
        }
    }

    public static void main(String[] args) {
        int number = -1;

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        }
        else {
            long result = factorial(number);
            System.out.println("The factorial of " + number + " is " + result);
        }
    }
}

