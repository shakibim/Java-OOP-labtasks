package lab3;

import java.util.Scanner;

public class problem_7 {

    public static void main(String[] args) {
        int i, j, m;
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number");
        n = input.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; ++j) {
                System.out.print(j);
            }
            for (m = n - i; m >= 1; m--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
