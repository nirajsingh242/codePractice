package threadseExample;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(() -> {
            System.out.println("Thread is running");
        });
        executorService.shutdown(); // Gracefully shuts down the executor service
        
        //order of execution cannot be defined.
        
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 5; i++) {
            int taskId = i;
            executor.submit(() -> {
                System.out.println("Task " + taskId + " executed by " + Thread.currentThread().getName());
            });
        }
        executor.shutdown();
        //1)thready cylce not to manage
        //2)just assign job
        
        
        
        
    }
}
