package bus;

public enum EnumCategory {
	
	SALARIEDEMPLOYEE("Full time"),
	WEEKLYEMPLOYEE("Part time"),
	UNDEFINED("Unfined");
	private final String name;
	private EnumCategory(String name)
	{
		this.name= name;
	}
	public String GetName()
	{
		return this.name;
	}
}
