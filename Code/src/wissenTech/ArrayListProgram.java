package wissenTech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A)fail fast
//		List<Integer> numbers = new ArrayList<>(Arrays.asList(1,24,-1,8,-3,0));
//		//will get concurrentModification Exeption as it is fail fast iteration
//		try {
//			
//			for (Integer i: numbers)
//			{
//				if(i<0) 
//					{
//						numbers.remove(i); 
//					}
//				
//			}
//
//		}catch(Exception e)
//		{
//			e.printStackTrace();
//		}
		
		
		
		//Fail safe
		List<Integer> numbers1 = new CopyOnWriteArrayList<>(Arrays.asList(1,24,-1,8,-3,0));
		//will not get concurrentModification Exeption as it is fail safe iteration
		for (Integer i: numbers1)
		{
			if(i<0) 
				{
				numbers1.remove(i); 
				}
			
		}
		numbers1.stream().forEach(System.out::println);
	
	
	}

}
