package Methods;

public class Interest {

        // Method to compute the future investment value
        public static double computeFutureValue(double principal, double rate, int years) {
            // Calculate the interest
            double interest = principal * rate * years;
            // Calculate the future value
            double futureValue = principal + interest;
            return futureValue;
        }

        public static void main(String[] args) {
            // Example usage
            double principal = 10000; // Principal amount
            double rate = 0.05; // Annual interest rate (5%)
            int years = 10; // Number of years

            double futureValue = computeFutureValue(principal, rate, years);

            System.out.printf("The future investment value is: %.2f%n", futureValue);
        }
    }

