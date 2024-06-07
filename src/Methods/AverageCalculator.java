package Methods;

public class AverageCalculator {

    public static double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        double average = calculateAverage(numbers);

        System.out.println("The average is: " + average);
    }
}

