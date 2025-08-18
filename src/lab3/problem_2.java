package lab3;

import java.util.Scanner;

public class problem_2 {

    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int count = 0;
        int fibo;
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number range");
        n = input.nextInt();
        while (count < n) {
            if (count <= 1) {
                fibo = count;
            } else {
                fibo = first + second;
                first = second;
                second = fibo;
            }
            System.out.println(fibo);
            count++;
        }

    }
}
