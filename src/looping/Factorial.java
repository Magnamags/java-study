package looping;

public class Factorial {
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }
    public static void main(String args[]) {
        int num = 4;
        int result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }

    }

//    public static void main(String[] args) {
//        int number = 5; // Example input
//        int result = factorial(number);
//        System.out.println("Factorial of " + number + " is: " + result);
//    }
//
//    // Recursive method to calculate factorial
//    public static int factorial(int n) {
//        if (n == 0) {
//            return 1; // Base case: 0! = 1
//        } else {
//            return n * factorial(n - 1); // Recursive call
//        }
//    }
//}

