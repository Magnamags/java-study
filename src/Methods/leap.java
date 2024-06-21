package Methods;

public class leap {
        public static boolean isLeapYear(int year) {
            // Check if the year is divisible by 4
            if (year % 4 == 0) {
                // If year is divisible by 100, it must also be divisible by 400 to be a leap year
                if (year % 100 == 0) {
                    return year % 400 == 0;
                } else {
                    return true; // Divisible by 4 and not divisible by 100
                }
            } else {
                return false; // Not divisible by 4
            }
        }
        public static void main(String[] args) {
            int year = 1998;

            if (isLeapYear(year)) {
                System.out.printf("%d is a leap year .%n ", year);
            } else {
                System.out.printf("%d is not a leap year.%n", year);
            }
        }
    }
    
