
package lab_test;
import java.util.Scanner;

public class problem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first matrix
        System.out.print("Input the rows and columns of first matrix: ");
        int n1 = sc.nextInt();
        int m1 = sc.nextInt();
        int[][] first = new int[n1][m1];

        System.out.println("Input elements in the first matrix:");
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[0].length; j++) {
                System.out.print("element - [" + i + "],[" + j + "] : ");
                first[i][j] = sc.nextInt();
            }
        }

        // Input for second matrix
        System.out.print("Input the rows and columns of second matrix: ");
        int n2 = sc.nextInt();
        int m2 = sc.nextInt();
        int[][] second = new int[n2][m2];

        System.out.println("Input elements in the second matrix:");
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < m2; j++) {
                System.out.print("element - [" + i + "],[" + j + "] : ");
                second[i][j] = sc.nextInt();
            }
        }

        // Print first matrix
        System.out.println("The first matrix is :");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                System.out.print(first[i][j] + " ");
            }
            System.out.println();
        }

        // Print second matrix
        System.out.println("The second matrix is :");
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < m2; j++) {
                System.out.print(second[i][j] + " ");
            }
            System.out.println();
        }

        // Sum of left diagonal of first matrix
        int leftDiagonalSum = 0;
        for (int i = 0; i < n1; i++) {
            leftDiagonalSum += first[i][i];
        }

        // Multiplication of right diagonal of second matrix
        int rightDiagonalProduct = 1;
        for (int i = 0; i < n2; i++) {
            rightDiagonalProduct *= second[i][n2 - i - 1];
        }

        // Output
        System.out.println("Addition of the left Diagonal elements is: " + leftDiagonalSum);
        System.out.println("Multiplication of the right Diagonal elements is: " + rightDiagonalProduct);
        System.out.println("Sum of both results: " + (leftDiagonalSum + rightDiagonalProduct));
    }
}
