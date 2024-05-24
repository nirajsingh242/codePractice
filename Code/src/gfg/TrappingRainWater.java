package gfg;

public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] arr={3,0,1,2,4};
		int[] arr= {4,3,2,1,4};
		//works for possible storage
		System.out.println(getWater(arr,arr.length));
		System.out.println(getMaxWater(arr,arr.length));
		

	}
	
	
	public static int getMaxWater(int[] arr,int n)
	{
		int largestIndex=getLargestIndex(arr,n);
		int secondlargestIndex=getSecondLargestIndex(arr,n);
		int res=Math.abs(largestIndex-secondlargestIndex);
		res=res*arr[secondlargestIndex];
		
		return res;
		
	}
	public static int getSecondLargestIndex(int[] arr,int n)
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
			}else if(arr[i]==arr[res])// for handling duplicate 
			{
				secondLargestIndex=i;
				//res=i;
			}
			
		}
		
		if(secondLargestIndex==-1)
			return n-1;
		return secondLargestIndex;
	}

	public static int getLargestIndex(int[] arr,int n)
	{
		int res=0;
		for(int i=1;i<n;i++)
		{
			if(arr[i]>arr[res])
			{
				res=i;
			}
			
		}
		return res;
	}

	//here blocks consider as water
		public static int getWater(int[] arr,int n)
		{
			int res=0;
			for(int i=1;i<n-1;i++)
			{
				int lmax=0;
				for(int j=0;j<i;j++)
				{
					lmax=Math.max(lmax, arr[j]);
				}
				
				int Rmax=0;
				for(int j=i+1;j<n;j++)
				{
					Rmax=Math.max(Rmax, arr[j]);
				}
				
				res	=res+(Math.min(lmax, Rmax)-arr[i]);
				
			}
			
			return res;
		}
		
}
