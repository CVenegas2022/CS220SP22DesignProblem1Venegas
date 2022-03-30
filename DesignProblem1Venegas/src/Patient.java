
public class Patient {
	
	//class variables
	private String name;
	private String id;
	private int daysInQuarantine;
	private boolean canRemove;
	
	//constructor
	public Patient(String n, int d, String s)
	{
		name=n;
		daysInQuarantine=d;
		id=s;
		if(daysInQuarantine>=14)
		{
			canRemove=true;
		}
		else
		{
			canRemove=false;
		}
	}
	
	//get methods
	public String getName()
	{
		return name;
	}
	
	public int getDaysInQuarantine()
	{
		return daysInQuarantine;
	}
	
	public String getId()
	{
		return id;
	}
	
	public boolean getCanRemove()
	{
		return canRemove;
	}
	
	//set methods
	public void setCanRemove(boolean b)
	{
		canRemove=b;
	}
	
	//test method
	public void printPatient()
	{
		System.out.println(toString());
	}
	
	//toString method
	public String toString()
	{
		return "Patient: "+name+"\nDays in quarantine: "+daysInQuarantine+"\nID: "+id+"\nCan be removed?: "+canRemove;
	}
	
}
