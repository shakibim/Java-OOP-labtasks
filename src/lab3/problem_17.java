package lab3;

import java.util.Scanner;

public class problem_17 {

    public static void main(String[] args) {
        int weekday;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weekday day");
        weekday = input.nextInt();
        if (weekday == 1) {
            System.out.println("Monday");
        } else if (weekday == 2) {
            System.out.println("Tuesday");
        } else if (weekday == 3) {
            System.out.println("Wednesday");
        } else if (weekday == 4) {
            System.out.println("Thursday");
        } else if (weekday == 5) {
            System.out.println("Friday");
        } else if (weekday == 6) {
            System.out.println("Saturday");
        } else if (weekday == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Enter valid week number");
        }
    }
}
