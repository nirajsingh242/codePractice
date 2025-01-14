package threadseExample;

public class JoinThreadExample implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JoinThreadExample t=new JoinThreadExample();
		Thread thread=new Thread(t);
		
		thread.start();
		thread.setPriority(1);
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("main method thread "+i);
			//Thread.yield();
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			System.out.println("run method thread "+i);
		}
		

		
	}

}
