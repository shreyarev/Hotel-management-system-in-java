package classes;

public class Employee
{
	private	String name ;
    private String eId ;
    private double salary ;
	
	public void setName(String name)
	{
		this.name = name ;
	}
    public void setEId (String eId)
	{
		this.eId = eId ;
	}
    public void setSalary(double salary)
	{
		this.salary = salary ;
	}
    public String getName( )
	{
		return name ;
	}
    public String getEId( )
	{
		return eId ;
	}
    public double getSalary( )
	{
	    return salary ;
	}
}