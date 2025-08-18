package lab2;

public class problem_3 {

    public static void main(String[] args) {
        System.out.println(nextPrime(12));
    }

    public static int nextPrime(int a) {
        int np = a;
        if (isPrime(a) == true) {
            np = a;
        } else {
            while (isPrime(np) == false) {
                np = np + 1;
            }
        }
        return np;
    }

    public static boolean isPrime(int a) {
        int count = 0;
        if (a == 1) {
            count = 1;
        } else {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    count++;
                }
            }
        }
        return count == 0;
    }
}
