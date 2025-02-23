package sortingAlo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HashMapSortingWays {

	public static void main(String[] args) {
		 Map<Integer, String> map = new HashMap<>();

	        // Add five key-value pairs to the map
		 map.put(10, "ten");
			map.put(4, "Date");
			map.put(5, "Elderberry");
			map.put(1, "Apple");
			map.put(2, "Banana");
			map.put(3, "Cherry");
			map.put(8, "berry");
			map.put(12, "kerry");
			map.put(3, "derry");
			map.put(99, "aerry");
			map.put(34, "perry");
	        
	        printMap(map,"raw map");
	       //SortByKeyUsingTreemap(map);
	        //SortByKeyUsingLinkedHashMap(map);
	        
	        SortByValueUsingLinkedHashMap1(map);
	       
	        
	}

	private static void SortByValueUsingLinkedHashMap(Map<Integer, String> map) {
		// TODO Auto-generated method stub
		
		List<Map.Entry<Integer, String>> entryList=new ArrayList<>(map.entrySet());
		Collections.sort(entryList,Comparator.comparing(Map.Entry::getValue));
		
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		
		for(Map.Entry<Integer, String> entry: entryList)
		{
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		printMap(sortedMap,"Sorting based on value using LinkedHashmap");
		
	}
	
	
	private static void SortByValueUsingLinkedHashMap1(Map<Integer, String> map) {
		
		List<Map.Entry<Integer, String>> l=new ArrayList<>(map.entrySet());
		Collections.sort(l,Comparator.comparing(Map.Entry::getValue));
		
		Map<Integer,String> result=new LinkedHashMap<>();
		for(Map.Entry<Integer, String> m:l )
		{
			result.put(m.getKey(), m.getValue());
		}
		printMap(result,"Sorting based on value using LinkedHashmap");
		
		
	}

	private static void SortByKeyUsingLinkedHashMap(Map<Integer, String> map) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> lhm=new LinkedHashMap<>();
		
		
		List<Integer> sortedKey=new ArrayList<>(map.keySet());
		Collections.sort(sortedKey);
		
		for(Integer key:sortedKey)
		{
			lhm.put(key, map.get(key));
		}
				
		printMap(lhm,"Sorting based on key using LinkedHashmap");
		
	}

	public static void SortByKeyUsingTreemap(Map<Integer,String> map)
	{
		TreeMap<Integer, String> tmap=new TreeMap<>(map);
		printMap(tmap, "Sorting based on key using Treemap");
		
	}
	
	public static void printMap(Map<Integer,String> map, String sortingTechnique)
	{
		System.out.println("\n"+sortingTechnique);
		System.out.println("...xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx....started print....xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx...");
		
		for(Map.Entry<Integer, String> entry: map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		System.out.println("...xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx....End....xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx...");
	}
	
	
}
