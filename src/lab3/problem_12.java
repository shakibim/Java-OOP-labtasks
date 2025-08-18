package lab3;

import java.util.Scanner;

public class problem_12 {

    public static void main(String[] args) {
        int i;
        int n1, n2;
        int gcd = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        n1 = input.nextInt();
        System.out.println("Enter the second number");
        n2 = input.nextInt();
        for (i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        System.out.printf("GCD of %d and %d is: %d", n1, n2, gcd);
    }
}
