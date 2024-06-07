package Methods;


    public class PowerNth {

        public static double calculatePower(double base, int exponent) {
            double result = 1;
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }
            return result;
        }

        public static void main(String[] args) {
            double base = 2;
            int exponent = 3;

            double power = calculatePower(base, exponent);
            System.out.println(base + " raised to the power of " + exponent + " is: " + power);
        }
    }



// public static double calculatePower(double base, int exponent) {
//        double result = 1;
//        int absExponent = Math.abs(exponent); // Get the absolute value of the exponent
//        for (int i = 0; i < absExponent; i++) {
//            result *= base;
//        }
//        if (exponent < 0) {
//            result = 1 / result; // If the exponent is negative, take the reciprocal of the result
//        }
//        return result;
//    }
