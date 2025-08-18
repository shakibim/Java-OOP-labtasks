package lab3;

import java.util.Scanner;

public class problem_8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int n;
        int temp;
        int reminder;
        System.out.println("Enter any number");
        n = input.nextInt();
        temp = n;
        while (temp != 0) {
            reminder = temp % 10;
            sum = sum * 10 + reminder;
            temp = temp / 10;
        }
        if (n == sum) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("not a Palindrome number");
        }
    }
}
