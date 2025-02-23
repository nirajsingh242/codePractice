package wissenTech;

public class ThreadExp1InstanceAndClasslevelLock {
//https://stackoverflow.com/questions/69536576/calling-synchronized-method-with-two-different-references-of-the-object-of-the-s
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	
		 A o1 = new A();
	        A o2 = new A();
	        
	        
	        MyThread t1=new MyThread(o1, "T1 thread with O1 object");
	        MyThread t2=new MyThread(o2, "T2 thread with O2 object");
	        
	        t1.start();
	        t2.start();
	        
	        
	        ///we our m1 method in instance method then code give expected outpu
//	        t1.start();
//	        try {
//				t1.join();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//	        t2.start();
//	        
	        
	        
	        
	}
	
	

}


class MyThread extends Thread 
{
	A o;
	String name;

	MyThread(A o,String name)
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

class A{
//A) synchronized method without static in object level lock
	//here there are three conditions
	//1)if one thread operates on same object , everything is fine
	//2)if more than 2 threads operating on same object, out is consistence , at a tym one will get chance to execute
	//3)if more than 2 thread operation in different object than , there will inconsistency as each thread will operate
	//differently differnt object separately(here below approach works)
	
//B) synchronized method with static in Class level lock 
	//if more than 2 thread operation in different object than , it will allow only one thread to operate on that method at
	//a time
	 public static synchronized void m1()
	 {
	 try {
		Thread.sleep(5000);
		System.out.println("Thread name "+Thread.currentThread().getName()+" priority : "+Thread.currentThread().getPriority() );
	
	 } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 } 
	 
	 } 
