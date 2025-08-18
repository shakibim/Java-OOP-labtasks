package lab3;

import java.util.Scanner;

public class problem_10 {

    public static void main(String[] args) {
        int i, j, m, n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number");
        n = input.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (m = 1; m <= 2 * i - 1; m++) {
                System.out.print("" + i);
            }

            System.out.println("");
        }
    }
}
