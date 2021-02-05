//(c) A+ Computer Science 
//www.apluscompsci.com

//Name - Justin Song
//Date - 2/3/21
//Class - APCSA Period 3
//Lab  - Distance

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public void Distance1(int x1, int y1, int x2, int y2)
	{
    xOne = x1;
    yOne = y2;
    xTwo = x2;
    yTwo = y2;
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
    xOne = x1;
    yOne = y1;
    xTwo = x2;
    yTwo = y2;
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
    xOne = x1;
    yOne = y1;
    xTwo = x2;
    yTwo = y2;
	}

	public void calcDistance()
	{
    distance = Math.sqrt(Math.pow(xTwo-xOne, 2)+(Math.pow(yTwo-yOne, 2)));
	}
	
	public double getDistance()
	{
		return distance;
	}
	
	public void print()
	{
    System.out.printf("distance ==  %.3f\n\n",distance);
	}
	
	//complete print or the toString

	public String toString()
	{
    String dis = String.format("%.3f\n",distance);
		return "distance == " + dis;
	}
}
