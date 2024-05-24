package gfg;

import java.util.Arrays;

public class MaxCircularSUmSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,-3,-2,6,-1,4};
		System.out.println(circularMaxSubArray(arr));

	}

	public static int circularMaxSubArray(int[] arr)
	{
		//1. negate
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=arr[i]*-1;
		}
		//2 calculate sum fo array
		int SumOfArray=Arrays.stream(arr).sum();
		// 3 find max sum sub array for normal array using kadane algo
		int maxSubarray=maxSubArrayKadane(arr);
		
		//4 compute -(sumofarray-sumofsybarrayofnormalarray)
		return -(SumOfArray-maxSubarray);
	}
	
    public static int maxSubArrayKadane(int[] a)//with wrap array sum subarray
{
    int csum=a[0];//currentSum
    int osum=a[0];//overallSum
    
    int startIndex=0;
    int endIndex=0;
    
    for(int i=1;i<a.length;i++){
        if(csum>=0){
            csum+=a[i];//current sum say let join in with previos train as current element has profit in joing them
    
            
        }else{
        csum=a[i];//otherwise they will make there own new train
        startIndex=i;
    }
    
    
    if(osum<csum)//every time current sum compare with overallsum if currentSum is greater than overallSum then update overallSum with currentSum
    {
        osum=csum;
        endIndex=i;
    }
    }

System.out.println(startIndex+" "+endIndex);//ttracking start index and maxidex of subarray;
return osum;
}


}
