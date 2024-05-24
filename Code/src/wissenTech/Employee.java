package wissenTech;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public class Employee {       
    private long id;   
    private String name;   
    private Date dateOfBirth;    
    private BigDecimal salary;
    
    
    
	@Override
	public int hashCode() {
		return Objects.hash(dateOfBirth, id, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(dateOfBirth, other.dateOfBirth) && id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(salary, other.salary);
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", salary=" + salary + "]";
	}   
   
}