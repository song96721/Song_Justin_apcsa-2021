//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Justin Song
//Date - 2/3/21
//Class - APCSA Period 3
//Lab  - MPHRunner

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MPHRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);
    		MilesPerHour find = new MilesPerHour();
    		find.calcMPH();
    		find.print();

		out.print("Enter the distance :: ");
		int dist = keyboard.nextInt();
		out.print("Enter the hours :: ");
		int hrs = keyboard.nextInt();
		out.print("Enter the minutes :: ");
		int mins = keyboard.nextInt();

		MilesPerHour find2 = new MilesPerHour(dist, hrs, mins);
		find2.calcMPH();
		find2.print();
		
		out.print("Enter the distance :: ");
		dist = keyboard.nextInt();
		out.print("Enter the hours :: ");
		hrs = keyboard.nextInt();
		out.print("Enter the minutes :: ");
		mins = keyboard.nextInt();

    		MilesPerHour find3 = new MilesPerHour(dist, hrs, mins);
    		find3.calcMPH();
    		find3.print();

    		out.print("Enter the distance :: ");
		dist = keyboard.nextInt();
		out.print("Enter the hours :: ");
		hrs = keyboard.nextInt();
		out.print("Enter the minutes :: ");
		mins = keyboard.nextInt();

    		MilesPerHour find4 = new MilesPerHour(dist, hrs, mins);
    		find4.calcMPH();
    		find4.print();
	}
}
