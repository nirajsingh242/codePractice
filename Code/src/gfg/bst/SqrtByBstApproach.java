package gfg.bst;

public class SqrtByBstApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(getSqroot(24));

	}

	public static int getSqroot(int x)
	{
		int low = 1;
		int high = x;
		int ans =-1;
		
		
		
		while(low<=high)
		{
			int mid = (low + high)/2;
			int midSq=mid*mid;
			if(midSq==x)
			{
				return mid;
			}
			
			else if(midSq>x)
			{
				high=mid-1;
			}
			else {
				low = mid +1;
				ans= mid;
			}
		}
		
		return ans;
		
	}
}
