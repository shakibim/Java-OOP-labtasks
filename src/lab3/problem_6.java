package lab3;

import java.util.Scanner;

public class problem_6 {

    public static void main(String[] args) {
        int min;
        int max;
        int guess = 0;
        int count = 0;
        int guesses = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the min value");
        min = input.nextInt();
        System.out.println("Enter the max value");
        max = input.nextInt();
       System.out.println("Random value of type int between " + min + " to " + max + ":");

int b = (int) (Math.random() * (max - min + 1) + min);
        System.out.println(b);
        do {
            System.out.println("Guess what number between (1-100)? ");
            guess = input.nextInt();
            guesses++;
            if (b > guess) {
                System.out.println("Too high, try again.");
            } else if (b < guess) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("You're right, the number is" + b);
            }
        } while (guess != b);
    }
}
