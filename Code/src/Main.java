import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
public class Main {

	public static void main(String[] args) {
		//(int)Math.floor(Math.log10(n) + 1);
		
		String s="";
		int[] inputArray= {1,2,3,12,100,200,-400,9};
		int sum=0;
		for(int i=0;i<inputArray.length;i++) {
			if(checkThreeDigit(inputArray[i]))
			{
				sum+=inputArray[i];
			}
		}
		
		System.out.println(Math.floor(Math.log10(Math.abs(100))+1));
		
	System.out.println(sum);
	
	String string = "Item1 10 Item2 25 Item3 30 Item4 45";

	System.out.println(Math.abs(Arrays.stream(string.split(" "))
			.filter((x)->x.matches("\\d+")).mapToInt(Integer::valueOf).sum()));
	List<Integer> wallPositions = Arrays.asList(0, 2, 4, 6);
	List<Integer> wallHeights = Arrays.asList(1, 3, 2, 4);
	
	System.out.println(compute(wallPositions,wallHeights));
	}
	
public static int compute(List<Integer> wallPositions, List<Integer> wallHeights){
	int mud =0;	
	for(int i=0;i<wallPositions.size()-1;i++)
	{
		if(wallPositions.get(i) < wallPositions.get(i + 1) - 1)
		{
			int height=Math.abs(wallHeights.get(i+1)-wallHeights.get(i));
			int gap=wallPositions.get(i+1) - wallPositions.get(i) - 1;
			int temp=0;
			
			
			if(gap>height)
			{
				int count =Math.max(wallHeights.get(i), wallHeights.get(i+1))+1;
				int leftgap=gap-height-1;
				 temp=count+leftgap/2;
			}else
			{
				 temp=Math.min(wallHeights.get(i),wallHeights.get(i+1))+gap;
			}
			mud=Math.max(mud,temp);
			
		}
	}
		return mud;
	}
	
	public static boolean checkThreeDigit(int n)
	{
		/*
		 * int ans=0;
		 * 
		 * while(n!=0) { n=n/10; ans++; }
		 */
		//return ans==3?true:false;
		return (int)Math.floor(Math.log10(Math.abs(n)) + 1)==3?true:false;
		
	}

	

}
