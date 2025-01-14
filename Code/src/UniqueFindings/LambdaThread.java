package UniqueFindings;
public class LambdaThread {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("Thread is running");
        };
        Thread thread = new Thread(runnable);
        thread.start(); // Starts the thread
    }
}
