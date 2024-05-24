package sortingAlo;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,5,4,6,0};
		SelectionSort(arr);
		Arrays.stream(arr).forEach(System.out::print);
		}

	private static void SelectionSort(int[] arr) {
		// TODO Auto-generated method stub
		// pushing lightest element first in every iteration , swapping will be done in last
		for(int i=0;i<arr.length-1;i++)
		{
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minIndex])
				{
					minIndex=j;
				}
				
				swap(arr, i, minIndex);
			}
		}
	}

	private static void swap(int[] arr, int i, int minIndex) {
		int temp=arr[minIndex];
		arr[minIndex]=arr[i];
		arr[i]=temp;
	}


	}


