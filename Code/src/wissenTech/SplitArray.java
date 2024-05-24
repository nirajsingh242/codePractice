package wissenTech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] original = {1,2,3,4,78,999,-1,456};
		List<Integer[]> listOfIntArray=new ArrayList<>();
		int chunk = 2; // chunk size to divide
		for(int i=0;i<original.length;i+=chunk){
		  //  System.out.println(Arrays.toString(Arrays.copyOfRange(original, i, Math.min(original.length,i+chunk))));
		
			listOfIntArray.add(Arrays.copyOfRange(original, i, Math.min(original.length,i+chunk)));
		}  

//for(Integer[] intArray:listOfIntArray)
//{
//	for(Integer val:intArray)
//	{
//		System.out.print(val+" ");
//	}
//	
//	System.out.println();
//}

	
	
	
	
	List<Integer> li=new ArrayList<>();
	li.add(1);
	li.add(2);
	li.add(3);
	li.add(4);
	li.add(5);
	li.add(6);
	li.add(7);
	li.add(8);
	
	
	li.parallelStream().peek(System.out::print).forEachOrdered(System.out::println);
	
	
	
	}

}
