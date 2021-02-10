//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Justin Song
//Date - 2/9/21
//Class - APCSA Period 3
//Lab  - StringRunner

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
    StringOddOrEven test = new StringOddOrEven();
		System.out.println(test.toString());

    test = new StringOddOrEven("boot");
    System.out.println(test.toString());

    test = new StringOddOrEven("it");
    System.out.println(test.toString());

    test = new StringOddOrEven("a");
    System.out.println(test.toString());

    test = new StringOddOrEven("eleven");
    System.out.println(test.toString());

    test = new StringOddOrEven("thirteen");
    System.out.println(test.toString());

    test = new StringOddOrEven("odd");
    System.out.println(test.toString());

    test = new StringOddOrEven("even");
    System.out.println(test.toString());
	}
}
