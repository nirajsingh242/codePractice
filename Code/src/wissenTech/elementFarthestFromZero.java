package wissenTech;

import java.util.Arrays;
import java.util.Scanner;

public class elementFarthestFromZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner s =new Scanner(System.in);
//		int n=s.nextInt();
//		int[] arr = new int[n];
//		
//		for(int i = 0; i < n; i++)
//		{
//			arr[i] = s.nextInt();
//		}

		
		int[] a= {-1,5,-2,0,1,-5};
		System.out.println(findFarthest(a));
		System.out.println(findFarthestInON(a));
		
		
	}
	

	
	private static int findFarthest(int[] arr) {
	     int N = arr.length;
	     Arrays.sort(arr);
	     if (Math.abs(arr[0]) >= Math.abs(arr[N-1]))
	         return arr[0];
	     else
	         return arr[N-1];
	}
	
	private static int findFarthestInON(int[] arr) {
		int farthestDistanceIndex=-1;
		int res=0; 
		for(int i=0;i<arr.length;i++)
		{
			if(res<Math.abs(arr[i]))
			{
				res=Math.abs(arr[i]);
				farthestDistanceIndex=i;
			}
		}
		
		return farthestDistanceIndex==-1?farthestDistanceIndex:arr[farthestDistanceIndex];
	}
	
}
