package bus;

public enum EnumGenda {
	
	FEMALE("Female"),
	MALE("Male"),
	UNDEFINED("Unfined");
	private final String name;
	private EnumGenda(String name)
	{
		this.name = name;
	}
	public String GetName() {
		return name;
	}
}
