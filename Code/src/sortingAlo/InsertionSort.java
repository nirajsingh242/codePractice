package sortingAlo;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr= {1,2,3,9,5,4,6,0};
		InsertionSort(arr);
		Arrays.stream(arr).forEach(System.out::print);
		}

	private static void InsertionSort(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<arr.length;i++)
		{
			for(int j=i-1;j>=0;j--)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}else
				{
					// do nothing
				}
				
			}
			
		}
		
	}

	}

