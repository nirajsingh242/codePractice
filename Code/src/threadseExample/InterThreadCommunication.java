package threadseExample;

public class InterThreadCommunication {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ThreadB t=new ThreadB();
		t.start();
		
		//1 if my below line values requires from other thread execution, in this scenario it will always gives invalid result
		 //a main thread executed befor : 0;
		//ThreadB executed before main thread : correct output
		//if initial for some time threadb executed then main thread : we get intermeiate ans
		//System.out.println("Total :"+t.total);
		
		//2 we can use sleep to solve this problem
		//here the problem is, unnecessary waiting of thread for specied tym even thread execution completed
		//Thread.sleep(1);
		//System.out.println("Total :"+t.total);
		
		
		//3 we can use join
		//here is problem is if thread execution for total variable is completed and we have another 1000 line of code whoes output is not required for main thread
		//so performance will be degraded
		//t.join();
		//System.out.println("Total :"+t.total);
		Thread.sleep(100);
		//4 wait and notify solve all above problem, it requires synchronized
		synchronized (t) {
			System.out.println("Main thread tring to call wait method");
			
			t.wait();	
			//we can also use time bound passing time as parameter to counter problem where child thread never notified
			// there is another scenario where child thread completed and notified however main didnt call wait method till then, beacoue of which when main will call wait no one will be there to notified and it will wait forever
		}
		System.out.println("Total :"+t.total);
		

		
		


	}

}

 class ThreadB extends Thread
{
	 int total=0;
	 @Override
		public void run() {
	 
		synchronized (this) {
			 System.out.println("child thread started execution for value");
		 for(int i=1;i<=100;i++)
		 {
			 total=total+i;
		 }
		 System.out.println("child thread tring to notify");
			
		this.notify();
		}
		 //3 issue incanse of scenario 3
		 try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("run method execution completed");
	 }
	 
	 
}
