import java.util.Arrays;

public class MinCoinProblem {

	public static void main(String[] args) {
		 int[] coins = {9, 6, 5, 1};
	        int sum = 19;
	        
	        System.out.println(minCoins(coins,sum));

	}

	private static int minCoins(int[] coins,int sum) {
		// TODO Auto-generated method stub
		int[] dp=new int[sum+1];
		Arrays.fill(dp, sum+1);
		dp[0]=0;
		
		
		for(int i=1;i<=sum;i++)
		{
			for(int coin:coins)
			{
				if(i>=coin)
				{
				dp[i]=Math.min(dp[i], dp[i-coin]+1);
			
				}	
			}
		}
		
		if(dp[sum]==sum+1)
			return -1;
		else
			return dp[sum];
		
	}

}
