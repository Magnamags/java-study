package looping;

public class Power {
    public static void main(String[] args) {
        int base = 2;
        int exponent = 3;
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result*base;
        }
        System.out.println(base + " raised to the power of " + exponent + " is " + result);
    }
}

//   public static void main(String[] args) {
//            int base = 2;
//            int exponent = 3;
//            int result = (int) Math.pow(base, exponent);
//            System.out.println(base + " raised to the power of " + exponent + " is " + result);
//        }
//    }