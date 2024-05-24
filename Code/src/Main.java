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
		
	System.out.println(sum);
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
