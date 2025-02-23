package wissenTech;

public class InterThreadComm {
    private static int counter = 0;

    public static void main(String[] args) {
        // Shared instance of Print for both threads
        Print printTask = new Print();

        Thread t1 = new Thread(printTask, "A");
        Thread t2 = new Thread(printTask, "B");

        t1.start();
        t2.start();
    }
}

class Print implements Runnable {
    private final Object lock = new Object();
    private boolean isATurn = true; // Flag to alternate between threads

    void print() {
        for (int i = 1; i <= 100; i++) {
            synchronized (lock) {
                while ((Thread.currentThread().getName().equals("A") && !isATurn) ||
                       (Thread.currentThread().getName().equals("B") && isATurn)) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt(); // Restore interrupted state
                        e.printStackTrace();
                    }
                }

                // Print the counter and thread name
                System.out.println("Thread name " + Thread.currentThread().getName() + " counter " + i);

                // Toggle the turn
                isATurn = !isATurn;

                // Notify the other thread
                lock.notify();
            }
        }
    }

    @Override
    public void run() {
        print();
    }
}
