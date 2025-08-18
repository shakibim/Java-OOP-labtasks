
package lab7;

import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int numerator = sc.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = sc.nextInt();

            int result = numerator / denominator; 
            System.out.println("Result: " + result);

        } catch (Exception e) {
            System.out.println("Exception caught: "+e);
        }

        System.out.println("Program continues after handling runtime exception.");
    }
}
