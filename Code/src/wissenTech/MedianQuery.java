package wissenTech;

import java.util.ArrayList;
import java.util.List;

class Pair{
	int startIndex;
	int endIndex;
	public Pair(int startIndex,int endIndex)
	{
		this.startIndex=startIndex;
		this.endIndex=endIndex;
	}
}

public class MedianQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {2, 4, 5, 3, 1, 6};
		
		List<Pair> q=new  ArrayList<>();
		
		q.add(new Pair(1,6));
		q.add(new Pair(2,4));
		q.add(new Pair(3,3));
		
		
		//for every set of pair we need to calculate median
		for(Pair p:q)
		{
			System.out.println(""+getMedian(arr,p));
			
		}
		

	}
	private static int getMedian(int[] arr, Pair p) {
		// TODO Auto-generated method stub
		
		int[] sortedArray=mergeSort(arr,p.startIndex-1,p.endIndex-1);
		int sizeOFArrayMedianIndex=(sortedArray.length-1)/2;
		
		
		
		return sortedArray[sizeOFArrayMedianIndex];
	}
	
	
	public static int[] mergeSort(int[] arr,int low,int high)
	{
	    if(low==high)
	    {
	    	int[] base=new int[1];
	    	base[0]=arr[low];
	        return base;
	    }
	    
	    int mid=(low+high)/2;
	    
	   int[] sorted1 = mergeSort(arr,low,mid);
	   int[] sorted2 = mergeSort(arr,mid+1,high);
	   int[] finalsortedArray=merge(sorted1,sorted2);
	   return finalsortedArray;
	    
	}
	
	
	public static int[] merge(int [] leftArray,int[] rightArray)
    {
        int leftArraySize=leftArray.length;
        int righArraySize=rightArray.length;
        int[] finalArray=new int[leftArraySize+righArraySize];
        int i=0,j=0,k=0;//leftarray tracking , rightArray Tracking , inputArray tracking
        
        while(i<leftArraySize && j<righArraySize)
        {
            if(leftArray[i]>rightArray[j]){
                finalArray[k]=rightArray[j];
                k++;
                j++;
            }else{
                finalArray[k]=leftArray[i];
                k++;
                i++;
            }
        }
        
        while(i<leftArraySize)
        {
            finalArray[k]=leftArray[i];
            k++;
            i++;
        }
 
         while(j<righArraySize)
        {
            finalArray[k]=rightArray[j];
            k++;
            j++;
        }
            
            
            return finalArray;
    }

}
