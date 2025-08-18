package lab3;

import java.util.Scanner;

public class problem_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        CheckOddEven(num);
    }

    public static void CheckOddEven(int number) {
        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
        System.out.println("bye!");
    }
}
