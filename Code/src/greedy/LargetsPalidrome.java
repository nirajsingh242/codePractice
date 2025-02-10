package greedy;

public class LargetsPalidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPalindrome("abccccdd"));

	}

	private static int longestPalindrome(String string) {
		// TODO Auto-generated method stub
		int[] arr=new int[128];
		
		for(char c:string.toCharArray())
		{
			arr[c]++;
		}
		int longestPalindromeLen=0;
		boolean odd=false;
		for(int i=0;i<128;i++)
		{
			if(arr[i]%2==0)
			{
				longestPalindromeLen=longestPalindromeLen+arr[i];
			}
			else
			{
				longestPalindromeLen=longestPalindromeLen+arr[i]-1;
				odd=true;
			}
				
			
		}
		if(odd) {
			longestPalindromeLen=longestPalindromeLen+1;
		}
		
		return longestPalindromeLen;
	}

//	public static int longestPalindrome(String s) {
//
//		if(s.length()==1)
//		return 1;
//		        for(int i=0;i<s.length()/2;i++)
//		        {
//		            if(isPalindrome(s.substring(i,s.length()-i)))
//		            return s.length();
//
//		        }
//		        return 0;
//		        
//		    }
//
//		    public static boolean isPalindrome(String str)
//		    {
//		        StringBuilder s=new StringBuilder(str);
//		        return s.reverse().toString().equals(str);
//		    }
}
