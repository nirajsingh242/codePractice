package threadseExample;

public class ThreadJoinExample extends Thread{
	
	

	@Override
	public void run() {
	
		System.out.println("Thread execution starte "+this.getName());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread execution ended "+this.getName());
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadJoinExample t1= new ThreadJoinExample();
		t1.setName("thread 1");
		ThreadJoinExample t2= new ThreadJoinExample();
		t2.setName("thread 2");

		
		t1.start();
		t2.start();
		
		try {
			t2.join(); // Main thread waits for thread1 to finish
			 System.out.println("Thread 1 has finished.");
			 
			 t1.join(); // Main thread waits for thread2 to finish
	            System.out.println("Thread 2 has finished.");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 System.out.println("Main thread finished.");
		
	}

}
