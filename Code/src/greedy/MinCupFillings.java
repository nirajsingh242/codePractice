package greedy;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MinCupFillings {

	public static void main(String[] args) {
		//Minimum Amount of Time to Fill Cups
//		Constraints:
//
//			amount.length == 3
//			0 <= amount[i] <= 100
		
		
//		You have a water dispenser that can dispense cold, warm, and hot water. Every second,
		//		you can either fill up 2 cups with different types of water, or 1 cup of any type of water.

//		You are given a 0-indexed integer array amount of length 3 where amount[0], amount[1], and amount[2] 
		//	denote the number of cold, warm, and hot water cups you need to fill respectively. Return the minimum number of seconds needed to fill up all the cups.
//

		
		//		Example 1:
//
//			Input: amount = [1,4,2]
//			Output: 4
//			Explanation: One way to fill up the cups is:
//			Second 1: Fill up a cold cup and a warm cup.
//			Second 2: Fill up a warm cup and a hot cup.
//			Second 3: Fill up a warm cup and a hot cup.
//			Second 4: Fill up a warm cup.
//			It can be proven that 4 is the minimum number of seconds needed.
//			Example 2:
		int[] amount1={1,4,2};
		System.out.println(fillCups(amount1));
		
//
//			Input: amount = [5,4,4]
//			Output: 7
//			Explanation: One way to fill up the cups is:
//			Second 1: Fill up a cold cup, and a hot cup.
//			Second 2: Fill up a cold cup, and a warm cup.
//			Second 3: Fill up a cold cup, and a warm cup.
//			Second 4: Fill up a warm cup, and a hot cup.
//			Second 5: Fill up a cold cup, and a hot cup.
//			Second 6: Fill up a cold cup, and a warm cup.
//			Second 7: Fill up a hot cup.
		int[] amount={5,4,4};
		System.out.println(fillCups(amount));
	
	
	}
	public  static int fillCups(int[] amount) {
	      
        PriorityQueue<Integer> p = new PriorityQueue<>(Comparator.reverseOrder());
        p.add(amount[0]);
        p.add(amount[1]);
        p.add(amount[2]);

int count=0;
        while(p.size()>0)
        {
        	  int m1=0;
              int m2=0;
           if(p.size()>0)
                m1=p.poll();
           
             if(p.size()>0)   
                m2=p.poll();
             
           if(m1>0 || m2>0)
           {
                   count++;
           }
               m1--;
               m2--;
               if(m1>0)
               {
                   p.add(m1);
               }
               if(m2>0)
               {
                   p.add(m2);
               }
        }

        return count;
       
   }
}
