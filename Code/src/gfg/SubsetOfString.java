package gfg;

public class SubsetOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//all char will be unique in Strin :: assumed
		printSubStringPossible("abc","",0);

	}
	
	//input String
	//current initially called for ""
	//i for root level tracking// see tree structure
	//output pattrn will from leaft leaf node to roght node
	public static void printSubStringPossible(String str,String current,int i)
	{
		if(i==str.length()) {
			System.out.println(current);
			return ;
		}
		printSubStringPossible(str,current,i+1);//first half , dont include 
		printSubStringPossible(str,current+str.charAt(i),i+1);//first half , dont include 
		
	}

}
