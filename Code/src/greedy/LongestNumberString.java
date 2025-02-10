package greedy;

import java.util.Arrays;

import gfg.LargestElementInArray;

public class LongestNumberString {

	public static void main(String[] args) {
	
		int[] a= {3,30,34,5,9};
		System.out.println(largestNumber(a));
		//Arrays
	}
	
	public static String largestNumber(int[] nums) {
		String[] arry=Arrays.stream(nums).mapToObj(String::valueOf).toArray(String[]::new);
		
		Arrays.sort(arry,(a,b)->((b+a).compareTo(a+b)));
		if(arry[0].equals("0"))
		{
			return "0";
		}
		return String.join("", arry);
		
	}

}
