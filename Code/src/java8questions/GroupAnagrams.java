package java8questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listString=Arrays.asList("abc","cba","pqr","rqp","cde");
		System.out.println("Using normal approach");
		groupAnagrams(listString);
		
		System.out.println("Using stream approach");
		System.out.println(listString.stream().collect(Collectors.groupingBy(word->{
			char[] c=word.toCharArray();
			Arrays.sort(c);
			return new String(c);
			
		})).values().stream().collect(Collectors.toList()));

	}

	
	private static void groupAnagrams(List<String> listString) {
		HashMap<String,List<String>> h=new HashMap<>();
		
		for(String s:listString)
		{
			char[] c=s.toCharArray();
			Arrays.sort(c);
			String sortedString=new String(c);
			
			h.computeIfAbsent(sortedString, k->new ArrayList<String>()).add(sortedString);
			
		}
		
		System.out.println(new ArrayList<>(h.values()));
	}
}
