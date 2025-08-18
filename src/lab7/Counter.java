
package lab7;

class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;  // Not synchronized
    }

    public int getCount() {
        return count;
    }
}
