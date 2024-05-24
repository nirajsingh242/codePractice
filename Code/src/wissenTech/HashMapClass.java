package wissenTech;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapClass {

	public static void main(String[] args) {
		
		//https://dzone.com/articles/things-to-keep-in-mind-while-using-custom-classes
		// TODO Auto-generated method stub
//		HashMap<Employee,String> employeeMap = new HashMap<Employee,String>();  
//
//	    Employee employee1 = new Employee();    
//	    employee1.setId(1);    
//	    employee1.setName("Sachin");    
//	    employee1.setDateOfBirth(new Date(1987,2,1));    
//	    employee1.setSalary(new BigDecimal(100000));    
//
//	    employeeMap.put(employee1,"India");    
//
//	    // Some Business logic    
//	    // In the second Operation I am updating the same employee with the newly initailized Employee Object
//	
//	
//	    Employee employee2 = new Employee();    
//	    employee2.setId(1);    
//	    employee2.setName("Sachin");    
//	    employee2.setDateOfBirth(new Date(1987,2,1));    
//	    employee2.setSalary(new BigDecimal(100000));  
//
//	    // Here we wanted to update the same Employee to Japan
//	    employeeMap.put(employee2,"Japan");    
//
//	    System.out.println(employeeMap); 
//	    // Output of this will be 2 as below
//
//	    /* 
//	        {Employee{id=1, name='Sachin', dateOfBirth=Tue Mar 01 00:00:00 IST 3887, salary=100000}=Japan, 
//	        Employee{id=1, name='Sachin', dateOfBirth=Tue Mar 01 00:00:00 IST 3887, salary=100000}=India}
//	    */
	
	//////////////////////////////////////
	    
		 HashMap<Employee,String> employeeMap = new HashMap<Employee,String>();  
		    Employee employee1 = new Employee();   
		    employee1.setId(1);   
		    employee1.setName("Sachin");   
		    employee1.setDateOfBirth(new Date(1987,2,1));   
		    employee1.setSalary(new BigDecimal(100000));
		    // Step 1
		    employeeMap.put(employee1,"India");   

		    for (Map.Entry<Employee, String> employeeStringEntry : employeeMap.entrySet()) {
		        System.out.println(employeeStringEntry.getKey().hashCode());   
		    }
		    
		 // Step 2
		    // Mutating the Employee Object
		    employee1.setName("Rahul");    

		    for (Map.Entry<Employee, String> employeeStringEntry : employeeMap.entrySet()) {
		        System.out.println(employeeStringEntry.getKey().hashCode());    
		    }
		    // The HashMap key is mutated and in the wrong bucket for that hashcode. 
		    // Step 3
		    System.out.println(employeeMap.get(employee1));    
		    // Returns null    

		    Employee employee2 = new Employee();   
		    employee2.setId(1);   
		    employee2.setName("Sachin");   
		    employee2.setDateOfBirth(new Date(1987,2,1));   
		    employee2.setSalary(new BigDecimal(100000));

		    System.out.println(employeeMap.get(employee2)); 
		    // Returns null
		    
		    //grouping and counting and sorted method in streams
		    
//		    List<Employee> emp=new ArrayList<>();
//		    emp.add(employee1);
//		    emp.add(employee2);
//		    emp.add(employee2);
//		    emp.stream().sorted((e1,e2)->e1.getSalary().compareTo(e2.getSalary())).forEach(System.out::println);
//		    Map<String, Long> mapEmpcount = emp.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.counting()));
//		    mapEmpcount.entrySet().stream().forEach(System.out::println);
	}

}
