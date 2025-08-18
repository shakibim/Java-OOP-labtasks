package lab3;

import java.util.Scanner;

public class problem_15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int n;
        int temp;
        int reminder;
        System.out.println("Enter any number");
        n = input.nextInt();
        temp = n;
        do {
            reminder = temp % 10;
            sum = sum * 10 + reminder;
            temp = temp / 10;
        } while (temp > 0);
        System.out.println("Reverse Number is:" + sum);

    }
}
