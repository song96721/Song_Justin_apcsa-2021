//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Justin Song

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}

	public String getWord() {
		return word;
	}

	public int compareTo( Word rhs )
	{		
		if (word.length() == rhs.getWord().length())
    {
      return word.compareTo(rhs.getWord());
    } 
		else 
    {
      return word.length() - rhs.getWord().length();
	  }
  }

	public String toString()
	{
		return word;
	}
}