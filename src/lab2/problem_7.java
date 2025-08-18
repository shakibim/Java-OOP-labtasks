package lab2;

import java.util.Scanner;

public class problem_7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter width");
        double width = in.nextDouble();
        System.out.println("Enter Height");
        double height = in.nextDouble();
        double area = height * width;
        double perimeter = 2 * (height + width);
        System.out.println("Area: " + area);
        System.out.println("Height: " + perimeter);
    }
}
