package wissenTech;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadExp2InstanceAndClasslevelLockOtherSimpleOption {
	
	//here no synchronized keyword required
	// no static keyword reqired
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	
		 	B o1 = new B();
	        B o2 = new B();
	        
	        
	        MyThread1 t1=new MyThread1(o1, "T1 thread with O1 object");
	        MyThread1 t2=new MyThread1(o2, "T2 thread with O2 object");
	        
	        t1.start();
	        t2.start();
	        
	        
	}
	
	

}
class MyThread1 extends Thread 
{
	B o;
	String name;

	MyThread1(B o,String name)
	{
		this.o=o;
		this.name=name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread.currentThread().setName(name);
			o.m1();
	}
	
}

class B{
	
	ReentrantLock l=new ReentrantLock();
	
		 public   void m1()
		 {
			 l.lock();
			 System.out.println("hold count  "+l.getHoldCount()+"  Ouequ  "+l.getQueueLength());
		 try {
			Thread.sleep(5000);
			System.out.println("Thread name "+Thread.currentThread().getName()+" priority : "+Thread.currentThread().getPriority() );
		
		 } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 l.unlock();
		 } 
		 
		 } 

