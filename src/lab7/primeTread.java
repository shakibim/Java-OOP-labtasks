
package lab7;

class PrimeThread extends Thread {
    @Override
    public void run() {
        for (int i = 2; i <= 10; i++) {
            if (isPrime(i)) {
                System.out.println("Prime: " + i);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
