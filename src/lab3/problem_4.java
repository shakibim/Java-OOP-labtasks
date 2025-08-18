package lab3;

public class problem_4 {

    public static void main(String[] args) {
        int num = 5;
        System.out.println("a: ");
        for (int i = 1; i <= num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("b: ");
        for (int i = num; i >= 0; i--) {
            for (int j = num - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
