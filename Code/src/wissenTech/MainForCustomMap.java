package wissenTech;

import java.util.HashMap;
import java.util.Map;

public class MainForCustomMap {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MapMethodCallCount<String, Integer> mmcc1 = new MapMethodCallCount<>(new HashMap<>());
		mmcc1.put("D", 6);
		mmcc1.put("y", 9);
		
		MapMethodCallCount<String, Integer> mmcc = new MapMethodCallCount<>(new HashMap<>());
		
		//psmd.put("A", null);
		mmcc.put("B", 2);
		mmcc.putIfAbsent("A", 4); 
		mmcc.putAll(mmcc1);
		
		System.out.println(" put count"+mmcc.getCountPut()+"");
		System.out.println(" put count"+mmcc.getCountPutAll()+"");
		System.out.println(" put count"+mmcc.getCountPutIfAbsent()+"");
		
		System.out.println(mmcc);
		
	// psmd.getCountPutAll() and psmd.getCountPutIfAbsent() 
	}

}
