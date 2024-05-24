package gfg;

public class RecursionMain {

	public static void main(String args[])
	{
		int no=1234;
		System.out.print("Sum of No "+SumOfDigitGFG(no));
	}
	
	

	
	//my approach
	public static int SumOfDigit(int no) {
		if(no<=9)//in last call it will definetly come as zero and this was best as per gfg video
		{
			return no;
		}
		return no%10+SumOfDigit(no/10);
	}
	
	//gfg approach
	public static int SumOfDigitGFG(int no) {
		if(no==0)
		{
			return no;
		}
		return no%10+SumOfDigitGFG(no/10);
	}
	
}
