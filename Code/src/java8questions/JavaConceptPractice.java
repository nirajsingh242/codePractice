package java8questions;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaConceptPractice {

	public static void main(String[] args) {

		 
		 System.out.println("//3) How do you find frequency of each character in a string using Java 8 streams?");
		 String inputString = "Java Concept Of The Day";
		 Map<Character, Long> collect = inputString.chars().
				 mapToObj(c->(char)c).filter(c->!c.toString().trim().equals("")).
				 collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 collect.entrySet().stream().forEach(System.out::println);
		 
		 System.out.println("How do you find frequency of each element in an array or a list?");
		 List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
		 
		 Map<String, Long> collect2 = stationeryList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 collect2.entrySet().stream().forEach(System.out::println);
		 
		 System.out.println("How do you sort the given list of decimals in reverse order?");
		 List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
		 decimalList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
		 
		 System.out.println(" Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?");

		 List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
		 String joinedString=listOfStrings.stream().collect(Collectors.joining(", ", "[", "]"));
		 System.out.println(joinedString);
		 
		 System.out.println("8) Given a list of integers, find maximum and minimum of those numbers?");
		  List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		  System.out.println("Maximum Element : "+listOfIntegers.stream().max(Comparator.naturalOrder()).get());
		  System.out.println("Maximum Element : "+listOfIntegers.stream().min(Comparator.naturalOrder()).get());
		  
		  
		  System.out.println("9) How do you merge two unsorted arrays into single sorted array using Java 8 streams?");
		  
		  int[] a = new int[] {4, 2, 5, 1};
	      int[] b = new int[] {8, 1, 9, 5};
	      int[] array = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
		  System.out.println(Arrays.toString(array));
		  
//		   List<Integer> list1 = Arrays.asList(5, 3, 9, 1, 7);
//	        List<Integer> list2 = Arrays.asList(8, 2, 3, 7, 6);
//	        List<Integer> list3 = Arrays.asList(4, 5, 9, 1, 10);
//
//	        List<Integer> mergedList = Stream.of(list1, list2, list3)
//	                .flatMap(List::stream)
//	                .distinct()
//	                .sorted()
//	                .collect(Collectors.toList());
//
//	        System.out.println(mergedList);
		  
		  
		  System.out.println("11) How do you get three maximum numbers and three minimum numbers from the given list of integers?");
		  List<Integer> listOfIntegerss = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
	         
	        //3 minimum Numbers
	         
	        System.out.println("-----------------");
	         
	        System.out.println("Minimum 3 Numbers");
	         
	        System.out.println("-----------------");
	         
	        listOfIntegerss.stream().sorted().limit(3).forEach(System.out::println);
	         
	        //3 Maximum Numbers
	         
	        System.out.println("-----------------");
	         
	        System.out.println("Maximum 3 Numbers");
	         
	        System.out.println("-----------------");
	         
	listOfIntegerss.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
	
	System.out.println("Java 8 program to check if two strings are anagrams or not?");
	
	 String s1 = "RaceCar";
     String s2 = "CarRace";
      
     String collect3 = Stream.of(s1.split("")).map(s->s.toUpperCase()).sorted(Comparator.naturalOrder()).collect(Collectors.joining());
     String collect4 = Stream.of(s2.split("")).map(s->s.toUpperCase()).sorted(Comparator.naturalOrder()).collect(Collectors.joining());
	if(collect3.equals(collect4))
	{
		  System.out.println("Two strings are anagrams");
	}else
	{
		System.out.println("Two strings are not anagrams");
	}

	
	
	
	
	System.out.println("Find sum of all digits of a number in Java 8?\r\n"
			+ "\r\n"
			+ "");
	
	 int i = 15623;
	 Stream.of(String.valueOf(i).split("")).collect(Collectors.summarizingInt(Integer::parseInt));
	 
	 
	 System.out.println("Find second largest number in an integer array?");
	 List<Integer> listOfIntegersss = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
	 Integer integer = listOfIntegersss.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	 System.out.println("second highest no :"+integer);
	 
	 System.out.println(" Given a list of strings, sort them according to increasing order of their length?");
	 
	 List<String> listOfStringss = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
	 List<String> collect5 = listOfStringss.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
	System.out.println(collect5);
	
	System.out.println("17) How do you find common elements between two arrays?");
	List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
    
    List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
    list1.stream().filter(list2::contains).forEach(System.out::println);
    
    System.out.println("Reverse each word of a string using Java 8 streams?");
    
    String str = "Java Concept Of The Day";
    
    System.out.println(Stream.of(str.split(" ")).map(word->new StringBuffer(word).reverse()).collect(Collectors.joining(" ")));
	
	
    
    
    System.out.println("22) How do you find the most repeated element in an array?");
    List<String> listOfStringsss = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
    Map<String, Long> collect6 = listOfStringsss.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    Entry<String, Long> entry = collect6.entrySet().stream().max(Map.Entry.comparingByValue()).get();
    System.out.println(entry);
    
    System.out.println("Palindrome program using Java 8 streams");
    
    String str1 = "ROTATOR";
    boolean palindrome = IntStream.range(0, str1.length()/2).
    noneMatch(j->str1.charAt(j)!=str1.charAt(str1.length()-1-j));
    if(palindrome)
    {
    	System.out.println(palindrome);
    }
    
    System.out.println("Find first repeated character in a string?");
    String inputString1 = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
    LinkedHashMap<String, Long> collect7 = Stream.of(inputString1.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
    Entry<String, Long> entry2 = collect7.entrySet().stream().filter(k->k.getValue()>1).findFirst().get();
    System.out.println("ans : "+entry2);
    
    
    System.out.println("Find first non-repeated character in a string?");
    Entry<String, Long> entry3 = collect7.entrySet().stream().filter(k->k.getValue()==1).findFirst().get();
    System.out.println("ans : "+entry3);
    
    
    System.out.println("Fibonacci series");
    
    LocalDate birthDay = LocalDate.of(1991, 01, 8);
    LocalDate today = LocalDate.now();
     
    System.out.println(ChronoUnit.YEARS.between(birthDay, today));
	}

}
