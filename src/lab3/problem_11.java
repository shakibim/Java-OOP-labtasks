package lab3;

import java.util.Scanner;

public class problem_11 {

    public static void main(String[] args) {
        double sum = 0;
        double i;
        double n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number");
        n = input.nextDouble();
        for (i = 1; i <= n; i++) {
            sum = sum + (1 / i);
        }
        System.out.println("sum is :" + sum);

    }
}
