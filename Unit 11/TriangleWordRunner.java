//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Justin Song

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
    Scanner keyboard = new Scanner(System.in);
		do 
    {
			out.print("Enter a word:: ");
			TriangleWord.printTriangle(keyboard.next());
			out.print("Do you want to enter another word?  ");
		} while(keyboard.next().toLowerCase().equals("yes"));
		
	}
}