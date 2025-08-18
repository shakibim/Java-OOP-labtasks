package lab5;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Line[] lineArr = new Line[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter x1 of " + i + " no Line:");
            int x1 = in.nextInt();
            System.out.println("Enter y1 of " + i + " no Line:");
            int y1 = in.nextInt();
            System.out.println("Enter x2 of " + i + " no Line:");
            int x2 = in.nextInt();
            System.out.println("Enter y1 of " + i + " no Line:");
            int y2 = in.nextInt();
            lineArr[i] = new Line(x1, y1, x2, y2);
        }
        Line linex = new Line(7, 9, 12, 13);
        Line liney = new Line(12, 13, 15, 16);
        System.out.println(linex.findSlope());
        System.out.println(liney.findSlope());
        System.out.println(isIntersecting(linex, liney));
    }

    public static boolean isIntersecting(Line l1, Line l2) {
        double x = l1.findSlope();
        double y = l2.findSlope();;
        return x != y;
    }
}
