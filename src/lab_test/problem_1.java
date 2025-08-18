package lab_test;

public class problem_1 {

    public static void main(String[] args) {
        int count = 10001;
        int n = 0;
        int x=1;
        while (x <= count) {
            if (isPrime(n)) {
                System.out.print(n+" ");
                x++; 
            }
            n++;
        }

    }

    public static boolean isPrime(int n) {
        boolean isPrime = false;
        if (n <= 1) {
            return false;   
        }
        if (n == 2) {
            return true;    
        }
        if (n % 2 == 0) {
            return false; 
        }
        for (int i = 3; i * i <= n; i += 2) { 
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}