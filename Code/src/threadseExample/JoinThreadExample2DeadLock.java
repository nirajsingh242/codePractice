package threadseExample;

public class JoinThreadExample2DeadLock  implements Runnable {
	 static Thread mt;

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			JoinThreadExample2DeadLock.mt=Thread.currentThread();
			JoinThreadExample2DeadLock t=new JoinThreadExample2DeadLock();
			
			Thread thread=new Thread(t);
			
			thread.start();
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
			
			try {
				mt.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(int i=0;i<5;i++)
			{
				System.out.println("run method thread "+i);
			}
			

			
		}

}
