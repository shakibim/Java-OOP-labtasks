package lab3;

import java.util.Scanner;

public class problem_13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = input.nextInt();
        int spaces = n;
        int number = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            number = 1;
            for (int k = 0; k <= i; k++) {
                System.out.print(" " + number);
                int j;
                number = number * (i - k) / (k + 1);
            }

            spaces--;
            System.out.println();
        }
    }
}

