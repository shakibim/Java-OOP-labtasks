
package lab2;

public class problem_8 {

    public static void main(String[] args) {
        int v1 = 20, v2 = 30, temp;
        System.out.println("Before Swapping");
        System.out.println("Variable 1:" + v1);
        System.out.println("Variable 2:" + v2);
        temp = v1;
        v1 = v2;
        v2 = temp;
        System.out.println("After Swapping");
        System.out.println("Variable 1:" + v1);
        System.out.println("Variable 2:" + v2);
    }
}
