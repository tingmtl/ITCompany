package bus;

public class HourlyEmployee extends Employee{

	double hoursPerWeek;
	double hoursRate;
	
	public double CalculatePayment()
	{
		return hoursPerWeek * hoursRate * 4 * 12;
	}
	
	public HourlyEmployee()
	{
		super();
		hoursPerWeek = 0;
		hoursRate = 0;
	}

	public HourlyEmployee(int id, String firstName, String lastName, EnumCategory employeeCategory, EnumGenda genda, double hoursPerWeek, double hoursRate)
	{
		super(id, firstName, lastName, employeeCategory, genda);
		this.hoursPerWeek = hoursPerWeek;
		this.hoursRate = hoursRate;
	}

	public double getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(double hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	public double getHoursRate() {
		return hoursRate;
	}

	public void setHoursRate(double hoursRate) {
		this.hoursRate = hoursRate;
	}

	public String toString() {
		
		return super.toString() + "\nHours per week :" + this.getHoursPerWeek() + ", Hours rate : " + this.getHoursRate() + "\nPayment : " + this.CalculatePayment();
	}
}
