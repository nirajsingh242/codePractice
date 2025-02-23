package threadseExample;
public class InterThreadCommunicationNotifyAll {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        ThreadBN t1 = new ThreadBN();
        ThreadBN t2 = new ThreadBN();  // Additional thread for demonstration
        t1.start();
        t2.start();

        synchronized (t1) {
            System.out.println("Main thread trying to call wait() on t1");
            t1.wait();  // Main thread waits for t1 to notify
        }

        synchronized (t2) {
            System.out.println("Main thread trying to call wait() on t2");
            t2.wait();  // Main thread waits for t2 to notify
        }

        System.out.println("Total from t1: " + t1.total);
        System.out.println("Total from t2: " + t2.total);
    }
}

class ThreadBN extends Thread {
    int total = 0;

    @Override
    public void run() {

        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " started execution for value");
            for (int i = 1; i <= 100; i++) {
                total = total + i;
            }
            System.out.println(Thread.currentThread().getName() + " trying to notifyAll");

            // Notify all threads waiting on this object
            this.notify();  
        }

        try {
            Thread.sleep(10000);  // Simulate some processing time after notifying
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " run method execution completed");
    }
}
