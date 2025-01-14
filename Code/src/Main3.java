import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//fails fast
		//java.util.ConcurrentModificationException
		List<String> l=new ArrayList<>();
		l.add("A");
		l.add("B");
		
		ListIterator<String> iterate=l.listIterator();
		while(iterate.hasNext())
		{
			
			System.out.println(iterate.next());
			l.remove(0);
			
		}


	
	//fails safe
	//No java.util.ConcurrentModificationException
	CopyOnWriteArrayList<String> li=new CopyOnWriteArrayList<>();
	li.add("A");
	li.add("B");
	Iterator iteratorVals = li.iterator();
	
	while(iteratorVals.hasNext())
	{
		li.remove(1);
		System.out.println(iteratorVals.next());
		
	}

}
}
