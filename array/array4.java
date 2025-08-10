package Array;
import java.util.*;
public class array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = 2;
        int cols = 3;

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] result = new int[rows][cols];

        // Input for first matrix
        System.out.println("Enter elements of first 2x3 matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("matrix1[" + i + "][" + j + "] = ");
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Input for second matrix
        System.out.println("Enter elements of second 2x3 matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("matrix2[" + i + "][" + j + "] = ");
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Adding matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Display result
        System.out.println("\nResultant Matrix After Addition:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println(); // Move to next row
        }

        sc.close(); // Close scanner
    }
}
