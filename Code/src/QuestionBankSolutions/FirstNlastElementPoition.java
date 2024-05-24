package QuestionBankSolutions;
  class Pair{
	int firstIndex;
	int lastIndex;
}
public class FirstNlastElementPoition {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,3,5,8,9,9,9,22,33,55,66};
		System.out.println("Iterative");
		int x=9;
		
		Pair pair=getpair(arr,arr.length-1,x);
		System.out.println("first Index of "+x+" is "+pair.firstIndex+" "+(pair.firstIndex!=-1?arr[pair.firstIndex]:" x is not found"));
		System.out.println("last Index of "+x+" is "+pair.lastIndex+" "+(pair.lastIndex!=-1?arr[pair.lastIndex]:" x is not found"));
		

	}
	public static Pair getpair(int[] arr,int n, int x)
	{
		Pair p=new Pair();
		p.lastIndex = lastOccuranceIterative(arr,n,x);
		p.firstIndex = firstOccuranceIterative(arr, n, x);
		
		
		return p;
		
		
	}

	public static int lastOccuranceIterative(int[] arr,int n, int x)
	{
		int low=0;
		int high=n-1;
		
		while(low<=high)
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
				if(mid==n-1 || arr[mid+1]!=arr[mid])
				{
					return mid;
				}else
				{
					low=mid+1;
				}
			}
			
		}
		
		return -1;
		
	}
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


}
