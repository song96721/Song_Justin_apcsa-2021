//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Justin Song

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("words.dat"));
		int s = file.nextInt();
    System.out.println(s);
	  Word[] words = new Word[s];
		file.nextLine();

		for (int i = 0; i < s; i++)
		{
			words[i] = new Word(file.nextLine());
		}

		for (int a = 0; a < words.length - 1; a++)
		{ 
			for (int b = a + 1; b < words.length; b++)
			{
				if (words[b].compareTo(words[a]) > 0)
				{
					Word t = words[a];
					words[a] = words[b];
					words[b] = t;
				}
			}
		}
		
		for (Word x : words)
		{
			System.out.println(x);
		}
		











	}
}