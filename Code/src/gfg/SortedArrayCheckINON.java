package gfg;

public class SortedArrayCheckINON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={10,10,2};
		System.out.println(isSOrted(arr));
		

	}

	public static boolean isSOrted(int[] arr)
	{
		for(int i=1; i<arr.length;i++)
		{
			if(arr[i]<arr[i-1])
			{
				return false;
			}
		}
		return true;
	}
}
