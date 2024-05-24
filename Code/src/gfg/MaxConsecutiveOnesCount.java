package gfg;

public class MaxConsecutiveOnesCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,0,1,1,1,1,0,1};
System.out.println(evenOddMaxSubArray_O_N(arr));
	}
	public static int maxConsecutiveOnesCount_O_N(int[] arr)
	{
		
		int res=0;
		int current=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1)
			{
				current++;
				res=Math.max(current, res);
				
			}else
			{
				current=0;
			}
			
		}
		return res;
	}

	public static int evenOddMaxSubArray_O_N(int[] arr)
	{
		
		int res=1;
		int current=1;
		
		for(int i=1;i<arr.length;i++)
		{
			if((arr[i]%2==0 && arr[i-1]%2!=0) || (arr[i-1]%2==0 && arr[i]%2!=0 ))
			{
				current++;
				res=Math.max(current, res);
				
			}else
			{
				current=1;
			}
			
		}
		return res;
	}


	public static int maxConsecutiveOnesCount(int[] arr)
	{//o(n2)
		int maxCOnsecutiveCount=0;
		for(int i=0;i<arr.length;i++)
		{
			int currentCount=0;
			for(int j=i;j<arr.length;j++)
			{
				if(arr[j]==1)
				{
					currentCount++;
				
				}else {
					break;
				}
				
			}
			maxCOnsecutiveCount=Math.max(maxCOnsecutiveCount, currentCount);
		}
		
		
		return maxCOnsecutiveCount;
	}
}
