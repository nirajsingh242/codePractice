package gfg;

public class MaxSubArrayWithSizeKUsingSlidingWIndow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,8,30,-5,20,7};
		int[] arr1 = {5,-10,6,90,3};
		int n=arr1.length;
		int k=2;
		System.out.println(getKSizeSubArraySumMax(arr1,n,k));
		System.out.println(getKSizeSubArrayWithGiveSome(arr1,n,k,96));
		
		

	}
public static int getKSizeSubArraySumMax(int[] arr,int n,int k)
{
	int curr=0;
	
	for(int i=0;i<k;i++)
	{
		curr+=arr[i];
	}
	int res=curr;
	for(int i=k;i<n;i++)
	{
		curr=curr+arr[i]-arr[i-k];
		res=Math.max(res,curr);	
	}
	
	return res;
}

public static boolean getKSizeSubArrayWithGiveSome(int[] arr,int n,int k,int sum)
{
	int curr=0;
	
	for(int i=0;i<k;i++)
	{
		curr+=arr[i];
	}
	int res=curr;
	for(int i=k;i<n;i++)
	{
		curr=curr+arr[i]-arr[i-k];
		res=Math.max(res,curr);
		if(res==sum)
			return true;
	}
	
	return false;
}

}
