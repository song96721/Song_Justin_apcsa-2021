//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Justin Song
//Date - 2/9/21
//Class - APCSA Period 3
//Lab  - StringEquality

import static java.lang.System.*;

public class StringEquality
{
	private String w1, w2;

	public StringEquality()
	{
    w1 = "hello";
    w2 = "goodbye";
	}

	public StringEquality(String one, String two)
	{
    w1 = one;
    w2 = two;
	}

	public void setWords(String one, String two)
	{
    w1 = one;
    w2 = two;
	}

	public boolean checkEquality( )
	{
    return w1.equals(w2);
	}

	public String toString()
	{
    if (checkEquality())
    {
      return w1 + " has the same letters as " + w2 + "\n";
    }
    else
    {
      return w1 + " does not have the same letters as " + w2 + "\n";
    }
		
	}
}
