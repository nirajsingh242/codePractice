package gfg;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={8,10,2,3};
		System.out.println("Before Reverse");
		printArray(arr);
		
		reverseArray(arr);
		
		System.out.println("\nAfter Reverse");
		printArray(arr);
		
		
	}

	

	private static void reverseArray(int[] arr) {
		// TODO Auto-generated method stub
		
		int low=0;
		int high=arr.length-1;
		
		while(low<high)
		{
				int temp=arr[low];
				arr[low++]=arr[high];
				arr[high--]=temp;
		}
		
		
	}



	public static void printArray(int[] arr)
	{
		Arrays.stream(arr).forEach(System.out::print);
	}
}
