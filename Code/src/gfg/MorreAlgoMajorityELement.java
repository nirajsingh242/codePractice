package gfg;

import java.util.HashMap;
import java.util.Map;

public class MorreAlgoMajorityELement {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4};//{7,2,7,3,7,2,7,7};
//		int majority=getMajorityElement(arr);
//		System.out.println("Majority Element "+majority);
		int index=getMajorityElementIndexMOore(arr);
		if(isMajorrity(arr,index))
			System.out.println("Majority Element "+arr[index]);
		else
			System.out.println("No Majority Element ");

	}
	private static int getMajorityElement(int[] arr) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			Integer response=map.putIfAbsent(arr[i], 1);
			if(response!=null)
			{
				map.computeIfPresent(arr[i], (k,v)->v+1);
			}
		}
		
		
		for(Map.Entry<Integer, Integer> m :map.entrySet())
		{
			if(m.getValue()>arr.length/2)
			{
				return m.getKey();
				
			}
		}
		return -1;
	}
	
	public static int getMajorityElementIndexMOore(int[] arr)
	{
		int majorityIndex=0;
		int count=1;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[majorityIndex]==arr[i])
			{
				count++;
			}else
			{
				count--;
			}
			
			if(count==0)
			{
				majorityIndex=i;
				count++;
			}
		}
		return majorityIndex;
	}
public static boolean isMajorrity(int[] arr,int majorityIndex )
{
 boolean flag=false;
 
 int majorityvalue=arr[majorityIndex];
 int count=0;
 for(int i=0;i<arr.length;i++)
 {
	 if(majorityvalue==arr[i])
	 {
		 count++;
	 }
	 if(count>arr.length/2)
	 {
		 flag = true;
		 return flag;
	 }
 }
 return flag;
}
}
