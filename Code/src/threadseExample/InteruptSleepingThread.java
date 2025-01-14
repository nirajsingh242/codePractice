package threadseExample;

public class InteruptSleepingThread implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InteruptSleepingThread i=new InteruptSleepingThread();
		Thread t1=new Thread(i);
		t1.start();
		t1.interrupt();//it will get wsated if thread in not in waiting state in entire its life cycle or else it keep on waitiing for thread to in waiting state.
		System.out.print("main thread completed");

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<1000;i++)
		{
			System.out.println("Run method execution");
		}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Run method got interuupted");
				
			}
		
		
	}

}
