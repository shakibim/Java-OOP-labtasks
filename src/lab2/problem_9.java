package lab2;

public class problem_9 {

    public static void main(String[] args) {
        int n = 5121;
        System.out.println(rev(n));
    }

    static int rev(int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum * 10 + n % 10;
            n = n / 10;
        }
        return sum;
    }
}
