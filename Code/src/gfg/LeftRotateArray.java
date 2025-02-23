package gfg;

import java.util.Arrays;

public class LeftRotateArray {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6};
		int d=2;
		printArray(arr,"Original array before "+d+" rotaion");
		
		leftROtate(arr,3);
		
		printArray(arr,"Left rotate Changed array after "+d+" rotaion");
		
		rightROtate(arr,d);
		
		printArray(arr,"Right rotate Changed array after "+d+" rotaion");
		
	}

	
	public static void leftROtate(int[] arr,int d)
	{
		for(int i=1;i<=d;i++)
		{
			int temp=arr[0];
			
			for(int j=1;j<arr.length;j++)
			{
				arr[j-1]=arr[j];
			}
			arr[arr.length-1]=temp;
		}
	}
	
	public static void rightROtate(int[] arr,int d)
	{
		for(int i=1;i<=d;i++)
		{
			int temp=arr[arr.length-1];
			
			for(int j=arr.length-1;j>0;j--)
			{
				arr[j]=arr[j-1];
			}
			arr[0]=temp;
		}
	}
	
	
	public static void printArray(int[] arr,String msg)
	{
		System.out.println(msg);
		Arrays.stream(arr).forEach(e->System.out.print(e+" "));
		System.out.println(" ");
	}
}
