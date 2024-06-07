package Methods;

public class Sum {
    public static int sumOfDigits(int number) {
        int sum = 0;
        number = Math.abs(number); // Take the absolute value to handle negative numbers

        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            sum += digit; // Add the digit to the sum
            number /= 10; // Remove the last digit
        }

        return sum;
    }

    public static void main(String[] args) {
        // Example integer
        int number = 12345;

        // Calculate the sum of the digits using the method
        int sum = sumOfDigits(number);

        // Print the result
        System.out.println("The sum of the digits in " + number + " is: " + sum);
    }
}

