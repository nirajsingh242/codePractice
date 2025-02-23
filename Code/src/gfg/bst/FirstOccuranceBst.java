package gfg.bst;

public class FirstOccuranceBst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,2,5,8};
		int toFindXFirstIndex=0;
		System.out.println("Recursive");
		int fisrtIndexOfX=firstOccuranceRecursive(arr,0,arr.length-1,toFindXFirstIndex);
		System.out.println("first Index of x is "+fisrtIndexOfX+" "+(fisrtIndexOfX!=-1?arr[fisrtIndexOfX]:" x is not found"));
		
		System.out.println("Iterative");
		int toFindXFirstIndexi=9;
		
		int fisrtIndexOfXi=firstOccuranceIterative(arr,arr.length-1,toFindXFirstIndexi);
		System.out.println("first Index of x is "+fisrtIndexOfXi+" "+(fisrtIndexOfXi!=-1?arr[fisrtIndexOfXi]:" x is not found"));
		

	}

	
	public static int firstOccuranceRecursive(int[] arr,int low,int high, int x)
	{
		if(low>high)
		{
			return -1;
		}
		
		int mid=(low+high)/2;
		
		if(arr[mid]>x)
		{
			return firstOccuranceRecursive(arr, low, mid-1, x);
		}else if(arr[mid]<x)
		{
			return firstOccuranceRecursive(arr, mid+1, high, x);
		}else
		{
			if(mid==0 || arr[mid-1]!=arr[mid])
			{
				return mid;
			}else
			{
				return firstOccuranceRecursive(arr, low, mid-1, x);
			}
		}
		
	}
	
	// we can also get index of last occuracnce 
	//just changing the else condtion accordigly

	//recursive:
//	else
//	{
//		if(mid==n-1 || arr[mid+1]!=arr[mid])
//		{
//			return mid;
//		}else
//		{
//			return firstOccuranceRecursive(arr, mid+1, high, x);
//		}
//	}
	
	
	
	public static int firstOccuranceIterative(int[] arr,int n, int x)
	{
		int low=0;
		int high=n-1;
		
		while(low<high)
		{
			int mid=(low+high)/2;
			
			if(arr[mid]>x)
			{
				high=mid-1;
			}else if(arr[mid]<x)
			{
				low=mid+1;
			}else
			{
				if(mid==0 || arr[mid-1]!=arr[mid])
				{
					return mid;
				}else
				{
					high=mid-1;
				}
			}
			
		}
		
		return -1;
		
	}
	
	// we can also get index of last occuracnce 
	//just changing the else condtion accordigly

	//itereative:
//	else
//	{
//		if(mid==n-1 || arr[mid+1]!=arr[mid])
//		{
//			return mid;
//		}else
//		{
//			low=mid+1;
//		}
//	}
	
	
	
	
}
