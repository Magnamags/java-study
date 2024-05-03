package Arrays;

public class Transpose {
    public static void main(String[] args) {
        int original[][] = {{1,2}, {2,3}, {3,4}};
        int transpose[][] = new int[2][3];


        for (int i=0; i<2; i++) {
            for (int j=0; j<3; j++) {
                transpose[i][j] = original[j][i];
            }
        }
        System.out.println("The original matrix is : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(original[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("Transpose of the matrix is: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transpose[i][j]+ " ");
            }
            System.out.println();
        }
    }
}