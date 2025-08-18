package lab2;

import java.util.Scanner;

public class problem_5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = in.nextInt();
        int num = x;
        int sum = 0;
        while (x != 0) {
            int b = x % 10;
            sum = sum + (b * b * b);
            x = x / 10;
        }
        if (num == sum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}
