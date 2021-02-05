//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Justin Song
//Date - 2/3/21
//Class - APCSA Period 3
//Lab  - MilesPerHour

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(45,0,32);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
    distance = dist;
    hours = hrs;
    minutes = mins;
	}

	public void setNums(int dist, int hrs, int mins)
	{
    distance = dist;
    hours = hrs;
    minutes = mins;
	}

	public void calcMPH()
	{
    double time = (hours + (minutes/60.0));
    mph = distance/time;
	}

	public void print()
	{
    System.out.println(String.format((distance + " miles in " + hours + " hour and " + minutes + " minutes = %.0f MPH.\n"),mph));
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return String.format((distance + " miles in " + hours + " hour and " + minutes + " minutes = %.0f MPH.\n"),mph);
	}
}
