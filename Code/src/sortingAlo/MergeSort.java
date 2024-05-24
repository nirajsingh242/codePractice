package sortingAlo;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={6,5,4,3,2,1};
		mergeSort(array,array.length);
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}

	private static void mergeSort(int[] array, int length) {
		// TODO Auto-generated method stub
		if(array.length<2)
		{
			return;
		}else {
			
			int mid=length/2;
			int[] larray=Arrays.copyOfRange(array, 0, mid);
			int[] rarray=Arrays.copyOfRange(array, mid,length);
			mergeSort(larray,mid);
			mergeSort(rarray,length-mid);
			
			merge(array,larray,rarray);
			
		}
		
	}

	private static void merge(int[] array, int[] larray, int[] rarray) {
		// TODO Auto-generated method stub
		int i=0,j=0,k=0;
		
		int leftArraySize=larray.length;
		int rightArraySize=rarray.length;
		
		while(i<leftArraySize && j<rightArraySize)
		{
			if(larray[i]<rarray[j])
			{
				array[k++]=larray[i++];
			}else
			{
				array[k++]=rarray[j++];
			}
		}
		
		
		
		while(i<leftArraySize)
		{
				array[k++]=larray[i++];
		}
		
		
		while(j<rightArraySize)
		{
				array[k++]=rarray[j++];
		}
		
	}

}
