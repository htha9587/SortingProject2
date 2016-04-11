package sorting2Controller;

/**
 * Version 0.1
 * @author htha9587
 *4-11-16
 */


public class Ship implements Comparable<Ship>
{
	private String name;
	private int ModelNumber;
	private String Population;
	
	public void start()
	{
		
	}
	
	public Ship(String name, int ModelNumber, String Population)
	{
		this.name = name;
		this.ModelNumber = ModelNumber;
		this.Population = Population;
	}
	
	
	public int compareTo(Ship other)
	{
		return Integer.compare(this.ModelNumber, other.ModelNumber);
		
	}
	
	public String toString()
	{
		String s = "Ship name: "+ name+"\nModel Number: "+ModelNumber+"\nPopulation: "+Population;
			return s;
		
	}
	
	
	
}
