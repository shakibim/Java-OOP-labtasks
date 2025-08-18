package lab3;

import java.util.Scanner;

public class problem_16 {

    public static void main(String[] args) {
        int num = 7;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }

            System.out.println();
        }
        for (int i = num - 1; i >= 1; i--) {
            int n = num - 1;
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
