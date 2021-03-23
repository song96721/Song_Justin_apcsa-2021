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
		file.nextLine();
		Word[] words = new Word[s];
		
		for (int i = 0; i < s ; i++) 
		{
			words[i] = new Word(file.next());
		}
    
		Arrays.sort(words);
		for (Word w : words) 
    {
			System.out.println(w);
	  }
  }
}