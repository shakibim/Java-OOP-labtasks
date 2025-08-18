
package lab1;

import java.util.Scanner;

public class problem_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the center of the circle (p q): ");
        double p = in.nextDouble();
        double q = in.nextDouble();
        System.out.print("Enter the radius of the circle: ");
        double r = in.nextDouble();
        System.out.print("Enter the point coordinates (x y): ");
        double x = in.nextDouble();
        double y = in.nextDouble();
        
        double distance = Math.sqrt(Math.pow(x - p, 2) + Math.pow(y - q, 2));
        
        if (distance <= r) {
            System.out.println("The point (" + x + ", " + y + ") is inside the circle.");
        } else {
            System.out.println("The point (" + x + ", " + y + ") is outside the circle.");
        }
        
        

    }
}