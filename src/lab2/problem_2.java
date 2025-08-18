package lab2;

import java.util.Scanner;

public class problem_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three lengths of sides of the triangle");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        if (x == y && y == z) {
            System.out.println("The triangle is Equilateral");
        } else if (x == y || y == z || z == x) {
            System.out.println("The triangle is Isosceles");
        } else {
            System.out.println("The triangle is Scalene");
        }
    }
}
