package gfg;

import java.util.Arrays;
import java.util.Collections;

public class ArrayFuntions {
	public static void printArray(int[] arr,String msg)
	{
		System.out.println(msg);
		Arrays.stream(arr).sorted().forEach(e->System.out.print(e+" "));
		System.out.println(" ");
	}

	
	
}
