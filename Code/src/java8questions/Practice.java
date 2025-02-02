package java8questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Practice {

	public static void main(String[] args) {
	//frequency of each char in String
		String str="Applle";
		System.out.println(str.chars().mapToObj(c->(char)c).
				collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
	
		
		//frequency of each String List
		List<String> list=Arrays.asList("abc","abc","dbc","sdf");
		list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
					
		
	//sort the list in reverse order;
		List<String> l=Arrays.asList("abc","wedss","ff");
		
		System.out.println(l.stream().sorted(Comparator.comparing(String::length).reversed()).collect(Collectors.toList()));
		
	//merge two arrays  in and sort them. distinct
		int[] a= {9,8,1,7};
		int[] b= {5,1,10};
		IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().forEach(System.out::println);
	
		String s="appa";
		IntStream.range(0, s.length()).noneMatch(i->s.charAt(i)!=s.charAt(s.length()-i-1));
	
		System.out.println("");
		System.out.println("How to find duplicate elements in a given integers list in java using Stream functions?");
	
		 List<Integer> myListInt = Arrays.asList(10,15,8,49,25,98,98,32,15);
		 HashSet<Integer> h=new HashSet<>();
		 myListInt.stream()
		 .filter(i->!h.add(i))
		 .forEach(System.out::println);
		 
		 System.out.println("Java 8 program to check if two strings are anagrams or not?");
			
		 String s1 = "RaceCar";
	     String s2 = "CarRaceq";
	    
	     s1=Stream.of(s1.split("")).map(ss->ss.toLowerCase()).sorted().collect(Collectors.joining());
	     s2=Stream.of(s2.split("")).map(ss->ss.toLowerCase()).sorted().collect(Collectors.joining());
			System.out.print(s1.equals(s2));
		
		System.out.println((Math.floor(Math.log10(Math.abs(10000))+1)));
		
		
		System.out.println("Reverse each word of a string using Java 8 streams?");
	    
	    String str1 = "Java Concept Of The Day";
	    System.out.println(Stream.of(str1.split(" ")).map(s3->new StringBuilder(s3).
	    		reverse()).collect(Collectors.joining(" ")));
	    
	    System.out.println("22) How do you find the most repeated element in an array?");
	    List<String> listOfStringsss = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil",
	    		"Pen", "Note Book", "Pencil");
	    System.out.println(listOfStringsss.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
	    .entrySet().stream().max(Map.Entry.comparingByValue()).get());
	  
	    System.out.println("Find first   repeated character in a string?");
	    String inputString1 = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
	    System.out.println(inputString1);
	    System.out.println(inputString1.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
	    .entrySet().stream().filter(c->c.getValue()>1).findFirst().get());
				

	    System.out.println(inputString1.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
	    .entrySet().stream().filter(c->c.getValue()==1).findFirst().get());
	}
	
	

}
