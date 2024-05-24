package gfg;

public class LargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr={10,10,10};
		System.out.println(getLargest(arr,arr.length));
		System.out.println(getSecondLargest(arr,arr.length));

	}

	public static int getSecondLargest(int[] arr,int n)
	{
		int res=0;
		int secondLargestIndex=-1;
		for(int i=1;i<n;i++)
		{
			if(arr[i]>arr[res])
			{
				secondLargestIndex=res;
				res=i;
			}
			else if(arr[i]<arr[res])
			{
				if(secondLargestIndex==-1)
				{
					secondLargestIndex=i;
				}else if(arr[i]>arr[secondLargestIndex])
				{
					secondLargestIndex=i;
				}
			}
			
		}
		
		if(secondLargestIndex==-1)
			return -1;
		return arr[secondLargestIndex];
	}

	public static int getLargest(int[] arr,int n)
	{
		int res=0;
		for(int i=1;i<n;i++)
		{
			if(arr[i]>arr[res])
			{
				res=i;
			}
			
		}
		return arr[res];
	}
}
