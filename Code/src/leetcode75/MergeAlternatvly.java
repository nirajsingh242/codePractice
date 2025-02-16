package leetcode75;

public class MergeAlternatvly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(mergeAlternately("abc","pqr"));
	}
	
	public static String mergeAlternately(String word1, String word2) {


        char[] c1=word1.toCharArray();
        char[] c2=word2.toCharArray();

        StringBuilder s=new StringBuilder();
        int i=0;
        int j=0;
        while(i<c1.length && j<c2.length)
        {
            s.append(c1[i]+"");
            s.append(c2[j]+"");
            i++;
            j++;
        }

           while(i<c1.length)
        {
            s.append(c1[i]+"");
            
            i++;
           
        }
           while(j<c2.length)
        {
            s.append(c2[j]+"");
            
            j++;
           
        }

       return s.toString();
        
    }

}
