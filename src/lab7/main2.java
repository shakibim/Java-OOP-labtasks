package lab7;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                printer.printEven();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                printer.printOdd();
            }
        });
       PrimeThread primeThread = new PrimeThread();

        t1.start();
        t2.start();
        primeThread.start();
    }
}

