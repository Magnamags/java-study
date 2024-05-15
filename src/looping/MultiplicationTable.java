package looping;

public class MultiplicationTable {
    public static void main(String[] args) {
        int N = 4;
        int Range = 10;
        int i=1;
        while (i <= Range){
            System.out.println(N + " * " + i + " = "+ N*i );
            i++;
        }
    }
}
