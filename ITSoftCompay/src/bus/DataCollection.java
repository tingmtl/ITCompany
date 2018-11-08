package bus;

import java.util.ArrayList;

public class DataCollection {

	private ArrayList<Employee> emList;
	
	public ArrayList<Employee> GetList()
	{
		return emList;
	}
	
	public void PrintAllEE()
	{
		for(Employee ee:emList)
		{
			System.out.println(ee);
			System.out.println("\n");
		}
	}
	
	public DataCollection()
	{
		emList = new ArrayList<Employee>();
	}
	
	public void Add(Employee ee) 
	{
		emList.add(ee);
	}
	
	public void Remove(Employee ee) 
	{
		emList.remove(ee);
	}
	
	public Employee Search(int id)
	{
		for(Employee curE : emList)
		{
			if(curE.getId() == id)
			{
				return curE;
			}
		}
		return null;
	}
	
	
}
