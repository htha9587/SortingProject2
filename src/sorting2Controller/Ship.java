package sorting2Controller;

/**
 * Version 0.2
 * @author htha9587
 *4-11-16
 */

import java.io.*;
import java.util.*;


public class Ship implements Comparable<Ship>
{
	private int name;
	private String ModelNumber;
	private int Population;
	
	public void start()
	{
		ArrayList al = new ArrayList();
		al.add(new Ship(101, "Ronaldo", 50000));
		al.add(new Ship(345, "Cygnus",60000));
		al.add(new Ship(222, "Titenic", 70000));
	}
	
	public Ship(int i, String string, int j)
	{
		this.name = i;
		this.ModelNumber = string;
		this.Population = j;
	}
	
	
	public Ship(Object object, int i, Object object2) {
		// TODO Auto-generated constructor stub
	}

	public int compareTo(Ship other)
	{
		Ship al = (Ship)other;
		if(Population== al.Population)
			return 0;
		
		else if(Population>al.compareTo(other))
		{
			return 1;
		}
		else
			return -1;
		
	}
	
	public String toString()
	{
		String s = "Ship name: "+ name+"\nModel Number: "+ModelNumber+"\nPopulation: "+Population;
			return s;
		
	}
	
	
	
}
