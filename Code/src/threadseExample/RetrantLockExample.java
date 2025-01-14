package threadseExample;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;
public class RetrantLockExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ReentrantLock l=new ReentrantLock();
    l.lock();
    l.lock();
    System.out.println(l.isLocked());
    System.out.println(l.isHeldByCurrentThread());
    System.out.println(l.getHoldCount());
    l.unlock();
    System.out.println(l.getHoldCount());
    System.out.println(l.isLocked());
    
    l.unlock();
    System.out.println(l.isLocked());
    System.out.println(l.isFair());
    
	}

}
