
public class MajorityElementsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,4,4,4,4};
		int expectedmajortiyValue=majority(arr);
		if(isMajortiy(arr, expectedmajortiyValue))
		{
			System.out.println(expectedmajortiyValue);
		}else
		{
			System.out.println("No majority Element found");
		}

	}

	public static int majority(int[] arr)
	{
	int majorityIndex=0;
	int count=1;
	
	for(int i=1;i<arr.length;i++)
	{
		if(arr[i]==arr[majorityIndex])
		{
			count++;
		}else
		{
			count--;
		}
		
		if(count==0)
		{
			majorityIndex=i;
			count=1;
			
		}
	}
		return arr[majorityIndex];
	
	}

	public static boolean isMajortiy(int[] arr,int majority)
	{
		System.out.println("Majority check called");
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==majority)
				count++;
			if(count>arr.length/2)
				return true;
		}
		return false;
	}
}
