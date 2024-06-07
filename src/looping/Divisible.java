package looping;

public class Divisible {
    public static void main(String[] args) {
        int counter=0;
        int div = 3;
        int limit = 5;
        System.out.println("The numbers divisble by 3 are : ");
        for (int i = 1; i<=Integer.MAX_VALUE ; i++) {
            if (i % div == 0) {
                System.out.println(i);
                counter++;

            }
           if(counter>=limit)
               break;
        }

    }
}
