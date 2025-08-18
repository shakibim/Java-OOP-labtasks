package lab3;

import java.util.Scanner;

public class problem_9 {

    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array");
        size = input.nextInt();
        System.out.println("Enter the array elements");
        int a[] = new int[100];
        for (int i = 0; i < size; i++) {
            a[i] = input.nextInt();
        }
        System.out.println("Even numbers are");
        for (int i = 0; i < size; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }
        System.out.println("Odd numbers are ");
        for (int i = 0; i < size; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
            }
        }
    }
}
