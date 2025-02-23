package gfg;

public class PossibleStringPermurtation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPermutation("ABC",0);

	}

	
	public static void printPermutation(String str,int i)
	{
		if(i==str.length()-1)
		{
			System.out.println(str);
			return;
		}
		
		for(int j=i;j<str.length();j++)
		{
			String strSwaped=swapString(str,i,j);
			printPermutation(strSwaped,i+1);
			swapString(strSwaped,j,i);
			
		}
		
	}


	private static String swapString(String str, int i, int j) {
		// TODO Auto-generated method stub
		char[] charArray=str.toCharArray();
		char temp=charArray[i];
		charArray[i]=charArray[j];
		charArray[j]=temp;
		
		return new String(charArray);
	}
}
