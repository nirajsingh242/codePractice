package sortingAlo;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr= {1,2,3,9,5,4,6,0};
		insertionSort(arr);
		Arrays.stream(arr).forEach(System.out::print);
		}

	//always key will be in temp unless its place being found
	public static void insertionSort(int[] arr)
	{
		for(int i=1;i<arr.length;i++)
		{

				int key=arr[i];
				int j=i-1;
				
				while(j>=0 &&arr[j]>key)
				{
					arr[j+1]=arr[j];
					j--;
				}
				
				arr[j+1]=key;
		}
	}

	}

