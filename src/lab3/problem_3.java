package lab3;

import java.util.Scanner;

public class problem_3 {

    public static void main(String[] args) {
        int i, j, n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        n = input.nextInt();
        for (i = 0; i < n; i++) {
            for (j = 0; j <= n; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
