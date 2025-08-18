package lab3;

import java.util.Scanner;

public class problem_18 {

    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any year");
        year = input.nextInt();
        if (year % 400 == 0) {
            System.out.println("Leap Year");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}
