package lab2;

import java.util.Scanner;

public class problem_10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter how many prime numbers to sum:");
        int num = in.nextInt();

        int sum = 0;
        int count = 0;

        for (int i = 2; count < num; i++) {
            if (isPrime(i)) {
                sum += i;
                count++;
            }
        }

        System.out.println("Total sum of the first " + num + " Prime Numbers: " + sum);
    }

    public static boolean isPrime(int a) {
        int count = 0;
        if (a == 1) {
            count = 1;
        } else {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    count++;
                }
            }
        }
        return count == 0;
    }
}
