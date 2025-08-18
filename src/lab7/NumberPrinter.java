package lab7;

public class NumberPrinter {
    public void printEven() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printOdd() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(4000); // regular interval
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
