package gfg;

import java.util.HashMap;
import java.util.Map;

public class ArrayElementFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={10,10,10,44,7,3,4,7};
		ArrayFuntions.printArray(arr, "Array");
		Map<Integer,Integer> frequencyOfElemnt=getfrequencyOfElemnt(arr);
		System.out.println(frequencyOfElemnt);
	
	}

	public static Map<Integer,Integer>  getfrequencyOfElemnt(int[] arr)
	{
	
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
				Integer returnn=map.putIfAbsent(arr[i],1);
				if(returnn!=null)
				{
					map.computeIfPresent(arr[i], (k,v)->v+1);

				}								
			
		}
		
		return map;
	}
}
