package lab2;

import java.util.Scanner;

public class problem_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = in.nextInt();
        if (num < 25) {
            System.out.println("Grade: F");
        } else if (num >= 25 && num < 45) {
            System.out.println("Grade: E");
        } else if (num >= 45 && num < 50) {
            System.out.println("Grade: D");
        } else if (num >= 50 && num < 60) {
            System.out.println("Grade: C");
        } else if (num >= 60 && num < 80) {
            System.out.println("Grade: B");
        } else if (num >= 80 && num <= 100) {
            System.out.println("Grade: A");
        } else {
            System.out.println("Invalid");
        }
    }
}
