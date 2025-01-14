import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HashMapSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  HashMap<String, Integer> hashMap = new HashMap<>();
	        hashMap.put("Apple", 5);
	        hashMap.put("Banana", 2);
	        hashMap.put("Orange", 8);
	        hashMap.put("Mango", 3);
	        
	       TreeMap<String,Integer> t=new TreeMap<>(hashMap); 
	       // Print sorted map
	        System.out.println("Sorted by keys: " + t);
	        
	        
	        List<Map.Entry<String,Integer>> list=new ArrayList(hashMap.entrySet());
	        list.sort(Map.Entry.comparingByValue());
	        
	        LinkedHashMap<String, Integer> lhp=new LinkedHashMap<>();
	        
	        for(Map.Entry<String, Integer> m:list)
	        {
	        	lhp.put(m.getKey(), m.getValue());
	        }
	        
	        System.out.println("Sorted by values: " + lhp);
		       
	        

	}

}

