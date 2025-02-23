package wissenTech;

import java.util.List;
//1) final class
public final class Person {
	
	
	//2) private final varibles
	
	private final String name; 
	private final Address add;
	private final List<String> degrees;
	public Person(String name, Address add, List<String> degrees) {
		super();
		this.name = name;
		//3) deep copy is required for any object
		//deeep copy  as shallow copy will give direct refecnce to actuall object
		Address newAddre =new Address(add.getAddressLine1(),add.getAddressLine2(),add.getPincode());
		this.add = newAddre;
		this.degrees = degrees;
	}
	
	//4) provided only getter, No setter to update instances 
	public String getName() {
		return name;
	}
	public Address getAdd() {
		return add;
	}
	public List<String> getDegrees() {
		return degrees;
	}
	
	
	
	

}
