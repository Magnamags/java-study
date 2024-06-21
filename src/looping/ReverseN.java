package looping;

public class ReverseN {
        public static void main(String[] args)
        {
            int number = 987654;
            int reverse = 0;
            while(number != 0)
            {
                int lastvalue = number % 10;
                reverse = reverse * 10 + lastvalue;
                number = number/10;
            }
            System.out.println("The reverse of the given number is: " + reverse);
        }
    }

