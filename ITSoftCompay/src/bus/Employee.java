package bus;

import java.util.Date;

public abstract class Employee implements IPayable{

	int    id;
	String firstName;
	String lastName;
	EnumCategory employeeCategory;
	EnumGenda genda;
	Employee(int id, String firstName, String lastName, EnumCategory employeeCategory, EnumGenda genda){
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeCategory = employeeCategory;
		this.genda = genda;
	}
	
	Employee()
	{
		this.firstName = "Undefined";
		this.lastName = "Undefined";
		this.employeeCategory = EnumCategory.UNDEFINED;
		this.genda = EnumGenda.UNDEFINED;		
	}
	
	public abstract double CalculatePayment();
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public EnumCategory getEmployeeCategory() {
		return employeeCategory;
	}

	public void setEmployeeCategory(EnumCategory employeeCategory) {
		this.employeeCategory = employeeCategory;
	}

	public EnumGenda getGenda() {
		return genda;
	}

	public void setGenda(EnumGenda genda) {
		this.genda = genda;
	}

	public String toString() {
		
		return "Category : " + this.getEmployeeCategory().GetName() + "\nFirst Name: " + this.getFirstName() + "\nLast Name : " + this.getLastName() + "\nGenda :" + this.getGenda().GetName();
	}

}
