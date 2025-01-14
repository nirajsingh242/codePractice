package threadseExample;
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running "+Thread.currentThread().getName() );
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        myRunnable.run();
        Thread thread = new Thread(myRunnable);
        thread.setPriority(10);
        thread.start(); // Starts the thread
        //thread.setName("hello");
       System.out.println("main thread name "+Thread.currentThread().getName() );
        
    }
}
