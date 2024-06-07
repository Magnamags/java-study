package Branching;

import java.util.Scanner;

public class weekdays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Week Number:");
        int num = sc.nextInt();
        if (num == 1)
            System.out.println("This is a Sunday");
        else if (num == 2)
            System.out.println("This is a Monday");
        else if (num == 3)
            System.out.println("This is a Tuesday");
        else if (num == 4)
            System.out.println("This is a Wednesday");
        else if (num == 5)
            System.out.println("This is a Thursday");
        else if (num == 6)
            System.out.println("This is a Friday");
        else if (num == 7)
            System.out.println("This is a Saturday");
        else
            System.out.println("The value should be between 1-7 ");
    }
}
