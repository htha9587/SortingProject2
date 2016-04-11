package sorting2Controller;

/**
 * Version 0.3
 * @author htha9587
 *4-11-16
 */

import java.io.*;
import java.util.*;


 class Ship implements Comparable
{
	String name;
	int ModelNumber;
	int Population;
	Ship(int ModelNumber, String name, int Population)
	{
		this.name = name;
		this.ModelNumber = ModelNumber;
		this.Population = Population;
	}
	
	public int compareTo(Object other)
	{
		Ship sh = (Ship)other;
		if(Population== sh.Population)
			return 0;
		
		else if(Population>sh.compareTo(other))
		{
			return 1;
		}
		else
			return -1;
		
	}


	
}
