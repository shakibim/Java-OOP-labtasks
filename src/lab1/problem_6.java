
package lab1;

import java.util.Scanner;

public class problem_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);
        String reversed2 = new StringBuilder(str).reverse().toString();
        System.out.println(reversed2);
    }
}
