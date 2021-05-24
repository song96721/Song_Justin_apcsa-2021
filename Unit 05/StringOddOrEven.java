//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Justin Song
//Date - 2/9/21
//Class - APCSA Period 3
//Lab  - StringOddOrEven

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;

	public StringOddOrEven()
	{
    		word = "cat";
	}

	public StringOddOrEven(String s)
	{
    		word = s;
	}

	public void setString(String s)
	{
    		word = s;
	}

 	public boolean isEven()
 	{
		return (word.length() % 2 == 0);
	}

 	public String toString()
 	{
    		if (isEven())
    		{
      			String output = word + " is even." + "\n";
      			return output;
    		}
    		else
    		{
      			String output = word + " is odd." + "\n";
      			return output;
    		}
    
	}
}
