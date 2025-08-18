package lab2;

import java.util.Scanner;

public class problem_4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = in.nextInt();
        int fac = 1;
        for (int i = 1; i <= x; i++) {
            fac = fac * i;
        }
        System.out.println(fac);
    }
}
