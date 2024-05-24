import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MainTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "niraj");
		map.put(2, "biraj");
		map.put(3, "siraj");
		
		Map<Integer, String> valueLHMap = new LinkedHashMap<>();
		 
		map.entrySet().stream().sorted(Map.Entry.comparingByValue())
		.forEachOrdered(e->valueLHMap.put(e.getKey(), e.getValue()));
		
		
		System.out.println("Foreachprdered");
		
		System.out.println(valueLHMap);
		List<Entry<Integer,String>> l = new LinkedList<>(map.entrySet());
	
		Comparator<Entry<Integer,String>> cmp= new Comparator<Entry<Integer,String>>() {

			@Override
			public int compare(Entry<Integer,String> o1, Entry<Integer,String> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue().toLowerCase());
			}
		};
		 Collections.sort(l,cmp);
		 
		// System.out.println(l);
		 
		 LinkedHashMap<Integer,String> lh=new LinkedHashMap<>();
		 
		 for(Entry<Integer,String> e:l)
		 {
			 lh.put(e.getKey(), e.getValue());
			 
		 }
		 
		 for(Entry<Integer,String> e:lh.entrySet())
		 {
			 //System.out.println(e.getKey()+" -> "+e.getValue());
				
			 
		 }

	}

}
