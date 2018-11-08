package bus;

public class SalariedEmployee extends Employee{

	double weeklySalary;
	
	public double CalculatePayment()
	{
		return weeklySalary * 4 * 12;
	}
	
	public SalariedEmployee()
	{
		super();
		weeklySalary = 0;
	}

	public SalariedEmployee(int id, String firstName, String lastName, EnumCategory employeeCategory, EnumGenda genda, double weeklySalary)
	{
		super(id, firstName, lastName, employeeCategory, genda);
		this.weeklySalary = weeklySalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
	public String toString() {
		
		return super.toString() + "\nWeekly Salary :" + this.getWeeklySalary() + "\nPayment : " + this.CalculatePayment();
	}
	
}
