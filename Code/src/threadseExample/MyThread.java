package threadseExample;
public class MyThread extends Thread {
	 @Override
	    public void run() {
	        System.out.println("Thread is running");
	    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start(); // Starts the thread
      }
}
