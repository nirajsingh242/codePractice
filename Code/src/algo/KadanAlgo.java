package algo;

public class KadanAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		 int arr[] = { 12, -11, 5, 5, 6, -28 };
         //calling maxSubarraySum() function
         System.out.println(maxSubArray(arr));

	}

	
	public static int maxSubArray(int[] arr)
	{
		int csum=arr[0];//current sum
		int osum=arr[0];//overall sum
		
		
		
		int startIndex=0;
		int endIndex=0;
		
		for(int i=1;i<arr.length;i++)
		{
			if(csum>0)
			{
				csum+=arr[i];
			}else
			{
				csum=arr[i];
				startIndex=i;
				
			}
			
			
			if(csum>osum)
			{
				osum=csum;
				endIndex=i;
				
			}
			
		}
		
		System.out.println(startIndex+" "+endIndex);//ttracking start index and maxidex of subarray;
		return osum;
		
	}
	

	

}
