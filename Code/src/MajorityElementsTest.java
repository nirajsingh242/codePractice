import java.util.HashMap;
import java.util.Map;

public class MajorityElementsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,4,4,4,4};
		//majorityMap(arr);
		int expectedmajortiyValue=mooresAlgo(arr);
		if(isMajortiy(arr, expectedmajortiyValue))
		{
			System.out.println(expectedmajortiyValue);
		}else
		{
			System.out.println("No majority Element found");
		}

	}
	
	public static void majorityMap(int[] arr)
	{
		Map<Integer,Integer> map=new  HashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(map.get(arr[i])==null)
			{
				map.put(arr[i], 1);
			}else
			{
				map.computeIfPresent(arr[i], (k,v)->v+1);
			}
		}
		
		for(Map.Entry<Integer, Integer> e:map.entrySet())
		{
			if(e.getValue()>arr.length/2)
			{
				System.out.println("majority element from map "+e.getKey());
			}
		}
	}
	
	public static int mooresAlgo(int[] arr)
	{
		int elementIndex=0;
		int count=1;
		
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]==arr[elementIndex])
			{
				count++;
			}else
			{
				count--;
			}
			
			if(count==0)
			{
				elementIndex=i;
				count=1;
			}
		}
		
		return arr[elementIndex];
		
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
