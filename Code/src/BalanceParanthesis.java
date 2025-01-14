
public class BalanceParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String balancedParanthesis="({[]})";
		String unBalancedParanthesis="({[])";
		
		System.out.print(checkBalancedParanthesisPractice(balancedParanthesis));
		System.out.print(checkBalancedParanthesisPractice(unBalancedParanthesis));
		

	}

	private static boolean checkBalancedParanthesis(String balancedParanthesis) {
		// TODO Auto-generated method stub
		int i=-1;
		char[] stack=new char[balancedParanthesis.length()];

		for(char ch: balancedParanthesis.toCharArray())
		{
			if(ch=='(' || ch=='[' || ch=='{')
			{
				stack[++i]=ch;
			}else
			{
				if((stack[i]=='(' && ch==')') || (stack[i]=='[' &&ch==']') || (stack[i]=='{' &&ch=='}'))
				{
					i--;
				}else
				{
					return false;
				}
				
			}
			
			
		}
		return i==-1;
		
	}
	
	public static boolean checkBalancedParanthesisPractice(String str)
	{
		
		int i=-1;
		
		char[] stack=new char[str.length()-1];
		
		for(char c:str.toCharArray())
		{
			if(c=='(' || c=='{' || c=='[')
			{
				stack[++i]=c;
			}else
			{
				if((stack[i]=='(' && c==')') || (stack[i]=='[' && c==']') || (stack[i]=='{' && c=='}'))
				{
					i--;
				}else
				{
					return false;
				}
			}
		}
		
		return i==-1;
		
	}
	
}
