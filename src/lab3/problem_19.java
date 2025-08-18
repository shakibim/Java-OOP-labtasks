package lab3;

import static java.lang.Math.pow;
import java.util.Scanner;

public class problem_19 {

    public static void main(String[] args) {
        int n, fact = 1, i;
        int sign = -1;
        int flag = 2;
        double sum, x;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n");
        n = input.nextInt();
        System.out.println("convert angle in degree");
        x = input.nextDouble();
        x = x * (3.142 / 180.0);
        sum = x;
        System.out.println("Angle in degree =:" + x);

        for (i = 3; i <= n; i = i + 2) {
            fact = fact * i * (i - 1);
            sum = sum + sign * pow(x, i) / fact;
            sign = sign * -1;
        }
        System.out.println("the sum is = :" + sum);

    }
}
