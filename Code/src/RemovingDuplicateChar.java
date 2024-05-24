import java.util.Arrays;
import java.util.HashSet;

public class RemovingDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//below code cn be used in
		//1) char[] duplication removing
		//2)String char duplication--> converting it to char[] and the sam process
		
		char[] str={'a','b','c','c','d','d','e'};
		removeDuplicateCharBetter(str);
		
		//System.out.print(removeDuplicateChar(str,str.length));
		
		
		
		
	}
	
	public static void removeDuplicateCharBetter(char[] str)
	{
		HashSet<Character>  charset = new HashSet<Character>();
		
		for(char c: str)
		{
			charset.add(c);
			
		}
		
		for(Character  character: charset)
		{
			System.out.println(character);
		}
		
		
	}
	
	public static char[] removeDuplicateChar(char[] str,int n)
	{
		//for tracking output in currurent char[] overwite
		int index=0;
		
		
		for(int i=0;i<n;i++)
		{
			//below for loop to track current char already pritneted or not .
			//if printed , it will break
			int j;
			for(j=0;j<i;j++)
			{
				if(str[i]==str[j])
				{
						break;
				}
					
			}
			
			//if not printed means i==j as j will start from check till below its own postion
			if(i==j)
			{
				str[index++]=str[i];
			}
			
			
			
		}
		
		return Arrays.copyOf(str, index);
	}

}
