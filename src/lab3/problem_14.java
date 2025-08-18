package lab3;

import java.util.Scanner;

public class problem_14 {

    public static void main(String[] args) {
        int i, fact = 1, n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any Number");
        n = input.nextInt();
        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("factorial number is :" + fact);

    }
}
