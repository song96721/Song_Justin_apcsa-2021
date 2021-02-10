//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Justin Song
//Date - 2/9/21
//Class - APCSA Period 3
//Lab  - WordsCompare

import static java.lang.System.*;

public class WordsCompare
{
	private String w1, w2;
   private int compare;

	public WordsCompare()
	{
    w1 = "abe";
    w2 = "ape";
	}

	public WordsCompare(String one, String two)
	{
    w1 = one;
    w2 = two;
	}

	public void setWords(String one, String two)
	{
    w1 = one;
    w2 = two;
	}

	public void compare()
	{
    compare = w1.compareTo(w2);
	}

	public String toString()
	{
		if(compare<0)
		{
			return w1 + " should be placed before " + w2 + "\n";
		}
		else
		{
			return w1 + " should be placed after " + w2 + "\n";
		}
	}
}
