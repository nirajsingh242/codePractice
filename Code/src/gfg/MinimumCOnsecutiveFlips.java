package gfg;

public class MinimumCOnsecutiveFlips {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,0,1,1,0,0,1,1,0,1,1};
		printMinimumConsecutiveFlips(arr,arr.length);

	}

	public static void printMinimumConsecutiveFlips(int arr[],int n)
	{
		for(int i=1;i<n;i++)
		{
			if(arr[i]!=arr[i-1])
			{
				if(arr[i]!=arr[0])
				{
					System.out.print("fliping start from "+i );
				}else
				{
					System.out.println(" and fliping end at "+(i-1) );
				}
					
			}
			
		}
		
		if(arr[n-1]!=arr[0])
		{
			System.out.print("and ** fliping end at "+(n-1) );
		}
	}
	
}
