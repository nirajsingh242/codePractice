
public class SpiralmatrixPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix={{1,2,3,3},
						{4,5,6,6},
						{7,8,9,9},
						{10,11,12,9}
					   };
		
		int top=0;
		int left=0;
		int right=matrix[0].length-1;
		int bottom=matrix.length-1;
		
		while(left<=right&&bottom>=top) {
	
		for(int i=left;i<=right;i++)
		{
			System.out.print(matrix[top][i]+", ");
		}
		System.out.println("");
		top++;
		for(int i=top;i<=bottom;i++)
		{
			System.out.print(matrix[i][right]+", ");
		}
		System.out.println("");
		right--;
		
		if(top<=bottom)
		{
		for(int i=right;i>=left;i--)
		{
			System.out.print(matrix[bottom][i]+", ");
		}
		System.out.println("");
		bottom--;
		}
		
		if(left<=right)
		{
		for(int i=bottom;i>=top;i--)
		{
			System.out.print(matrix[i][left]+", ");
		}
		left++;
		System.out.println("");
		}
		}
		

	}

}
