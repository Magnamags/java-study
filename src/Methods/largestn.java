package Methods;

public class largestn {

        public static int findLargest(int[] numbers) {
            if (numbers == null || numbers.length == 0) {
                throw new IllegalArgumentException("Array must not be null or empty");
            }
            int largest = numbers[0]; // Assume the first element is the largest initially
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > largest) {
                    largest = numbers[i]; // Update largest if current element is greater
                }
            }
            return largest;
        }

        public static void main(String[] args) {
            int[] numbers = {10, 20, 5, 35, 50, 15};

            int largestNumber = findLargest(numbers);

            System.out.println("The largest number is: " + largestNumber);
        }
    }


