package Proc;

import java.util.ArrayList;

import bus.DataCollection;
import bus.Employee;
import bus.EnumCategory;
import bus.EnumGenda;
import bus.HourlyEmployee;
import bus.IPayable;
import bus.SalariedEmployee;

public class TestITCompay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//(String firstName, String lastName, EnumCategory employeeCategory, EnumGenda genda, double weeklySalary)
		Employee salaryEE = new SalariedEmployee(1, "Mari", "Brown", EnumCategory.SALARIEDEMPLOYEE, EnumGenda.FEMALE, 1000);		
		Employee hourEE = new HourlyEmployee(2, "Jim", "Li", EnumCategory.WEEKLYEMPLOYEE, EnumGenda.MALE, 16, 40);
		
		Employee salaryEE2 = new SalariedEmployee(3, "Emile", "Smith", EnumCategory.SALARIEDEMPLOYEE, EnumGenda.FEMALE, 1000);		
		Employee hourEE2 = new HourlyEmployee(4, "Mia", "Wilson", EnumCategory.WEEKLYEMPLOYEE, EnumGenda.MALE, 16, 40);
		
		DataCollection eeList = new DataCollection();
		eeList.Add(salaryEE);
		eeList.Add(hourEE);
		eeList.Add(salaryEE2);
		eeList.Add(hourEE2);
		
		System.out.println("============================");
		System.out.println("\nList of employee..");
		
		eeList.PrintAllEE();
		
		System.out.println("============================");
		System.out.println("\nSearching employee 3");
		Employee eSearch = eeList.Search(3);
		if(eSearch == null)
			System.out.println("\nDo not find the employee whose id is 3");
		else
			System.out.println(eSearch.toString());
		
		System.out.println("============================");
		System.out.println("\nAfter remove employee whose id is 3, the employee list is...");
		eeList.Remove(eSearch);
		eeList.PrintAllEE();
		
		
			
	}

}
