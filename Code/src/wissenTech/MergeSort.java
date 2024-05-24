package wissenTech;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,3,7,42,1,2};
		int[] output= mergeSort(arr,0,arr.length-1);
		
		for(int a:output)
		{
			System.out.print(" "+a);
		}
	}

	private static int[] mergeSort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		if(low==high)
		{
			int[] base=new int[1];
			base[0]=arr[low];
			return base;
			
		}
		
		int mid=(low+high)/2;
		int[] lefthalf=mergeSort(arr,low,mid);
		int[] righthalf=mergeSort(arr,mid+1,high);
		
		return merge(lefthalf,righthalf);
		
	}

	private static int[] merge(int[] lefthalf, int[] righthalf) {
		// TODO Auto-generated method stub
		
		int i=0,j=0,k=0;
		int lefthalfArraySize=lefthalf.length;
		int righthalfArraySize=righthalf.length;
		int[] mergedArray=new int[lefthalfArraySize+righthalfArraySize];
		while(i<lefthalfArraySize && j<righthalfArraySize)
		{
			if(lefthalf[i]>righthalf[j])
			{
				mergedArray[k]=righthalf[j];
				j++;
				k++;
				
			}else
			{
				mergedArray[k]=lefthalf[i];
				i++;
				k++;
			
			}
		}
		while(i<lefthalfArraySize)
		{
			mergedArray[k]=lefthalf[i];
			i++;
			k++;
		
		}
		while(j<righthalfArraySize)
		{
			mergedArray[k]=righthalf[j];
			j++;
			k++;
		
		}
		return mergedArray;
	}

}
