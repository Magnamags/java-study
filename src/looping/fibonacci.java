package looping;

public class fibonacci {
    public static void main(String[] args) {
    int n = 10, firstTerm = 0, secondTerm = 1;
    System.out.println("Fibonacci Series till " + n + " terms:");

    for (int i = 1; i <= n; i++) {
        System.out.print(firstTerm + ", ");
        // compute the next term
        int nextTerm = firstTerm + secondTerm;
        firstTerm = secondTerm;
        secondTerm = nextTerm;
    }
}
}
// public static void main(String[] args) {
//        int n = 10; // Number of terms to generate
//        System.out.print("Fibonacci series up to " + n + " terms: ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(fibonacci(i) + " ");
//        }
//    }
//
//    // Recursive method to calculate Fibonacci number
//    public static int fibonacci(int n) {
//        if (n <= 1) {
//            return n; // Base cases: F(0) = 0, F(1) = 1
//        } else {
//            return fibonacci(n - 1) + fibonacci(n - 2); // Recursive call
//        }
//    }

