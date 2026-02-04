package LearnJava;

class Counter {
    private int count;

    public void increment() {
        synchronized (this) {
            count++;
        }

    }

    public int getCount() {
        return count;
    }
}

class SyncBlock extends Thread {

    Counter count;

    public SyncBlock(Counter count) {
        this.count = count;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            count.increment();
        }
    }

}

public class SynchronizedBlock {
    public static void main(String[] args) throws InterruptedException {

        Counter count = new Counter();

        SyncBlock t1 = new SyncBlock(count);
        SyncBlock t2 = new SyncBlock(count);
        t1.start();
        t2.start();
        // Wait for both threads to finish
        t1.join();
        t2.join();

        System.out.println("Count is " + count.getCount());
    }
}
