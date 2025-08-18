
package lab7;

import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter marks (0-100): ");
            int marks = sc.nextInt();

            if (marks < 0 || marks > 100) {
                throw new InvalidMarksException("Marks should be between 0 and 100!");
            }

            System.out.println("You entered valid marks: " + marks);

        } catch (InvalidMarksException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception: " + e);
        }
    }
}

