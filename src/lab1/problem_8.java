package lab1;
import java.util.HashSet;
import java.util.Scanner;

import java.util.Scanner;

public class problem_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter main string: ");
        String str = sc.nextLine();

        System.out.print("Enter substring to count: ");
        String pattern = sc.nextLine();

        int count = 0;
        for (int i = 0; i <= str.length() - pattern.length(); i++) {
            if (str.substring(i, i + pattern.length()).equals(pattern)) {
                count++;
            }
        }

        System.out.println("Number of occurrences of '" + pattern + "': " + count);
    }
}

