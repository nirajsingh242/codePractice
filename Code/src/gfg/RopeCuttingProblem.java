package gfg;

public class RopeCuttingProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxRopeLengthCutPossible(9,2,2,2));

	}

	public static int maxRopeLengthCutPossible(int n,int a,int b, int c)
	{
		if(n==0)
			return 0;
		else if(n<0)
			return -1;
		
		int res= max(maxRopeLengthCutPossible(n-a,a,b,c),
					 maxRopeLengthCutPossible(n-b,a,b,c),
					 maxRopeLengthCutPossible(n-c,a,b,c));
		
		if(res==-1)
			return -1;
		else
			return res+1;
			
	}
	
	public static int max(int i,int j, int k)
	{
		return i>j?(i>k?i:k):(j>k?j:k);
	}
}
