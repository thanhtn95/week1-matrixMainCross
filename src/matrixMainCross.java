import java.util.Scanner;

public class matrixMainCross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter maxtrix size :");
        int size = sc.nextInt();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (int) Math.floor(Math.random() * 100);
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.println();
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += matrix[i][i];
        }
        System.out.println();
        System.out.println("Sum of the matrix main cross = " + sum);
    }
}
