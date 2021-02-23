//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Justin Song

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
    letter = 'C';
    amount = 4;
	}

	public TriangleFive(char c, int amt)
	{
    letter = c;
    amount = amt;
	}

	public void setLetter(char c)
	{
    letter = c;
	}

	public void setAmount(int amt)
	{
    amount = amt;
	}

	public String toString()
	{
		String output="";
    int number = letter;
    for (int a = 0; a < amount; a++)
    {
      for (int b = 0; b < amount - a; b++)
      {
        for (int c = b; c < amount; c++)
        {
          char ch = (char)(letter + b);
          if (ch > 90)
          {
            ch = (char)(ch - 26);
          }
          output += ch;
        }
        output += " ";
      }
      output += "\n";
    }
		return output;
	}
}