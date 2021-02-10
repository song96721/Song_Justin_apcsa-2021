//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Justin Song
//Date - 2/9/21
//Class - APCSA Period 3
//Lab  - WordsCompareRunner

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		WordsCompare word = new WordsCompare("abe", "ape");
    word.compare();
    System.out.println(word.toString());

    WordsCompare word2 = new WordsCompare("giraffe", "gorilla");
    word2.compare();
    System.out.println(word2.toString());

    WordsCompare word3 = new WordsCompare("one", "two");
    word3.compare();
    System.out.println(word3.toString());

    WordsCompare word4 = new WordsCompare("fun", "funny");
    word4.compare();
    System.out.println(word4.toString());

    WordsCompare word5 = new WordsCompare("123", "19");
    word5.compare();
    System.out.println(word5.toString());

    WordsCompare word6 = new WordsCompare("193", "1910");
    word6.compare();
    System.out.println(word6.toString());

    WordsCompare word7 = new WordsCompare("goofy", "godfather");
    word7.compare();
    System.out.println(word7.toString());

    WordsCompare word8 = new WordsCompare("funnel", "fun");
    word8.compare();
    System.out.println(word8.toString());

	 }
}
