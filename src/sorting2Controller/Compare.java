package sorting2Controller;

import java.io.*;
import java.util.*;

import sorting2Controller.Ship;

/**
 * Version 0.4
 * @author htha9587
 *4-11-16
 */

public class Compare 
{

	public static void main(String [] args)
	{
		ArrayList al = new ArrayList();
		al.add(new Ship(101, "Ronaldo", 50000));
		al.add(new Ship(345, " USS Cygnus",60000));
		al.add(new Ship(222, "Titenic", 70000));
		
		Collections.sort(al);
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			Ship sh =(Ship)itr.next();
			String name = "";
			System.out.println("Ship name: "+ sh.name+"\nModel Number: "+sh.ModelNumber+"\nPopulation: "+sh.Population);
		}
		
	}
	
	
	
	
	
}
